import java.util.Scanner;

public class Reto390_Condicionales_PixelArt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for (int i = 1; i <= cases; i++) {
            int magenta = sc.nextInt();
            int amarillo = sc.nextInt();
            int cian = sc.nextInt();
            String composition = sc.nextLine();
            pixelArt(magenta, amarillo, cian, composition);
        }
        sc.close();
    }

    // public static void pixelArt(int magenta, int amarillo, int cian, String
    // composition) {
    public static void pixelArt(int magenta, int amarillo, int cian, String composition) {
        for (int i = 0; i < composition.length(); i++) {
            if (composition.charAt(i) == 'M') {
                magenta--;
            }
            if (composition.charAt(i) == 'A') {
                amarillo--;
            }
            if (composition.charAt(i) == 'C') {
                cian--;
            }
            if (composition.charAt(i) == 'R') {
                magenta--;
                amarillo--;
            }
            if (composition.charAt(i) == 'V') {
                amarillo--;
                cian--;
            }
            if (composition.charAt(i) == 'L') {
                cian--;
                magenta--;
            }
            if (composition.charAt(i) == 'N') {
                magenta--;
                amarillo--;
                cian--;
            }
        }
        if (magenta >= 0 && amarillo >= 0 && cian >= 0) {
            System.out.println("SI " + magenta + " " + amarillo + " " + cian);
        } else {
            System.out.println("NO");
        }
    }
}
