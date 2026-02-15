public class File {
    /*Añadir Fichero (Se pedirá el nombre completo y el tamaño)
Modificar Fichero (Dado un ID)
Listar Ficheros
Borrar Fichero (Dado un ID)
Buscar fichero por nombre o extensión (Se dará un único string de búsqueda). Por ejemplo: Buscar: rest.txt | Buscar: rest | Buscar t.txt ...
Salir
Detalles:
De cada fichero se almacenará su id (único), nombre, extensión y tamaño. El id será autogenerado.
De un fichero se podrá modificar su nombre, extensión o tamaño.
En el menú se deberá controlar si el usuario introduce un número distinto al listado. Controlar si es una entrada no numérica.
Almacenar información sobre el autor del fichero.
Mostrar el ID del fichero como 2 dígitos. Por ejemplo: Fichero 1 sería Fichero 01. Fichero 3 sería Fichero 03.
     */
    private int id;
    private String nombre;
    private double tamaño;
    private String extension;
    private static int contador=1;
    private String autor;
}
