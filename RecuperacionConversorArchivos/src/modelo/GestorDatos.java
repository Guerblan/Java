package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// Esta clase guarda los datos en memoria y sabe leerlos / escribirlos en CSV, JSON y XML
public class GestorDatos {

    private List<String> cabeceras = new ArrayList<>();
    private List<List<String>> registros = new ArrayList<>();
    private String formatoOrigen; // CSV, JSON o XML

    // Borra lo que hubiera cargado antes
    public void limpiar() {
        cabeceras.clear();
        registros.clear();
        formatoOrigen = null;
    }

    public String getFormatoOrigen() {
        return formatoOrigen;
    }

    public List<String> getCabeceras() {
        return cabeceras;
    }

    public List<List<String>> getRegistros() {
        return registros;
    }

    public boolean hayDatos() {
        return !cabeceras.isEmpty() || !registros.isEmpty();
    }

    // -------- LECTURA CSV --------
    public void cargarDesdeCsv(Path fichero) throws IOException {
        limpiar();
        formatoOrigen = "CSV";

        try (BufferedReader reader = Files.newBufferedReader(fichero, StandardCharsets.UTF_8)) {
            String linea;
            boolean primera = true;

            while ((linea = reader.readLine()) != null) {
                if (linea.isBlank())
                    continue;

                String[] partes = parseLineaCsv(linea);
                List<String> fila = new ArrayList<>();

                for (String p : partes)
                    fila.add(p);

                if (primera) {
                    cabeceras.addAll(fila);
                    primera = false;
                } else {
                    registros.add(fila);
                }
            }
        }
    }

    private String[] parseLineaCsv(String linea) {
        String separador = linea.contains(";") ? ";" : ",";
        return linea.split(separador, -1);
    }

    // -------- LECTURA JSON --------
    public void cargarDesdeJson(Path fichero) throws IOException {
        limpiar();
        formatoOrigen = "JSON";

        String contenido = Files.readString(fichero, StandardCharsets.UTF_8);

        // cabeceras
        Matcher mCab = Pattern.compile("\"cabeceras\"\\s*:\\s*\\[(.*?)\\]").matcher(contenido);
        if (mCab.find())
            cabeceras.addAll(parseJsonArrayOfStrings(mCab.group(1)));

        // registros
        Matcher mReg = Pattern.compile("\"registros\"\\s*:\\s*\\[(.*)\\]\\s*\\}\\s*$", Pattern.DOTALL)
                .matcher(contenido);
        if (mReg.find()) {
            Matcher filaMatcher = Pattern.compile("\\[(.*?)\\]").matcher(mReg.group(1));
            while (filaMatcher.find())
                registros.add(parseJsonArrayOfStrings(filaMatcher.group(1)));
        }
    }

    // Convierte un texto tipo ["a","b"] en una lista de String
    private List<String> parseJsonArrayOfStrings(String texto) {
        List<String> resultado = new ArrayList<>();
        boolean enCadena = false;
        StringBuilder actual = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == '\"') {
                if (enCadena) {
                    resultado.add(actual.toString());
                    actual.setLength(0);
                }
                enCadena = !enCadena;
            } else if (enCadena) {
                actual.append(c);
            }
        }
        return resultado;
    }

    // -------- LECTURA XML --------
    public void cargarDesdeXml(Path fichero) throws IOException {
        limpiar();
        formatoOrigen = "XML";

        try (InputStream in = Files.newInputStream(fichero)) {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(in);
            doc.getDocumentElement().normalize();

            // cabeceras
            NodeList cabNodes = doc.getElementsByTagName("cabeceras");
            if (cabNodes.getLength() > 0) {
                NodeList campos = ((Element) cabNodes.item(0)).getElementsByTagName("campo");
                for (int i = 0; i < campos.getLength(); i++)
                    cabeceras.add(campos.item(i).getTextContent());
            }

            // registros
            NodeList regNodes = doc.getElementsByTagName("registro");
            for (int i = 0; i < regNodes.getLength(); i++) {
                NodeList campos = ((Element) regNodes.item(i)).getElementsByTagName("campo");
                List<String> fila = new ArrayList<>();
                for (int j = 0; j < campos.getLength(); j++)
                    fila.add(campos.item(j).getTextContent());
                registros.add(fila);
            }

        } catch (ParserConfigurationException | SAXException e) {
            throw new IOException("Error al leer XML: " + e.getMessage(), e);
        }
    }

    // -------- ESCRITURA CSV --------
    public void guardarComoCsv(Path ficheroSalida) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(ficheroSalida, StandardCharsets.UTF_8)) {
            writer.write(String.join(";", cabeceras));
            writer.newLine();
            for (List<String> fila : registros) {
                writer.write(String.join(";", fila));
                writer.newLine();
            }
        }
    }

    // -------- ESCRITURA JSON --------
    public void guardarComoJson(Path ficheroSalida) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(ficheroSalida, StandardCharsets.UTF_8)) {
            writer.write("{\n  \"cabeceras\": [");
            for (int i = 0; i < cabeceras.size(); i++) {
                if (i > 0)
                    writer.write(", ");
                writer.write("\"" + escaparJson(cabeceras.get(i)) + "\"");
            }
            writer.write("],\n  \"registros\": [\n");
            for (int i = 0; i < registros.size(); i++) {
                writer.write("    [");
                for (int j = 0; j < registros.get(i).size(); j++) {
                    if (j > 0)
                        writer.write(", ");
                    writer.write("\"" + escaparJson(registros.get(i).get(j)) + "\"");
                }
                writer.write("]" + (i < registros.size() - 1 ? "," : "") + "\n");
            }
            writer.write("  ]\n}");
        }
    }

    private String escaparJson(String valor) {
        return valor == null ? "" : valor.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    // -------- ESCRITURA XML --------
    public void guardarComoXml(Path ficheroSalida) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(ficheroSalida, StandardCharsets.UTF_8)) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<datos>\n  <cabeceras>\n");
            for (String c : cabeceras)
                writer.write("    <campo>" + escaparXml(c) + "</campo>\n");
            writer.write("  </cabeceras>\n  <registros>\n");
            for (List<String> fila : registros) {
                writer.write("    <registro>\n");
                for (String v : fila)
                    writer.write("      <campo>" + escaparXml(v) + "</campo>\n");
                writer.write("    </registro>\n");
            }
            writer.write("  </registros>\n</datos>\n");
        }
    }

    private String escaparXml(String valor) {
        return valor == null ? "" : valor.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
}
