import java.util.Scanner;

public class UT5_2_Contador {
    public static Scanner sc = new Scanner(System.in);
    public static final String menuObjects = "\n1-tiempo"
            + "\n2-presion"
            + "\n3-segundos"
            + "\n4-circular"
            + "\n5-alarma"
            + "\n0-Salir";

    public static void main(String[] args) throws Exception {
        // Declaration of 3 objects
        Contador tiempo = new Contador();
        Contador presion = new Contador();
        Contador segundos = new Contador();
        ContadorCircular circular = new ContadorCircular();
        ContadorAlarma alarma = new ContadorAlarma();
        
        int option;
        boolean flag = true;
        while (flag) {
            System.out.println(menuObjects);
            System.out.print("\nElige una opcion: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> Contador.menu(tiempo);
                case 2 -> Contador.menu(presion);
                case 3 -> Contador.menu(segundos);
                case 4 -> ContadorCircular.menu(circular);
                case 5 -> ContadorAlarma.menu(alarma);
                default -> flag = false;
            }
        }
    }
}
