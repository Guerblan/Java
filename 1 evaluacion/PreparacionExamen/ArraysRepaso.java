import java.util.Scanner;
import java.util.Arrays;

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

    }

    public static void ejercicio10() {

    }

    public static void ejercicio11() {

    }

    public static void ejercicio12() {

    }

    public static void ejercicio13() {

    }

    public static void ejercicio14() {

    }

    public static void ejercicio15() {

    }

    public static void ejercicio16() {

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
        ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
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
