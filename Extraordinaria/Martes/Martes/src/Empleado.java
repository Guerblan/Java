
public class Empleado {
    protected String nombre;
    protected double sueldo;


    public Empleado(String nombre,double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("sueldo: " +sueldo);
    }
   
}
