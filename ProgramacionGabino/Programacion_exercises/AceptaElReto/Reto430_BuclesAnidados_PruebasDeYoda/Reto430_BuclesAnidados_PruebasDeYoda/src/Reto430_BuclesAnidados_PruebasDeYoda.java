import java.util.Scanner;

public class Reto430_BuclesAnidados_PruebasDeYoda {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numPruebas;
        while ((numPruebas = sc.nextInt()) > 0) {
            int day = 0;
            for (int i = 1; i <= numPruebas; i++) {
                int dayPrueba = sc.nextInt();
                int delay = sc.nextInt();
                day++;
                do{
                    if (day < dayPrueba) {
                        day++;
                    }
                    if (day > dayPrueba) {
                        dayPrueba += delay;
                    }
                }while (day!=dayPrueba);
            }
            System.out.println(day);
        }
        sc.close();
    }
}
