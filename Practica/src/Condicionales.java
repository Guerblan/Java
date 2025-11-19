package Practica.src;

import java.util.Scanner;

public class Condicionales {
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

    public static void ejercicio4() {
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

    public static void ejercicio5() {
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

    public static void ejercicio6() {
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

    public static void ejercicio7() {
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
        teclado.close();
    }

    public static void ejercicio8() {
        /*
         * Realiza el control de acceso a una caja fuerte. La combinación será un número
         * de cuatro
         * cifras. El usuario tendrá 4 oportunidades para averiguar el número.
         * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos
         * mostrará el mensaje
         * “Clave incorrecta le quedan X intentos”, si agota los 4 intentos mostrará el
         * mensaje “Lo siento has
         * agotado las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja
         * fuerte”
         */
        Scanner teclado = new Scanner(System.in);
        int clave = 1234;

        for (int i = 1; i == 4; i++) {
            System.out.println("Introduce la contraseña");
            clave = teclado.nextInt();
            if (clave == 1234) {
                System.out.println("Contraseña correcta!");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
        teclado.close();
    }

    public static void ejercicio9() {
        /*
         * Escribe un programa que pida por teclado un día de la semana y que diga qué
         * asignatura toca a primera hora ese día.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué día de la semana?");
        String dia = scanner.nextLine();
        if ("Lunes".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Inglés");
        } else if ("Martes".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Sociales");
        } else if ("Miércoles".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Lenguaje");
        } else if ("Jueves".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Programación");
        } else if ("Viernes".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Programación");
        } else if ("Sábado".equalsIgnoreCase(dia)) {
            System.out.println("Ese día no ha clases");
        } else if ("Domingo".equalsIgnoreCase(dia)) {
            System.out.println("Ese día no hay clases");
        } else {
            System.out.println("Día introducido no válido");
        }
    }

    public static void ejercicio10() {
        /*MISMO EJERCICIO QUE EL ANTERIOR PERO PODEMOS PONER SÓLO IFY ES VÁLIDO

         * Escribe un programa que pida por teclado un día de la semana y que diga qué
         * asignatura toca a primera hora ese día.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué día de la semana?");
        String dia = scanner.nextLine();
        if ("Lunes".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Inglés");
        }
        if ("Martes".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Sociales");
        }
        if ("Miércoles".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Lenguaje");
        }
        if ("Jueves".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Programación");
        }
        if ("Viernes".equalsIgnoreCase(dia)) {
            System.out.println("La primera asignatura del día es: Programación");
        }
        if ("Sábado".equalsIgnoreCase(dia)) {
            System.out.println("Ese día no ha clases");
        }
        if ("Domingo".equalsIgnoreCase(dia)) {
            System.out.println("Ese día no hay clases");
        } else {
            System.out.println("Día introducido no válido");
        }
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

    public static void ejercicio31() {

    }

    public static void ejercicio32() {

    }

    public static void ejercicio33() {

    }

    public static void ejercicio34() {

    }

    public static void ejercicio35() {

    }

    public static void ejercicio36() {

    }

    public static void ejercicio37() {

    }

    public static void ejercicio38() {

    }

    public static void ejercicio39() {

    }

    public static void ejercicio40() {

    }

    public static void ejercicio41() {

    }

    public static void ejercicio42() {

    }

    public static void ejercicio43() {

    }

    public static void ejercicio44() {

    }

    public static void ejercicio45() {

    }

    public static void ejercicio46() {

    }

    public static void ejercicio47() {

    }

    public static void ejercicio48() {

    }

    public static void ejercicio49() {

    }

    public static void ejercicio50() {

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
        ejercicio10();
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
        // ejercicio31();
        // ejercicio32();
        // ejercicio33();
        // ejercicio34();
        // ejercicio35();
        // ejercicio36();
        // ejercicio37();
        // ejercicio38();
        // ejercicio39();
        // ejercicio40();
        // ejercicio41();
        // ejercicio42();
        // ejercicio43();
        // ejercicio44();
        // ejercicio45();
        // ejercicio46();
        // ejercicio47();
        // ejercicio48();
        // ejercicio49();
        // ejercicio50();

    }
}
