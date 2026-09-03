import java.util.Scanner;

public class Conversor {
    Scanner scanner = new Scanner(System.in);

    // Método no estático para mostrar el menú
    public void mostrarMenu() {
        String menu = "\n1. Seleccionar carpeta\n2. Lectura de fichero\n3. Conversión\n4. Salir";
        System.out.println(menu);
    }

    // Método no estático para manejar la opción seleccionada
    public void ejecutarOpcion(int opcion) {
        while (opcion != 4) {
            mostrarMenu();
            System.out.println("Introduce una opción");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionar carpeta");
                    seleccionarCarpeta();
                    break;
                case 2:
                    System.out.println("Lectura de fichero");
                    lecturaDeFichero();
                    break;
                case 3:
                    System.out.println("Conversión");
                    conversion();
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public void seleccionarCarpeta() {

    }

    public void lecturaDeFichero() {

    }

    public void conversion() {

    }

    public static void main(String[] args) {
        Conversor app = new Conversor(); // Crear instancia para usar métodos no estáticos
        app.mostrarMenu();
        int opcion = 0;
        app.ejecutarOpcion(opcion);
    }
}
