import java.util.Scanner;

public class RepasoAccesoDatos {

    public static void ejercicio1() {
        /*
         * Realizar un programa que pida por teclado un número determinado de
         * números
         * e indica cuántos son pares e impares, además de visualizar la suma total de
         * ambos tipos.
         */

        Scanner Sc = new Scanner(System.in);
        int numeros = 0;
        int num = 0;
        int par = 0;
        int inpar = 0;
        int suma = 0;
        System.out.println("Qué cantidad de números quieres que te pida?");
        numeros = Sc.nextInt();
        if (numeros >= 0) {
            for (int i = 1; i <= numeros; i++) {
                System.out.println("Dame un número");
                num = Sc.nextInt();
                suma += num;
                if (num % 2 == 0) {
                    par++;
                }
                if (num % 2 != 0) {
                    inpar++;
                }

            }
            System.out.println("El número de pares es " + par);
            System.out.println("El número de inmpares es " + inpar);
            System.out.println("La suma es " + suma);
        } else {
            System.out.println("Error.Tienes que meter una cantidad mayor que 0");
        }

    }

    public static void ejercicio2() {
        /*
         * . Escribir un programa que pide un número y muestre todos sus antecesores
         * indicando si son positivos o negativos y si son pares o impares.
         */
        Scanner sca = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un número positivo");
        num = sca.nextInt();
        for (int i = 0; i < num; i++ ) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        ejercicio2();
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
    }
}
