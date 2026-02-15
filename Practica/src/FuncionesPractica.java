package Practica.src;



import java.util.Scanner;

/*--------------FUNCIONES-------------
Lo que me dijo Joel que es importante saber:

 .saber que el nombre va 1 con mayuscula
 .saber cuando va void o cuando retormna alg
 .saber si le tiene que entrar algo a la funcion y como usar lo que le entra
 .saber como usar las funciones en otras funciones
 
*/
public class FuncionesPractica {
    public static void ejercicio1() {
        /*
         * Escribe una función llamada saludar que imprima "¡Bienvenido!" dos veces.
         * Luego, invócala desde el método main.
         */
        saludar();

    }

    public static void saludar() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Bienvenido");
        }
    }

    // -------------------------------------------------------------------------------------------
    public static void ejercicio2() {
        /*
         * Crear una función sumar dentro de ejercicio2() que reciba dos int y devuelva
         * su suma.
         */
        int resultado = sumar(3, 5);
        System.out.println("El resultado es: " + resultado);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    // -------------------------------------------------------------------------------------------
    public static void ejercicio3() {
        /*
         * Función con parámetros y void.
         * Crear una función imprimirEdad que reciba un int edad e imprima:
         * "Tienes X años".
         */
        imprimirEdad(36);
    }

    public static void imprimirEdad(int edad) {
        System.out.println("Tienes " + edad + " años");
    }

    // ---------------------------------------------------------------------------------------------
    public static void ejercicio4() {
        /*
         * Objetivo: Crear una función que reciba un String nombre e imprima:
         * "¡Hola, [nombre]!".
         */
        saludar("Ana");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola!" + nombre);
    }

    // ----------------------------------------------------------------------------------------------------
    public static void ejercicio5() {
        /*
         * Crear una función que reciba un double precio e imprima:
         * "El precio total es: €[precio]".
         */
        imprimirPrecio(345.95);
    }

    public static void imprimirPrecio(double precio) {
        System.out.println("El precio total es: " + precio + " euros");
    }

    // -------------------------------------------------------------------------------------------------------
    public static void ejercicio6() {
        /*
         * Crea una función llamada esPar que reciba un int numero y devuelva true si es
         * par o false si es impar.
         */
        esPar(3);
    }

    public static boolean esPar(int numero) {// como me pide que retorne un boolean pues le paso ese tipo public static
                                             // boolean esPar

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
            return true;
        } else {
            System.out.println("El número " + numero + " es impar");
            return false;
        }
    }

    // ----------------------------------------------------------------------------------------------------------
    public static void ejercicio7() {
        /*
         * Crea una función llamada calcularPromedio que reciba tres parámetros de tipo
         * double
         * (nota1, nota2, nota3) y devuelva el promedio de las tres notas (también como
         * double).
         */
        calcularPromedio(5.1, 6.4, 4.2);
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de las 3 notas es: " + promedio);
        return promedio;

    }

    // -----------------------------------------------------------------------------------------------------------
    public static void ejercicio8() {
        /*
         * Crea una función llamada validarEdad que reciba un parámetro int edad y
         * devuelva un String con estos mensajes:
         * 
         * Si la edad es menor a 18: "Menor de edad".
         * 
         * Si la edad está entre 18 y 65 (incluidos): "Adulto".
         * 
         * Si la edad es mayor a 65: "Adulto mayor".
         */
        System.out.println("Qué edad tiene?");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        String resultado = validarEdad(edad);
        System.out.println(resultado);
    }

    public static String validarEdad(int edad) {

        String frase = "";
        if (edad < 18) {
            frase = "Menor de edad";
        }
        if (edad >= 18 && edad <= 65) {
            frase = "Adulto";
        }
        if (edad > 65) {
            frase = "Adulto mayor";
        }
        return frase;
    }

    // -------------------------------------------------------------------------------------------------------------
    public static void ejercicio9() {
        /*
         * Realiza una función llamada suma que sume dos números enteros
         * y te devuelva el resultado, posteriormente llámala desde el main y
         * muestra su resultado
         */
        int resultado = suma(5, 3);
        System.out.println(resultado);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    // -----------------------------------------------------------------------------------------------------------
    public static void ejercicio10() {
        /*
         * Realiza un método llamado holaMundo que al ser llamada
         * muestre por consola el mensaje “Hola Mundo!”.
         */
        holaMundo();
    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
    }

    // ----------------------------------------------------------------------------------------------------
    public static void ejercicio11() {
        /*
         * Realiza un método llamado eco con un parámetro de entrada n,
         * que al ser llamada muestre por consola el mensaje “ECO” un
         * número n de veces.
         */
        eco(4);
    }

    public static void eco(int n) {
        // ¿Cómo imprimo un número concreto de veces??Pues con un for
        for (int i = 0; i < n; i++) {
            System.out.println("ECO");
        }
    }

    // ---------------------------------------------------------------------------------------------------
    public static void ejercicio12() {
        /*
         * Escribe un método llamado mostrarIntermedios que tenga dos
         * parámetros de entrada a y b (números enteros) y muestre todos
         * los números pares entre ambos números (a y b inclusive).
         */
        mostrarIntermedios(4, 23);
    }

    public static void mostrarIntermedios(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    // ---------------------------------------------------------------------------------------------------------
    public static void ejercicio13() {
        /*
         * Crea una calculadora llamando a la función suma,resta,multiplicación y
         * división
         * Le tiene que entrar 2 parámetros y devolverme el resultado.
         * Se tiene que repetir hasta que pulse salida
         */
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Qué operación deseas hacer?");
        while (opcion != 0) {
            System.out.println("Sumar");
            System.out.println("Restar");
            System.out.println("Multiplicar");
            System.out.println("Dividir");
            opcion = scanner.nextInt();
        }
    }

    // ---------------------------------------------------------------------------------------------------
    public static void ejercicio14() {
        /*
         * Realiza una función areaCirculo que reciba un parámetro r y te
         * devuelva el área de un círculo de radio r.
         * Nota: En un circulo: area = pi * r * 2
         * Nota: en Java podemos usar el número pi con la constante de la
         * clase Math PI ( se accede con Math.PI )
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el radio del círculo");
        int radio = scanner.nextInt();
        double area = areaCirculo(radio);
        System.out.println("El área del círculo es: " + area);

    }

    public static double areaCirculo(int radio) {
        /*
         * para la letra pi se usa el Math.PI,luego multiplico por potencia
         * (Math.pow) de lo que hay dentro del paréntesis que sería la base y el
         * exponente
         * También podría hacer Math.PI*radio*radio y sería igual
         */
        double area = Math.PI * Math.pow(radio, 2);

        return area;
    }

    // ------------------------------------------------------------------------------------------------------------
    public static void ejercicio15() {
        /*
         * Realiza una función que reciba dos números enteros y devuelva el
         * mayor de los dos, si son iguales devuelve cualquiera de los dos.
         * 
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un primer número: ");
        int a = scanner.nextInt();
        System.err.println("Introduce un segundo número: ");
        int b = scanner.nextInt();
        int numeroMayor = mayorNumero(a, b);
        System.out.println("El número mayor es: " + numeroMayor);

    }

    public static int mayorNumero(int a, int b) {
        int numeroMayor = 0;
        if (a > b) {

            // NO imprimimos porque eso lo hace el Main (arriba),aquí retornamos
            return a;
        }
        if (a < b) {
            // igual que arriba
            return b;
        }
        if (a == b) {
            // igual
            return a;
        }
        return numeroMayor;
    }

    // ---------------------------------------------------------------------------------------------
    public static void ejercicio16() {
        int opcion = 0;
        boolean flag = true;
        int resultado = 0;
        
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el primer número con el que operar:");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduce el segundo número con el que operar:");
            int b = Integer.parseInt(scanner.nextLine());
            String menu = "\n menú:" +
                    "\n1-Sumar" +
                    "\n2-Restar" +
                    "\n3-Multipicar" +
                    "\n4-Dividir" +
                    "\n5-Salir";
            System.out.println(menu);
            System.out.print("\nQué operación quieres usar? ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> resultado = a + b;

                case 2 -> {
                    resultado = a - b;
                    // así podría seguir escribiendo dentro de este case con este formato de switch
                    // ->
                    // poniendo dos llaves
                    System.out.println("Has elegido la opción dos");
                }

                case 3 -> resultado = a * b;

                case 4 -> resultado = a / b;
                // poniendo el boolean en false sale
                case 5 -> flag = false;

                default -> System.out.println("Opción incorrecta.Vuelve a elegir");

            }
            // esto lo he hecho así para practicar cómo imprimir mediante una variable
            String fraseResultado = "\nEl resultado es: " + resultado + " unidades";
            System.out.println(fraseResultado);

        }
        System.out.println("Has salido correctamente!");
    }

    // --------------------------------------------------------------------------------------------------
    /*
     * 
     */
    public static void ejercicio17() {

    }

    // ---------------------------------------------------------------------------------------------------
    public static void ejercicio18() {

    }

    // ------------------------------------------------------------------------------------------------
    public static void ejercicio19() {

    }

    // -----------------------------------------------------------------------------------------------------
    public static void ejercicio20() {

    }

    // ---------------------------------------------------------------------------------------------------------
    public static void ejercicio21() {

    }

    // --------------------------------------------------------------------------------------------
    public static void ejercicio22() {

    }

    public static void ejercicio23() {
       
    }

    public static void ejercicio24() {

    }

    public static void ejercicio25() {

    }

    public static void ejercicio26() {

    }

    public static void ejercicio27() {

    }

    public static void ejercicio28() {

    }

    public static void ejercicio29() {

    }

    public static void ejercicio30() {

    }

    public static void ejercicio31() {

    }

    public static void ejercicio32() {

    }

    public static void ejercicio33() {

    }

    public static void ejercicio34() {

    }

    public static void ejercicio35() {

    }

    public static void ejercicio36() {

    }

    public static void ejercicio37() {

    }

    public static void ejercicio38() {

    }

    public static void ejercicio39() {

    }

    public static void ejercicio40() {

    }

    public static void ejercicio41() {

    }

    public static void ejercicio42() {

    }

    public static void ejercicio43() {

    }

    public static void ejercicio44() {

    }

    public static void ejercicio45() {

    }

    public static void ejercicio46() {

    }

    public static void ejercicio47() {

    }

    public static void ejercicio48() {

    }

    public static void ejercicio49() {

    }

    public static void ejercicio50() {

    }

    public static void main(String[] args) throws Exception {

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
        // ejercicio14();
        // ejercicio15();
        ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
         //ejercicio23();
        // ejercicio24();
        // ejercicio25();
        // ejercicio26();
        // ejercicio27();
        // ejercicio28();
        // ejercicio29();
        // ejercicio30();
        // ejercicio31();
        // ejercicio32();
        // ejercicio33();
        // ejercicio34();
        // ejercicio35();
        // ejercicio36();
        // ejercicio37();
        // ejercicio38();
        // ejercicio39();
        // ejercicio40();
        // ejercicio41();
        // ejercicio42();
        // ejercicio43();
        // ejercicio44();
        // ejercicio45();
        // ejercicio46();
        // ejercicio47();
        // ejercicio48();
        // ejercicio49();
        // ejercicio50();

    }
}
