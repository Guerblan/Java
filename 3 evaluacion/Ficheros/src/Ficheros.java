import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {

    public void crearFichero() {
        Path rutaDirectorio = Paths.get("DataSet");
        Path rutaArchivo = Paths.get("DataSet/Archivo.txt");

        try {
            if (Files.exists(rutaDirectorio)) {
                System.out.println("El directorio ya existe.");
            } else {
                Files.createDirectories(rutaDirectorio);
                System.out.println("Directorio creado en " + rutaDirectorio.toString());
                Files.createFile(rutaArchivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void borrarFichero() {
        Path ruta = Paths.get("DataSet/Archivo.txt");
        try {
            Files.deleteIfExists(ruta);
            Files.delete(ruta);

        } catch (IOException e) {
            System.out.println("No existe el archivo");
        }
    }

    public void copiarFichero() {
        Path origenCopia = Paths.get("DataSet/Archivo.txt");
        Path destinoCopia = Paths.get("DataSet/CopiaArchivo.txt");

        try {
            Files.copy(origenCopia, destinoCopia);
        } catch (IOException e) {
            System.err.println("ERROR en la copia del archivo");
        }
    }

    public void moverFichero() {
        Path origenArchivo = Paths.get("DataSet/Archivo.txt");
        Path destinoArchivo = Paths.get("DataSet/NuevoDirectorio/Archivo.txt");

        try {
            Files.move(origenArchivo, destinoArchivo);
            System.out.println("Archivo movido correctamente.");
        } catch (IOException e) {
            System.err.println("ERROR al mover el archivo: " + e.getMessage());
        }
    }

    public void consultarAtributos() {
        Path rutaArchivo = Paths.get("DataSet/Archivo.txt");

        try {
            // Aquí está leyendo los atributos
            BasicFileAttributes atributos = Files.readAttributes(rutaArchivo, BasicFileAttributes.class);

            System.out.println("Tamaño del archivo: " + atributos.size() + " bytes");
            System.out.println("Es un directorio: " + atributos.isDirectory());
            System.out.println("Es un archivo regular: " + atributos.isRegularFile());
            System.out.println("Fecha de creación: " + atributos.creationTime());
            System.out.println("Fecha de última modificación: " + atributos.lastModifiedTime());
            System.out.println("Fecha de último acceso: " + atributos.lastAccessTime());
        } catch (IOException e) {
            System.err.println("ERROR al consultar los atributos del archivo: " + e.getMessage());
        }
    }

    public void leerArchivoTexto() {
        Path rutaArchivo = Paths.get("DataSet/Archivo.txt");

        try {
            // Lee todas las líneas del archivo y las guarda en una lista
            List<String> lineas = Files.readAllLines(rutaArchivo);

            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("ERROR al leer el archivo: " + e.getMessage());
        }
    }

    public void escribirArchivoTexto() {
        Path rutaArchivo = Paths.get("DataSet/Archivo.txt");

        try {
            // Escribe una línea en el archivo (sobrescribe el contenido)
            String contenido = "Esta es una nueva línea.\n";
            Files.write(rutaArchivo, contenido.getBytes());

            // Añade más líneas al archivo (sin sobrescribir)
            List<String> lineas = new ArrayList<>();
            lineas.add("Línea 1");
            lineas.add("Línea 2");
            lineas.add("Línea 3");
            Files.write(rutaArchivo, lineas, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("ERROR al escribir en el archivo: " + e.getMessage());
        }
    }

}
