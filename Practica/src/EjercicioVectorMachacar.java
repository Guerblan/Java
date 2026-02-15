package Practica.src;

import java.util.Scanner;

public class EjercicioVectorMachacar {
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
