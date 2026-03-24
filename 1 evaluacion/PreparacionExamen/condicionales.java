package PreparacionExamen;

import java.util.Scanner;

public class condicionales {

    public static void ejercicio1() {
        /*
         * UT3 — Nivel alto
         * Ejercicio
         * 
         * Haz un programa que:
         * 
         * Pida dos números
         * Pida una operación
         * 
         * 1 → Sumar
         * 2 → Restar
         * 3 → Multiplicar
         * 4 → Dividir
         * 
         * El programa debe realizar la operación elegida.
         * 
         * Ejemplo:
         * 
         * Número 1: 6
         * Número 2: 3
         * Operación: 3
         * 
         * Salida:
         * 
         * Resultado: 18
         */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num1 = 0;
        int opcion = 0;
        System.out.println("Dame un primer número");
        num = sc.nextInt();
        System.out.println("Dame un segundo número");
        num1 = sc.nextInt();
        System.out.println("Qué operacióin quieres hacer?");
        System.out.println("1_Sumar");
        System.out.println("2_Restar");
        System.out.println("3_Multiplicar");
        System.out.println("4_Dividir");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de " + num + " + " + num1 + " es: " + (num + num1));
                break;
            case 2:
                System.out.println("La resta de " + num + " - " + num1 + " es: " + (num - num1));
                break;
            case 3:
                System.out.println("La multiplicacion de " + num + " * " + num1 + " es: " + (num * num1));
                break;
            case 4:
                System.out.println("La division de " + num + " / " + num1 + " es: " + (num / num1));
                break;
            default:
                break;
        }
    }

    public static void ejercicio2() {
        /*
         * 🔴 UT3 — Nivel alto
         * Ejercicio siguiente
         * 
         * Haz un programa que:
         * 
         * 1️⃣ Pida un año
         * 2️⃣ Determine si es bisiesto
         * 
         * Reglas:
         * 
         * Un año es bisiesto si:
         * 
         * es divisible entre 4
         * Y no divisible entre 100
         * 
         * O
         * 
         * es divisible entre 400
         * 
         * Ejemplos:
         * 
         * 2000 → Bisiesto
         * 1900 → No bisiesto
         * 2024 → Bisiesto
         * 2023 → No bisiesto
         */
        Scanner sc = new Scanner(System.in);
        int anio = 0;
        System.out.println("Dame un año y te diré si es o no es bisiesto");
        anio = sc.nextInt();
        if (((anio % 4 == 0) && (anio % 100 != 0)) || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }

    public static void ejercicio3() {
        /*
         * Ejercicio final del tema
         * 
         * Haz un programa que:
         * 
         * 1️⃣ Pida tres números enteros
         * 2️⃣ Determine si pueden formar un triángulo
         * 
         * Regla:
         * 
         * Para que exista un triángulo:
         * 
         * lado1 + lado2 > lado3
         * lado1 + lado3 > lado2
         * lado2 + lado3 > lado1
         * 
         * Si se cumplen todas:
         * 
         * Es un triángulo válido
         * 
         * Si no:
         * 
         * No se puede formar un triángulo
         */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        System.out.println("Dame un primer número");
        num = sc.nextInt();
        System.out.println("Dame un segundo número");
        num1 = sc.nextInt();
        System.out.println("Dame un tercer número");
        num2 = sc.nextInt();
        if (((num + num1) > num2) && ((num + num2) > num1) && ((num1 + num2) > num)) {
            System.out.println("Es un triánguloi válido");
        } else {
            System.out.println("No se puede formar un triángulo");
        }
    }

    public static void ejercicio4() {

    }

    public static void ejercicio5() {

    }

    public static void ejercicio6() {

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
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();

    }
}