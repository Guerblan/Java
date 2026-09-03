import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UT4_1_Array {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String opciones = "\nOpción 1 - Aleatorios\n" +
                "Opción 2 - Inverso\n" +
                "Opción 3 - Notas\n" +
                "Opción 4 - VectorVariable\n" +
                "Opción 5 - Suma\n";
        int opcion;
        boolean salir = false;
        do {
            System.out.println(opciones);
            System.out.print("\nElige una opción:");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (opcion) {
                case 1:
                    Aleatorios();
                    break;
                case 2:
                    Inverso();
                    break;
                case 3:
                    Notas();
                    break;
                case 4:
                    VectorVariable();
                    break;
                case 5:
                    Suma();
                    break;

                default:
                    salir = true;
                    sc.close();
                    break;
            }
        } while (!salir);
    }

    /*
     * Ejercicio 1
     * 
     * Realizar un programa que defina un vector llamado “vector_numeros” de 10
     * enteros, a continuación lo inicialice con valores aleatorios (del 1 al 10) y
     * posteriormente muestre en pantalla cada elemento del vector junto con su
     * cuadrado y su cubo.
     */

    public static void Aleatorios() {
        double[][] aleatorios = new double[10][3];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i][0] = random.nextInt(9) + 1;
            aleatorios[i][1] = Math.pow(aleatorios[i][0], 2);
            aleatorios[i][2] = Math.pow(aleatorios[i][0], 3);
            System.out
                    .println((int) aleatorios[i][0] + "\t " + (int) aleatorios[i][1] + "\t " + (int) aleatorios[i][2]);
        }
    }

    /*
     * Ejercicio 2
     * 
     * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector
     * con datos leídos por el teclado. Copia los elementos del vector en otro
     * vector pero en orden inverso, y muéstralo por la pantalla.
     */
    public static void Inverso() {
        String[] frases = new String[5];
        String[] frasesInvertida = new String[5];
        System.out.println("\nEscribe 5 Strings para rellenar el Array.");
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Posición " + i + ": ");
            frases[i] = sc.nextLine();
            frasesInvertida[frasesInvertida.length - i - 1] = "";
            for (int j = 0; j < frases[i].length(); j++) {
                frasesInvertida[frasesInvertida.length - i - 1] += frases[i].charAt(frases[i].length() - j - 1);
            }
        }
        System.out.println("\nString invertido: " + Arrays.toString(frasesInvertida));
    }

    /*
     * Ejercicio 3
     * 
     * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por
     * un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las
     * notas, la nota media, la nota más alta que ha sacado y la menor.
     */
    public static void Notas() {
        float[] notas = new float[5];
        float notaMax = Float.MIN_VALUE;
        float notaMin = Float.MAX_VALUE;
        int notaSuma = 0;
        System.out.println("\nEscribe 5 notas entre 0 y 10.\n");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = Float.parseFloat(sc.nextLine());
            } while (notas[i] < 0 || notas[i] > 10);
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
            if (notas[i] < notaMin) {
                notaMin = notas[i];
            }
            notaSuma += notas[i];
        }
        System.out.println("\n" + Arrays.toString(notas));
        System.out.println("\nNota media = " + notaSuma / 5);
        System.out.println("\nNota máxima = " + notaMax);
    }

    /*
     * Ejercicio 4
     * 
     * Programa que declare un vector de diez elementos enteros y pida números para
     * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
     * Entonces se debe imprimir el vector (sólo los elementos introducidos).
     */
    public static void VectorVariable() {
        System.out.println("Dame hasta 10 números, para al introducir un negativo");
        int[] vector = new int[10];
        boolean flag = true;
        for (int i = 0; i < 10 && flag; i++) {
            vector[i] = Integer.parseInt(sc.nextLine());
            if (vector[i] < 0) {
                flag = false;
            }
        }
        flag = true;
        System.out.print("\nEstas son los números positivos que has introducido: ");
        for (int i = 0; i < 10 && flag; i++) {
            if (vector[i] < 0) {
                flag = false;
            } else {
                System.out.print(vector[i] + " ");
            }
        }
        System.out.println();
    }

    /*
     * Ejercicio 5
     * 
     * Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco
     * enteros cada uno, pida valores para ‘vector1’ y ‘vector2’ y calcule
     * vector3=vector1+vector2.
     */
    public static void Suma() {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("\nVector 1," + (1 + i) + ": ");
            vector1[i] = Integer.parseInt(sc.nextLine());
            System.out.print("Vector 2," + (1 + i) + ": ");
            vector2[i] = Integer.parseInt(sc.nextLine());
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println(Arrays.toString(vector3));
    }
}
