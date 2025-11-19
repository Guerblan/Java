package Extraordinaria.martes2.martes2.src;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public String toString() {
        return super.toString() + "Departamento:" + departamento;
    }

   @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Empleado persona = (Empleado) obj;

    return this.nombre.equals(persona.nombre) && this.sueldo == persona.sueldo;
}

}

/*
 * @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Empleado persona = (Empleado) obj;

    return this.nombre.equals(persona.nombre) && this.sueldo == persona.sueldo;
}

 */