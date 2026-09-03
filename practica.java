import java.util.Random;
import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        /*
         * Ejercicio 9:
         * Dibujar una escalera de asteriscos y despues la version invertida.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la altura de la escalera");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            // for (int j = 0; j < i; j++) {
            System.out.print("*");
            // }
            System.out.println();
        }
    }
}