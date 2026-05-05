import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class ArraysRepaso {

    public static void ejercicio1() {
        /*
         * Ejercicio 1 — Crear y mostrar un vector (MUY FÁCIL)
         * 
         * Crea un vector de 5 números enteros.
         * 
         * Asigna valores manualmente y muestra todos los valores por pantalla usando un
         * for.
         */
        int vector[] = { 3, 2, 1, 1, 4 };
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }

    public static void ejercicio2() {
        /*
         * Leer valores en un vector (FÁCIL)
         * 
         * Crea un vector de 10 posiciones.
         * 
         * Pide al usuario 10 números y guárdalos dentro del vector.
         * 
         * Después muestra el contenido.
         */
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un valor en el vector");
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void ejercicio3() {
        /*
         * Ejercicio 3 — Calcular la suma y media (FÁCIL–MEDIA)
         * 
         * Pide 8 números y guárdalos en un vector.
         * 
         * Calcula:
         * 
         * La suma total
         * La media
         */
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int resta = 0;
        int array[] = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número");
            array[i] = sc.nextInt();
            suma += array[i];
            resta -= array[i];
        }
        System.out.println(suma);
        System.out.println(resta);
    }

    public static void ejercicio4() {
        /*
         * Pide 10 números.
         * 
         * Después pide un número extra y busca si está dentro del vector.
         * 
         * Si está:
         * 
         * Mostrar la posición.
         * 
         * Si no:
         * 
         * Mostrar que no existe.
         */
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.err.println("Mete un númmero");
            array[i] = sc.nextInt();

        }
        int num;
        System.out.println("Dame un número extra");
        num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println(i);
            } else {
                System.out.println("No existe");
            }
        }
    }

    public static void ejercicio5() {
        /*
         * Ejercicio 5 — Ordenar un vector (MEDIA)
         * 
         * Pide 10 números.
         * 
         * Ordénalos usando:
         * 
         * Arrays.sort()
         * 
         * Muestra el vector antes y después.
         */
        /*
         * int array[] = { 3, 2, 5, 8, 5, 7, 8 };
         * System.out.println(Arrays.sort(array));
         */
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.err.println("Mete un númmero");
            array[i] = sc.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void ejercicio6() {
        /*
         * Crea un vector con valores.
         * 
         * Haz una copia usando:
         * 
         * Arrays.copyOf()
         * 
         * Muestra ambos.
         */
        int array[] = { 3, 2, 5, 8, 5, 7, 8 };
        int copia[] = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + ",");
        }
    }

    public static void ejercicio7() {
        /*
         * Ejercicio 7 — Insertar un elemento en un vector (ALTA)
         * 
         * Tienes un vector.
         * 
         * Añade un número al final creando un vector nuevo.
         */
        int array[] = { 9, 2, 12, 8, 46, 7, 8 };
        int copia[] = Arrays.copyOf(array, array.length + 1);
        copia[copia.length - 1] = 1;
    }

    public static void ejercicio8() {
        /*
         * Ejercicio 8 — Eliminar un elemento (ALTA)
         * 
         * Dado un vector y un número:
         * 
         * Elimina ese número del vector.
         * 
         * Qué entrenas
         * 
         * Búsqueda
         * Eliminación
         * Copia sin un elemento
         * 
         * Esto viene del algoritmo de eliminación en vectores.
         */
        int array[] = { 4, 5, 2, 2, 10, 69, 74, 5, };
        System.out.println("El array es : " + Arrays.toString(array));
        System.out.println("Dime un número");
        int num = sc.nextInt();
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                posicion = i;
            }
        }
        // int copia[] = Arrays.copyOf(array, array.length - 1);

        int copia[] = Arrays.copyOf(array, array.length - 1);
        int j = 0;
        for (int i = 0; i < copia.length; i++) {
            if (posicion != i) {
                copia[j] = array[i];
                j++;
            }
        }

    }

    public static void ejercicio9() {
        /*
         * Escribe un programa que pida 10 números por teclado,los almacene en un array
         * y que luego muestre el máximo valor,el mínimo y las posiciones que ocupa en
         * el array.
         */
        Scanner sc = new Scanner(System.in);
        int num;

        int posMax = 0;
        int posMin = 0;
        int array[] = new int[10];
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            num = sc.nextInt();
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                posMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                posMin = i;
            }
        }
        System.out.println("El máximo valor del array es : " + max + " que está en la poscición : " + posMax);
        System.out.println("El mínimo valor del array es : " + min + " que está en la poscición : " + posMin);

    }

    public static void ejercicio10() {
        /*
         * 
         * 
         * Realiza un programa que dado un array desordenado lo ordene y lo muestre por
         * consola siguiendo
         * el algoritmo que desees.
         * 
         */
        int array[] = { 3, 5, 2, 1, 9, 7, 8, 6 };
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";");
        }
    }

    public static void ejercicio11() {

        /*
         * Define un vector de 10 posiciones e introduce las 5 primeras posiciones con
         * numeros enteros.
         * 
         * Borra cualquier posición y lo muestras.
         * 
         * Borra el elemento que tenga como valor 8
         */
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10];
        int num;
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            vector[i] = num;
        }
        System.out.println("Dime qué posición quieres borrar");
        int posicion = sc.nextInt();
        for (int i = posicion; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }
        vector[vector.length - 1] = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 8) {
                for (int j = i; j < vector.length - 1; j++) {
                    vector[j] = vector[j + 1];
                }
            }
        }
        vector[vector.length - 1] = 0;

    }

    public static void ejercicio12() {
        /*
         * Define un vector de 10 posiciones e introduce las primeras 6 posiciones con
         * números enteros.
         * 
         * Muestra el vector por pantalla.
         * 
         * Elimina la posición 3 del vector (desplazando los elementos hacia la
         * izquierda).
         * 
         * Muestra el vector actualizado.
         * 
         * Busca un número específico introducido por el usuario y sustitúyelo por un 0.
         * 
         * Muestra el vector final tras la sustitución.
         */
        int vector[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce valores en el vector");
            int num = sc.nextInt();
            vector[i] = num;
        }
        System.out.println(Arrays.toString(vector));
        for (int i = 3; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }
        vector[vector.length - 1] = 0;
        System.out.println(Arrays.toString(vector));
        System.out.println("Introduce un número a eliminar del vector");
        int num1 = sc.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num1) {
                vector[i] = 0;
            }
        }
        System.out.println(Arrays.toString(vector));
    }

    public static void ejercicio13() {
        /*
         * Declara una matriz de enteros de 3 filas y 4 columnas. Después, recórrela con
         * dos for y muestra todos sus valores por pantalla.
         */
        int[][] matriz = new int[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void ejercicio14() {

        /*
         * Ejercicio de este tipo:
         * 
         * Crea una matriz de 4 filas y 5 columnas. Rellénala con números aleatorios del
         * 1 al 20. Después, muestra la matriz completa y pide al usuario qué fila
         * quiere ver.
         * 
         * El usuario debe introducir una fila del 1 al 4. Luego muestra solo esa fila.
         */
        int[][] matriz = new int[4][5];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(20) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Introduce un número de fila");
        int num = sc.nextInt();
        for (int j = 0; j < matriz[num - 1].length; i++) {
            System.out.println(matriz[num - 1][j]);
        }
    }

    public static void ejercicio15() {
        /*
         * 
         * 
         * Crea una matriz de 3 filas y 6 columnas. Rellénala con números aleatorios del
         * 10 al 30. Muestra la matriz completa. Después pide al usuario qué fila quiere
         * ver, del 1 al 3, y muestra solo esa fila.
         */
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(20) + 10;
            }
        }
        System.out.println("Introduce el número de fila a mostrar");
        int fila = sc.nextInt();
        for (int j = 0; J < matriz[fila - 1].length; i++) {
            System.out.println(matriz[fila - 1][j] + " ");
        }
        System.out.println();
    }

    public static void ejercicio16() {
        /*
         * Crea una matriz de 4 filas y 5 columnas. Rellénala con números aleatorios del
         * 1 al 50. Muestra la matriz completa. Después pide al usuario qué columna
         * quiere ver, del 1 al 5, y muestra solo esa columna.
         */
        int[][] matriz = new int[4][5];
        Scanner sc = new Scanner(System.in);
        Random random = new andom();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
                System.out.println(" ");
            }
            System.out.println();
        }
        System.out.println("introduce el número de columna a imprimir");
        int columna = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][columna - 1]);
        }
    }

    public static void ejercicio17() {

    }

    public static void ejercicio18() {

    }

    public static void ejercicio19() {

    }

    public static void ejercicio20() {

    }

    public static void ejercicio21() {

    }

    public static void ejercicio22() {

    }

    public static void ejercicio23() {

    }

    public static void ejercicio24() {

    }

    public static void ejercicio25() {

    }

    public static void ejercicio26() {

    }

    public static void ejercicio27() {

    }

    public static void ejercicio28() {

    }

    public static void ejercicio29() {

    }

    public static void ejercicio30() {

    }

    public static void main(String[] args) {

        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        ejercicio13();
        // ejercicio14();
        // ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();
        // ejercicio25();
        // ejercicio26();
        // ejercicio27();
        // ejercicio28();
        // ejercicio29();
        // ejercicio30();

    }

}
