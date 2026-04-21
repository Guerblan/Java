import java.util.Scanner;

public class Cajero {
    // Scanner sc = new Scanner(System.in);
    static int saldo = 0;

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String menu = "Elige una opción\n " + "1. Consultar saldo\n " + "2. Depositar dinero\n "
                + "3. Retirar dinero\n " + "4. Salir\n";

        int opcion = 0;
        while (opcion != 4) {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                default:
                    break;
            }
        }
    }

    public static void consultarSaldo() {
        // int saldo = 0;
        System.out.println(saldo);
    }

    public static void depositarDinero() {
        int ingreso = 0;
        System.err.println("¿Cuánto quiere ingresar?");
        if (ingreso > 0) {
            saldo += ingreso;
        } else {
            System.out.println("Cantidad a ingresar inválida");
        }

    }

    public static void retirarDinero() {

    }

    public static void main(String[] args) {
        menu();
    }
}
