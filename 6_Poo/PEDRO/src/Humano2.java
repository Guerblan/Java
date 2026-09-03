public class Humano2 {

    int brazos;

    int piernas;

    String nombre;

    boolean bailar;

    public Humano2(String nombre, boolean bailar) {

        this.bailar = bailar;

        this.brazos = 2;

        this.piernas = 2;

        this.nombre = nombre;

    }

    public String dimeMinombre() {
        return nombre;
    }

    public void sabeBailar() {
        if (bailar == true) {
            System.out.println("Sabe bailarrrrrr");
        }
        if (bailar == false) {
            System.out.println("No sabe Hulio");
        }
    }

}