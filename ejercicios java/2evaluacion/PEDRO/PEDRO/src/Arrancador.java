public class Arrancador {

    public static void main(String[] args) throws Exception {
        Humano2 Pedro = new Humano2("Pedro", false);
        System.out.println("Mi nombre es " + Pedro.dimeMinombre());
        Pedro.sabeBailar();
    }
}
