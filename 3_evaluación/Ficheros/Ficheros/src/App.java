import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
    String estudiante="";
    int limite = 5;
    ArrayList<String> estudiantes = new ArrayList<>();
    for(int i=0;i<limite;i++){
        System.out.println("Dame un nombre");
        estudiante=sca.nextLine();
        estudiantes.add(estudiante);
        System.out.println("El estudiante " + estudiante + " ha sido añadido");
    }
    System.out.println(estudiantes);
    }
}
