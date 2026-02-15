//package Practica.src;

import java.util.Scanner;

public class Otros {

    public static void ejercicio1() {
        /*
         * USO DE COLOR EN UN TEXTO
         * 
         * Usamos la estructura \033[31m------texto------\033[0m
         * hay muchos colores sólo cambiamos los códigos
         */
        System.out.println("\033[32mHola mundo normal!\033[0m");
    }

    public static void ejercicio2() {
        /*
         * SALTO DE LÍNEA
         * 
         * \n ,así se verá en varias líneas no todo en una
         */
        System.out.println("Nombre: Juan Pérez\nDirección: Calle Falsa 123\nTeléfono: 555-123-456");

    }

    public static void ejercicio3() {
        /*
         * USO CORRECTO DE LECTURA DE INT
         * 
         * Realiza un programa que pida dos números y que luego muestre el resultado
         * de su multiplicación.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        // así sería.Esto nos hace un salto de línea automático
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un segundo número");
        int b = Integer.parseInt(scanner.nextLine());
        int resultado = a * b;
        System.out.println("La multiplicación del primer número y el segundo es: " + resultado);

    }

    /**
     * Creamos 3 bucles for uno hará esto y conseguiremos los otro y bla bla bla
     *
     * @param n (que será la altura de la pirámide)
     **/
    public static void ejercicio4() {
        /*
         * Realiza un programa en Java que, dado un número entero positivo n, construya
         * una pirámide de asteriscos de altura n.
         * 
         * Cadab nivel de la pirámid
         * 
         * 
         * e debe contener un número impar de asteriscos
         * alineados al centro, formando una figura simétrica. La base de la pirámide
         * tendrá 2 * n - 1 asteriscos.
         * 
         * Requisitos:
         * El programa debe solicitar al usuario un número entero n.
         * 
         * La pirámide debe mostrarse en la consola utilizando solo espacios y
         * asteriscos (*).
         * 
         * Usa bucles anidados para construir la figura línea por línea.
         */

        Scanner sca = new Scanner(System.in);
        System.out.println(

                "Introduce la altura");
        int n = sca.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println(" ");
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int y = 0; y < i; y++) {
                System.out.print(" ");
                System.out.print("*");
            }
        }

    }

    public static void ejercicio5() {

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
        ejercicio4();
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
