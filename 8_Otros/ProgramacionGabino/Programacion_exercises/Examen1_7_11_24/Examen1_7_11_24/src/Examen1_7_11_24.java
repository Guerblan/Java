import java.util.Scanner;

public class Examen1_7_11_24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*
         * Este ejercicio consta de 2 preguntas:
         * 1- ¿Qué es c y que hace?
         * 2- ¿Qué hace el programa?
         */
        System.out.println("Dame números hasta que introduzcas un 0, devuelvo cuantos impares");
        int c = 0, n = 1;
        do {
            n = sc.nextInt();
            if (n % 2 == 1) {
                c++;
            }
            System.out.println(n);
        } while (n != 0);


        System.out.println("\nEjercicio 2: escribir frase y dar la vuelta quitando espacios");
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine(), frase2 = "";
        for (int i = (frase.length() - 1); i >= 0; i--) {
            if (frase.charAt(i) != ' ') {
                frase2 += frase.charAt(i);
            }
        }


        System.out.println(frase2);
        System.out.println("\nEjercicio 3: Pide un número N y devuelve el producto de los primeros N primos");
        System.out.print("\nDame un número: ");
        int N = sc.nextInt(), acumulador = 0, multiplicacion = 1;
        for (int i = 2; acumulador < N; i++) {
            if (EsPrimo(i)) {
                acumulador++;
                multiplicacion *= i;
            }
        }
        System.out.println("\nEl producto de los primeros " + N + " números primos es " + multiplicacion);
        sc.close();
    }

    public static boolean EsPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(num) && primo; i++) { //En vez de Math.sqrt() también se podría poner num/2, pero es menos correcto
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
