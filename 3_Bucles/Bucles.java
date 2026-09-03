import java.util.Random;
import java.util.Scanner;

class Bucles {

    public static void ejercicio1() {
        /*
         * Ejercicio 1:
         * Realizar un programa que imprima en pantalla los numeros del 1 al 100.
         * (Debes hacerlo con las tres estructuras iterativas vistas: while, do while
         * y for).
         */
        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num++;
        }

        do {
            System.out.println(num);
            num++;
        } while (num <= 100);

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio2() {
        /*
         * Ejercicio 2:
         * Escribir un programa que solicite un valor positivo y nos muestre desde 1
         * hasta el valor ingresado de uno en uno.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero positivo");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio3() {
        /*
         * Ejercicio 3:
         * Desarrollar un programa que permita la carga de 10 valores por teclado y
         * nos muestre posteriormente la suma de los valores ingresados y su promedio.
         */
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduce 10 numeros");
        for (int i = 0; i < 10; i++) {
            suma += sc.nextInt();
        }

        double promedio = suma / 10.0;
        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + promedio);
    }

    public static void ejercicio4() {
        /*
         * Ejercicio 4:
         * Diseña una aplicación o programa que consista en lo siguiente:
         * o Guarda en una variable tu nombre.
         * o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
         * por teclado.
         * o El programa finaliza cuando el usuario adivina tu nombre. Sino el
         * programa debe continuar pidiendo al usuario que lo intente otra vez.
         */
        Scanner sc = new Scanner(System.in);
        String nombre = "Pedro";
        String intento = "";

        while (!intento.equalsIgnoreCase(nombre)) {
            System.out.println("Adivina mi nombre");
            intento = sc.nextLine().trim();
        }

        System.out.println("Correcto");
    }

    public static void ejercicio5() {
        /*
         * Ejercicio 5:
         * Diseña una aplicación que simule la tirada de dos dados y muestre al
         * usuario el resultado de la tirada. Si los dos dados tienen el mismo número
         * debe mostrar un mensaje indicando que el resultado es el mismo. La
         * aplicación se debe repetir hasta que el usuario indique que no quiere tirar
         * más (preguntando por 's' o 'n', o "si" o "no").
         */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String seguir;

        do {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            if (dado1 == dado2) {
                System.out.println("Ambos dados tienen el mismo valor: " + dado1);
            } else {
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 2: " + dado2);
            }

            System.out.println("Quieres seguir? (s/n)");
            seguir = sc.nextLine().trim();
        } while (seguir.equalsIgnoreCase("s") || seguir.equalsIgnoreCase("si"));
    }

    public static void ejercicio6() {
        /*
         * Ejercicio 6:
         * Realizar un juego para adivinar un número. Para ello primero, el programa
         * debe guardar un número en una variable y el usuario debe introducir números
         * hasta acertarlos. Para darle pistas al usuario se le indicará "mayor" o
         * "menor" según sea mayor o menor con respecto al número guardado. El proceso
         * termina cuando el usuario acierta.
         */
        Scanner sc = new Scanner(System.in);
        int secreto = 3;
        int intento = -1;

        while (intento != secreto) {
            System.out.println("Adivina el numero");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("El numero secreto es mayor");
            } else if (intento > secreto) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("Has acertado");
            }
        }
    }

    public static void ejercicio7() throws InterruptedException {
        /*
         * Ejercicio 7:
         * Diseña una aplicación que simule un reloj digital que muestre la hora sin
         * parar. Debe esperar un segundo real para darle más realismo. Pasos:
         * o Pide al usuario que introduzca la hora y los minutos.
         * o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
         * o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
         * cambio de minuto y hora.
         * o Muéstralo por pantalla.
         * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa
         * durante 1000 milisegundos = 1 segundo).
         */
        Scanner sc = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo = 0;

        do {
            System.out.println("Dame la hora (0-23)");
            hora = sc.nextInt();
            System.out.println("Dame los minutos (0-59)");
            minuto = sc.nextInt();
        } while (hora < 0 || hora > 23 || minuto < 0 || minuto > 59);

        while (true) {
            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
            Thread.sleep(1000);
            segundo++;

            if (segundo == 60) {
                segundo = 0;
                minuto++;
            }
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    public static void ejercicio8() {
        /*
         * Ejercicio 8:
         * Escriba un programa que calcule el factorial de un número. El factorial de
         * un número es igual al producto de todos los números enteros positivos desde
         * 1 hasta dicho número.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial es " + factorial);
    }

    public static void ejercicio9() {
        /*
         * Ejercicio 9:
         * Escriba un programa que dibuje una escalera de asteriscos. La altura de la
         * escalera se lee por teclado. Ejemplo: Si introducimos un 5 nos queda:
         * *
         * **
         * ***
         * ****
         * *****
         * Posteriormente hacer lo mismo, pero con la pirámide invertida.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos pisos quieres?");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = altura; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ejercicio10() {
        /*
         * Ejercicio 10:
         * Pedir cuantos numeros se van a introducir y contar positivos, negativos,
         * ceros, pares e impares.
         */
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Cuantos numeros vas a introducir?");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce un numero");
            int num = sc.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public static void ejercicio11() {
        /*
         * Ejercicio 11:
         * Mostrar la tabla de multiplicar de un numero.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }

    public static void ejercicio12() {
        /*
         * Ejercicio 12:
         * Convertir temperaturas entre Celsius y Fahrenheit con un menu.
         */
        Scanner sc = new Scanner(System.in);
        double temperatura = 0;
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("1. Introducir temperatura");
            System.out.println("2. Convertir");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce una temperatura");
                    temperatura = sc.nextDouble();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("La temperatura esta en c o en f?");
                    String escala = sc.nextLine().trim();
                    if (escala.equalsIgnoreCase("c")) {
                        System.out.println((temperatura * 1.8) + 32);
                    } else if (escala.equalsIgnoreCase("f")) {
                        System.out.println((temperatura - 32) / 1.8);
                    } else {
                        System.out.println("Escala no valida");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static void ejercicio13() {
        /*
         * Ejercicio 13:
         * Determinar si un numero es perfecto.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma == num) {
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }

    public static void ejercicio14() {
        /*
         * Ejercicio 14:
         * Pedir un numero positivo y calcular la suma desde 1 hasta ese numero.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma += i;
        }

        System.out.println("La suma es " + suma);
    }

    public static void ejercicio15() {
        /*
         * Ejercicio 15:
         * Simular una casa de apuestas con saldo inicial de 100 euros.
         */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int saldo = 100;
        boolean seguir = true;

        while (seguir && saldo > 0) {
            System.out.println("Tu saldo es " + saldo);
            System.out.println("Cuanto quieres apostar?");
            int apuesta = sc.nextInt();

            if (apuesta >= 1 && apuesta <= saldo) {
                if (random.nextBoolean()) {
                    saldo += apuesta;
                    System.out.println("Has ganado");
                } else {
                    saldo -= apuesta;
                    System.out.println("Has perdido");
                }
            } else {
                System.out.println("Apuesta no valida");
            }

            System.out.println("Quieres seguir? (s/n)");
            String respuesta = sc.next();
            seguir = respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("si");
        }
    }

    public static void ejercicio16() {
        /*
         * Ejercicio 16:
         * Simular una quiniela de 15 partidos, validando 1, X o 2 y contando
         * aciertos frente a resultados aleatorios.
         */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] apuestas = new String[15];
        String[] resultados = { "1", "X", "2" };
        int aciertos = 0;

        for (int i = 0; i < apuestas.length; i++) {
            String apuesta;
            do {
                System.out.println("Resultado para el partido " + (i + 1) + " (1/X/2)");
                apuesta = sc.next().trim().toUpperCase();
            } while (!apuesta.equals("1") && !apuesta.equals("X") && !apuesta.equals("2"));

            apuestas[i] = apuesta;
        }

        for (int i = 0; i < apuestas.length; i++) {
            String resultadoReal = resultados[random.nextInt(resultados.length)];
            System.out.println(
                    "Partido " + (i + 1) + ": tu apuesta = " + apuestas[i] + ", resultado real = " + resultadoReal);

            if (apuestas[i].equals(resultadoReal)) {
                aciertos++;
            }
        }

        System.out.println("Aciertos totales: " + aciertos);
    }

    public static void ejercicio17() {
        /*
         * Ejercicio 17:
         * Convertir una frase a formato camelCase.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine().trim();
        StringBuilder camelCase = new StringBuilder();
        boolean convertirMayuscula = true;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isWhitespace(c)) {
                convertirMayuscula = true;
            } else if (convertirMayuscula) {
                camelCase.append(Character.toUpperCase(c));
                convertirMayuscula = false;
            } else {
                camelCase.append(Character.toLowerCase(c));
            }
        }

        System.out.println(camelCase);
    }

    public static void ejercicio18() {
        /*
         * Ejercicio 18:
         * Diseñar un programa que pida un número por teclado y escriba tantas líneas
         * como diga el número y en cada línea escriba desde el número 1 hasta el
         * número introducido.
         * Ejemplo: Si se introduce el número 5, el programa deberá mostrar en
         * pantalla:
         * 12345
         * 12345
         * 12345
         * 12345
         * 12345
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void ejercicio19() {
        /*
         * Ejercicio 19:
         * Diseñar un programa que haga lo mismo que el anterior, pero en este caso
         * deberá escribir los números en orden decreciente, es decir, si introducimos
         * el número 5 deberá mostrar en pantalla:
         * 54321
         * 54321
         * 54321
         * 54321
         * 54321
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void ejercicio20() {
        /*
         * Ejercicio 20:
         * Deberéis diseñar un programa similar al anterior, pero en lugar de escribir
         * en todas las líneas todos los números desde el 1 hasta el introducido por
         * teclado, en la primera línea se imprimirá sólo el número 1, en la segunda
         * el 1 y el 2, y así hasta escribir el número de líneas indicadas por el
         * usuario.
         * Ejemplo: Si el usuario imprime el número 5, el programa mostrará en
         * pantalla:
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void ejercicio21() {
        /*
         * Ejercicio 21:
         * Diseña un programa que escriba todos los números del 100 al 0 de 7 en 7,
         * es decir, mostrará 100, 93, 86...0.
         */
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
    }

    public static void ejercicio22() {
        /*
         * Ejercicio 22:
         * Desarrollar un programa que te pregunte cuantos números quieres leer.
         * Nosotros deberemos leer la cantidad de números indicada y calcula el
         * promedio de los valores indicados.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres leer?");
        int cantidad = sc.nextInt();
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce un numero");
            suma += sc.nextDouble();
        }

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / cantidad));
        } else {
            System.out.println("No se introdujeron numeros");
        }
    }

    public static void ejercicio23() {
        /*
         * Ejercicio 23:
         * Realiza un programa que lea un número por teclado y nos diga si el número
         * es o no primo. (Los números primos son aquellos que sólo son divisibles por
         * ellos mismos y por la unidad).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        boolean primo = num > 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    public static void ejercicio24() {
        /*
         * Ejercicio 24:
         * Desarrollar un programa que lea números enteros hasta teclear 0, y nos
         * muestre el máximo, el mínimo y la media de todos ellos. El 0 no se debe
         * contar como número introducido, solo como valor de salida.
         */
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        Integer max = null;
        Integer min = null;
        int num;

        do {
            System.out.println("Introduce un numero (0 para terminar)");
            num = sc.nextInt();

            if (num != 0) {
                suma += num;
                contador++;

                if (max == null || num > max) {
                    max = num;
                }
                if (min == null || num < min) {
                    min = num;
                }
            }
        } while (num != 0);

        if (contador > 0) {
            System.out.println("Maximo: " + max);
            System.out.println("Minimo: " + min);
            System.out.println("Media: " + (suma / (double) contador));
        } else {
            System.out.println("No se introdujeron numeros");
        }
    }

    public static void ejercicio25() {
        /*
         * Ejercicio 25:
         * Escribe un programa en Java que implemente una calculadora simple. La
         * calculadora debe permitir a los usuarios realizar operaciones matemáticas
         * básicas, como suma, resta, multiplicación y división. El programa deberá
         * mostrar un menú con las siguientes opciones:
         * 1. Sumar
         * 2. Restar
         * 3. Multiplicar
         * 4. Dividir
         * 5. Es primo (indica si el número introducido es primo o no lo es)
         * 6. Salir
         * Cuando el usuario selecciona una opción (del 1 al 5), el programa debe
         * solicitar los números necesarios para realizar la operación y mostrar el
         * resultado de dicha operación. El programa debe repetir el proceso hasta que
         * el usuario seleccione la opción "Salir".
         * La opción "Salir" muestra un mensaje de despedida y finaliza la ejecución
         * del programa.
         */
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Es primo");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Primer numero");
                    double a = sc.nextDouble();
                    System.out.println("Segundo numero");
                    double b = sc.nextDouble();

                    if (opcion == 1) {
                        System.out.println("Resultado: " + (a + b));
                    } else if (opcion == 2) {
                        System.out.println("Resultado: " + (a - b));
                    } else if (opcion == 3) {
                        System.out.println("Resultado: " + (a * b));
                    } else if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                case 5:
                    System.out.println("Dame un numero");
                    int num = sc.nextInt();
                    boolean primo = num > 1;

                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            primo = false;
                        }
                    }

                    if (primo) {
                        System.out.println("Es primo");
                    } else {
                        System.out.println("No es primo");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static void ejercicio26() {
        /*
         * Ejercicio 26:
         * Diseña un programa que calcule la letra de un DNI. Para ello:
         * o 1º Pediremos el DNI por teclado al usuario.
         * o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
         * quedándonos con el resto de la división, que debe estar entre 0 y 22.
         * o Comprobaremos en la tabla correspondiente, en función del resto obtenido
         * en el paso anterior, cuál es la letra que corresponde.
         * Ejemplo: Si introduzco el número 70588387, el resto de la división con 23
         * es 7, por lo que le corresponde la letra "F".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero del DNI");
        int dni = sc.nextInt();
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                'H', 'L', 'C', 'K', 'E' };
        char letra = letras[dni % 23];

        System.out.println("La letra del DNI es " + letra);
    }

    public static void ejercicio27() {
        /*
         * Ejercicio 27:
         * Solicita al usuario una cadena y comprueba el número de vocales que tiene.
         * Deberás usar el método charAT(i) de la clase String para extraer un
         * carácter de la cadena, donde i es la posición del carácter de la cadena que
         * queremos obtener. Por ejemplo, si quisiéramos obtener el carácter número de
         * 5 de una cadena lo haríamos así: cadena.charAT(i)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine().toLowerCase();
        int vocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == '\u00e1' || c == '\u00e9'
                    || c == '\u00ed' || c == '\u00f3' || c == '\u00fa') {
                vocales++;
            }
        }

        System.out.println("Numero de vocales: " + vocales);
    }

    public static void ejercicio28() {
        /*
         * Ejercicio 28:
         * Realiza el control de acceso a una caja fuerte. La combinación será un
         * número de cuatro cifras. El usuario tendrá 4 oportunidades para averiguar
         * el número.
         * El programa nos pedirá la combinación para abrirla. Si no acertamos, se
         * nos mostrará el mensaje "Clave incorrecta le quedan X intentos", si agota
         * los 4 intentos mostrará el mensaje "Lo siento has agotado las 4
         * oportunidades" y si acertamos se nos dirá "Has abierto la caja fuerte".
         */
        Scanner sc = new Scanner(System.in);
        int claveCorrecta = 1234;
        boolean abierta = false;

        for (int i = 4; i > 0; i--) {
            System.out.println("Introduce la combinacion");
            int clave = sc.nextInt();

            if (clave == claveCorrecta) {
                abierta = true;
                System.out.println("Has abierto la caja fuerte");
                break;
            } else if (i > 1) {
                System.out.println("Clave incorrecta, te quedan " + (i - 1) + " intentos");
            }
        }

        if (!abierta) {
            System.out.println("Lo siento has agotado las 4 oportunidades");
        }
    }

    public static void ejercicio29() {
        /*
         * Ejercicio 29:
         * Realiza un programa que compruebe si dos números son amigos. Para ello hay
         * que comprobar que la suma de todos los divisores del primer número (sin
         * contar con él) es el segundo número, y que la suma de todos los divisores
         * propios del segundo número (sin contar con él) es el primer número.
         * Por ejemplo:
         * - Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y
         * 110. Su suma es 284.
         * - Los divisores propios de 284 son 1, 2, 4, 71 y 142. Su suma es 220.
         * - Por tanto, 220 y 284 son amigos.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dame el segundo numero");
        int num2 = sc.nextInt();
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma1 += i;
            }
        }

        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                suma2 += i;
            }
        }

        if (suma1 == num2 && suma2 == num1) {
            System.out.println("Son numeros amigos");
        } else {
            System.out.println("No son numeros amigos");
        }
    }

    public static void ejercicio30() {
        /*
         * Ejercicio 30:
         * Realiza un algoritmo que permita calcular un número determinado de
         * elementos de la serie de Fibonacci, teniendo en cuenta que cada uno es la
         * suma de los dos elementos anteriores, con la excepción de los dos
         * primeros, que son 0 y 1. Así, la serie estaría formada por los números:
         * 0, 1, 1, 2, 3, 5, 8, 13, 21...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos de Fibonacci quieres mostrar?");
        int cantidad = sc.nextInt();

        long a = 0;
        long b = 1;

        for (int i = 0; i < cantidad; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }

        System.out.println();
    }

    public static void ejercicio31() {
        /*
         * Ejercicio 31:
         * Crea un programa que pida al usuario un número entero positivo y calcule la
         * suma de todos los números primos hasta ese número.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero positivo");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 2; i <= num; i++) {
            boolean primo = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                suma += i;
            }
        }

        System.out.println("La suma de todos los numeros primos hasta " + num + " es " + suma);
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

    // Ejercicios incorporados desde PreparacionExamen/bucles.java.
    public static void ejercicio51() {
        /* Muestra los numeros impares entre 0 y 20. */
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public static void ejercicio52() {
        /* Muestra los numeros del 1 al 10 y calcula su suma. */
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma += i;
        }

        System.out.println("Suma: " + suma);
    }

    public static void ejercicio53() {
        /* Muestra los numeros pares entre 1 y 50. */
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }

    public static void ejercicio54() {
        /* Muestra las tablas de multiplicar del 1 al 5. */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void ejercicio55() {
        /* Lee diez numeros y muestra la suma de los que son positivos. */
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero:");
            int numero = sc.nextInt();
            if (numero > 0) {
                suma += numero;
            }
        }

        System.out.println("Suma de positivos: " + suma);
    }

    public static void ejercicio56() {
        /* Lee numeros hasta introducir 0 y muestra su suma. */
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.println("Introduce un numero (0 para terminar):");
            numero = sc.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
    }

    public static void ejercicio57() {
        /* Cuenta cuantos numeros se introducen antes de escribir uno negativo. */
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;

        do {
            System.out.println("Introduce un numero negativo para terminar:");
            numero = sc.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);

        System.out.println("Numeros no negativos introducidos: " + contador);
    }

    public static void ejercicio58() {
        /* Muestra un menu que permite saludar, mostrar el 10 o salir. */
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar numero 10");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println(10);
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    // Ejercicios incorporados desde UT3_2_Bucles.java.
    public static void ejercicio59() {
        /* Lee numeros y muestra su cuadrado hasta introducir uno negativo. */
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Dime un numero y te dare su cuadrado mientras no sea negativo");
        while ((num = sc.nextInt()) >= 0) {
            System.out.println("El cuadrado de " + num + " es " + (num * num));
        }
    }

    public static void ejercicio60() {
        /* Lee numeros hasta uno negativo y calcula la media de los no negativos. */
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cantidad = 0;
        double num;

        System.out.println("Dime numeros y calculare la media; escribe uno negativo para terminar");
        while ((num = sc.nextDouble()) >= 0) {
            suma += num;
            cantidad++;
        }

        if (cantidad > 0) {
            System.out.println("La media de los numeros es " + (suma / cantidad));
        } else {
            System.out.println("No se introdujeron numeros no negativos");
        }
    }

    public static void ejercicio61() {
        /* Muestra el producto de los diez primeros numeros impares. */
        long producto = 1;

        for (int impar = 1; impar <= 19; impar += 2) {
            producto *= impar;
        }

        System.out.println("La multiplicacion de los 10 primeros impares es " + producto);
    }

    public static void ejercicio62() {
        /* Lee diez numeros y muestra las medias de positivos y negativos, y los ceros. */
        Scanner sc = new Scanner(System.in);
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;
        int ceros = 0;

        System.out.println("Dame 10 numeros");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num > 0) {
                sumaPositivos += num;
                cantidadPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                cantidadNegativos++;
            } else {
                ceros++;
            }
        }

        if (cantidadPositivos > 0) {
            System.out.println("La media de los numeros positivos es "
                    + (sumaPositivos / (double) cantidadPositivos));
        }
        if (cantidadNegativos > 0) {
            System.out.println("La media de los numeros negativos es "
                    + (sumaNegativos / (double) cantidadNegativos));
        }
        System.out.println("Has introducido " + ceros + " ceros");
    }

    public static void ejercicio63() {
        /* Pide una cantidad de sueldos y muestra el sueldo maximo introducido. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuantos sueldos quieres introducir");
        int cantidad = sc.nextInt();

        if (cantidad <= 0) {
            System.out.println("Debes introducir al menos un sueldo");
            return;
        }

        int sueldoMaximo = Integer.MIN_VALUE;
        System.out.println("Introduce " + cantidad + " sueldos");
        for (int i = 0; i < cantidad; i++) {
            int sueldo = sc.nextInt();
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }

        System.out.println("El sueldo maximo es: " + sueldoMaximo + " euros");
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
        // ejercicio51();
        // ejercicio52();
        // ejercicio53();
        // ejercicio54();
        // ejercicio55();
        // ejercicio56();
        // ejercicio57();
        // ejercicio58();
        // ejercicio59();
        // ejercicio60();
        // ejercicio61();
        // ejercicio62();
        // ejercicio63();
    }
}
