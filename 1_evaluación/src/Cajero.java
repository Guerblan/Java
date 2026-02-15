import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        int opcion = 0;
        int saldo = 0;
        int ingreso = 0;
        int retirada = 0;
        int numIngresos = 0;
        int numRetiradas = 0;
        int totalIngresos = 0;
        int totalRetiradas = 0;

        while (opcion != 4) {
            System.out.println("------------------------------------------");
            System.out.println("          CAJERO AUTOMÁTICO               ");
            System.out.println("------------------------------------------");
            System.out.println("          1.Consultar saldo               ");
            System.out.println("          2.Ingresar dinero               ");
            System.out.println("          3.Retirar dinero                ");
            System.out.println("          4.Salir                         ");
            System.out.println("------------------------------------------");
            System.out.println("Elija una opción");
            opcion = sca.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de: " + saldo);
                    break;

                case 2:
                    System.out.println("¿Cuánto desea ingresar?");
                    ingreso = sca.nextInt();
                    if (ingreso <= 0) {
                        System.out.println("El importe ingresado no es válido");
                    } else {
                        saldo += ingreso;
                        numIngresos++;
                        totalIngresos += ingreso;
                    }

                    break;

                case 3:
                    System.out.println("¿Cuánto desea retirar?");
                    retirada = sca.nextInt();
                    if (retirada <= 0 || retirada > saldo) {
                        System.out.println("El importe retirado no es válido");
                    } else {
                        saldo -= retirada;
                        numRetiradas++;
                        totalRetiradas += retirada;
                    }

                    break;

                case 4:
                    System.out.println("Saliendo!");
                    System.out.println("----------------------");
                    System.out.println("Movimientos:");
                    System.out.println("Saldo: " + saldo);
                    System.out.println("Número de ingresos: " + numIngresos);
                    System.out.println("Total ingresado: " + totalIngresos);
                    System.out.println("Número de retiradas: " + numRetiradas);
                    System.out.println("Total retirado: " + totalRetiradas);

                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
