package modelo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Esta clase se encarga de trabajar con carpetas y archivos del sistema.
// Básicamente aquí gestiono rutas y compruebo si los ficheros existen.
public class GestorArchivos {

    // Aquí guardo la carpeta que el usuario ha elegido
    private Path carpetaActual;

    // Devuelvo la ruta de la carpeta (o null si no hay ninguna elegida)
    public String getRutaCarpetaActual() {
        return (carpetaActual == null) ? null : carpetaActual.toString();
    }

    // Intento cambiar de carpeta. Si existe y es carpeta real, la guardo.
    public boolean seleccionarCarpeta(String ruta) {
        Path posible = Paths.get(ruta);

        if (Files.exists(posible) && Files.isDirectory(posible)) {
            carpetaActual = posible;
            return true; // carpeta válida
        }

        return false; // la ruta no era una carpeta válida
    }

    // Devuelvo una lista con los nombres de los archivos dentro de la carpeta
    // actual
    public List<String> listarArchivos() {
        List<String> resultado = new ArrayList<>();

        // Si no hay carpeta, simplemente devuelvo lista vacía
        if (carpetaActual == null) {
            return resultado;
        }

        // Leo el contenido de la carpeta
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(carpetaActual)) {
            for (Path p : stream) {
                resultado.add(p.getFileName().toString()); // solo el nombre, no la ruta completa
            }
        } catch (IOException e) {
            // Si hay error no hago nada especial, solo devuelvo lo que tenga (o vacío)
        }

        return resultado;
    }

    // Compruebo si un fichero con ese nombre existe dentro de la carpeta actual
    public boolean existeFicheroEnCarpeta(String nombreFichero) {
        if (carpetaActual == null) {
            return false;
        }
        Path p = carpetaActual.resolve(nombreFichero);
        return Files.exists(p) && Files.isRegularFile(p);
    }

    // Devuelvo la ruta completa de un fichero dentro de la carpeta seleccionada
    public Path getPathFichero(String nombreFichero) {
        if (carpetaActual == null) {
            return null;
        }
        return carpetaActual.resolve(nombreFichero);
    }
}
