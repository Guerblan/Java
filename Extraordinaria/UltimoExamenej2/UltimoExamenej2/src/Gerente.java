public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, int sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El departamento es: " + departamento);

    }
}
