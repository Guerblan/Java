import java.util.Scanner;

class metodosYFunciones {
    /*
     * Enunciado
     * 
     * Realiza una función llamada suma que sume dos números enteros y devuelva el
     * resultado.
     * 
     * Después:
     * 
     * Llama a esa función desde el main
     * Muestra el resultado por pantalla
     */
    public static int suma(int a, int b) {

        int resultado = a + b;
        return resultado;
    }

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer número");
        int a = sc.nextInt();
        System.out.println("Dame el segundo número");
        int b = sc.nextInt();
        int resultado = suma(a, b);
        System.out.println("La suma de los número es: " + resultado);
    }

    /*
     * EJERCICIO BÁSICO 2
     * 
     * Enunciado real del material:
     * 
     * Realiza un método llamado holaMundo que al ser llamado muestre por consola:
     * 
     * Hola Mundo!
     */

    public static void ejercicio2() {
        System.out.println("Hola Mundo!");
    }

    /*
     * EJERCICIO BÁSICO 3
     * 
     * Enunciado real:
     * 
     * Realiza un método llamado eco que reciba un número n y muestre por consola la
     * palabra ECO repetida n veces.
     */

    public static void eco(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("ECO");
        }
    }

    public static void ejercicio3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número n y te devolveré la palabra ECO repetida tantas veces como n");
        int n = sc.nextInt();
        eco(n);
    }

    /*
     * EJERCICIO BÁSICO 4
     * 
     * Enunciado real:
     * 
     * Escribe un método llamado mostrarIntermedios que tenga dos parámetros a y b y
     * muestre todos los números pares entre ambos números (incluidos).
     */
    public static void mostrarIntermedios(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int a = sc.nextInt();
        System.out.println("Introduce otro número");
        int b = sc.nextInt();
        mostrarIntermedios(a, b);

    }

    /*
     * EJERCICIO BÁSICO 5
     * 
     * Enunciado real:
     * 
     * Escribe un método llamado tablaMultiplicar que reciba un número n y muestre
     * su tabla de multiplicar del 1 al 10.
     */
    public static void tablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un núemro");
        int n = sc.nextInt();
        tablaMultiplicar(n);
    }

    public static void ejercicio6() {

    }

    public static void ejercicio7() {

    }

    public static void ejercicio8() {

    }

    public static void ejercicio9() {

    }

    public static void ejercicio10() {

    }

    public static void ejercicio11() {

    }

    public static void ejercicio12() {

    }

    public static void ejercicio13() {

    }

    public static void ejercicio14() {

    }

    public static void ejercicio15() {

    }

    public static void ejercicio16() {

    }

    public static void ejercicio17() {

    }

    public static void ejercicio18() {

    }

    public static void ejercicio19() {

    }

    public static void ejercicio20() {

    }

    public static void ejercicio21() {

    }

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

    public static void main(String[] args) throws Exception {

        // ejercicio1();
        // ejercicio2();
        // eco();
        // ejercicio3();
        // ejercicio4();
        ejercicio5();
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
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();
        // ejercicio25();
        // ejercicio26();
        // ejercicio27();
        // ejercicio28();
        // ejercicio29();
        // ejercicio30();

    }
}