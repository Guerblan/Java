import java.util.Scanner;

public class Condicionales {
    public static void ejercicio1() {
        /*
         * .Ejercicio 1:
         * 
         * .Uso:
         * Scanner, operador módulo (%) y estructura condicional (if).
         * 
         * .Tema:
         * Comprobar si un número introducido es múltiplo de 3.
         * 
         * .Enunciado:
         * Escribe un programa que pida un número y diga si es o no
         * múltiplo de 3.
         */

        Scanner sca = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número entero");
        num = sca.nextInt();
        if (num % 3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 3");
        } else {
            System.out.println("El nñumero " + num + " no es múltiplo de 3");
        }
    }

    public static void ejercicio2() {
        /*
         * .Ejercicio 2:
         * 
         * .Uso:
         * Scanner y estructuras condicionales (if, else if).
         * 
         * .Tema:
         * Determinar el mayor de tres números introducidos por teclado.
         * 
         * .Enunciado:
         * Escribe un programa que lee por teclado tres números enteros y
         * calcula y muestra el
         * mayor de los tres.
         */

        Scanner sca = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Introduce un primer número");
        num1 = sca.nextInt();
        System.out.println("Introduce un segundo número");
        num2 = sca.nextInt();
        System.out.println("Introduce un tercer número");
        num3 = sca.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayo es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayo es " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayo es " + num3);
        } else {
            System.out.println("Ha ocurrido un error al introducir valores");
        }
    }

    public static void ejercicio3() {
        /*
         * .Ejercicio 3:
         * 
         * .Uso:
         * Scanner, estructuras condicionales (if).
         * 
         * .Tema:
         * Validar una hora con formato 24h según valores introducidos.
         * 
         * .Enunciado:
         * Escribe un programa que lea por teclado tres números enteros
         * H, M, S correspondientes
         * a hora, minutos y segundos respectivamente, y comprueba si la hora que
         * indican es una hora válida.
         * Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
         * para las horas será
         * mayor o igual que cero y menor que 24. El valor válido para los minutos y
         * segundos estará
         * comprendido entre 0 y 59 ambos incluidos.
         */

        Scanner sca = new Scanner(System.in);
        int hora;
        int min;
        int seg;
        System.out.println("Introduce la hora");
        hora = sca.nextInt();
        System.out.println("Introduce los minutos");
        min = sca.nextInt();
        System.out.println("Introduce los segundos");
        seg = sca.nextInt();
        if (hora >= 0 && hora <= 23 && min >= 0 && min <= 59 && seg >= 0 && seg <= 59) {
            System.out.print("El relog marca las: " + hora + ":" + min + ":" + seg);
        } else {
            System.out.println("Hora introducida inválida");
        }

    }

    public static void ejercicio4() {
        /*
         * .Ejercicio 4:
         * 
         * .Uso:
         * Scanner y switch.
         * 
         * .Tema:
         * Convertir números entre 0 y 10 en texto mediante switch.
         * 
         * .Enunciado:
         * Escribe un programa que pida por teclado un número entre 0 y
         * 10, y muestre en pantalla
         * el nombre en letras de ese número. Se debe controlar que se introduzca un
         * número válido.
         */

        Scanner sca = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número del 0 al 10");
        num = sca.nextInt();
        switch (num) {
            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;

            default:
                System.out.println("Número introducido no válido");
                break;
        }
    }

    public static void ejercicio5() {
        /*
         * .Ejercicio 5:
         * 
         * .Uso:
         * Scanner, String (toLowerCase o toUpperCase) y switch.
         * También con equalsIgnoreCase
         * 
         * .Tema:
         * Convertir texto con nombres de números a su valor numérico.
         * 
         * .Enunciado:
         * Escribe un programa que realice lo contrario que el anterior,
         * es decir pide un número en
         * letras y enseña un número.
         * Aclaración: No es lo mismo la cadena "Uno" que "uno" o que "UNO", por lo
         * tanto, para que el
         * programa funcione correctamente deberías pasar todas las letras del nombre
         * del número a
         * mayúsculas o a minúsculas. Investiga cuál es la función del objeto String que
         * nos permite realizar ese
         * cambio.
         */

        Scanner sca = new Scanner(System.in);
        String num = "";
        System.out.println("Introduce un número con palabras");
        num = sca.nextLine().toLowerCase();
        // No sería posible usar el IgnoreCase dentro del switch(num.IgnoreCase) ya que
        // un switch no
        // puede recibir una condición
        switch (num) {
            case "cero":
                System.err.println(0);
                break;
            case "uno":
                System.err.println(1);
                break;
            case "dos":
                System.err.println(2);
                break;
            case "tres":
                System.err.println(3);
                break;
            case "cuatro":
                System.err.println(4);
                break;
            case "cinco":
                System.err.println(5);
                break;
            case "seis":
                System.err.println(6);
                break;
            case "siete":
                System.err.println(7);
                break;
            case "ocho":
                System.err.println(8);
                break;
            case "nueve":
                System.err.println(9);
                break;
            case "diez":
                System.err.println(10);
                break;

            default:
                System.err.println("Valor introducido incorrecto");
                break;
        }
    }

    /*
     * Ahora lo haremos usando equalsIgnoreCase().No podríamos usarlo en el switch
     * porque es una comparación,una condición
     * y un switch nunca puede recibir eso,tiene que recibir un valor concreto.
     * Resultaría así:
     * 
     * 
     * Scanner teclado = new Scanner(System.in);
     * System.out.println("Dime un número en palabras entre el uno y el diez:");
     * String num = teclado.nextLine();
     * 
     * if (num.equalsIgnoreCase("cero")) {
     * System.out.println(0);
     * } else if (num.equalsIgnoreCase("uno")) {
     * System.out.println(1);
     * } else if (num.equalsIgnoreCase("dos")) {
     * System.out.println(2);
     * } else if (num.equalsIgnoreCase("tres")) {
     * System.out.println(3);
     * } else if (num.equalsIgnoreCase("cuatro")) {
     * System.out.println(4);
     * } else if (num.equalsIgnoreCase("cinco")) {
     * System.out.println(5);
     * } else if (num.equalsIgnoreCase("seis")) {
     * System.out.println(6);
     * } else if (num.equalsIgnoreCase("siete")) {
     * System.out.println(7);
     * } else if (num.equalsIgnoreCase("ocho")) {
     * System.out.println(8);
     * } else if (num.equalsIgnoreCase("nueve")) {
     * System.out.println(9);
     * } else if (num.equalsIgnoreCase("diez")) {
     * System.out.println(10);
     * } else {
     * System.out.println("Valor introducido no válido");
     * }
     * }
     */

    public static void ejercicio6() {
        /*
         * .Ejercicio 6:
         * 
         * .Uso:
         * Scanner, switch y estructuras condicionales.
         * 
         * .Tema:
         * Clasificar un mes por su número y mostrar sus días y nombre.
         * 
         * .Enunciado:
         * Escribe un programa que lea una variable entera mes y
         * compruebe si el valor
         * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
         * 28 días. Se
         * mostrará además el nombre del mes.
         * Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
         */

        Scanner sca = new Scanner(System.in);
        int mes = 0;
        System.out.println("Introduce un número correspondiente a un mes");
        mes = sca.nextInt();
        switch (mes) {
            case 1:
                System.out.println("El mes " + mes + " corresponde a Enero y tiene 31 días");
                break;
            case 2:
                System.out.println("El mes " + mes + " corresponde a Febrero y tiene 28 días");
                break;
            case 3:
                System.out.println("El mes " + mes + " corresponde a Marzo y tiene 31 días");
                break;
            case 4:
                System.out.println("El mes " + mes + " corresponde a Abril y tiene 30 días");
                break;
            case 5:
                System.out.println("El mes " + mes + " corresponde a Mayo y tiene 31 días");
                break;
            case 6:
                System.out.println("El mes " + mes + " corresponde a Junio y tiene 30 días");
                break;
            case 7:
                System.out.println("El mes " + mes + " corresponde a Julio y tiene 31 días");
                break;
            case 8:
                System.out.println("El mes " + mes + " corresponde a Agosto y tiene 31 días");
                break;
            case 9:
                System.out.println("El mes " + mes + " corresponde a Septiembre y tiene 30 días");
                break;
            case 10:
                System.out.println("El mes " + mes + " corresponde a Octubre y tiene 31 días");
                break;
            case 11:
                System.out.println("El mes " + mes + " corresponde a Noviembre y tiene 30 días");
                break;
            case 12:
                System.out.println("El mes " + mes + " corresponde a Diciembre y tiene 31 días");
                break;

            default:
                System.out.println("Valor introducido inválido");
                break;
        }

    }

    public static void ejercicio7() {
        /*
         * .Ejercicio 7:
         * 
         * .Uso:
         * Scanner, estructuras condicionales y operadores lógicos.
         * 
         * .Tema:
         * Calcular media si todas las notas están aprobadas (≥5).
         * 
         * .Enunciado:
         * Escribe un programa que pida la nota de las tres evaluaciones,
         * y si están aprobadas
         * realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si
         * no, escribe que evaluación
         * debe recuperar.
         */

        Scanner sca = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        System.out.println("¿Qué nota has sacado el la primera evaluación?");
        nota1 = sca.nextInt();
        System.out.println("¿Qué nota has sacado el la segunda evaluación?");
        nota2 = sca.nextInt();
        System.out.println("¿Qué nota has sacado el la tercera evaluación?");
        nota3 = sca.nextInt();
        if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5) {
            int media = (nota1 + nota2 + nota3) / 3;
            System.out.println("La nota final es: " + media);
        } else if (nota1 < 5) {
            System.out.println("Tienes que recuperar la primera evaluación");
        } else if (nota2 < 5) {
            System.out.println("Tienes que recuperar la segunda evaluación");
        } else if (nota3 < 5) {
            System.out.println("Tienes que recuperar la tercera evaluación");
        } else {
            System.out.println("Nota introducida errónea");
        }
    }

    /*
     * .Ejercicio 8:
     * 
     * .Uso:
     * Scanner, estructuras condicionales y operadores aritméticos.
     * 
     * .Tema:
     * Calcular sueldo mensual según horas normales y extra pagadas.
     * 
     * .Enunciado:
     * Escribe un programa que calcule el sueldo de un trabajador.
     * Debe pedir el número de
     * horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir
     * de ahí, las restantes
     * horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total
     * del sueldo.
     */

    public static void ejercicio8() {
        Scanner sca = new Scanner(System.in);
        int horas = 0;
        System.out.println("Cuántas horas has trabajado?");
        horas = sca.nextInt();
        if (horas <= 150) {
            System.out.println("El sueldo a percibir es de: " + horas * 10 + " euros");
        } else if (horas > 150) {
            System.out.println("El sueldo a percibir es de: " + (((horas - 150) * 20) + 1500) + " euros");
        } else {
            System.out.println("Valor introducido inválido");
        }
    }

    public static void ejercicio9() {
        /*
         * .Ejercicio 9:
         * 
         * .Uso:
         * Scanner, estructuras condicionales y operador módulo (%).
         * 
         * .Tema:
         * Verificar si un año es bisiesto según sus reglas divisibles.
         * 
         * .Enunciado:
         * Escribe un programa que diga si un año es bisiesto. No deber
         * permitir aceptar años
         * negativos. Un año es bisiesto si cumple una de las siguientes reglas:
         * 1. Divisible entre 4, divisible entre 100 y divisible entre 400.
         * 2. Divisible entre 4, NO divisible entre 100.
         */

        Scanner sca = new Scanner(System.in);
        int anio = 0;
        System.out.println("Dime un año y te diré si es o no bisiesto");
        anio = sca.nextInt();
        if ((anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }
    /*
     * .Ejercicio 10:
     * 
     * .Uso:
     * Scanner y estructuras condicionales (if, else if, else).
     * 
     * .Tema:
     * Comparar dos números para saber cuál es mayor o si son iguales.
     * 
     * .Enunciado:
     * Construye un programa que pida dos números al usuario e
     * indique cuál es mayor o si son
     * iguales.
     */

    public static void ejercicio10() {
        Scanner sca = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Dame un número");
        num1 = sca.nextInt();
        System.out.println("Dame otr número");
        num2 = sca.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println("Son iguales");
        }
    }

    /*
     * .Ejercicio 11:
     * 
     * .Uso:
     * Scanner, operador módulo (%) y estructura condicional (if).
     * 
     * .Tema:
     * Comprobar si un número introducido es par o impar.
     * 
     * .Enunciado:
     * Construye un programa que pida un número al usuario y nos
     * indique si es par o impar.
     */

    public static void ejercicio11() {
        Scanner sca = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un número y te diré si es par o inpar");
        num = sca.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else if (num % 2 != 0) {
            System.out.println(num + " es inpar");
        } else {
            System.out.println("Valor introducido no válido");
        }
    }

    /*
     * .Ejercicio 12:
     * 
     * .Uso:
     * Scanner, estructuras condicionales y operadores aritméticos.
     * 
     * .Tema:
     * Dividir dos números y controlar la división por cero.
     * 
     * .Enunciado:
     * Construye un programa que pida dos números al usuario y
     * muestre el resultado de su
     * división. Si el segundo número es 0, debe mostrar un mensaje de error.
     */

    public static void ejercicio12() {
        Scanner sca = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Dame un primer número");
        num1 = sca.nextInt();
        System.out.println("Dame un segundo número");
        num2 = sca.nextInt();
        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es " + resultado);
        } else {
            System.out.println("Error en el valor de entrada");
        }
    }

    /*
     * .Ejercicio 13:
     * 
     * .Uso:
     * Scanner, estructuras condicionales y clase Math (Math.pow).
     * 
     * .Tema:
     * Calcular una potencia controlando el caso exponente igual a 0.
     * 
     * .Enunciado:
     * Construye un programa que pida dos números al usuario. Debe
     * calcular el resultado de
     * elevar el primero (base) al segundo (exponente) teniendo en cuenta lo
     * siguiente:
     * o Si el exponente es cero el resultado es 1
     * o En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la
     * función que
     * calcula la potencia)
     */

    public static void ejercicio13() {
        Scanner sca = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Introduce la base");
        num1 = sca.nextInt();
        System.out.println("Introduce el exponente");
        num2 = sca.nextInt();
        double resultado = 0;

        if (num2 == 0) {
            resultado = 1;
        } else {
            resultado = Math.pow(num1, num2);
        }
        System.out.println("El resultado de elevar " + num1 + " a " + num2 + " es " + resultado);
    }

    /*
     * .Ejercicio 14:
     * 
     * .Uso:
     * Scanner, estructuras condicionales y operadores lógicos.
     * 
     * .Tema:
     * Clasificar un triángulo por sus lados y si es rectángulo.
     * 
     * .Enunciado:
     * Construye un programa que exprese si un triángulo es
     * isósceles, equilátero o escaleno y
     * si es rectángulo. Para ello debe recibir por teclado 3 valores
     * correspondiente a la medida de sus
     * lados.
     */

    public static void ejercicio14() {
        Scanner sca = new Scanner(System.in);
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        System.out.println("Dame el primer lado del triángulo");
        lado1 = sca.nextInt();
        System.out.println("Dame el segundo lado del triángulo");
        lado2 = sca.nextInt();
        System.out.println("Dame el tercer lado del triángulo");
        lado3 = sca.nextInt();
        if (lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
            System.out.println("El triángulo es isósceles");
        }
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triángulo es equilátero");
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("El triángulo es escaleno");
        }
        if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3 ||
                lado1 * lado1 + lado3 * lado3 == lado2 * lado2 ||
                lado2 * lado2 + lado3 * lado3 == lado1 * lado1) {
            System.out.println("El triángulo es rectángulo");
        }
    }

    public static void ejercicio15() {
        /*
         * .Ejercicio 15:
         * 
         * .Uso:
         * Scanner, estructuras condicionales y operadores aritméticos.
         * 
         * .Tema:
         * Calcular el coste total de un viaje según número de alumnos.
         * 
         * .Enunciado:
         * Un instituto está organizando un viaje y te piden que
         * construyas un programa que
         * calcule el coste total del viaje y lo que le supone a cada alumno en función
         * de lo siguiente:
         * o Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
         * o De 30 a 49 alumnos, deberán pagar 48€ por alumno.
         * o De 20 a 29 alumnos, deberán pagar 56€ por alumno.
         * o Menos de 20 alumnos, deberán abonar un total de 2000 euros en total.
         */

        Scanner sca = new Scanner(System.in);
        int costeT = 0;
        int numAlum = 0;
        System.out.println("¿Qué numero de alumnos asistirán a la excursión?");
        numAlum = sca.nextInt();
        if (numAlum >= 50) {
            costeT = numAlum * 40;
            System.out.println("El coste total del viaje es: " + costeT);
        } else if (numAlum >= 30 && numAlum <= 49) {
            costeT = numAlum * 48;
            System.out.println("El coste total del viaje es: " + costeT);
        } else if (numAlum >= 20 && numAlum <= 29) {
            costeT = numAlum * 56;
            System.out.println("El coste total del viaje es: " + costeT);
        } else {

            System.out.println("El coste total del viaje es 2000 euros");
        }

    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        ejercicio14();
        // ejercicio15();

    }
}
