package vista;

import java.util.List;
import java.util.Scanner;

// Esta clase se encarga de todo lo que ve y escribe el usuario por consola.
// Aquí no hay lógica del programa, solo interacción con el usuario.
public class VistaConsola {

    private Scanner scanner;

    public VistaConsola() {
        scanner = new Scanner(System.in); // para leer lo que escribe el usuario
    }

    // Muestra el estado del programa cada vez que se pinta el menú
    public void mostrarEstado(String carpeta, String fichero) {
        System.out.println("=== Conversor de ficheros CSV/JSON/XML ===");
        System.out.println("Carpeta seleccionada: " + (carpeta == null ? "Ninguna" : carpeta));
        System.out.println("Fichero cargado: " + (fichero == null ? "Ninguno" : fichero));
        System.out.println("------------------------------------------");
    }

    // Imprime el menú principal
    public void mostrarMenu() {
        System.out.println("1. Seleccionar carpeta");
        System.out.println("2. Leer fichero");
        System.out.println("3. Convertir fichero");
        System.out.println("4. Salir");
    }

    // Pide una opción del menú. Si no es número, devuelvo -1
    public int leerOpcionMenu() {
        System.out.print("Elige una opción: ");
        String linea = scanner.nextLine();
        try {
            return Integer.parseInt(linea);
        } catch (NumberFormatException e) {
            return -1; // opción inválida
        }
    }

    // Los métodos de abajo simplemente piden información al usuario

    public String pedirRutaCarpeta() {
        System.out.print("Introduce la ruta de la carpeta: ");
        return scanner.nextLine();
    }

    public String pedirNombreFichero() {
        System.out.print("Introduce el nombre del fichero (con extensión): ");
        return scanner.nextLine();
    }

    public String pedirFormatoDestino() {
        System.out.print("Formato destino (csv/json/xml): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    public String pedirNombreFicheroSalida() {
        System.out.print("Nombre del fichero de salida (sin extensión): ");
        return scanner.nextLine().trim();
    }

    // Lista lo que hay dentro de la carpeta elegida
    public void mostrarContenidoCarpeta(List<String> nombres) {
        if (nombres == null || nombres.isEmpty()) {
            System.out.println("La carpeta está vacía.");
        } else {
            System.out.println("Contenido de la carpeta:");
            for (String nombre : nombres) {
                System.out.println(" - " + nombre);
            }
        }
    }

    // Mensaje genérico para avisos y errores
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
