import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UT4_4_Matrices3 {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String menu = "\n1 - Matriz9"
                + "\n2 - Buscador"
                + "\n3 - ArrayVariable"
                + "\n4 - Iteración";
        int opcion;
        Boolean flag = true;
        do {
            System.out.println("\n" + menu);
            System.out.print("\nOpción: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (opcion) {
                case 1 -> Matriz9();
                case 2 -> Buscador();
                case 3 -> ArrayVariable();
                case 4 -> Iteracion();
                default -> {
                    flag = false;
                    sc.close();
                }
            }
        } while (flag);
    }

    /*
     * Ejercicio 1 - Matriz9
     * 
     * Escribe un programa que genere al azar 20 números enteros comprendidos entre
     * 0 y 9. Estos números se deben introducir en una matriz de 4 filas por 5
     * columnas. La matriz tendrá una fila y una columna mas, donde se almacenarán
     * los valores de las sumas parciales por filas y columnas. La celda de la
     * posición inferior derecha almacenará la suma total.
     */
    public static void Matriz9() {
        int[][] matriz = new int[5][6];
        for (int i = 0; i < (matriz.length - 1); i++) {
            for (int j = 0; j < (matriz[0].length - 1); j++) {
                matriz[i][j] = random.nextInt(10);
                matriz[i][matriz[0].length - 1] += matriz[i][j];
                matriz[matriz.length - 1][j] += matriz[i][j];
                matriz[matriz.length - 1][matriz[0].length - 1] += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 2 - Buscador
     * 
     * Crea un array de números de un tamaño pasado por teclado, el array contendrá
     * números aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un
     * dígito que nosotros le indiquemos por teclado (debes controlar que se
     * introduce un numero correcto), estos deben guardarse en un nuevo array.
     * 
     * Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números
     * acabados en 5, podría salir 155, 25, etc.
     */
    public static void Buscador() {
        System.out.print("Tamaño del array: ");
        int size = Integer.parseInt(sc.nextLine());
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.toString(random.nextInt(300) + 1);
        }
        System.out.println(Arrays.toString(array));
        System.out.print("\nBuscar números terminados en: ");
        String buscarString;
        char buscarChar;
        Boolean flag;
        do {
            flag = false;
            buscarString = sc.nextLine();
            buscarChar = buscarString.charAt(buscarString.length() - 1);
            if (buscarString.length() != 1 || buscarChar < 48 || buscarChar > 57) {
                flag = true;
            }
        } while (flag);
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(array[i].length() - 1) == buscarChar) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /*
     * Ejercicio 3 - ArrayVariable
     * 
     * Crea un array de 100 elementos, inicialmente vacío. El programa pedirá al
     * usuario que introduzca números por teclado. Cada nuevo número introducido
     * ocupará la posición 0 del array, obligando a todo el contenido a desplazarse
     * una posición a la derecha. Cuando el usuario introduzca el número 0, el
     * programa finalizará mostrando el contenido útil del array.
     */
    public static void ArrayVariable() {
        int num = 100;
        int[] array = new int[num];
        int contador = 0;
        Boolean flag = true;
        do {
            if (contador > 0) {
                System.out.print("\nEl array de momento es: ");
                for (int i = 0; i < contador; i++) {
                    System.out.print(array[i] + " ");
                }
            }
            for (int i = contador + 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            System.out.print("\nIntroduce un nuevo número: ");
            array[0] = Integer.parseInt(sc.nextLine());
            if (array[0] == 0) {
                flag = false;
            }
            contador++;
        } while (flag);
        System.out.print("\nEl array final ha quedado así: ");
        for (int i = 1; i < contador; i++) {
            System.out.print(array[i] + " ");

        }
    }

    /*
     * Ejercicio 4 - Iteracion
     * 
     * Crea una array de 150 números aleatorios comprendidos entre 5 y 10. El
     * programa pedirá por teclado un número de iteraciones. En cada iteración, el
     * array almacenará en una celda el valor contenido en la celda anterior mas el
     * contenido en la celda siguiente.
     */
    public static void Iteracion() {
        int longitud = 5;
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) + 5;
        }
        System.out.println("\nArray original: " + Arrays.toString(array));
        System.out.print("\nNúmero de iteraciones: ");
        int iteraciones = Integer.parseInt(sc.nextLine());
        int anterior, actual = 0, siguiente;
        for (int i = 0; i < iteraciones; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j > 0 && j < array.length - 1) {
                    anterior = actual;
                    actual = array[j];
                    siguiente = array[j + 1];
                } else if (j == 0) {
                    anterior = 0;
                    actual = array[j];
                    siguiente = array[j + 1];
                } else {
                    anterior = actual;
                    actual = array[j];
                    siguiente = 0;
                }
                array[j] += anterior + siguiente;
            }
            System.out.println("\nIteración " + (i + 1) + ": " + Arrays.toString(array));
        }
    }
}
