package controlador;

import java.io.IOException;
import java.nio.file.Path;

import modelo.GestorArchivos;
import modelo.GestorDatos;
import vista.VistaConsola;

// Esta clase es como "el jefe" del programa. Controla las opciones del menú
// y llama a las otras clases para hacer el trabajo.
public class Controlador {

    // Aquí guardo datos básicos que necesito durante el programa
    private String ficheroSeleccionado = null;
    private VistaConsola vista;
    private GestorArchivos gestorArchivos;
    private GestorDatos gestorDatos;

    public Controlador() {
        // Al iniciar creo los objetos que voy a usar
        vista = new VistaConsola();
        gestorArchivos = new GestorArchivos();
        gestorDatos = new GestorDatos();
    }

    // Este método es el "corazón" del programa. Muestra el menú y reacciona a lo
    // que elija el usuario.
    public void iniciarPrograma() {
        boolean salir = false;

        while (!salir) {
            // Muestro siempre el estado actual antes del menú
            vista.mostrarEstado(gestorArchivos.getRutaCarpetaActual(), ficheroSeleccionado);
            vista.mostrarMenu();
            int opcion = vista.leerOpcionMenu();

            // Dependiendo de la opción, llamo a un método u otro
            switch (opcion) {
                case 1:
                    seleccionarCarpeta();
                    break;
                case 2:
                    leerFichero();
                    break;
                case 3:
                    convertirFichero();
                    break;
                case 4:
                    salir = true; // El usuario decidió salir
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Intenta de nuevo.");
            }

            System.out.println(); // línea en blanco para separar iteraciones
        }
    }

    // Opción 1: seleccionar una carpeta del ordenador
    private void seleccionarCarpeta() {
        String ruta = vista.pedirRutaCarpeta();

        // Compruebo si la carpeta existe realmente
        if (!gestorArchivos.seleccionarCarpeta(ruta)) {
            vista.mostrarMensaje("La carpeta no existe o no es válida.");
            return;
        }

        // Al cambiar de carpeta, olvidamos fichero y datos anteriores para evitar
        // errores
        ficheroSeleccionado = null;
        gestorDatos.limpiar();

        vista.mostrarMensaje("Carpeta seleccionada correctamente.");
        vista.mostrarContenidoCarpeta(gestorArchivos.listarArchivos()); // Muestro lo que tiene dentro
    }

    // Opción 2: leer un fichero y cargar sus datos en memoria
    private void leerFichero() {
        // Sin carpeta elegida no tiene sentido leer nada
        if (gestorArchivos.getRutaCarpetaActual() == null) {
            vista.mostrarMensaje("Primero debes seleccionar una carpeta (opción 1).");
            return;
        }

        String nombreFichero = vista.pedirNombreFichero();

        // Compruebo si el fichero de verdad está dentro de la carpeta elegida
        if (!gestorArchivos.existeFicheroEnCarpeta(nombreFichero)) {
            vista.mostrarMensaje("El fichero no existe en la carpeta seleccionada.");
            return;
        }

        Path rutaFichero = gestorArchivos.getPathFichero(nombreFichero);
        String nombreLower = nombreFichero.toLowerCase(); // para comparar extensión sin problemas

        try {
            // Detecto el tipo según la extensión y uso el método correspondiente
            if (nombreLower.endsWith(".csv")) {
                gestorDatos.cargarDesdeCsv(rutaFichero);
            } else if (nombreLower.endsWith(".json")) {
                gestorDatos.cargarDesdeJson(rutaFichero);
            } else if (nombreLower.endsWith(".xml")) {
                gestorDatos.cargarDesdeXml(rutaFichero);
            } else {
                vista.mostrarMensaje("Extensión no soportada. Usa .csv, .json o .xml");
                return;
            }

            // Si llego aquí, se cargó bien
            ficheroSeleccionado = nombreFichero;
            vista.mostrarMensaje("Fichero leído correctamente. Registros cargados: "
                    + gestorDatos.getRegistros().size()
                    + " (formato origen: " + gestorDatos.getFormatoOrigen() + ")");
        } catch (IOException e) {
            // Si hay error, lo aviso de forma sencilla
            vista.mostrarMensaje("Error leyendo el fichero: " + e.getMessage());
        }
    }

    // Opción 3: convertir el fichero cargado a otro formato
    private void convertirFichero() {
        // Si no hay datos cargados, no se puede convertir
        if (!gestorDatos.hayDatos()) {
            vista.mostrarMensaje("Primero debes leer un fichero (opción 2).");
            return;
        }

        // Sin carpeta no sabría dónde guardar el nuevo fichero
        if (gestorArchivos.getRutaCarpetaActual() == null) {
            vista.mostrarMensaje("No hay carpeta seleccionada para guardar el fichero.");
            return;
        }

        // Pido el formato y el nombre base para el nuevo archivo
        String formato = vista.pedirFormatoDestino();
        String nombreBase = vista.pedirNombreFicheroSalida();

        if (nombreBase == null || nombreBase.isBlank()) {
            vista.mostrarMensaje("Nombre de fichero de salida no válido.");
            return;
        }

        // Según formato elegido, preparo la extensión final
        String extension;
        switch (formato) {
            case "csv":
                extension = ".csv";
                break;
            case "json":
                extension = ".json";
                break;
            case "xml":
                extension = ".xml";
                break;
            default:
                vista.mostrarMensaje("Formato no válido. Usa: csv, json o xml.");
                return;
        }

        String nombreSalida = nombreBase + extension;
        Path rutaSalida = gestorArchivos.getPathFichero(nombreSalida);

        try {
            // Llamo al método que corresponda según el formato deseado
            switch (formato) {
                case "csv":
                    gestorDatos.guardarComoCsv(rutaSalida);
                    break;
                case "json":
                    gestorDatos.guardarComoJson(rutaSalida);
                    break;
                case "xml":
                    gestorDatos.guardarComoXml(rutaSalida);
                    break;
            }

            vista.mostrarMensaje("Fichero convertido y guardado como: " + nombreSalida);

        } catch (IOException e) {
            // Si falla la escritura, lo indico
            vista.mostrarMensaje("Error al guardar el fichero: " + e.getMessage());
        }
    }
}
