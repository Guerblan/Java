import java.util.Scanner;

public class App {
    public static void ejercicio1() {
        /*
         * Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe
         * pedir el número de
         * horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir
         * de ahí, las restantes
         * horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total
         * del sueldo
         */
        Scanner teclado = new Scanner(System.in);
        int numhoras = 0;
        System.out.println("¿Cuántas horas has trabajado?");
        numhoras = teclado.nextInt();
        if (numhoras >= 0 && numhoras <= 150) {
            System.out.println("Tu salario es " + numhoras * 10 + " euros");
        } else if (numhoras >= 150) {
            System.out.println("Tu salario es " + (1500 + (numhoras - 150) * 20) + " euros");
        }

    }

    public static void ejercicio2() {
        /*
         * Escribe un programa que lea una variable entera mes y compruebe si el valor
         * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
         * 28 días. Se
         * mostrará además el nombre del mes.
         */
        Scanner teclado = new Scanner(System.in);
        String mes = "";
        System.out.println("Dime un mes que te diré el número de días que tiene");
        mes = teclado.nextLine();
        if (mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Marzo") || mes.equalsIgnoreCase("Mayo")
                || mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Octubre")
                || mes.equalsIgnoreCase("Diciembre")) {
            System.out.println("El mes tiene 31 días");
        } else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Junio")
                || mes.equalsIgnoreCase("Septiembre") || mes.equalsIgnoreCase("Noviembre")) {
            System.out.println("El mes tiene 30 días");
        } else if (mes.equalsIgnoreCase("Febrero")) {
            System.out.println("Ese mes tiene 28 días");
        } else {
            System.out.println("El mes introducido no es válido");
        }

    }

    public static void ejercicio3() {
        /* Diseña un programa que escriba todos los numeros del 100 al 0 de 7 en 7 */

        for (int i = 100; i >= 0; i = i - 7) {
            System.out.println(i);
        }
    }

    public static void ejercicio4() {
        /*
         * Ejercicio: ¿Es par o impar?
         * Escribe un programa en Java que:
         * Pida al usuario que introduzca un número entero.
         * Use un booleano para determinar si el número es par o impar.
         * Muestra un mensaje en pantalla indicando si el número es par o impar.
         */
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean par = false;
        boolean impar = false;
        System.out.println("Dame un número");
        num = teclado.nextInt();
        if (num % 2 == 0) {
            par = true;
        }
        if (par == true) {
            System.out.println("Par");
        }
    }

    public static void ejercicio5() {
        /*
         * Ejercicio: ¿Es positivo o negativo?
         * 
         * Escribe un programa en Java que:
         * 
         * Pida al usuario que introduzca un número entero.
         * Use un booleano para determinar si el número es positivo o negativo.
         * Muestra un mensaje en pantalla indicando si el número es positivo, negativo o
         * cero.
         */
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean positivo = false;
        boolean negativo = false;
        System.out.println("Dame un número");
        num = teclado.nextInt();
        if (num > 0) {
            positivo = true;
        }
        if (positivo) {
            System.out.println("Es positivo");
        }
        if (num < 0) {
            negativo = true;
        }
        if (negativo) {
            System.out.println("Es negativo");
        }
    }

    public static void ejercicio6() {
        /*
         * Introducimos dos numeros por pantalla y utilizando 2 booleanos que sea
         * positivo si los dos número son positivos me los sumas y si no me imprimers
         * por pantalla el numero negativo
         * 
         */
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("mete los dos enteros");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        boolean positivo1 = false;
        boolean positivo2 = false;
        if (num1 > 0) {
            positivo1 = true;
        }
        if (num2 > 0) {
            positivo2 = true;
        }
        if (positivo1 == true && positivo2 == true) {
            System.out.println("La suma es " + (num1 + num2));
        }
        if (positivo1 == false && positivo2 == false || positivo1 == true && positivo2 == false
                || positivo1 == false && positivo2 == true) {
            System.out.println("No me has dado dos numeros positivos");
        }
    }

    public static void ejercicio7() {

    }

    public static void ejercicio8() {

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

    public static void main(String[] args) throws Exception {
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
    }
}
