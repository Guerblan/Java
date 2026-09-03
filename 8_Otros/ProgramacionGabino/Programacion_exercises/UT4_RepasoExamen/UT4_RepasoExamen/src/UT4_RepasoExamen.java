import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UT4_RepasoExamen {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String menu = "\n1 - Calculadora"
                + "\n2 - Max"
                + "\n3 - Ordenar"
                + "\n4 - Derecha";
        int opcion;
        Boolean flag = true;
        do {
            System.out.println("\n" + menu);
            System.out.print("\nOpción: ");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (opcion) {
                case 1 -> Calculadora();
                case 2 -> Max();
                case 3 -> Ordenar();
                case 4 -> Derecha();
                default -> {
                    flag = false;
                    sc.close();
                }
            }
        } while (flag);
    }

    public static int[][] MatrizAleatoria(int filas, int columnas, int aleatoriosMin, int aleatoriosMax) {
        int[][] matrizAleatoria = new int[filas][columnas];
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[0].length; j++) {
                matrizAleatoria[i][j] = random.nextInt(aleatoriosMin, aleatoriosMax);
            }
        }
        return matrizAleatoria;
    }

    public static void PintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio: Programa una calculadora de matrices con las siguientes
     * operaciones:
     * 
     * Suma entre matrices de igual tamaño
     * Producto escalar (Un entero por una matriz)
     * Producto entre matrices (Ver video)
     * Matriz traspuesta (Lo que antes eran filas, ahora son columnas)
     */
    public static void Calculadora() {
        String menuCalculadora = "\n1 - Suma"
                + "\n2 - Producto escalar"
                + "\n3 - Producto matrices"
                + "\n4 - Matriz transpuesta";
        int opcion;
        System.out.println("\n" + menuCalculadora);
        System.out.print("\nOpción: ");
        opcion = Integer.parseInt(sc.nextLine());
        System.out.println();
        switch (opcion) {
            case 1 -> Suma();
            case 2 -> ProductoEscalar();
            case 3 -> ProductoMatrices();
            case 4 -> MatrizTranspuesta();
        }
    }

    public static void Suma() {
        System.out.print("Número de filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Número de columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = MatrizAleatoria(filas, columnas, 1, 10);
        int[][] matriz2 = MatrizAleatoria(filas, columnas, 1, 10);
        System.out.println("Matriz1: ");
        PintarMatriz(matriz1);
        System.out.println("Matriz2: ");
        PintarMatriz(matriz2);
        int[][] matrizSuma = new int[filas][columnas];
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[0].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Resultado de sumar ambas matrices: ");
        PintarMatriz(matrizSuma);
    }

    public static void ProductoEscalar() {
        System.out.print("Número de filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Número de columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.print("Número entero para multiplicar: ");
        int numero = Integer.parseInt(sc.nextLine());
        int[][] matriz = MatrizAleatoria(filas, columnas, 1, 10);
        System.out.println("Vamos a multiplicar por " + numero
                + "esta matriz: ");
        PintarMatriz(matriz);
        int[][] matrizProducto = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizProducto[i][j] = matriz[i][j] * numero;
            }
        }
        System.out.println("Este es el resultado: ");
        PintarMatriz(matrizProducto);
    }

    public static void ProductoMatrices() {
        System.out.print("Número de filas Matriz1: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Número de columnas Matriz1: ");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.println("La matriz2 tendrá las mismas columnas que filas la matriz1");
        System.out.print("Número de columnas Matriz2: ");
        int columnas2 = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = MatrizAleatoria(filas, columnas, 1, 10);
        int[][] matriz2 = MatrizAleatoria(columnas, columnas2, 1, 10);
        System.out.println("Matriz1: ");
        PintarMatriz(matriz1);
        System.out.println("Matriz2: ");
        PintarMatriz(matriz2);
        int[][] matrizProducto = new int[filas][columnas2];
        for (int i = 0; i < matrizProducto.length; i++) {
            for (int j = 0; j < matrizProducto[0].length; j++) {
                for (int k = 0; k < columnas; k++) {
                    matrizProducto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println("El resultado es:");
        PintarMatriz(matrizProducto);
    }

    public static void MatrizTranspuesta() {
        System.out.print("Número de filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Número de columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        int[][] matriz = MatrizAleatoria(filas, columnas, 1, 10);
        System.out.println("La matriz original es: ");
        PintarMatriz(matriz);
        int[][] matrizTranspuesta = new int[columnas][filas];
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[0].length; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("La matriz transpuesta es: ");
        PintarMatriz(matrizTranspuesta);
    }

    /*
     * Ejercicio 2: Crea un programa que, dado un array, encuentre el segundo valor
     * más grande.
     */
    public static void Max() {
        int[] array = { 2, 9, 7, 3, 9, 7, 0 };
        System.out.println(Arrays.toString(array));
        /*
         * Otra forma de hacerlo:
         * int max = 0;
         * int segundoMax = 0;
         * for (int i = 0; i < array.length; i++) {
         * if (max < array[i]) {
         * segundoMax = max;
         * max = array [i];
         * }
         * }
         */
        int max = 0;
        int iTemp = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("El valor máximo es " + max);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = 0;
            }
        }
        max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("El segundo valor máximo es " + max);
    }

    /*
     * Ejercicio 3: Crea un programa que genere un array de números enteros.
     * Posteriormente
     * deberá guardar en un segundo array todos los números ordenados de menor a
     * mayor.
     */
    public static void Ordenar() {
        int size = 11;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }
        System.out.println("El array original es: " + Arrays.toString(array));
        int[] array2 = new int[size];
        int min = Integer.MAX_VALUE;
        int jTemp = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    jTemp = j;
                }
            }
            min = Integer.MAX_VALUE;
            array2[i] = array [jTemp];
            array[jTemp] = Integer.MAX_VALUE;
        }
        System.out.println("El array final es "+ Arrays.toString(array2));
    }

    /*
     * Ejercicio 4: Crea un programa que rote un array hacia la derecha. Al rotar,
     * cada elemento pasa a ocupar el lugar de su derecha. El último elemento
     * ocupará la primera posición.
     */
    public static void Derecha() {
        int size = 4;
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(1,10);
        }
        System.out.println("El array original es: "+ Arrays.toString(array));
        int [] arrayDerecha = new int[size];
        arrayDerecha [0] = array [size-1];
        for (int i = 1; i < arrayDerecha.length; i++) {
            arrayDerecha[i] = array [i-1];
        }
        System.out.println("El array movido a la derecha es: "+ Arrays.toString(arrayDerecha));
    }
}
