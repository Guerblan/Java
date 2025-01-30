import java.util.Scanner;

/*

MÉTODO BURBUJA:

public void ordena_numero(int array[]) {
       int aux = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j]<(array[j + 1])) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }

        }
    }
     */
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
        teclado.close();
    }

    public static void ejercicio3() {
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

    public static void ejercicio5() {

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
        ejercicio3();
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
