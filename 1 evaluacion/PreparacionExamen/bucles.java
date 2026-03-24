import java.util.Scanner;

class Bucles20Ejercicios {

    public static void ejercicio1() {
        /*
         * UT4 — Nivel fácil
         * Ejercicio 1
         * 
         * Haz un programa que:
         * 
         * Muestre los números del 1 al 10
         * 
         * Salida esperada:
         * 
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * 10
         */

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    public static void ejercicio2() {
        /*
         * Ejercicio 5 — Tabla de multiplicar
         * 
         * Haz un programa que:
         * 
         * Pida un número al usuario
         * Muestre su tabla de multiplicar del 1 al 10
         * 📌 Ejemplo de funcionamiento
         * 
         * Si el usuario escribe:
         * 
         * 5
         * 
         * Debe salir:
         * 
         * 5 x 1 = 5
         * 5 x 2 = 10
         * 5 x 3 = 15
         * 5 x 4 = 20
         * 5 x 5 = 25
         * 5 x 6 = 30
         * 5 x 7 = 35
         * 5 x 8 = 40
         * 5 x 9 = 45
         * 5 x 10 = 50
         */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Dame un número");
        num = sc.nextInt();
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

    }

    public static void ejercicio3() {
        /*
         * UT4 — Nivel fácil
         * Ejercicio 6 — Suma de números (aquí empieza lo importante)
         * 
         * Haz un programa que:
         * 
         * Muestre los números del 1 al 10
         * Y al final muestre la suma total
         * 📌 Salida esperada
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * 10
         * La suma es: 55
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }

    public static void ejercicio4() {
        /*
         * UT4 — Nivel fácil
         * Ejercicio 7 — Números pares
         * 
         * Haz un programa que:
         * 
         * Muestre números del 1 al 50
         * Solo los pares
         */
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
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

    }
}