/*
 * Crea una clase Empleado con:

Atributos protegidos: nombre (String) y sueldo (double).

Constructor y método mostrarDatos().

Crea una clase Gerente que herede de Empleado y:

Añada el atributo departamento (String).

Sobrescriba el método mostrarDatos() para incluir el departamento.

Desde una clase Empresa con método main:

Crea un objeto Empleado y uno Gerente.

Llama a mostrarDatos() para ambos.


 */

public class Empresa {
    public static void main(String[] args) throws Exception {
        Empleado e1 =new Empleado("Jose", 1350);
        Gerente g1 = new Gerente("Paco", 1800, "informática");
        e1.mostrarDatos();
        g1.mostrarDatos();
    }
}
