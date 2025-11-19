package UltimoExamenEj1.src;

/*
 * Crea una clase llamada Coche que tenga:

Dos atributos privados: marca (String) y velocidad (int).

Un constructor que reciba ambos valores.

Métodos públicos para:

Mostrar los valores (mostrarDatos).

Acelerar (acelerar(int incremento)) y frenar (frenar(int decremento)).

Después, crea una clase Principal con el método main que:

Cree un objeto de tipo Coche.

Llame a sus métodos para modificar su velocidad.

Muestre los datos del coche tras cada operación.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Coche c1 = new Coche("mercedes", 200);
        c1.acelerar(13);
        c1.mostrarValores();
        c1.decelerar(80);
        c1.mostrarValores();
    }
}
