import java.util.Scanner;

class Bucles20Ejercicios {

    public static void ejercicio1() {

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void ejercicio2() {

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

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }

    public static void ejercicio4() {

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void ejercicio5() {

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

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            int num = sc.nextInt();
            sum += num;

        }

        System.out.println(sum);

    }

    public static void ejercicio8() {

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

        Scanner sc = new Scanner(System.in);

        int pares = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Dame un número");

            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            }

        }

        System.out.println(pares);

    }

    public static void ejercicio11() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            int num = sc.nextInt();

            if (num > 0) {
                sum = sum + num;
            }

        }

        System.out.println(sum);

    }

    public static void ejercicio12() {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        System.out.println("Dame un número");

        num = sc.nextInt();

        while (num != 0) {

            sum += num;

            System.out.println("Dame otro número");

            num = sc.nextInt();

        }

        System.out.println("La suma total es: " + sum);

    }

    public static void ejercicio13() {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contador = 0;

        System.out.println("Introduce un número");

        num = sc.nextInt();

        while (num >= 0) {

            contador++;

            System.out.println("Dame otro número");

            num = sc.nextInt();

        }

        System.out.println(contador);

    }

    public static void ejercicio14() {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        String menu = "\n Menú: "
                + "\n 1_Saludar "
                + "\n 2_Mostrar número 10 "
                + "\n 3_Salir"
                + "\n Introduce una opción";

        while (opcion != 3) {

            System.out.println(menu);

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Hola");
                    break;

                case 2:
                    System.out.println("10");
                    break;

                case 3:
                    System.out.println("Saliendo");
                    break;

                default:
                    break;
            }

        }

    }

    public static void ejercicio15() {

        Scanner sc = new Scanner(System.in);

        int numsecret = 4;
        int num = 0;

        while (num != numsecret) {

            System.out.println("Intenta acertar el número secreto!");

            num = sc.nextInt();

            if (num == numsecret) {

                System.out.println("Correcto!");

            }

        }

    }

    public static void ejercicio16() {

        Scanner sc = new Scanner(System.in);

        int numsecret = 7;

        boolean acertado = false;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Intenta acertar el número");

            int num = sc.nextInt();

            if (num == numsecret) {

                System.out.println("Correcto");

                acertado = true;

                break;

            }

        }

        if (acertado == false) {

            System.out.println("Has perdido");

        }

    }

    public static void ejercicio17() {

        Scanner sc = new Scanner(System.in);

        int numsecret = 9;

        int num = 0;

        boolean acertado = false;

        while (acertado == false) {

            System.out.println("Dime un número");

            num = sc.nextInt();

            if (num < numsecret) {

                System.out.println("El número secreto es mayor");

            }

            else if (num > numsecret) {

                System.out.println("El número secreto es menor");

            }

            else {

                System.out.println("Correcto");

                acertado = true;

            }

        }

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

    public static void main(String[] args) {

        ejercicio17();

    }

}