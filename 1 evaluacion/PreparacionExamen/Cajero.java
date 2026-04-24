import java.util.Scanner;

public class Cajero {
    static Scanner sc = new Scanner(System.in);
    static int saldo = 0;
    static int ingreso = 0;
    static int numIngresos = 0;
    static int totalIngresado = 0;
    static int numRetiradas = 0;
    static int totalRetirado = 0;

    public static void menu() {

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
        System.out.println("Gracias por usar el cajero automático.Hasta luego!");
        System.out.println("-------------ESTADÍSTICAS DE USO------------------");
        System.out.println("Número total de ingresos " + numIngresos);
        System.out.println("Importe total ingresado " + totalIngresado);
        System.out.println("Número total de retiradas " + numRetiradas);
        System.out.println("Importe total de retiradas " + totalRetirado);
        System.out.println("Saldo final de la cuenta " + saldo);
        System.out.println("---------------------------------------------------");
    }

    public static void consultarSaldo() {

        System.out.println("Su saldo es " + saldo);
    }

    public static void depositarDinero() {

        System.err.println("¿Cuánto quiere ingresar?");
        ingreso = sc.nextInt();
        if (ingreso > 0) {
            saldo += ingreso;
            totalIngresado += ingreso;
            numIngresos++;
            System.out.println("Ha ingresado " + ingreso + " euros");
        } else {
            System.out.println("Cantidad a ingresar inválida");
        }

    }

    public static void retirarDinero() {
        int retirada = 0;
        System.out.println("¿Cuánto desea retirar?");
        retirada = sc.nextInt();
        if (retirada > saldo) {
            System.out.println("No dispone de saldo suficiente");
        } else if (retirada < 0) {
            System.out.println("Cantidad a retirar errónea");
        } else {
            totalRetirado += retirada;
            numRetiradas++;
            saldo -= retirada;
            System.out.println("Ha retirado " + retirada + " con éxito");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
