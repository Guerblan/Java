import java.util.Scanner;
import java.util.Random;

public class Bucles {
    /**
     * .Ejercicio 1:
     * 
     * .Uso:
     * `while`, `do-while`, `for`
     * 
     * .Tema:
     * Recorrido de números del 1 al 100 con distintas estructuras de repetición.
     * 
     * .Enunciado:
     * Realizar un programa que imprima en pantalla los números del 1 al 100.
     * (Debes hacerlo con las tres estructuras iterativas vistas: while, do while y
     * for).
     */

    public static void ejercicio1() {
        /*
         * int contador = 1;
         * 
         * while (contador <= 100) {
         * System.out.println(contador);
         * contador++;
         * }
         */

        /*
         * int contador = 1;
         * do {
         * System.out.println(contador);
         * contador++;
         * } while (contador <= 100);
         */

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

    }

    /**
     * .Ejercicio 2:
     * 
     * .Uso:
     * `Scanner`, `for`
     * 
     * .Tema:
     * Contar desde 1 hasta un número introducido por el usuario.
     * 
     * .Enunciado:
     * Escribir un programa que solicite un valor positivo y nos muestre desde 1
     * hasta el valor ingresado de uno en uno.
     */

    public static void ejercicio2() {
        Scanner sca = new Scanner(System.in);
        int num = 1;
        System.out.println("Dame un número poitivo");
        num = sca.nextInt();
        while (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        }
    }

    /**
     * .Ejercicio 3:
     * 
     * .Uso:
     * `Scanner`, `for`, variables acumuladoras
     * 
     * .Tema:
     * Sumar y promediar 10 números introducidos por el usuario.
     * 
     * .Enunciado:
     * Desarrollar un programa que permita la carga de 10 valores por teclado y nos
     * muestre posteriormente la suma de los valores ingresados y su promedio.
     */

    public static void ejercicio3() {
        Scanner sca = new Scanner(System.in);
        int sum = 0;
        System.out.println("introduce 10 valores");
        for (int i = 0; i < 10; i++) {
            int num = sca.nextInt();
            sum += num;
        }
        // Importante poner promedio después de asignarle el valor a sum porque si no
        // sería 0/10
        int promedio = sum / 10;
        System.out.println("La suma de los valores es: " + sum + " y su promedio: " + promedio);
    }

    public static void ejercicio4() {
        /**
         * .Ejercicio 4:
         * 
         * .Uso:
         * `Scanner`, `String`, `while`, comparación de cadenas (`equals`)
         * 
         * .Tema:
         * Bucle que solicita adivinar un valor hasta acertar.
         * 
         * .Enunciado:
         * Diseña una aplicación o programa que consista en lo siguiente:
         * o Guarda en una variable tu nombre.
         * o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
         * por teclado.
         * o El programa finaliza cuando el usuario adivina tu nombre. Sino el programa
         * debe continuar
         * pidiendo al usuario que lo intente otra vez.
         */
        Scanner sca = new Scanner(System.in);
        String nombre = "Pedro";
        String intento = "";
        System.out.println("Cómo me llamo?Adivínalo!");
        /*
         * Usamos el .trim() para eliminar espacios,así el usuario si mete
         * sin querer un espacio antes o después del nombre no pasará nada
         */
        intento = sca.nextLine().trim();
        /*
         * el IgnoreCase para ignorar si metemos mayusculas o minúsculas.Va seguido del
         * .equals,sin
         * . ni separaciones
         * 
         * También importante que !intento hace referencia a que NO es igual,si
         * eliminara !
         * estaría diciendo que si son iguales y no es lo que queremos
         */
        while (!intento.equalsIgnoreCase(nombre)) {
            System.out.println("Inténtalo de nuevo!!");
            intento = sca.nextLine().trim();
        }
        System.out.println("Bien!, " + nombre + " es mi nombre!");

    }

    public static void ejercicio5() {
        /**
         * .Ejercicio 5:
         * 
         * .Uso:
         * `Random`, `Scanner`, `while`, condicionales (`if`)
         * 
         * .Tema:
         * Simulación de dados con repetición según elección del usuario.
         * 
         * .Enunciado:
         * Diseña una aplicación que simule la tirada de dos dados y muestre al usuario
         * el resultado de la tirada.
         * Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que
         * el resultado es el mismo.
         * La aplicación se debe repetir hasta que el usuario indique que no quiere
         * tirar más (preguntando por ‘s’ o ‘n’, o “si” o “no”).
         */
        Scanner sca = new Scanner(System.in);
        Random aleatorio = new Random();
        int tirada1 = 0;
        int tirada2 = 0;
        String seguir = "";
        do {
            tirada1 = aleatorio.nextInt(6) + 1;
            tirada2 = aleatorio.nextInt(6) + 1;
            if (tirada1 == tirada2) {
                System.out.println("Has sacado en ambas tiradas " + tirada1);
            } else {
                System.out.println("El resultado de la primera tirada es: " + tirada1);
                System.out.println("El resultado de la segunda tirada es: " + tirada2);
            }
            System.out.println("Quieres seguir tirando??Respone s si sí o n si no");
            seguir = sca.nextLine().trim();

        } while (seguir.equalsIgnoreCase("s"));

    }

    public static void ejercicio6() {
        /**
         * .Ejercicio 6:
         * 
         * .Uso:
         * `Scanner`, `Random` o número fijo, `while`, condicionales (`if`)
         * 
         * .Tema:
         * Juego de adivinar un número con pistas de mayor o menor.
         * 
         * .Enunciado:
         * Realizar un juego para adivinar un número. Para ello primero, el programa
         * debe guardar
         * un número en una variable y el usuario debe introducir números hasta
         * acertarlos.
         * Para darle pistas al usuario se le indicará “mayor” o “menor” según sea mayor
         * o menor con
         * respecto al número guardado. El proceso termina cuando el usuario acierta.
         */
        Scanner sca = new Scanner(System.in);
        int numsecret = 3;
        int intento = 0;
        while (intento != numsecret) {
            System.out.println("Adivina el número!");
            intento = sca.nextInt();
            if (intento == numsecret) {
                System.out.println("Exacto!,el número es " + numsecret);
            } else if (intento < numsecret) {
                System.out.println(intento + " es menor que el número secreto");
            } else {
                System.out.println(intento + " es mayor que el número secreto");
            }
        }

    }

    public static void ejercicio7() {
        /**
         * .Ejercicio 7:
         * 
         * .Uso:
         * `Scanner`, `Thread.sleep()`, bucle infinito (`while`), condicionales, manejo
         * de tiempo manual
         * 
         * .Tema:
         * Simulación de un reloj digital con incremento por segundo.
         * 
         * .Enunciado:
         * Diseña una aplicación que simule un reloj digital que muestre la hora sin
         * parar. Debe
         * esperar un segundo real para darle más realismo. Pasos:
         * o Pide al usuario que introduzca la hora y los minutos.
         * o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
         * o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
         * cambio de
         * minuto y hora.
         * o Muéstralo por pantalla.
         * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa
         * durante 1000
         * milisegundos = 1 segundo).
         */
        Scanner sca = new Scanner(System.in);
        int hora = 0;
        int min = 0;
        int seg = 0;
        do {
            System.out.println("Dame las horas");
            hora = sca.nextInt();
            System.out.println("Dame los minutos");
            min = sca.nextInt();
        } while (hora < 0 || hora > 23 || min < 0 || min > 59);
        // Formato para imprimir horas!!!!
        System.out.printf("%02d:%02d:%02d%n", hora, min, seg);

    }

    public static void ejercicio8() {
        /**
         * .Ejercicio 8:
         * 
         * .Uso:
         * `Scanner`, `for`, variables acumuladoras
         * 
         * .Tema:
         * Cálculo del factorial de un número entero positivo.
         * 
         * .Enunciado:
         * Escriba un programa que calcule el factorial de un número.
         * El factorial de un número es igual al producto de todos los números enteros
         * positivos desde 1 hasta dicho número.
         */
    }

    public static void ejercicio9() {
        /**
         * .Ejercicio 9:
         * 
         * .Uso:
         * `Scanner`, `for`, concatenación de cadenas
         * 
         * .Tema:
         * Dibujo de figuras con asteriscos: escalera creciente e invertida.
         * 
         * .Enunciado:
         * Escriba un programa que dibuje una escalera de asteriscos. La altura de la
         * escalera se lee por teclado.
         * Ejemplo: Si introducimos un 5 nos queda:
         *
         * *
         * **
         * ***
         * ****
         * *****
         * 
         * Posteriormente hacer lo mismo, pero con la pirámide invertida.
         */
        Scanner sca = new Scanner(System.in);
        int limit = 0;
        System.out.println("Cuántos pisos quieres que tenga la pirámide?");
        limit = sca.nextInt();
        // Usamos un bucle anidado!!Así sí podré incrementar!!Ojo con los intervalos de
        // i y j
        for (int i = 1; i <= limit; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = limit; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ejercicio10() {
        /**
         * .Ejercicio 10:
         * 
         * .Uso:
         * `Scanner`, `for`, condicionales (`if`), operadores aritméticos
         * 
         * .Tema:
         * Contar positivos, negativos, ceros, pares e impares a partir de una serie de
         * números ingresados.
         * 
         * .Enunciado:
         * Diseña un programa que pide al usuario que ingrese la cantidad de números que
         * va a introducir.
         * Deberá leer la cantidad de números indicada y cuenta cuántos son positivos,
         * negativos y ceros,
         * cuántos pares y cuántos impares, mostrando esa información al finalizar la
         * ejecución.
         */
        Scanner sca = new Scanner(System.in);
        int numIntro = 0;
        int num = 0;
        int pos = 0;
        int neg = 0;
        int cero = 0;
        int par = 0;
        int imp = 0;
        System.out.println("Qué cantidad de números vas a introducir?");
        numIntro = sca.nextInt();
        for (int i = 0; i < numIntro; i++) {
            System.out.println("Introduce un número");
            num = sca.nextInt();
            // Bloque de positivos/negativos y ceros
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                cero++;
            }

            // Bloque de par/impar
            if (num % 2 == 0) {
                par++;
            } else {
                imp++;
            }

        }
        System.out.println("La cantidad de números positivos es: " + pos);
        System.out.println("La cantidad de números negativos es: " + neg);
        System.out.println("La cantidad de ceros es: " + cero);
        System.out.println("La cantidad de números pares es: " + par);
        System.out.println("La cantidad de números impares es: " + imp);

    }

    /**
     * .Ejercicio 11:
     * 
     * .Uso:
     * `Scanner`, `for`, operadores aritméticos
     * 
     * .Tema:
     * Mostrar la tabla de multiplicar del número introducido por el usuario.
     * 
     * .Enunciado:
     * Crea un programa que solicite un número y muestra su tabla de multiplicar del
     * 1 al 10.
     */
    public static void ejercicio11() {

    }

    /**
     * .Ejercicio 12:
     * 
     * .Uso:
     * `Scanner`, `if`, `switch`, operadores aritméticos
     * 
     * .Tema:
     * Conversión de temperaturas entre Celsius y Fahrenheit con menú interactivo.
     * 
     * .Enunciado:
     * Diseña un programa que permita al usuario convertir temperaturas de Celsius a
     * Fahrenheit y viceversa.
     * Ofrece un menú para elegir la conversión.
     * (Para pasar de Celsius a Fahrenheit: (°C * 1,8) + 32 y de Fahrenheit a
     * Celsius: (ºF - 32) / 1.8)
     */
    public static void ejercicio12() {

    }

    /**
     * .Ejercicio 13:
     * 
     * .Uso:
     * `Scanner`, `for`, condicionales (`if`), operadores aritméticos
     * 
     * .Tema:
     * Determinar si un número entero es un número perfecto.
     * 
     * .Enunciado:
     * Implementa un programa que pida un número entero al usuario y determine si es
     * un número perfecto.
     * Un número es perfecto si es igual a la suma de sus divisores propios.
     * (Los divisores propios de un número son aquellos números por los que es
     * divisible un número sin contar el número).
     */
    public static void ejercicio13() {

    }

    /**
     * .Ejercicio 14:
     * 
     * .Uso:
     * `Scanner`, `for`, condicionales (`if`), lógica para detectar números primos
     * 
     * .Tema:
     * Calcular la suma de todos los números primos hasta un número dado.
     * 
     * .Enunciado:
     * Crea un programa que pida al usuario un número entero positivo y calcule la
     * suma de todos los números primos hasta ese número.
     */
    public static void ejercicio14() {

    }

    /**
     * .Ejercicio 15:
     * 
     * .Uso:
     * `Scanner`, `Random`, `while`, condicionales (`if`), control de saldo
     * 
     * .Tema:
     * Simulación de apuestas con control de saldo y resultado aleatorio.
     * 
     * .Enunciado:
     * Diseña un programa que simule una casa de apuestas. Se comenzará con un saldo
     * de 100€.
     * Pedirá al usuario qué cantidad quiere apostar, la cual deberá estar entre 1 y
     * el saldo disponible.
     * Se deberá generar un booleano aleatorio (`random.nextBoolean()`), en caso de
     * que salga `true`,
     * el usuario gana el importe apostado.
     * Se jugará a este juego mientras quiera el usuario y/o quede saldo.
     */
    public static void ejercicio15() {

    }

    /**
     * .Ejercicio 16:
     * 
     * .Uso:
     * `Scanner`, `Random`, `for`, arrays o variables múltiples, validación de
     * entrada, condicionales (`if`)
     * 
     * .Tema:
     * Simulación de una quiniela de 15 partidos con resultados aleatorios y
     * comprobación de aciertos.
     * 
     * .Enunciado:
     * Crea un programa que simule una quiniela, para ello se deberá leer el
     * resultado de 15 partidos.
     * El usuario deberá introducir 1, X o 2. Almacenaremos los valores en variables
     * para luego poder usarlas.
     * Debemos controlar que solo pueda introducir 1, X o 2.
     * 
     * Una vez pedidos todos los resultados iremos generando aleatoriamente el
     * resultado de los partidos,
     * si gana el equipo de casa (1), empatan (X) o gana el equipo visitante (2).
     * 
     * Debemos mostrar para finalizar el resultado del partido y el que puso el
     * usuario, y finalmente el
     * número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el
     * pleno al 15.
     */
    public static void ejercicio16() {

    }

    /**
     * .Ejercicio 17:
     * 
     * .Uso:
     * `Scanner`, `String`, `charAt()`, `Character.toUpperCase()`,
     * `Character.toLowerCase()`, `for`
     * 
     * .Tema:
     * Conversión de una frase a formato camelCase (estilo PascalCase en este caso).
     * 
     * .Enunciado:
     * Crea un programa que lea una frase por teclado y la convierta al formato
     * camelCase.
     * Por ejemplo, si introducimos por teclado “hola como estás”, el programa
     * deberá mostrar “HolaComoEstás”.
     * 
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
    public static void ejercicio17() {

    }

    /**
     * .Ejercicio 18:
     * .Uso: `Scanner`, `for`
     * .Tema: Repetir una secuencia numérica en varias líneas
     * .Enunciado: Pide un número y escribe tantas líneas como el número diga, y en
     * cada línea escribe desde 1 hasta ese número.
     */
    public static void ejercicio18() {
    }

    /**
     * .Ejercicio 19:
     * .Uso: `Scanner`, `for`
     * .Tema: Secuencia numérica decreciente en múltiples líneas
     * .Enunciado: Igual que el anterior, pero en orden decreciente (ej: 54321).
     */
    public static void ejercicio19() {
    }

    /**
     * .Ejercicio 20:
     * .Uso: `Scanner`, `for`
     * .Tema: Escalera numérica creciente (1, 12, 123...)
     * .Enunciado: Imprimir pirámide numérica creciente según número de líneas
     * indicado.
     */
    public static void ejercicio20() {
    }

    /**
     * .Ejercicio 21:
     * .Uso: `for`
     * .Tema: Cuenta regresiva de 7 en 7 desde 100 a 0
     * .Enunciado: Muestra los números desde 100 a 0 de 7 en 7.
     */
    public static void ejercicio21() {
    }

    /**
     * .Ejercicio 22:
     * .Uso: `Scanner`, `for`
     * .Tema: Promedio de N números
     * .Enunciado: Pregunta cuántos números quiere leer y muestra el promedio.
     */
    public static void ejercicio22() {
    }

    /**
     * .Ejercicio 23:
     * .Uso: `Scanner`, `for`
     * .Tema: Verificar número primo
     * .Enunciado: Pide un número y dice si es primo.
     */
    public static void ejercicio23() {
    }

    /**
     * .Ejercicio 24:
     * .Uso: `Scanner`, `do-while`
     * .Tema: Mínimo, máximo y media de números
     * .Enunciado: Leer números hasta introducir 0. Mostrar el máximo, mínimo y
     * media.
     */
    public static void ejercicio24() {
    }

    /**
     * .Ejercicio 25:
     * .Uso: `Scanner`, `switch`, `while`
     * .Tema: Calculadora simple interactiva
     * .Enunciado: Calculadora con menú de operaciones (+, -, *, /, primo) que
     * repite hasta que se elija salir.
     */
    public static void ejercicio25() {
    }

    /**
     * .Ejercicio 26:
     * .Uso: `Scanner`, `switch`, operadores
     * .Tema: Calcular letra de DNI
     * .Enunciado: Pedir DNI, calcular el resto y usarlo para obtener la letra según
     * tabla.
     */
    public static void ejercicio26() {
    }

    /**
     * .Ejercicio 27:
     * .Uso: `Scanner`, `charAt()`, `for`
     * .Tema: Contar vocales en una cadena
     * .Enunciado: Solicita una cadena y muestra cuántas vocales contiene.
     */
    public static void ejercicio27() {
    }

    /**
     * .Ejercicio 28:
     * .Uso: `Scanner`, condicionales
     * .Tema: Control de acceso a una caja fuerte
     * .Enunciado: Pide una combinación (4 intentos máximo). Si acierta, abre. Si
     * no, mensaje de error.
     */
    public static void ejercicio28() {
    }

    /**
     * .Ejercicio 29:
     * .Uso: `Scanner`, bucles, lógica matemática
     * .Tema: Números amigos
     * .Enunciado: Comprueba si dos números son amigos (la suma de divisores de uno
     * da el otro, y viceversa).
     */
    public static void ejercicio29() {
    }

    /**
     * .Ejercicio 30:
     * .Uso: `Scanner`, `for`
     * .Tema: Serie de Fibonacci
     * .Enunciado: Calcula N términos de la serie de Fibonacci.
     */
    public static void ejercicio30() {
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
        ejercicio10();
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
    }
}
