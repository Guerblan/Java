import java.util.Random;
import java.util.Scanner;

public class UT3_RepasoParaElExamen {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String opciones = "Opción 1 - InfoNumeros\n" +
                "Opción 2 - CelsiusFahrenheit\n" +
                "Opción 3 - Perfecto\n" +
                "Opción 4 - Primos\n" +
                "Opción 5 - Apuesta\n" +
                "Opción 6 - Quiniela\n" +
                "Opción 7 - CamelCase\n";
        int opcion;
        boolean salir = false;
        do {
            System.out.println("\nElige una opción:");
            System.out.println(opciones);
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    InfoNumeros();
                    break;
                case 2:
                    CelsiusFahrenheit();
                    break;
                case 3:
                    Perfecto();
                    break;
                case 4:
                    Primos();
                    break;
                case 5:
                    Apuesta();
                    break;
                case 6:
                    Quiniela();
                    break;
                case 7:
                    CamelCase();
                    break;

                default:
                    salir = true;
                    sc.close();
                    break;
            }
        } while (!salir);
    }

    /*
     * Ejercicio 1: Diseña un programa que pide al usuario que ingrese la cantidad
     * de números que va a introducir. Deberá leer la cantidad de números indicada y
     * cuenta cuántos son positivos, negativos y ceros, cuantos pares y cuantos
     * impares, mostrando esa información al finalizar la ejecución.
     */
    public static void InfoNumeros() {
        int numPositivo = 0, numNegativo = 0, ceros = 0, numPar = 0, numImpar = 0;
        System.out.print("\n¿Cuántos números quieres introducir? ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.print("Introduce el número 1: ");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num2 > 0) {
                numPositivo++;
            } else if (num2 < 0) {
                numNegativo++;
            } else {
                ceros++;
            }
            if (num2 % 2 == 0) {
                numPar++;
            } else {
                numImpar++;
            }
        }
        System.out.println("\nHas introducido " + num + " números:"
                + "\n-Números positivos: " + numPositivo
                + "\n-Números negativos: " + numNegativo
                + "\n-Ceros: " + ceros
                + "\n-Números pares: " + numPar
                + "\n-Números impar: " + numImpar);
    }

    /*
     * Ejercicio 2: Diseña un programa que permita al usuario convertir temperaturas
     * de Celsius a Fahrenheit y viceversa. Ofrece un menú para elegir la
     * conversión.
     * (Para pasar de Celsius a Fahrenheit: (°C x 1,8) + 32 y de Fahrenheit a
     * Celsius: (Fº-32)*1.8)
     */
    public static void CelsiusFahrenheit() {
        System.out.println("\nElige una opción"
                + "\n1-Celsius to Farenhein"
                + "\n2-Farenhein to Celsius");
        int opcion = Integer.parseInt(sc.nextLine());
        System.out.print("\nDime la temperatura:");
        int temperatura = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1:
                System.out
                        .println("\nLa temperatura " + temperatura + "C es igual a " + (temperatura * 1.8 + 32) + "F");
                break;
            case 2:
                System.out.println(
                        "\nLa temperatura " + temperatura + "F es igual a " + ((temperatura - 32) * 1.8) + "C");
                break;

            default:
                System.out.println("\nNo has elegido una opción correcta");
                break;
        }
    }

    /*
     * Ejercicio 3: Implementa un programa que pida un número entero al usuario y
     * determine si es un número perfecto. Un número es perfecto si es igual a la
     * suma de sus divisores propios. (Los divisores propios de un número son
     * aquellos números por los que es divisible un número sin contar el número).
     */
    public static void Perfecto() {
        int suma = 1;
        System.out.print("\nDame un número: ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        if (num == 1 || suma != num) {
            System.out.println("\nNO es perfecto");
        } else {
            System.out.println("\nSI es perfecto");
        }
    }

    /*
     * Ejercicio 4: Crea un programa que pida al usuario un número entero positivo y
     * calcule la suma de todos los números primos hasta ese número.
     */
    public static void Primos() {
        int suma = 0;
        System.out.print("\nIntroduce un número entero positivo: ");
        int num = Integer.parseInt(sc.nextLine());
        while (num < 0) {
            System.out.print("\nNúmero incorrecto, introduce un número entero positvo: ");
            num = Integer.parseInt(sc.nextLine());
        }
        for (int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j <= i / 2 && primo; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                suma += i;
            }
        }
        System.out.println("\nLa suma de los número primos hasta " + num + " es " + suma);
    }

    /*
     * Ejercicio 5: Diseña un programa que simule una casa de apuestas. Se comenzará
     * con un saldo de 100€. Pedirá al usuario que cantidad quiere apostar, la cual
     * deberá estar entre 1 y el saldo disponible. Se deberá generar un booleano
     * aleatorio (random.nextBoolean()), en caso de que salga true, el usuario gana
     * el importe apostado. Se jugará a este juego mientras quiera el usuario y/o
     * quede saldo.
     */

    public static void Apuesta() {
        int saldo = 100, apuesta = 0;
        boolean flag = false;
        String respuestaSi = "si";
        do {
            System.out.print("\nTu saldo es de: " + saldo
                    + "\n¿Cuánto quieres apostar?: ");
            apuesta = Integer.parseInt(sc.nextLine());
            while (apuesta > saldo) {
                System.out.println("\nNo puedes apostar más de los que tienes, haz otra apuesta menor.");
                apuesta = Integer.parseInt(sc.nextLine());
            }
            boolean numRandom = random.nextBoolean();
            if (numRandom) {
                System.out.println("\n¡Ganaste!");
                saldo += apuesta;
            } else {
                System.out.println("\n¡Perdiste!");
                saldo -= apuesta;
            }
            System.out.println("\nTu saldo es de: " + saldo);
            System.out.print("¿Quieres seguir jugando? Escribe si o no: ");
            String respuesta = sc.nextLine();
            if (respuesta.equals(respuestaSi)) {
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);
    }

    /*
     * Ejercicio 6: Crea un programa que simule una quiniela, para ello se deberá
     * leer el resultado de 15 partidos. El usuario deberá introducir 1, X o 2.
     * Almacenaremos los valores en variables para luego poder usarlas. Debemos
     * controlar que solo pueda introducir 1, X o 2
     * Una vez pedidos todos los resultados iremos generando aleatoriamente el
     * resultado de los partidos, si gana el equipo de casa (1), empatan(X) o gana
     * el equipo visitante.
     * Debemos mostrar para finaliza el resultado del partido y el que puso el
     * usuario, y finalmente el número de aciertos. Los aciertos en la quiniela se
     * cuentan del 1 al 14 + el pleno al 15.
     * Un ejemplo de funcionamiento sería:
     */
    public static void Quiniela() {
        int aciertos = 0;
        for(int i = 1; i<= 15; i++){
            System.out.print("Partido "+i+": ");
            String apuesta = sc.nextLine();
            while (!apuesta.equals("1") && !apuesta.equals("x") && !apuesta.equals("2")) {
                System.out.print("Resultado no válido, introduce otro: ");
                apuesta = sc.nextLine();
            }
            String resultado = ResuldadoRandom(random.nextInt(3));
            if(apuesta.equals(resultado)){
            System.out.println("Partido "+i+": Resultado = "+resultado+", Tu apuesta = "+apuesta+". Has acertado!!!");
            aciertos ++;
            }else{
                System.out.println("Partido "+i+": Resultado ="+resultado+", Tu apuesta = "+apuesta+". No acertado");
            }
        }
        System.out.println("\nNúmero total de aciertos: "+aciertos);
        if (aciertos == 15) {
            System.out.println("Acertaste el pleno al 15!!!");
        }System.out.println("NO has acertado también el pleno al 15");
    }
    public static String ResuldadoRandom(int num){
        String resuldadoRandom;
        switch (num) {
            case 0 -> resuldadoRandom = "1";
            case 1 -> resuldadoRandom = "x";
            case 2 -> resuldadoRandom = "2";
            default -> resuldadoRandom = "Resultado no válido, introduce otro: "+num;
                
        }
        return resuldadoRandom;
    }
    /*
     * Ejercicio 7: Crea un programa que lea una frase por teclado y la convierta al
     * formato camelCase. Por ejemplo, si introducimos por teclado “hola como
     * estás”, el programa deberá mostrar “HolaComoEstás”.
     * Pistas:
     * 
     * Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando la
     * función cadena.charAt(i), donde cadena es nuestra variable cadena y la i la
     * posición del carácter.
     * 
     * Podemos pasar a minúscula un carácter con la función:
     * Character.toLowerCase(c), donde c es el carácter a convertir.
     */
    public static void CamelCase() {
        System.out.println("\nEscribe una frase");
        String frase = sc.nextLine();
        String camelCaseFrase = "";
        Boolean camelCaseOn = true;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                camelCaseOn = true;
            } else if (camelCaseOn) {
                camelCaseFrase += Character.toUpperCase(frase.charAt(i));
                camelCaseOn = false;
            } else {
                camelCaseFrase += frase.charAt(i);
            }
        }
        System.out.println("\n" + camelCaseFrase);
    }
}
