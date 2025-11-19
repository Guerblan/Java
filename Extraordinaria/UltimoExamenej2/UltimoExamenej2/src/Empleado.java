
public class Empleado {

protected String nombre;
protected int sueldo;

public Empleado(String nombre,int sueldo){
    this.nombre=nombre;
    this.sueldo=sueldo;
}

public void mostrarDatos(){
    System.out.println("El nombre  es: " + nombre);
    System.out.println("El sueldo es "+ sueldo);
}

}
