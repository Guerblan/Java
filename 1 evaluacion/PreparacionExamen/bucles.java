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
        /*
         * Ejercicio 9 — Tabla múltiple (empieza a complicarse un poco)
         * 
         * Haz un programa que:
         * 
         * Muestre las tablas de multiplicar del 1 al 5
         * Cada tabla debe ir separada
         * 📌 Salida esperada
         * Tabla del 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * 1 x 3 = 3
         * 1 x 4 = 4
         * 1 x 5 = 5
         * 1 x 6 = 6
         * 1 x 7 = 7
         * 1 x 8 = 8
         * 1 x 9 = 9
         * 1 x 10 = 10
         * 
         * Tabla del 2
         * 2 x 1 = 2
         * 2 x 2 = 4
         * ...
         * 2 x 10 = 20
         * 
         * Tabla del 3
         * ...
         * 
         * Tabla del 4
         * ...
         * 
         * Tabla del 5
         * ...
         */
        int resultado = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 5; j++) {

                resultado = i * j;

                System.out.println(i + " X " + j + " = " + resultado);
            }
        }
    }

    public static void ejercicio6() {
        /*
         * Haz un programa que:
         * 
         * Pida 10 números al usuario
         * Cuente cuántos son positivos
         * Al final muestre:
         * Cantidad de positivos: X
         */
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 1; i <= 10; i++) {
            int numero = sc.nextInt();
            if (numero > 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    public static void ejercicio7() {
        /*
         * Sumar 10 números introducidos por el usuario
         * 
         * Haz un programa que:
         * 
         * Pida 10 números
         * Los vaya sumando
         * Muestre al final:
         * La suma total es: X
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }

    public static void ejercicio8() {
        /*
         * Calcular el promedio de 10 números
         * 
         * Haz un programa que:
         * 
         * Pida 10 números
         * Los sume
         * Calcule el promedio
         * Muestre:
         * El promedio es: X
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double promedio = sum / 10.00;
        System.out.println(promedio);
    }

    public static void ejercicio9() {
        /*
         * Encontrar el número mayor
         * 
         * Este ejercicio es clave. Sale muchas veces en exámenes.
         * 
         * 🔴 Enunciado
         * 
         * Haz un programa que:
         * 
         * Pida 10 números al usuario
         * Encuentre el número mayor
         * Muestre:
         */
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El número mayor es: " + mayor);
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
        ejercicio5();
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