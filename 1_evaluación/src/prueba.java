import java.util.Scanner;

public class prueba {
    public static void ejercicio1() {
        /*
         * • Ejercicio 1: Escribe un programa que pida un número y diga si es o no
         * múltiplo de 3.
         */
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingresa un número");
        num = teclado.nextInt();
        if (num % 3 == 0) {
            System.out.println("El número introduciodo es múltiplo de 3");
        } else if (num % 3 != 0) {
            System.out.println("El número introducido no es múltiplo de 3");
        }
    }

    public static void ejercicio2() {
        /*
         * • Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y
         * calcula y muestra el
         * mayor de los tres.
         */
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Dame un número");
        num1 = teclado.nextInt();
        System.out.println("Dame otro número");
        num2 = teclado.nextInt();
        System.out.println("Dame un último número");
        num3 = teclado.nextInt();
        if (num1 > num2 & num1 > num3) {
            System.out.println(num1 + " es el mayor de los 3 números");
        } else if (num2 > num1 & num2 > num3) {
            System.out.println(num2 + " es el número mayor");
        } else if (num3 > num1 & num3 > num2) {
            System.out.println(num3 + "es el nñumero más alto ");
        } else {
            System.out.println("No hay un número claro que sea el más alto");
        }

    }

    public static void ejercicio3() {
        /*
         * • Ejercicio 3: Escribe un programa que lea por teclado tres números enteros
         * H, M, S correspondientes
         * a hora, minutos y segundos respectivamente, y comprueba si la hora que
         * indican es una hora válida.
         * Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
         * para las horas será
         * mayor o igual que cero y menor que 24. El valor válido para los minutos y
         * segundos estará
         * comprendido entre 0 y 59 ambos incluidos.
         */

    }

    public static void ejercicio4() {
        /*
         * • Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y
         * 10, y muestre en pantalla
         * el nombre en letras de ese número. Se debe controlar que se introduzca un
         * número válido.
         */

    }

    public static void ejercicio5() {
        /*
         * • Ejercicio 5: Escribe un programa que realice lo contrario que el anterior,
         * es decir pide un número en
         * letras y enseña un número.
         * Aclaración: No es lo mismo la cadena "Uno" que "uno" o que "UNO", por lo
         * tanto, para que el
         * programa funcione correctamente deberías pasar todas las letras del nombre
         * del número a
         * mayúsculas o a minúsculas. Investiga cuál es la función del objeto String que
         * nos permite realizar ese
         * cambio.
         */
    }

    public static void ejercicio6() {
        /*
         * • Ejercicio 6: Escribe un programa que lea una variable entera mes y
         * compruebe si el valor
         * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
         * 28 días. Se
         * mostrará además el nombre del mes.
         * Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
         */
    }

    public static void ejercicio7() {
        /*
         * • Ejercicio 7: Escribe un programa que pida la nota de las tres evaluaciones,
         * y si están aprobadas
         * realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si
         * no, escribe que evaluación
         * debe recuperar.
         */
    }

    /*
     * • Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador.
     * Debe pedir el número de
     * horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir
     * de ahí, las restantes
     * horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total
     * del sueldo.
     */
    public static void ejercicio8() {
        Scanner teclado = new Scanner(System.in);
        int numhora;
        System.out.println("Introduce el número de horas trabajadas");
        numhora = teclado.nextInt();
        if (numhora > 0 && numhora <= 150) {
            System.out.println("El sueldo es de " + (10 * numhora) + " euros");
        } else if (numhora > 150) {
            System.out.println("El sueldo es de " + (20 * numhora) + " euros");
        } else {
            System.out.println("No le corresponde sueldo");
        }

    }

    public static void ejercicio9() {
        /*
         * • Ejercicio 9: Escribe un programa que diga si un año es bisiesto. No deber
         * permitir aceptar años
         * negativos. Un año es bisiesto si cumple una de las siguientes reglas:
         * 1. Divisible entre 4, divisible entre 100 y divisible entre 400.
         * 2. Divisible entre 4, NO divisible entre 100.
         */
        Scanner teclado = new Scanner(System.in);
        int anio;
        System.out.println("Introduce el año");
        anio = teclado.nextInt();
        if ((anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) || (anio % 4 == 0 && anio % 100 == 0)) {
            System.out.println("El año es bisiesto");
        } else if (anio < 0) {
            System.out.println("El año introducido no es válido");
        } else {
            System.out.println("El año introducido no es bisiesto");
        }
    }

    public static void main(String[] args) {
        // ejercicio1();
        ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();

    }
}
