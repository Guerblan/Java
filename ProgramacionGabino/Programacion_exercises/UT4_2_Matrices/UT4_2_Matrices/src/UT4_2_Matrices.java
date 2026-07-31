import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UT4_2_Matrices {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String opciones = "\nOpción 1 - Alumno\n" +
                "Opción 2 - Temperatura\n" +
                "Opción 3 - SumaOrtogonal\n" +
                "Opción 4 - SumaDiagonal\n" +
                "Opción 5 - Marco\n";
        int opcion;
        boolean salir = true;
        do {
            System.out.println(opciones);
            System.out.print("\nElige una opción:");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (opcion) {
                case 1 -> Alumno();
                case 2 -> Temperatura();
                case 3 -> SumaOrtogonal();
                case 4 -> SumaDiagonal();
                case 5 -> Marco();
                default -> {
                    salir = false;
                    sc.close();
                }
            }
        } while (salir);
    }

    /*
     * Ejercicio 1
     * Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza
     * un programa que introduzca el nombre y la edad de cada alumno. El proceso de
     * lectura de datos terminará cuando se introduzca como nombre un asterisco (*)
     * Al finalizar se mostrará los siguientes datos:
     * Todos lo alumnos mayores de edad.
     * Los alumnos mayores (los que tienen más edad)
     */
    public static void Alumno() {
        String[] nombre = new String[100];
        int[] edad = new int[100];
        int i;
        boolean flag = true;
        System.out.println("\nDime nombre y edad, cierra con nombre = *");
        for (i = 0; i < edad.length && flag; i++) {
            System.out.print("\nNombre: ");
            nombre[i] = sc.nextLine();
            if (nombre[i].equals("*")) {
                flag = false;
            } else {
                System.out.print("Edad: ");
                edad[i] = Integer.parseInt(sc.nextLine());
            }
        }
        float edadMax = Float.MIN_NORMAL;
        System.out.println("\nLos alumnos mayores de edad son:");
        for (int j = 0; j < i; j++) {
            if (edad[j] > edadMax) {
                edadMax = edad[j];
            }
            if (edad[j] >= 18) {
                System.out.println(nombre[j]);
            }
        }
        System.out.println("\nLa edad máxima es " + (int) edadMax + " años"
                + "\ny estos son los alumnos con esa edad:");
        for (int j = 0; j < i; j++) {
            if (edad[j] == edadMax) {
                System.out.println(nombre[j]);
            }
        }
    }

    /*
     * Ejercicio 2
     * Queremos guardar la temperatura mínima y máxima de 5 días. realiza un
     * programa que de la siguiente información:
     * La temperatura media de cada día
     * Los días con menos temperatura
     * Se lee una temperatura por teclado y se muestran los días cuya temperatura
     * máxima coincide con ella. si no existe ningún día se muestra un mensaje de
     * información.
     */
    public static void Temperatura() {
        int[][] temperatura = new int[5][5];
        float tempMin = Float.MAX_VALUE;
        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("\nDía " + (i + 1) + ", temperatura máxima: ");
            temperatura[i][0] = Integer.parseInt(sc.nextLine());
            do {
                System.out.print("Día " + (i + 1) + ", temperatura mínima: ");
                temperatura[i][1] = Integer.parseInt(sc.nextLine());
            } while (temperatura[i][0] < temperatura[i][1]);
            if (temperatura[i][1] < tempMin) {
                tempMin = temperatura[i][1];
            }
            System.out.println(
                    "La temperatura media del día " + (i + 1) + " es " + ((float)temperatura[i][0] + (float)temperatura[i][1]) / 2);
            for (int j = 0; j < i; j++) {
                if (temperatura[i][0] == temperatura[j][0]) {
                    System.out.println("Tiene la misma temperatura que el día " + (j+1));
                }
            }
        }
    }

    /*
     * Ejercicio 3
     * Diseñar el algoritmo correspondiente a un programa, que:
     * Crea una tabla bidimensional de longitud 5x5 y nombre ‘matriz’.
     * Carga la tabla con valores numéricos enteros.
     * Suma todos los elementos de cada fila y todos los elementos de cada columna
     * visualizando los resultados en pantalla.
     */
    public static void SumaOrtogonal() {
        int [][] matriz = new int[5][5];
        int [] sumaFilas = new int[5];
        int []sumaColumnas = new int[5];
        for (int i = 0; i < matriz[0].length; i++) {
            sumaFilas[i] = 0;
            sumaColumnas[i] = 0;
        }
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(4)+1;
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }
        for (int [] i : matriz) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(sumaFilas));
        System.out.println(Arrays.toString(sumaColumnas));
    }

    /*
     * Ejercicio 4
     * Diseñar el algoritmo correspondiente a un programa, que:
     * Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
     * Carga la tabla de forma que los componentes pertenecientes a la diagonal de
     * la matriz tomen el valor 1 y el resto el valor 0.
     * Muestra el contenido de la tabla en pantalla.
     */
    public static void SumaDiagonal() {
        int [][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                    
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        for (int[] i : matriz) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 5
     * Diseñar el algoritmo correspondiente a un programa, que:
     * Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
     * Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
     * posiciones o elementos que delimitan la tabla, es decir, las más externas,
     * mientras que el resto de los elementos contendrán el valor 0.
     * 111111111111111
     * 100000000000001
     * 100000000000001
     * 100000000000001
     * 111111111111111
     * Visualiza el contenido de la matriz en pantalla.
     */
    public static void Marco() {
        int [][] matriz = new int[5][15];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 || j == 0 || i == matriz.length - 1 || j == matriz[0].length -1) {
                    matriz[i][j] = 1;
                    
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        for (int[] i : matriz) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
