import java.util.Scanner;

public class Bucles3 {

    public static void ejercicio1() {
        /*
         * Ejercicio 1: Diseña un programa que pide al usuario que ingrese la cantidad
         * de números que va a
         * introducir. Deberá leer la cantidad de números indicada y cuenta cuántos son
         * positivos, negativos y
         * ceros, cuantos pares y cuantos impares, mostrando esa información al
         * finalizar la ejecución.
         */
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;
        int par = 0;
        int impar = 0;
        System.out.println("Dime cuántos número deseas introucir");
        num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce un número");
            int num2 = teclado.nextInt();
            if (num2 > 0) {
                positivo++;
            }
            if (num2 < 0) {
                negativo++;
            }
            if (num2 == 0) {
                cero++;
            }
            if (num2 % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        }
        System.out.println("la cantiad de número positivos es " + positivo);
        System.out.println("la cantiad de número negativos es " + negativo);
        System.out.println("la cantiad de ceros es " + cero);
        System.out.println("la cantiad de números pares es " + par);
        System.out.println("la cantiad de números impares es " + impar);
        System.out.println("La cantidad de números es" + (positivo + negativo + cero));
    }

    // **************************************************************** */
    // Hola Pedro, Soy Maik solo quiero decirte que sé que te estas esforzando mucho
    // y me pone muy contento, aunque no veas reflejado
    // en las notas un aprobado, le estas echando muchas ganas y estas aprendiendo
    // un montón y eso es lo unico que importaa
    // enhorabuena
    // **************************************************************** */
    public static void ejercicio2() {
        /*
         * /• Ejercicio 2: Crea un programa que solicite un número y muestra su tabla de
         * multiplicar del 1 al 10./
         */
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Dame un número");
        num = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + num + " = " + i * num);
        }

    }

    public static void ejercicio3() {
        /*
         * • Ejercicio 3: Diseña un programa que permita al usuario convertir
         * temperaturas de Celsius a
         * Fahrenheit y viceversa. Ofrece un menú para elegir la conversión.
         * (Para pasar de Celsius a Fahrenheit: (°C * 1,8) + 32 y de Fahrenheit a
         * Celsius: (ºF-32)/1.8)
         */
        Scanner teclao = new Scanner(System.in);
        int grad = 0;
        System.out.println("Qué conversión quieres hacer?");

    }

    /*
     * • Ejercicio 4: Implementa un programa que pida un número entero al usuario y
     * determine si es un
     * número perfecto. Un número es perfecto si es igual a la suma de sus divisores
     * propios. (Los divisores
     * propios de un número son aquellos números por los que es divisible un número
     * sin contar el
     * número).
     */
    public static void ejercicio4() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.println("Dame un número entero");
        num = teclado.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Es un número perfecto");
        } else {
            System.out.println("No es un número perfecto");
        }

    }

    /*
     * • Ejercicio 5: Crea un programa que pida al usuario un número entero positivo
     * y calcule la suma de
     * todos numero anteriores
     */
    public static void ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        System.out.println("Dame un número");
        num = teclado.nextInt();
        for (int i = 1; i <= num; i++) {
            suma = suma + i;
        }
        System.out.println("La suma es" + suma);

    }

    public static void ejercicio6() {
        /*
         * • Ejercicio 6: Diseña un programa que simule una casa de apuestas. Se
         * comenzará con un saldo de
         * 100€. Pedirá al usuario que cantidad quiere apostar, la cual deberá estar
         * entre 1 y el saldo
         * disponible. Se deberá generar un booleano aleatorio (random.nextBoolean()),
         * en caso de que salga
         * true, el usuario gana el importe apostado. Se jugará a este juego mientras
         * quiera el usuario y/o
         * quede saldo.
         */
        Scanner sca = new Scanner(System.in);
        int saldo = 100;
        int apuesta = 0;
        boolean seguir = true;
        while (seguir && saldo > 0) {
            System.out.println("Tu saldo es de " + saldo);
            System.out.println("Cuánto quieres apostar?");
            apuesta = sca.nextInt();
            if (saldo >= apuesta) {
                boolean resultado = Math.random() < 0.5;
                if (resultado) {
                    System.out.println("Enhorabuena!Has ganado la apuesta!!");
                    System.out.println("Tu saldo ahora es de :");
                    System.out.println(saldo += apuesta);
                } else {
                    System.out.println("Has perdido");
                    System.out.println("Tu nuevo saldo es de:");
                    System.out.println(saldo -= apuesta);
                }
            } else {
                System.out.println("Error al introducir cantidad");
            }
            System.out.println("¿Quieres seguir jugando? (s/n)");
            String respuesta = sca.next();
            if (respuesta.equalsIgnoreCase("s")) {
                continue;
            } else {
                seguir = false;
            }
        }

    }

    /*
     * • Ejercicio 7: Crea un programa que simule una quiniela, para ello se deberá
     * leer el resultado de 15
     * partidos. El usuario deberá introducir 1, X o 2. Almacenaremos los valores en
     * variables para luego
     * poder usarlas. Debemos controlar que solo pueda introducir 1, X o 2
     * Una vez pedidos todos los resultados iremos generando aleatoriamente el
     * resultado de los partidos,
     * si gana el equipo de casa (1), empatan(X) o gana el equipo visitante.
     * Debemos mostrar para finaliza el resultado del partido y el que puso el
     * usuario, y finalmente el
     * número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el
     * pleno al 15.
     * Un ejemplo de funcionamiento sería:
     * Programación UT.3: Estructuras de Control
     * Página 2 de 2
     */
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Introduce los valores de la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();

    }

    /*
     * • Ejercicio 8: Crea un programa que lea una frase por teclado y la convierta
     * al formato camelCase. Por
     * ejemplo, si introducimos por teclado “hola como estás”, el programa deberá
     * mostrar
     * “HolaComoEstás”.
     * Pistas:
     * o Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando
     * la función
     * cadena.charAt(i), donde cadena es nuestra variable cadena y la i la posición
     * del carácter.
     * o Podemos pasar a minúscula un carácter con la función:
     * Character.toLowerCase(c), donde c
     * es el carácter a convertir.
     * o Podemos pasar a mayúsculas un carácter con la función:
     * Character.toUpperCase(c), donde c
     * es el carácter a convertir.
     */
    /*
     * public static void ejercicio8() {
     * Scanner teclao = new Scanner(System.in);
     * String frase = "";
     * System.out.println("Dame un frase");
     * frase = teclao.nextInt();
     * for (int i = 0; i < frase.length; i++) {
     * if (frase.charAT(i).equals("")) {
     * 
     * }
     * }
     * }
     */

    /*
     * Ejercicio 1: Diseña un programa que pide al usuario que ingrese la cantidad
     * de números que va a
     * introducir. Deberá leer la cantidad de números indicada y cuenta cuántos son
     * positivos, negativos y
     * ceros, cuantos pares y cuantos impares, mostrando esa información al
     * finalizar la ejecución.
     * • Ejercicio 2: Crea un programa que solicite un número y muestra su tabla de
     * multiplicar del 1 al 10.
     * • Ejercicio 3: Diseña un programa que permita al usuario convertir
     * temperaturas de Celsius a
     * Fahrenheit y viceversa. Ofrece un menú para elegir la conversión.
     * (Para pasar de Celsius a Fahrenheit: (°C * 1,8) + 32 y de Fahrenheit a
     * Celsius: (ºF-32)/1.8)
     * • Ejercicio 4: Implementa un programa que pida un número entero al usuario y
     * determine si es un
     * número perfecto. Un número es perfecto si es igual a la suma de sus divisores
     * propios. (Los divisores
     * propios de un número son aquellos números por los que es divisible un número
     * sin contar el
     * número).
     * • Ejercicio 5: Crea un programa que pida al usuario un número entero positivo
     * y calcule la suma de
     * todos los números primos hasta ese número.
     * • Ejercicio 6: Diseña un programa que simule una casa de apuestas. Se
     * comenzará con un saldo de
     * 100€. Pedirá al usuario que cantidad quiere apostar, la cual deberá estar
     * entre 1 y el saldo
     * disponible. Se deberá generar un booleano aleatorio (random.nextBoolean()),
     * en caso de que salga
     * true, el usuario gana el importe apostado. Se jugará a este juego mientras
     * quiera el usuario y/o
     * quede saldo.
     * • Ejercicio 7: Crea un programa que simule una quiniela, para ello se deberá
     * leer el resultado de 15
     * partidos. El usuario deberá introducir 1, X o 2. Almacenaremos los valores en
     * variables para luego
     * poder usarlas. Debemos controlar que solo pueda introducir 1, X o 2
     * Una vez pedidos todos los resultados iremos generando aleatoriamente el
     * resultado de los partidos,
     * si gana el equipo de casa (1), empatan(X) o gana el equipo visitante.
     * Debemos mostrar para finaliza el resultado del partido y el que puso el
     * usuario, y finalmente el
     * número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el
     * pleno al 15.
     * Un ejemplo de funcionamiento sería:
     */

    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
    }
}