import java.util.Scanner;
/*-----------------------CALCULADORA MODULAR */

public class ej10 {
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static double dividir(double a, double b) {
        double resultado = a / b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {

            System.out.println("Introduce un primer número");
            int a = sc.nextInt();
            System.out.println("Introduce un segundo número");
            int b = sc.nextInt();
            System.out.println("CALCULADORA MODULAR");
            System.out.println("--------------------");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir del programa");
            System.out.println("--------------------");
            System.out.println("Elije la operación que quieres hacer con esos dos números");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(sumar(a, b));
                    break;
                case 2:
                    System.out.println(restar(a, b));
                    break;
                case 3:
                    System.out.println(multiplicar(a, b));
                    break;
                case 4:
                    System.out.println(dividir(a, b));

                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;

                default:
                    break;
            }
        }
    }
}
