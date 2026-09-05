import java.util.Scanner;

class ElementosBasicos {
    public static void ejercicio1() {
        /*
         * Ejercicio 1:
         * Escribe un programa que muestre por pantalla tu nombre, tu edad
         * y tu correo electrónico, cada dato en una línea distinta.
         */
        System.out.println("\033[32mHola mundo normal!\033[0m");
    }

    public static void ejercicio2() {
        /*
         * Ejercicio 2:
         * Escribe un programa que muestre por pantalla 10 palabras en inglés
         * junto a su correspondiente traducción al castellano, en dos columnas
         * alineadas a la izquierda.
         */
        System.out.println("Nombre: Juan Pérez\nDirección: Calle Falsa 123\nTeléfono: 555-123-456");
    }

    public static void ejercicio3() {
        /*
         * Ejercicio 3:
         * Pide por teclado un String preguntando por tu nombre y después muestra
         * un mensaje de bienvenida por consola.
         * Por ejemplo, si introduzco "Fernando", debe aparecer "Bienvenido Fernando".
         */
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("¿Cómo te llamas?");
        nombre = teclado.nextLine();
        System.out.println("Bienvenido " + nombre);
    }

    public static void ejercicio4() {
        /*
         * Pide el nombre y los dos apellidos de una persona por separado. Después,
         * construye y muestra su nombre completo en una sola línea.
         */
    }

    public static void ejercicio5() {
        /*
         * Ejercicio 5:
         * Escribe un programa que pida dos números y muestre el resultado
         * de su multiplicación.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un segundo número");
        int b = Integer.parseInt(scanner.nextLine());
        int resultado = a * b;
        System.out.println("La multiplicación del primer número y el segundo es: " + resultado);
    }

    public static void ejercicio6() {
        /*
         * Ejercicio 6:
         * Pedir dos números y realizar operaciones básicas de suma, resta y
         * multiplicación, enseñando el resultado.
         */
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dime el primer número");
        num1 = teclado.nextInt();
        System.out.println("Dime el segundo número");
        num2 = teclado.nextInt();
        System.out.println("Haré algunas operaciones básicas con él");
        System.out.println("El resultado de la suma de ambos números es " + (num1 + num2));
        System.out.println("El resultado de la resta de ambos números es " + (num1 - num2));
        System.out.println("El resultado de la multiplicación de ambos números es " + (num1 * num2));
    }

    public static void ejercicio7() {
        /*
         * Ejercicio 7:
         * Pedir un número y calcular su raíz cuadrada.
         */
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Dame un número");
        num = teclado.nextInt();
        System.out.println("El resultado de su raíz cuadrada es " + Math.sqrt(num));
    }

    public static void ejercicio8() {
        /*
         * Ejercicio 8:
         * Pedir el radio de un círculo y calcular su área.
         * Fórmula: A = pi * r^2
         */
        Scanner teclado = new Scanner(System.in);
        int radio;
        System.out.println("Dame el radio");
        radio = teclado.nextInt();
        System.out.println("El área del círculo es " + (Math.PI * Math.pow(radio, 2)));
    }

    public static void ejercicio9() {
        /*
         * Ejercicio 9:
         * Pedir el radio de una circunferencia y calcular su longitud.
         * Fórmula: L = 2 * pi * r
         */
        Scanner teclado = new Scanner(System.in);
        int radio;
        System.out.println("Dame el radio");
        radio = teclado.nextInt();
        System.out.println("La longitud de la circunferencia es " + (2 * Math.PI * radio));
    }

    public static void ejercicio10() {
        /*
         * Pide la base y la altura de un rectángulo. Calcula y muestra su área y su
         * perímetro.
         */
    }

    public static void ejercicio11() {
        /*
         * Ejercicio 11:
         * Pedir dos números, base y exponente, y calcular la potencia.
         */
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dame la base");
        num1 = teclado.nextInt();
        System.out.println("Dame el exponente");
        num2 = teclado.nextInt();
        System.out.println("El resultado de la potencia " + num1 + " elevado a " + num2 + " es "
                + Math.pow(num1, num2));
    }

    public static void ejercicio12() {
        /*
         * Pide una temperatura en grados Celsius y conviértela a grados Fahrenheit.
         * Fórmula: F = (C * 9 / 5) + 32.
         */
    }

    public static void ejercicio13() {
        /*
         * Pide al usuario el precio de un producto y el porcentaje de descuento.
         * Calcula y muestra el precio final después de aplicar el descuento.
         */
    }

    public static void ejercicio14() {
        /*
         * Pide al usuario su nombre y su año de nacimiento. Después, muestra un
         * mensaje con su nombre y la edad que cumplirá durante el año actual.
         */
    }

    public static void ejercicio15() {
        /*
         * Pide una cantidad de segundos y muestra cuántas horas, minutos y segundos
         * representa.
         */
    }

    public static void ejercicio16() {
        /*
         * Pide una frase y muestra la misma frase en mayúsculas, en minúsculas y sin
         * espacios al principio ni al final.
         */
    }

    public static void ejercicio17() {
        /*
         * Ejercicio 17:
         * Pedir una frase y enseñar por pantalla la longitud, la primera
         * y la última letra.
         * Pista: la función substring permite extraer una subcadena de una cadena.
         */
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Dime una frase y te devolveré su longitud y la primera y última letra");
        frase = teclado.nextLine();
        System.out.println("La longitud de la frase es " + frase.length()
                + ", su primera letra es " + frase.substring(0, 1)
                + " y la última letra es " + frase.substring(frase.length() - 1));
    }

    public static void ejercicio18() {
        /*
         * Pide una palabra por teclado y muestra por pantalla:
         * su longitud
         * la segunda letra
         * la penúltima letra
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra");
        String palabra = sc.nextLine();

        System.out.println("La longitud de la palabra es " + palabra.length());
        System.out.println("La segunda letra es: " + palabra.substring(1, 2));
        System.out.println("La penúltima letra es " + palabra.substring(palabra.length() - 2, palabra.length() - 1));
    }

    public static void ejercicio19() {
        /*
         * Pide una palabra y un número entero. Muestra el carácter que ocupa esa
         * posición dentro de la palabra, teniendo en cuenta que la primera posición
         * de un String es la posición 0.
         */
    }

    public static void ejercicio20() {
        /*
         * Ejercicio 20:
         * Pedir un password y comprobar si es igual que un String definido
         * en el programa. Enseñar el resultado por pantalla.
         */
        Scanner teclado = new Scanner(System.in);
        String password = "cincosydos";
        String cadena;
        System.out.println("Dime el password y te diré si es el correcto");
        cadena = teclado.nextLine();
        System.out.println("¿Has introducido el password correcto? " + cadena.equals(password));
    }

    public static void ejercicio21() {
        /*
         * Ejercicio 21:
         * Pedir por consola una frase que contenga una palabra concreta y extraer
         * esa palabra de la cadena introducida.
         * Pista: indexOf devuelve la posición en la que se encuentra una cadena
         * dentro de otra.
         */
        Scanner teclado = new Scanner(System.in);
        String frase;
        int posicionPalabra;
        String palabra;

        System.out.println("Dame una frase:");
        frase = teclado.nextLine();

        System.out.println("Dime la palabra que quieres buscar dentro de la frase:");
        palabra = teclado.nextLine();

        posicionPalabra = frase.indexOf(palabra);

        if (posicionPalabra >= 0) {
            System.out.println("La palabra encontrada es: "
                    + frase.substring(posicionPalabra, posicionPalabra + palabra.length()));
        } else {
            System.out.println("La palabra no aparece dentro de la frase");
        }
    }

    public static void ejercicio22() {
        /*
         * Pide por teclado una frase y una palabra. Después muestra por pantalla:
         * la longitud de la palabra
         * su segunda letra
         * su penúltima letra
         * si esa palabra aparece dentro de la frase
         * y, si aparece, extraerla desde la frase usando substring e indexOf
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase:");
        String frase = sc.nextLine();
        System.out.println("Ahora dame una palabra");
        String palabra = sc.nextLine();
        System.out.println("La longitud de la palabra es: " + palabra.length());
        System.out.println("La segunda letra es: " + palabra.substring(1, 2));
        System.out.println("La penlltima letra es: " + palabra.substring(palabra.length() - 2, palabra.length() - 1));
        int posicionPalabra = frase.indexOf(palabra);
        if (posicionPalabra >= 0) {
            System.out.println("La palabra introducida sí está dentro de la frase y es: "
                    + frase.substring(posicionPalabra, posicionPalabra + palabra.length()));
        }
    }

    public static void ejercicio23() {
        /*
         * Ejercicio 23:
         * Escribe un programa que pinte por pantalla una pirámide rellena
         * a base de asteriscos. En este caso, la altura la introduce el usuario.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
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
        // ejercicio14();
        ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
    }
}
