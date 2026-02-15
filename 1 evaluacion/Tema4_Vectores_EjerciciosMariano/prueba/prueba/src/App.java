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

    }}

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
