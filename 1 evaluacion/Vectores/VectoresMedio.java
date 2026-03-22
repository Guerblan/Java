import java.util.Arrays;
import java.util.Scanner;

// Ejercicios redistribuidos desde Vectores.java

class VectoresMedio {

public static void ejercicio6() {
        /*
         * Realiza un programa que pida al usuario 9 números naturales y los almacene en
         * un array a,
         * tras ello,introducir todos los numeros que sean pares en un array b y los que
         * sean impares
         * en un array c,tanto el array b como el array c se tendrán que mostrar por
         * pantalla.
         * 
         */

        Scanner teclado = new Scanner(System.in);

        int a[] = new int[9];
        int b[] = new int[0];
        int c[] = new int[0];

        System.out.println("Introduce los valores");

        for (int i = 0; i < 9; i++) {
            a[i] = teclado.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (a[i] % 2 == 0) {
                b = Arrays.copyOf(b, b.length + 1);
                b[b.length - 1] = a[i];
            }

            else {
                c = Arrays.copyOf(c, c.length + 1);
                c[c.length + 1] = a[i];
            }

        }

    }

public static void ejercicio7() {
        /*
         * Escribe un programa que pida 10 números por teclado,los almacene en un array
         * y que luego muestre el máximo valor,el mínimo y las posiciones que ocupa en
         * el array.
         */
    }

public static void ejercicio8() {
        /*
         * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
         * los almacene
         * en un array
         */
    }

public static void ejercicio9() {
        /*
         * 9)
         * 
         * Realiza un programa que dado un array desordenado lo ordene y lo muestre por
         * consola siguiendo
         * el algoritmo que desees.
         * 
         */

    }

public static void ejercicio11() {
        /*
         * 11) Realiza un programa que dado un array bidimensional, lo
         * muestre por pantalla con la siguiente estructura:(está en una imagen
         * en el pdf de Mariano )
         */
        Scanner teclado = new Scanner(System.in);

        int[][] array = { { 2, 4, 5, 1 }, { 4, 2, 5, 1 }, { 4, 1, 1, 8 }, { 4, 4, 8, 8 } };
        System.out.println("Introduce la matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

}

// ===== Eliminacion en vectores integrada =====

import java.util.Scanner;

class EliminacionVectoresMedio {
    /*
     * Define un vector de 10 posiciones e introduce las 5 primeras posiciones con
     * numeros enteros y muestralo.
     * Borra la posicion 2 y muestralo.
     * 
     * Borra el elemento que tenga como valor 8
     *
     */

    public static void EjercicioVector() {
        Scanner scan = new Scanner(System.in);

        int listaNum[] = new int[10];

        int posicion = 5;

        // Introduce valores en el vector.
        for (int i = 0; i < posicion; i++) {
            System.out.println("Introduce un valor:");
            listaNum[i] = scan.nextInt();
        }
        // Imprimir el vector
        for (int i = 0; i < posicion; i++) {
            System.out.println("El vector es: " + listaNum[i]);
        }
        System.out.println();

        // Eliminar con la posicion del vector.
        /*
         * System.out.println("Que posicion quieres quitar");
         * int posEliminada = scan.nextInt();
         * for (int i = posEliminada; i < posicion - 1; i++) {
         * listaNum[i] = listaNum[i + 1];
         * 
         * }
         * listaNum[posicion - 1] = 0;
         * posicion--;
         * // Muestra el vector
         * for (int i = 0; i < posicion; i++) {
         * System.out.println("El vector que queda es:" + listaNum[i]);
         * }
         */

        // Eliminar segun un valor

        System.out.println("Introduce el valor que quieres eliminar:");
        int valor = scan.nextInt();
        for (int i = 0; i < posicion; i++) {
            if (listaNum[i] == valor) {
                for (int j = i; j < posicion - 1; j++) {
                    listaNum[j] = listaNum[j + 1];

                }
                listaNum[posicion - 1] = 0;
                posicion--;
            }

        }

        // Muestra el vector
        for (int i = 0; i < posicion; i++) {
            System.out.println("El vector que queda es:" + listaNum[i]);
        }

    }

    public static void main(String[] args) {
        EjercicioVector();
    }

}

