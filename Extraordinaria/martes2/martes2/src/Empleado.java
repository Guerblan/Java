package Extraordinaria.martes2.martes2.src;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    @Override
    public String toString() {

        return "Nombre: " + nombre + "sueldo" + sueldo;
    }
}
