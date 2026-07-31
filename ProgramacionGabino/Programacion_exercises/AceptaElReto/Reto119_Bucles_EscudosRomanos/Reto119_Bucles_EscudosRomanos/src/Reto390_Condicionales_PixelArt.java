import java.util.Scanner;

public class Reto390_Condicionales_PixelArt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soldadosLibres;
        while((soldadosLibres=sc.nextInt())>0){
            System.out.println(escudosRomanos(soldadosLibres));
        }
        sc.close();
    }
    public static int escudosRomanos(int soldadosLibres) {
        int escudos=0;
        while (soldadosLibres>0) {
            int lado = (int)(Math.sqrt(soldadosLibres));
            escudos+=lado*lado+lado*4;
            soldadosLibres-=lado*lado;
        }
        
        return escudos;
    }
}
