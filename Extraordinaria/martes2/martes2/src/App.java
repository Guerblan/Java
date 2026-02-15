package Extraordinaria.martes2.martes2.src;

public class App {
    public static void main(String[] args) throws Exception {
        Empleado PacoJones = new Empleado("PacoJones", 75);
        Gerente Luis = new Gerente("Luis", 1500, "Fisica");
        PacoJones.mostrarDatos();
        Luis.mostrarDatos();

    }
}
