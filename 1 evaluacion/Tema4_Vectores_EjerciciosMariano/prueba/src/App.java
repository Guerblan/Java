import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void ejercicio1() {
        /*
         * Reliza un programa que pida al usuario un numero natural n,a partir de ese
         * número
         * le pediremos n veces que nos introduzca otros numeros
         * que almacenaremos en un array a y mostraremos por pantalla
         */
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Dame un múmero n");
        num = teclado.nextInt();

        int num2[] = new int[num];

    }

    public static void ejercicio2(){
        /*
         * Realizar un programa que teniendo un array relleno con valores a de tamaño 5,
         * realize una copia del mismo en otra variable array b y lo muestre por
         * pantalla el array
         * b en orden ascendente y el b en orden descendente
         */

        int arraya[] = { 24, 14, 15, 54, 76 };
        int arrayb[] = Arrays.copyOf(arraya, arraya.length);
        arraya[3] = 4;

        for (int i = 0; i < arraya.length; i++) {
            System.out.println(arraya[i]);
            System.out.println(arrayb[i]);
        }

    public static void ejercicio3() {
        /*
         * 3_ Realiza un programa que pida números enteros postivos al usuario y los
         * almacene en un array a ,
         * cuando el usuario introduzca -1 se dejará de pedir números y se mostrará el
         * array a de ñps múmeros que ha ontroducido
         * exceptuando el -1
         */
    }

    public static void ejercicio4() {
        /*
         * 4_Realiza un programa que pida al ususario un array de 10 elementos y muestre
         * por pantalla un array b que contenga los
         * elementos al revés,finalmente muestra por pantalla el array b
         * 
         */
    }

    public static void ejercicio5() {

        /*
         * Realiza un programa que pida al usuario un congunto de números para un array
         * de 8 elementos
         * y muestre por mantalla un array b que sólo contenga los elementos impares
         * 
         */

    }

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

    /*
     * 10)
     * Haz un programa que genere 20 números enteros del 1 al 50 ambos inclusive
     * y los almacene en un array,posteriormente almacenará en un nuevo array solo
     * los números primos que haya en ese array.Ambos arrays nalmente serán
     * mostrados por consola.
     */
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

    public static void ejercicio12() {
        /*
         * Realiza un programa que dado un array bidimensional lo
         * rellene de números enteros aleatorios del 2 al 12 (ambos
         * inclusive)
         */

    }

    public static void ejercicio13() {
        /*
         * Realiza un programa que inserte en un array bidimensional
         * de 3x3 de números enteros, compuesto solamente por 0, tres
         * valores 1 en una posición aleatoria, no pueden solaparse, es
         * decir, ocupar la misma casilla alguno de los tres valores,
         * después muestra por pantalla el contenido del array.
         * 
         */

    }

    public static void ejercicio14() {
        /*
         * Realiza un programa que pida al usuario el tamaño en las
         * dos dimensiones (X e Y) de un array bidimensional, construya
         * un array bidimensional (con esas dimensiones) con todas las
         * posiciones con el valor 0 y lo muestre por pantalla.
         * Posteriormente se va introducir en el array el valor 1 en todas
         * las posiciones exceptuando las que estén en los bordes
         * exteriores del array, ejemplo:(en la imagen del pdf del ejercicio)
         */

    }

    public static void ejercicio15() {
        /*
         * Realiza un programa que inserte en un array bidimensional
         * de 5x5 de números enteros, compuesto solamente por 0, tres
         * valores 1 de manera aleatoria, no pueden solaparse, es decir,
         * ocupar la misma casilla alguno de los tres valores, ni pueden
         * estar en casillas contiguas vertical u horizontalmente
         * (diagonalmente sí) después muestra por pantalla el contenido
         * del array.
         * 
         */

    }

    public static void ejercicio16() {
        /*
         * Realiza un programa en donde dado un array bidimensional
         * de tamaño 5x5 (con las posiciones con el valor 0) el usuario
         * puede introducir los números que él desee uno a uno, hasta
         * que introduzca la letra n. Cada vez que el usuario introduzca
         * un número se le mostrará el contenido del array. Ejemplo:
         * (en la imagen del pdf del ej)
         */

    }

    public static void ejercicio17() {
        /*
         * Realiza un tablero de ajedrez con cuadros negros: \u25A1,
         * cuadro blancos: \u25A0 y una dama ۩ presenta la dama en
         * una posición cualquiera (al azar) del tablero (array
         * bidimensional) y vas a pedir la nueva coordenada de la dama
         * en el tablero, existen dos posibilidades: que no sea válida (se
         * informará al usuario que no es válida y que no se puede
         * realizar el movimiento) o que sea válida (en este caso se
         * mostrará la nueva disposición de la dama en el tablero), según
         * las reglas del ajedrez. En ambos casos se le pedirá al usuario
         * si desea seguir jugando (s->Sí y n->No) y en caso armativo se
         * le volverá a pedir las nuevas coordenadas y el proceso volverá
         * a empezar.
         */

    }

    public static void main(String[] args) throws Exception {
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
        // ejercicio13();
        // ejercicio14();
        // ejercicio15();

    }
}
