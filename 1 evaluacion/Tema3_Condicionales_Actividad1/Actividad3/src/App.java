/*ACTIVIDAD 3 CONDICIONALES */

import java.util.Scanner;

public class App {

    /*
     * • Ejercicio 1: Construye un programa que pida dos números al usuario e
     * indique cuál es mayor o si son
     * iguales.
     */
    public static void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el primer número ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número ");
        num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + "es mayor que " + num2);

        } else {

            if (num2 > num1) {
                System.out.println(num2 + " es mayor que " + num1);
            } else {
                System.out.println(num1 + " y " + num2 + " son iguales");

            }
        }
    }

    /*
     * • Ejercicio 2: Construye un programa que pida un número al usuario y nos
     * indique si es par o impar.
     */
    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Dime un número");
        num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    /*
     * • Ejercicio 3: Construye un programa que pida dos números al usuario y
     * muestre el resultado de su
     */
    /* división. Si el segundo número es 0, debe mostrar un mensaje de error. */
    public static void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dame un primer número");
        num1 = teclado.nextInt();
        System.out.println("Dame un segundo número");
        num2 = teclado.nextInt();
        if (num2 == 0) {
            System.out.println("Error");
        } else {
            System.out.println("El resultado de la división es " + (num1 / num2));
        }
    }

    /*
     * • Ejercicio 4: Construye un programa que pida dos números al usuario. Debe
     * calcular el resultado de
     * elevar el primero (base) al segundo (exponente) teniendo en cuenta lo
     * siguiente:
     * o Si el exponente es cero el resultado es 1
     * o En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la
     * función que
     * calcula la potencia)
     */
    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dame el primer número");
        num1 = teclado.nextInt();
        System.out.println("Dame un segundo número");
        num2 = teclado.nextInt();

    }

    /*
     * • Ejercicio 5: Construye un programa que exprese si un triángulo es
     * isósceles, equilátero o escaleno y
     * si es rectángulo. Para ello debe recibir por teclado 3 valores
     * correspondiente a la medida de sus
     * lados.
     */
    public static void ejercicio5() {

    }

    /*
     * • Ejercicio 6: Un instituto está organizando un viaje y te piden que
     * construyas un programa que
     * calcule el coste total del viaje y lo que le supone a cada alumno en función
     * de lo siguiente:
     * o Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
     * o De 30 a 49 alumnos, deberán pagar 48€ por alumno.
     * o De 20 a 29 alumnos, deberán pagar 56€ por alumno.
     * o Menos de 20 alumnos, deberán abonar un total de 2000 euros en total.
     */
    public static void ejercicio6() {
        Scanner teclado = new Scanner(System.in);
        int costTotal;
        int costIndividual;
        int numAlumnos;
        System.out.println("Dime el número de alumnos que van a la excursión");
        numAlumnos = teclado.nextInt();
        if (numAlumnos >= 50) {
            System.out.println("La excursion en total saldrá por " + (numAlumnos * 40));
        } else if (numAlumnos >= 30) {
            System.out.println("La excursión en total saldrá por " + (numAlumnos * 48));
        } else if (numAlumnos >= 20) {
            System.out.println("La excursión en total saldrá por " + (numAlumnos * 56));
        } else {
            System.out.println("La excusrión en total saldrá por 2000 euros");
        }
    }

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
    }
}