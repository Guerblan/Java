import java.util.Scanner;
import java.util.Random;

public class bucles1 {
    /*
     * Ejercicio 1: Realizar un programa que imprima en pantalla los números del 1
     * al 100. (Debes hacerlo
     * con las tres estructuras iterativas vistas: while, do while y for).
     */
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        /*
         * usando while:
         * int num = 1;
         * while(num<=100){
         * System.out.println(num);
         * num++;
         * }
         */

        /*
         * usando do while:
         * int num = 1;
         * do {
         * System.out.println(num);
         * num++;
         * }while(num<=100);
         */

        for (int num = 1; num <= 100; num++) {
            System.out.println(num);
        }

    }

    /*
     * • Ejercicio 2: Escribir un programa que solicite un valor positivo y nos
     * muestre desde 1 hasta el valor
     * ingresado de uno en uno.
     */
    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        int num;
        int i = 1;
        System.out.println("Dame el número");
        num = teclado.nextInt();
        while (num > 0 && i <= num) {
            System.out.println(i);
            i++;
        }
    }

    /*
     * • Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por
     * teclado y nos muestre
     * posteriormente la suma de los valores ingresados y su promedio.
     */
    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        int num;
        double sum = 0;
        double promedio;
        int i = 0;
        while (i <= 9) {
            System.out.println("Dame los números");
            num = teclado.nextInt();
            sum = sum + num;
            i++;
        }
        promedio = (sum / i);
        System.out.println("La suma de los valores es " + sum + " y la media " + promedio);
    }

    public static void ejercicio4() {
        /*
         * • Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
         * o Guarda en una variable tu nombre.
         * o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
         * por teclado.
         * o El programa finaliza cuando el usuario adivina tu nombre. Sino el programa
         * debe continuar
         * pidiendo al usuario que lo intente otra vez.
         */
        Scanner teclado = new Scanner(System.in);
        String nombre = "Pedro";
        String nombre2;
        do {
            System.out.println("Introduce el nombre");
            nombre2 = teclado.nextLine();
        } while (nombre2.equalsIgnoreCase(nombre) == false);

    }

    /*
     * • Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y
     * muestre al usuario el resultado
     * de la tirada. Si los dos dados tienen el mismo número debe mostrar un mensaje
     * indicando que el
     * resultado es el mismo. La aplicación se debe repetir hasta que el usuario
     * indique que no quiere tirar
     * más (preguntando por ‘s’ o ‘n’, o “si” o “no”).
     */
    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        Random tirada = new Random();
        int dado1, dado2;
        String parar = "si";
        while (parar.equalsIgnoreCase("si") || parar.equalsIgnoreCase("s")) {
            dado1 = tirada.nextInt(6) + 1;
            dado2 = tirada.nextInt(6) + 1;
            if (dado1 == dado2) {
                System.out.println("Ambos dados dan el mismo resulatdo, " + dado1 + " y " + dado2);
            } else {
                System.out.println("Los resultados son " + dado1 + " y " + dado2);
            }
            System.out.println("Quieres seguir jugando?");
            parar = teclado.nextLine();
            if (parar.equalsIgnoreCase("no") || parar.equalsIgnoreCase("n")) {
                System.out.println("Ok amigo adiosss");
            } else if (parar.equalsIgnoreCase("si") || parar.equalsIgnoreCase("s")) {
            } else {
                while (!(parar.equalsIgnoreCase("si") || parar.equals("s") || parar.equalsIgnoreCase("no")
                        || parar.equalsIgnoreCase("n"))) {
                    System.out.println("Respuesta no válida");
                    System.out.println("Introduce una respuesta correcta");
                    parar = teclado.nextLine();
                }
            }

        }
    }

    /*
     * • Ejercicio 6: Realizar un juego para adivinar un número. Para ello primero,
     * el programa debe guardar
     * un número en una variable y el usuario debe introducir números hasta
     * acertarlos. Para darle pistas
     * al usuario se le indicará “mayor” o “menor” según sea mayor o menor con
     * respecto al número
     * guardado. El proceso termina cuando el usuario acierta.
     */

    /*
     * • Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre
     * la hora sin parar. Debe
     * esperar un segundo real para darle más realismo. Pasos:
     * o Pide al usuario que introduzca la hora y los minutos.
     * o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
     * o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
     * cambio de
     * minuto y hora
     * o Muéstralo por pantalla.
     * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa
     * durante 1000
     * milisegundos = 1 segundo).
     */

    /*
     * • Ejercicio 8: Escriba un programa que calcule el factorial de un número. El
     * factorial de un número es
     * igual al producto de todos los números enteros positivos desde 1 hasta dicho
     * número.
     */

    /*
     * • Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. La
     * altura de la escalera se lee
     * por teclado. Ejemplo: Si introducimos un 5 nos queda:
     *
     **
     ***
     ****
     *****
     * Posteriormente hacer lo mismo, pero con la pirámide invertida.
     */

    public static void main(String[] args) throws Exception {
         ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio3();
         //ejercicio4();
        //ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
    }
}
