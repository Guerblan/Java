import java.util.Scanner;

public class UT3_Practica_Cajero {
    public static Scanner sc = new Scanner(System.in);
    public static int saldo = 100;
    public static int numIngresos = 0;
    public static int ingresos = 0;
    public static int numRetiradas = 0;
    public static int retiradas = 0;
    public static boolean flag = true;

    public static void firma() {
        System.out.print("Realizado por: ");
        String nombre = " José Gabino Muriel Sánchez";
        for(int i=0; i<nombre.length(); i++){
            System.out.print(nombre.charAt(i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                // TODO: handle exception
            }
            if (nombre.charAt(i)==' ') {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
            }
        }
    }
    public static void main(String[] args) throws Exception {
        String opciones = "\n ------------------------------"
                        + "\n|       Cajero Automático      |"
                        + "\n|                              |"
                        + "\n ------------------------------ "
                        + "\n|       1. Consultar saldo     |"
                        + "\n|       2. Depositar dinero    |"
                        + "\n|       3. Retirar dinero      |"
                        + "\n|       4. Salir               |"
                        + "\n|                              |"
                        + "\n ------------------------------ "
                        + "\n"
                        + "\nElija una opción: ";
        
        
       
        while (flag) {
            System.out.print(opciones);
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> consultarSaldo();
                case 2 -> depositarDinero();
                case 3 -> retirarDinero();
                case 4 -> salir();
                default -> System.out.println ("\nOpción errónea");
            }
        }
        firma();
    }

    public static void consultarSaldo() {
        System.out.println("Tu saldo actual es: $"+saldo);
    }
    public static void depositarDinero() {
        System.out.print("Ingrese la cantidad a depositar: ");
        int deposito = Integer.parseInt(sc.nextLine());
        numIngresos ++;
        ingresos += deposito;
        saldo += deposito;
    }
    public static void retirarDinero() {
        System.out.print("Ingrese la cantidad a retirar: ");
        int retiro = Integer.parseInt(sc.nextLine());
        if (saldo >= retiro) {
            numRetiradas ++;
            retiradas += retiro;
            saldo -= retiro;
        } else {
            System.out.println("Fondos insuficientes. Su saldo actual es: $"+saldo);
        }
    }
    public static void salir() {
        System.out.println("Gracias por usar el cajero atomático. ¡Hasta luego!"
                          +"\n"
                          +"\n--------------ESTADÍSTICAS DE USO--------------"
                          +"\n        Número total de Ingresos:      "+numIngresos
                          +"\n        Importe total Ingresado:      $"+ingresos
                          +"\n        Número total de Retiradadas:   "+numRetiradas
                          +"\n        Importe total Retirado:       $"+retiradas
                          +"\n        Saldo Final en cuenta:        $"+saldo
                          +"\n-----------------------------------------------");
        flag= !flag;
    }
    
}
