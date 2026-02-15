public class App {
    public static void main(String[] args) throws Exception {
      Empleado Luis = new Empleado("Luis", 1000);
      Gerente Paco = new Gerente("Paco", 1200, "i+d");

        Luis.mostrarDatos();
        Paco.mostrarDatos();


    }
}
