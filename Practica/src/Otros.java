package Practica.src;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

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

    /*
     * RECUPERACIÓN 1 EVALUACIÓN
     */
    public static void ejercicio4() {
        /*
         * Ejercicio 1: Declaración e inicialización de arrays
         * Declara un array de enteros llamado numeros con un tamaño de 5 elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50.
         * 
         * Imprime el valor del tercer elemento del array.
         */
        int[] numeros = { 10, 20, 30, 40, 50 };
        System.out.println(numeros[3]);
    }

    public static void ejercicio5() {
        /*
         * Ejercicio 3: Modificación de elementos
         * Declara un array de enteros llamado temperaturas con un tamaño de 3
         * elementos.
         * 
         * Inicializa el array con los valores 15, 20, 25.
         * 
         * Cambia el valor del segundo elemento a 30.
         * 
         * Imprime el array completo después de la modificación.
         */

        int[] temperaturas = { 15, 20, 25 };

    }

    public static void ejercicio6() {
        /*
         * USO DE MATH.POW
         * 
         * 
         * Escribe un programa en Java que le pida al usuario ingresar dos números:
         * 
         * la base (un número decimal o entero),
         * 
         * y el exponente (entero positivo o negativo),
         * 
         * El programa debe mostrar el resultado de elevar la base al exponente usando
         * Math.pow.
         */

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        double resultado;
        System.out.println("Dame el primer número");
        num1 = scan.nextInt();
        System.out.println("Dame el segundo número");
        num2 = scan.nextInt();
        resultado = Math.pow(num1, num2);
        System.out.println("El resultado de elevar " + num1 + " a " + num2 + " es " + resultado);

    }

    public static void ejercicio7() {
        /*
         * FUNCIÓN RESTO
         * 
         * Pide un número entero al usuario y usa el operador % para determinar si el
         * 
         * número es par o impar.
         */

        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Dame un número");
        num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
    }

    public static void ejercicio8() {
        /*
         * MATH.RANDOM
         * 
         * El programa genera un número aleatorio entre 1 y 10.
         * El usuario tiene que adivinarlo. El programa le dice si acertó o no.
         */
        Scanner sca = new Scanner(System.in);
        Random ran = new Random();

        int numeroAleatorio;
        int numeroUsuario;

        numeroAleatorio = ran.nextInt(10 + 1);
        System.out.println("Introduce un número entre 1 y 10");
        numeroUsuario = sca.nextInt();
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Acertaste!El numero aleatorio también es el " + numeroAleatorio);
        } else {
            System.out.println("No has acertado");
        }
    }

    public static void ejercicio9() {
        /*
         * BOOLEAN
         * 
         * El usuario introduce un número.
         * El programa verifica si ese número está entre 1 y 100 (ambos inclusive) y
         * muestra un mensaje según corresponda.
         * Usaremos una variable boolean para guardar el resultado.
         * 
         */

        Scanner sca = new Scanner(System.in);
        int num;
        boolean entra = false;
        System.out.println("Introduce un número");
        num = sca.nextInt();
        if (num >= 1 && num <= 100) {
            entra = true;
            System.out.println("El número está en el rango 1-100");
        } else {
            System.out.println("El número no está en el rango 1-100");
        }
    }

    public static void ejercicio10() {
        /*
         * BOOLEAN
         * 
         * Realizar un juego para adivinar un número. Para ello primero, el programa
         * debe guardar
         * un número en una variable y el usuario debe introducir números hasta
         * acertarlos. Para darle pistas
         * al usuario se le indicará “mayor” o “menor” según sea mayor o menor con
         * respecto al número
         * guardado. El proceso termina cuando el usuario acierta.
         * Muestra los intentos que has hecho hasta sacar el número.
         */
        Scanner sca = new Scanner(System.in);

        int numSecreto = 13;
        int numIntroducido = 0;
        Boolean encontrado = false;
        int intentos = 0;

        do {
            System.out.println("introduce un número");
            numIntroducido = sca.nextInt();
            if (numIntroducido > numSecreto) {
                System.out.println("Te has pasao");
            }
            if (numIntroducido < numSecreto) {
                System.out.println("Te has quedao corto");
            }
            if (numIntroducido == numSecreto) {
                encontrado = true;
                System.out.println("Acertastes!");
            }
            intentos++;
            System.out.println("Este es tu intento número " + intentos);
        } while (encontrado == false);

        /*
         * while (encontrado==false) {
         * 
         * System.out.println("introduce un número");
         * numIntroducido = sca.nextInt();
         * if (numIntroducido > numSecreto) {
         * System.out.println("Te has pasao");
         * }
         * if (numIntroducido < numSecreto) {
         * System.out.println("Te has quedao corto");
         * }
         * if (numIntroducido==numSecreto) {
         * encontrado=true;
         * System.out.println("Acertastes!");
         * }
         * intentos++;
         * System.out.println("Éste es tu intento número " + intentos);
         * }
         */

    }

    public static void ejercicio11() {
        /*
         *
         * SWITCH BÁSICO
         * 
         * Enunciado:
         * Escribe un programa en Java que muestre un menú con opciones numéricas del 1
         * al 7, donde cada número representa un día de la semana. El usuario debe
         * introducir un número, y el programa mostrará el nombre del día
         * correspondiente.
         * 
         * Requisitos:
         * Usa una estructura switch para mostrar el día según el número.
         * 
         * Si el número no está entre 1 y 7, muestra un mensaje que diga
         * "Número inválido".
         * 
         */
        Scanner sca = new Scanner(System.in);
        int dia;
        System.out.println("Introduce un número del 1-7 y te diré al día de la semana que corresponde");
        dia = sca.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Número introducido incorrecto");
                break;
        }
    }

    public static void ejercicio12() {
        /*
         * BUCLE ANIDADO
         * 
         * Realiza un programa en Java que, dado un número entero positivo n, construya
         * una pirámide de asteriscos de altura n.
         * 
         * Cada nivel de la pirámide debe contener un número impar de asteriscos
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
        int n;
        System.out.println("Introduce un número");
        n = sca.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.println("*");
            }
        }
    }

    public static void ejercicio13() {
        /*
         * Declara una lista (ArrayList<String>) para guardar nombres.
         * 
         * Pide al usuario que introduzca 5 nombres y los añada a la lista.
         * 
         * Después de la inserción, muestra todos los nombres introducidos.
         * 
         * Incluye un comentario explicando:
         * 
         * ¿Por qué se usa ArrayList?
         * 
         * ¿Qué ventajas tiene sobre los arrays tradicionales?
         * 
         */
        Scanner sca = new Scanner(System.in);
        int limite = 5;
        ArrayList<String> listaNombres = new ArrayList<>();
        for (int i = 0; i < limite; i++) {
            System.out.println("Introduce un nombre en la posición " + i);
            String nombre = sca.nextLine();
            listaNombres.add(nombre);
        }
        System.out.print("El array de libros quedaría tal que así: " + listaNombres);
    }

    public static void ArrayListAlmacenarYMostrarCiudades() {
        /*
         * ARRAYLIST PARA ALMACENAR Y MOSTRAR DATOS
         * 
         * Crea un programa en Java que:
         * 
         * Declare un ArrayList<String> para guardar nombres de ciudades.
         * 
         * Pida al usuario que introduzca 3 ciudades y las añada a la lista.
         * 
         * Muestre todas las ciudades al final, pero en mayúsculas.
         * 
         * Justifica en un comentario por qué usas ArrayList y no un array tradicional.
         * 
         * 
         */

        Scanner sca = new Scanner(System.in);
        ArrayList<String> listaCiudades = new ArrayList<>();
        int limite = 3;
        // pongo límite para llegar sólo a las 3 ciudades que me piden
        for (int i = 0; i < limite; i++) {
            System.out.println("Introduce el nombre de una ciudad en la posición: " + i);
            // Ahora introduzco un nombre de una ciudad (lo estoy metiendo por teclado pero
            // no en el array aún!!!)
            // Como lo voy a usar dentro del for sólo lo declaro dentro del mismo for
            String nombre = sca.nextLine();
            // Es ahora cuando lo meto dentro del array y no antes
            listaCiudades.add(nombre);

        }
        for (String nombre : listaCiudades) {
            System.out.print(nombre.toUpperCase() + ",");
        }
    }

    public static void ArrayListAlmacenarYMostrarFrutas() {
        /*
         * Declara un ArrayList<String> para guardar frutas.
         * 
         * Pide al usuario 4 frutas y añádelas a la lista.
         * 
         * Muestra:
         * 
         * .
         */
        Scanner sca = new Scanner(System.in);
        ArrayList<String> listaFrutas = new ArrayList<>();
        int limite = 4;
        for (int i = 0; i < limite; i++) {
            System.out.println("Introduce una fruta en la posición:" + i);
            String fruta = sca.nextLine();
            listaFrutas.add(fruta);
        }
        // Ahora voy a usar dos formas de mostrarlo con for each y mostrando el array
        // directamente
        /*
         * for(String fruta:listaFrutas){
         * System.out.println(fruta);
         * }
         */
        System.out.println("El ArrayList completo es: " + listaFrutas);

    }

    public static void UsoDeLinkedListEIteratorParaguardarYMostrarNumeros() {
        /*
         * Crea un programa que:
         * 
         * Use una LinkedList<Integer> para almacenar 6 números enteros introducidos por
         * el usuario.
         * 
         * Utilice un Iterator para recorrer la lista y calcular la suma total de los
         * elementos.
         * 
         * Muestre el resultado de la suma.
         * 
         * Incluye comentarios que expliquen:
         * 
         * ¿Por qué usar LinkedList en lugar de ArrayList?
         * 
         * ¿Qué ventajas tiene el Iterator para este ejercicio?
         */
        Scanner sca = new Scanner(System.in);
        // Ojo que si uso Int me daría fallo,Int es para operaciones sencillas e Integer
        // es para colecciones
        LinkedList<Integer> listaNumeros = new LinkedList<>();
        int limite = 6;
        for (int i = 0; i < limite; i++) {
            System.out.println("Introduce un número en la posición: " + i);
            int num = sca.nextInt();
            listaNumeros.add(num);
        }
        // Quedarme bien con la estructura.
        Iterator<Integer> ite = listaNumeros.iterator();
        int suma = 0;
        // mientras pueda iterar una posición más entra en el bucle,si no pasas al syso
        // que viene
        while (ite.hasNext()) {
            // sumo a suma el siguiente valor de la iteración
            suma += ite.next();
        }
        System.out.println("Suma total = " + suma);

    }

    public static void LinkedListIteratorConCondiciones() {
        


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
        // ArrayListAlmacenarYMostrarCiudades();
        // ArrayListAlmacenarYMostrarFrutas();
        // UsoDeLinkedListEIteratorParaguardarYMostrarNumeros();
        // LinkedListIteratorConCondiciones();
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
