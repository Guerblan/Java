import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Vectores {

    // Ejercicios de vectores ordenados por dificultad.
    // Todas las entradas siguen el patron ejercicioN().

    public static void ejercicio1() {
        /* Pide n numeros, guardalos en un array y muestralos por pantalla. */
    }

    public static void ejercicio2() {
        /*
         * Copia un array de cinco valores y muestra la copia en orden ascendente y
         * descendente.
         */
    }

    public static void ejercicio3() {
        /*
         * Pide enteros positivos hasta introducir -1 y muestra los valores guardados.
         */
    }

    public static void ejercicio4() {
        /*
         * Pide un array de diez elementos y muestra otro con los elementos en orden
         * inverso.
         */
    }

    public static void ejercicio5() {
        /* Pide ocho numeros y crea otro array que solo contenga los impares. */
    }

    public static void ejercicio6() {
        /* Pide nueve numeros y separa los pares y los impares en dos arrays. */
    }

    public static void ejercicio7() {
        /* Pide diez numeros y muestra el maximo, el minimo y sus posiciones. */
    }

    public static void ejercicio8() {
        /* Genera veinte enteros aleatorios entre 0 y 99 y guardalos en un array. */
    }

    public static void ejercicio9() {
        /* Ordena un array desordenado usando el algoritmo que prefieras. */
    }

    public static void ejercicio10() {
        /* Genera veinte numeros entre 1 y 50 y guarda los primos en otro array. */
    }

    public static void ejercicio11() {
        /* Muestra por pantalla un array bidimensional con el formato indicado. */
    }

    public static void ejercicio12() {
        /* Rellena un array bidimensional con aleatorios entre 2 y 12. */
    }

    public static void ejercicio13() {
        /* Coloca tres unos sin solaparse en posiciones aleatorias de una matriz 3x3. */
    }

    public static void ejercicio14() {
        /*
         * Crea una matriz del tamano pedido y rellena con unos las posiciones
         * interiores.
         */
    }

    public static void ejercicio15() {
        /* Coloca tres unos no contiguos en una matriz 5x5. */
    }

    public static void ejercicio16() {
        /*
         * Permite introducir numeros en una matriz 5x5 hasta que se escriba la letra n.
         */
    }

    public static void ejercicio17() {
        /* Juego de una dama en un tablero de ajedrez con movimientos validos. */
    }

    // Ejercicios de practica integrados en la misma numeracion.

    // Nivel 1: fundamentos e inicializacion

    public static void ejercicio18() {

        /*
         * Ejercicio 1: DeclaraciÃƒÆ’Ã‚Â³n e inicializaciÃƒÆ’Ã‚Â³n de arrays
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 5
         * elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50.
         * 
         * Imprime el valor del tercer elemento del array.
         */

        int[] numeros = { 10, 20, 30, 40, 50 };
        System.out.println(numeros[2]);

    }

    public static void ejercicio19() {
        /*
         * Ejercicio 1.1: DeclaraciÃƒÆ’Ã‚Â³n e inicializaciÃƒÆ’Ã‚Â³n de arrays
         * Declara un array de enteros llamado notas con un tamaÃƒÆ’Ã‚Â±o de 4
         * elementos.
         * 
         * Inicializa el array con los valores 8, 6, 9, 7.
         * 
         * Imprime el valor del cuarto elemento del array.
         */
        int[] notas = { 8, 6, 9, 7, };
        System.out.println(notas[3]);

    }

    public static void ejercicio20() {
        /*
         * Crea un vector llamado temperaturas que almacene los siguientes valores: 23,
         * 12, 45, 8. Luego, imprime el segundo elemento del vector.
         * 
         * int [] temperatura = {23, 12, 45, 8};
         * System.out.println(temperatura[1]);
         */

        /*
         * Dado el vector int[] numeros = {10, 20, 30, 40, 50};,
         * intenta acceder e imprimir el elemento en la posiciÃƒÆ’Ã‚Â³n 5.
         * Explica quÃƒÆ’Ã‚Â© ocurre y por quÃƒÆ’Ã‚Â©.
         */
        /*
         * int[] numeros = {10, 20, 30, 40, 50};
         * System.out.println(numeros[5]);
         */

    }

    public static void ejercicio21() {
        /*
         * Ejercicio 3: ModificaciÃƒÆ’Ã‚Â³n de elementos
         * Declara un array de enteros llamado temperaturas con un tamaÃƒÆ’Ã‚Â±o de 3
         * elementos.
         * 
         * Inicializa el array con los valores 15, 20, 25.
         * 
         * Cambia el valor del segundo elemento a 30.
         * 
         * Imprime el array completo despuÃƒÆ’Ã‚Â©s de la modificaciÃƒÆ’Ã‚Â³n.
         */
        int[] temperaturas = { 15, 20, 25 };
        temperaturas[1] = 30;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }

    }

    public static void ejercicio22() {
        /*
         * Declara un array de enteros llamado precios con un tamaÃƒÆ’Ã‚Â±o de 4
         * elementos.
         * 
         * Inicializa el array con los valores 100, 200, 300, 400.
         * 
         * Cambia el valor del tercer elemento a 350.
         * Usa un bucle for para recorrer el array e imprimir cada uno de sus elementos
         * despuÃƒÆ’Ã‚Â©s de la modificaciÃƒÆ’Ã‚Â³n.
         * 
         * 
         */
        int[] precios = { 100, 200, 300, 400 };
        precios[2] = 350;
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

    }

    public static void ejercicio23() {
        /*
         * Crea un programa que declare e inicialice un array unidimensional
         * de 5 elementos con valores del 1 al 5. Luego, muestra todos los elementos del
         * array.
         */
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void ejercicio24() {
        /*
         * RELLENAR UN ARRAY CON RAMDOMS
         * 
         * Crea un programa que declare e inicialice un array unidimensional de 5
         * elementos con valores del 1 al 5. Luego, muestra todos los elementos del
         * array.
         */
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void ejercicio25() {
        /*
         * Escriba un programa que llene un array con nÃƒÆ’Ã‚Âºmeros del 1 al 10 y los
         * muestre
         * por
         * pantalla.
         */
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + ",");
        }

    }

    public static void ejercicio26() {
        /*
         * RELLENAR UN ARRAY CON RAMDOMS
         * 
         * Crea un programa en el que:
         * 
         * Se declare un array de tamaÃƒÆ’Ã‚Â±o 5.
         * 
         * Se llenen los 5 espacios con nÃƒÆ’Ã‚Âºmeros aleatorios entre 1 y 50.
         * 
         * Se muestren los nÃƒÆ’Ã‚Âºmeros del array en pantalla.
         */
        int[] array = new int[5];
        /*
         * AquÃƒÆ’Ã‚Â­ creo la instancia de la clase random,algo que harÃƒÆ’Ã‚Â© siempre
         * que use el mÃƒÆ’Ã‚Â©todo random,al igual que en Scanner uso la instancia
         * aquÃƒÆ’Ã‚Â­ tmb
         */
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
            /*
             * AquÃƒÆ’Ã‚Â­ arriba esto igualando la posiciÃƒÆ’Ã‚Â³n de array[i]
             * a una generaciÃƒÆ’Ã‚Â³n de nÃƒÆ’Ã‚Âºmeros aleatorios entre 1-50,asÃƒÆ’Ã‚Â­ es
             * como se escribirÃƒÆ’Ã‚Â­a
             */
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    // Nivel 2: recorridos, calculos y busquedas

    public static void ejercicio27() {
        /*
         * Ejercicio 4: Suma de elementos
         * Declara un array de enteros llamado valores con un tamaÃƒÆ’Ã‚Â±o de 5
         * elementos.
         * 
         * Inicializa el array con los valores 5, 10, 15, 20, 25.
         * 
         * Usa un bucle for para calcular la suma de todos los elementos del array.
         * 
         * Imprime el resultado de la suma.
         */
        int[] valores = { 5, 10, 15, 20, 25 };
        int suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        System.out.println(suma);
    }

    public static void ejercicio28() {
        /*
         * Ejercicio 4.1: Suma de elementos
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 2, 4, 6, 8, 10, 12.
         * 
         * Usa un bucle for para calcular la suma de todos los elementos del array.
         * 
         * Imprime el resultado de la suma.
         */
        int[] numeros = { 2, 4, 6, 8, 10, 12 };
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);

    }

    public static void ejercicio29() {
        /*
         * Ejercicio 5: BÃƒÆ’Ã‚Âºsqueda de un elemento
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50, 60.
         * 
         * Pide al usuario que ingrese un nÃƒÆ’Ã‚Âºmero (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el nÃƒÆ’Ã‚Âºmero ingresado por el usuario
         * estÃƒÆ’Ã‚Â¡ en el
         * array.
         * 
         * Si el nÃƒÆ’Ã‚Âºmero estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "El nÃƒÆ’Ã‚Âºmero X estÃƒÆ’Ã‚Â¡ en el array".
         * 
         * Si el nÃƒÆ’Ã‚Âºmero no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "El nÃƒÆ’Ã‚Âºmero X no estÃƒÆ’Ã‚Â¡ en el array".
         * 
         * Ejemplo de funcionamiento:
         * Si el usuario ingresa 30, el programa deberÃƒÆ’Ã‚Â­a imprimir:
         * El nÃƒÆ’Ã‚Âºmero 30 estÃƒÆ’Ã‚Â¡ en el array.
         * 
         * Si el usuario ingresa 35, el programa deberÃƒÆ’Ã‚Â­a imprimir:
         * El nÃƒÆ’Ã‚Âºmero 35 no estÃƒÆ’Ã‚Â¡ en el array.
         */

        Scanner teclado = new Scanner(System.in);
        boolean encontrado = false;
        int[] numeros = { 10, 20, 30, 40, 50, 60 };
        System.out.println("Ingresa un nÃƒÆ’Ã‚Âºmero");
        int num = teclado.nextInt();
        /**
         * aquÃƒÆ’Ã‚Â­ simplemento cambio a true el valor del booleano si estÃƒÆ’Ã‚Â¡ en
         * el array.SÃƒÆ’Ã‚Â³lo
         * eso
         */
        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                encontrado = true;
            }
        }
        /*
         * Para mejor impresiÃƒÆ’Ã‚Â³n.En este condicional antes lo puse dentro del for
         * pero
         * como este sÃƒÆ’Ã‚Â³lo sirve para
         * cambiar el valor del booleano cuando me salgo del for entonces hago el
         * condicional e imprimo
         */
        if (encontrado) {
            System.out.println("El numero " + num + " estÃƒÆ’Ã‚Â¡ en el array");
        } else {
            System.out.println("El numero " + num + " no estÃƒÆ’Ã‚Â¡ en el array");
        }

    }

    public static void ejercicio30() {
        /*
         * Ejercicio 5.1: BÃƒÆ’Ã‚Âºsqueda de un elemento
         * Declara un array de enteros llamado edades con un tamaÃƒÆ’Ã‚Â±o de 5
         * elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario estÃƒÆ’Ã‚Â¡
         * en el
         * array.
         * 
         * Si la edad estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "La edad X estÃƒÆ’Ã‚Â¡ en el array".
         * 
         * Si la edad no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "La edad X no estÃƒÆ’Ã‚Â¡ en el array".
         * 
         * 
         */
        Scanner teclado = new Scanner(System.in);
        int[] edades = { 18, 22, 25, 30, 35 };
        int edad;
        boolean encontrada = false;
        System.out.println("Ingresa una edad");
        edad = teclado.nextInt();
        for (int i = 0; i < edades.length; i++) {
            if (edad == edades[i]) {
                encontrada = true;
            }
        }
        if (encontrada) {
            System.out.println("La edad " + edad + " aparece en el array");
        } else {
            System.out.println("La edad " + edad + " no aparece en el array");
        }

    }

    public static void ejercicio31() {
        /**
         * Ejercicio 5.2: BÃƒÆ’Ã‚Âºsqueda de un elemento
         * Declara un array de enteros llamado precios con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 100, 200, 300, 400, 500, 600.
         * 
         * Pide al usuario que ingrese un precio (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el precio ingresado por el usuario
         * estÃƒÆ’Ã‚Â¡ en el
         * array.
         * 
         * Si el precio estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "El precio
         * X estÃƒÆ’Ã‚Â¡
         * en el array".
         * 
         * Si el precio no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "El
         * precio X
         * no estÃƒÆ’Ã‚Â¡ en el array".
         */
        int[] precios = { 100, 200, 300, 400, 500, 600 };
        int precio;
        boolean encontrado = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un precio");
        precio = teclado.nextInt();
        for (int i = 0; i < precios.length; i++) {
            if (precio == precios[i]) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El precio " + precio + " estÃƒÆ’Ã‚Â¡ en el array");
        } else {
            System.out.println("El precio " + precio + " no estÃƒÆ’Ã‚Â¡ en el array");
        }
    }

    public static void ejercicio32() {
        /**
         * Nivel 2.5: BÃƒÆ’Ã‚Âºsqueda de la posiciÃƒÆ’Ã‚Â³n de un elemento en un array
         * Ejercicio 6: BÃƒÆ’Ã‚Âºsqueda de la posiciÃƒÆ’Ã‚Â³n de un elemento
         * Declara un array de enteros llamado temperaturas con un tamaÃƒÆ’Ã‚Â±o de 5
         * elementos.
         * 
         * Inicializa el array con los valores 15, 20, 25, 30, 35.
         * 
         * Pide al usuario que ingrese una temperatura (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la temperatura ingresada por el usuario
         * estÃƒÆ’Ã‚Â¡
         * en el array.
         * 
         * Si la temperatura estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "La
         * temperatura X estÃƒÆ’Ã‚Â¡ en el array en la posiciÃƒÆ’Ã‚Â³n Y".
         * 
         * Si la temperatura no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "La
         * temperatura X no estÃƒÆ’Ã‚Â¡ en el array".
         */
        Scanner teclado = new Scanner(System.in);
        int[] temperaturas = { 15, 20, 25, 30, 35 };
        System.err.println("Ingresa una temperatura");
        int temp = teclado.nextInt();
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temp == temperaturas[i]) {
                encontrado = true;
                posicion = i;
            }
        }
        if (encontrado) {
            System.out.println("La temperatura " + temp + " estÃƒÆ’Ã‚Â¡ en el array en la posiciÃƒÆ’Ã‚Â³n " + posicion);
        } else {
            System.out.println("La temperatura " + temp + " no estÃƒÆ’Ã‚Â¡ en el array");
        }

    }

    public static void ejercicio33() {
        // BUSCAR ELEMENTOS EN UN ARRAY
        /**
         * Ejercicio 6.1: BÃƒÆ’Ã‚Âºsqueda de la posiciÃƒÆ’Ã‚Â³n de una edad
         * Declara un array de enteros llamado edades con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35, 40.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario estÃƒÆ’Ã‚Â¡
         * en el
         * array.
         * 
         * Si la edad estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "La edad X
         * estÃƒÆ’Ã‚Â¡ en
         * el array en la posiciÃƒÆ’Ã‚Â³n Y".
         * 
         * Si la edad no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "La edad
         * X no
         * estÃƒÆ’Ã‚Â¡ en el array".
         */
        boolean edadEncontrada = false;
        int edad;
        int edades[] = { 12, 22, 25, 30, 35, 40 };
        System.out.println("Introduce una edad");
        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();
        for (int i = 0; i < edades.length; i++) {
            if (edad == edades[i]) {
                edadEncontrada = true;
                System.out.println("La edad " + edad + " estÃƒÆ’Ã‚Â¡ en el array en la posiciÃƒÆ’Ã‚Â³n " + i);
            }
        }
        if (!edadEncontrada) {
            System.out.println("La edad " + edad + " no estÃƒÆ’Ã‚Â¡ en el array");
        }
    }

    public static void ejercicio34() {
        // BUSCAR ELEMENTOS EN UN ARRAY
        /**
         * Ejercicio 6.1: BÃƒÆ’Ã‚Âºsqueda de la posiciÃƒÆ’Ã‚Â³n de una edad
         * Declara un array de enteros llamado edades con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35, 40.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario estÃƒÆ’Ã‚Â¡
         * en el
         * array.
         * 
         * Si la edad estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "La edad X
         * estÃƒÆ’Ã‚Â¡ en
         * el array en la posiciÃƒÆ’Ã‚Â³n Y".
         * 
         * Si la edad no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo: "La edad
         * X no
         * estÃƒÆ’Ã‚Â¡ en el array".
         */
        boolean edadEncontrada = false;
        int edad;
        int edades[] = { 12, 22, 25, 30, 35, 40 };
        System.out.println("Introduce una edad");
        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();
        for (int i = 0; i < edades.length; i++) {
            if (edad == edades[i]) {
                edadEncontrada = true;
                System.out.println("La edad " + edad + " estÃƒÆ’Ã‚Â¡ en el array en la posiciÃƒÆ’Ã‚Â³n " + i);
            }
        }
        if (!edadEncontrada) {
            System.out.println("La edad " + edad + " no estÃƒÆ’Ã‚Â¡ en el array");
        }

    }

    public static void ejercicio35() {
        /*
         * 
         * Ejercicio: BÃƒÆ’Ã‚Âºsqueda de la posiciÃƒÆ’Ã‚Â³n de un nombre en un array
         * Declara un array de cadenas (String) llamado nombres con un tamaÃƒÆ’Ã‚Â±o de
         * 5
         * elementos.
         * 
         * Inicializa el array con los valores "Ana", "Carlos", "LucÃƒÆ’Ã‚Â­a", "Pedro",
         * "SofÃƒÆ’Ã‚Â­a".
         * 
         * Pide al usuario que ingrese un nombre (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el nombre ingresado por el usuario
         * estÃƒÆ’Ã‚Â¡ en el
         * array.
         * 
         * Si el nombre estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "El nombre X estÃƒÆ’Ã‚Â¡ en el array en la posiciÃƒÆ’Ã‚Â³n Y".
         * 
         * Si el nombre no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "El nombre X no estÃƒÆ’Ã‚Â¡ en el array".
         */
        String[] nombres = { "Ana", "Carlos", "LucÃƒÆ’Ã‚Â­a", "Pedro", "SofÃƒÆ’Ã‚Â­a" };
        Scanner teclado = new Scanner(System.in);
        String nombre;
        boolean coincide = false;
        System.out.println("Introduce un nombre");
        nombre = teclado.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equalsIgnoreCase(nombres[i])) {
                coincide = true;
                System.out.println("El nombre " + nombre + " estÃƒÆ’Ã‚Â¡ en el array");
            }
        }
        if (!coincide) {
            System.out.println("El nombre " + nombre + " no estÃƒÆ’Ã‚Â¡ en el array");
        }

    }

    public static void ejercicio36() {
        /*
         * BUSCAR ELEMENTOS EN UN ARRAY
         * 
         * Declara un array de cadenas llamado nombres con un tamaÃƒÆ’Ã‚Â±o de 5
         * elementos.
         * 
         * Inicializa el array con los valores: "Ana", "Carlos", "Elena", "Luis",
         * "MarÃƒÆ’Ã‚Â­a".
         * 
         * Pide al usuario que ingrese un nombre (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para verificar si el nombre ingresado por el usuario
         * estÃƒÆ’Ã‚Â¡ en
         * el array.
         * 
         * Si el nombre estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "El nombre X estÃƒÆ’Ã‚Â¡ en la lista en la posiciÃƒÆ’Ã‚Â³n Y".
         * 
         * Si el nombre no estÃƒÆ’Ã‚Â¡ en el array, imprime un mensaje diciendo:
         * "El nombre X no estÃƒÆ’Ã‚Â¡ en la lista".
         */

        String[] nombres = { "Ana", "Carlos", "Elena", "Luis" };
        String nombre;
        boolean encontrado = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un nombre");
        nombre = teclado.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) {
                encontrado = true;/*
                                   * Este booleano lo uso para poder imprimir en una sola linea la
                                   * soluciÃƒÆ’Ã‚Â³n.
                                   * En el if de abajo que estÃƒÆ’Ã‚Â¡ fuera del for si no tuviera el booleano se
                                   * imprimirÃƒÆ’Ã‚Â­a varias veces
                                   */
                System.out.println("El nombre " + nombre + " estÃƒÆ’Ã‚Â¡ en el array en la posiciÃƒÆ’Ã‚Â³n " + i);
            }
        }
        if (!encontrado) {/* AquÃƒÆ’Ã‚Â­ gracias al booleano no estÃƒÆ’Ã‚Â¡ obligado a imprimirse */
            System.out.println("El nombre " + nombre + " no estÃƒÆ’Ã‚Â¡ en el array");
        }
    }

    public static void ejercicio37() {
        /*
         * Ejercicio 7: Encontrar el valor mÃƒÆ’Ã‚Â¡ximo y mÃƒÆ’Ã‚Â­nimo en un array
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 7
         * elementos.
         * 
         * Inicializa el array con los valores 10, 5, 20, 15, 30, 25, 40.
         * 
         * Usa un bucle for para encontrar el valor mÃƒÆ’Ã‚Â¡ximo en el array.
         * 
         * Usa otro bucle for para encontrar el valor mÃƒÆ’Ã‚Â­nimo en el array.
         * 
         * Imprime el valor mÃƒÆ’Ã‚Â¡ximo y el valor mÃƒÆ’Ã‚Â­nimo.
         */
        int[] numeros = { 10, 5, 20, 15, 30, 25, 40 };
        /*
         * AquÃƒÆ’Ã‚Â­ no es buena prÃƒÆ’Ã‚Â¡ctica inicializar en esos valores.Es mucho
         * mÃƒÆ’Ã‚Â¡s seguro
         * iniciar con el primer elemento del array
         * y comparar todos con ese,asÃƒÆ’Ã‚Â­ servirÃƒÆ’Ã‚Â¡ para culquiera que sean
         * los valores del
         * array.Corrijo a continuaciÃƒÆ’Ã‚Â³n
         * 
         * int valormax=0;
         * int valormin=100;
         */
        /*
         * Si igualo los valores mÃƒÆ’Ã‚Â¡sximo y mÃƒÆ’Ã‚Â­nimo al valor de la primera
         * posiciÃƒÆ’Ã‚Â³n del
         * array
         * ya sÃƒÆ’Ã‚Â³lo tendrÃƒÆ’Ã‚Â© que comparar valores con respecto a ese
         * valor.Mejor forma de
         * plantearlo
         */
        int valormax = numeros[0];
        int valormin = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > valormax) {
                valormax = numeros[i];
            }
        }
        System.out.println("El valor mÃƒÆ’Ã‚Â¡ximo del array es " + valormax);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < valormin) {
                valormin = numeros[i];
            }
        }
        System.out.println("El valor mÃƒÆ’Ã‚Â­nimo del array es " + valormin);
    }

    public static void ejercicio38() {
        /*
         * DescripciÃƒÆ’Ã‚Â³n:
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 10
         * elementos.
         * InicialÃƒÆ’Ã‚Â­zalo con los valores {12, 5, 8, 21, 30, 17, 40, 3, 14, 27}.
         * Usa un bucle for para recorrer el array y contar cuÃƒÆ’Ã‚Â¡ntos
         * nÃƒÆ’Ã‚Âºmeros son pares y
         * cuÃƒÆ’Ã‚Â¡ntos son impares.
         * Imprime el resultado.
         */
        int[] numeros = { 12, 5, 8, 21, 30, 17, 40, 3, 14, 27 };
        int contpar = 0;
        int continpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contpar += 1;
            }
            if (numeros[i] % 2 != 0) {
                continpar += 1;
            }
        }
        System.out.println("El nÃƒÆ’Ã‚Âºmero total de nÃƒÆ’Ã‚Âºmeros pares en el array es " + contpar);
        System.out.println("El nÃƒÆ’Ã‚Âºmero total de nÃƒÆ’Ã‚Âºmeros impares en el array es " + continpar);
    }

    public static void ejercicio39() {
        /*
         * Crea un programa en Java que solicite al usuario el tamaÃƒÆ’Ã‚Â±o de un array
         * unidimensional
         * y luego le permita rellenarlo con valores de tipo String (cadenas de texto)
         * introducidos por teclado.
         * 
         * Requisitos:
         * 
         * Pedir al usuario el tamaÃƒÆ’Ã‚Â±o del array.
         * 
         * Crear un array de String con ese tamaÃƒÆ’Ã‚Â±o.
         * 
         * Rellenar el array con nombres de fruta ingresadas por el usuario.
         * 
         * Mostrar por pantalla el contenido final del array.
         */
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Introduce la longitud del array");
        longitud = teclado.nextInt();
        /*
         * aquÃƒÆ’Ã‚Â­ tengo que poner un salto de lÃƒÆ’Ã‚Â­nea asÃƒÆ’Ã‚Â­,no sÃƒÆ’Ã‚Â©
         * muy bien porque pero
         * se imprimirÃƒÆ’Ã‚Â­a mal si no lo hago
         */
        teclado.nextLine();
        /*
         * Le doy al valor del array la variable longitud y listo,asÃƒÆ’Ã‚Â­ es como
         * pido por
         * teclado
         * la longitud
         */
        String[] frutas = new String[longitud];
        for (int i = 0; i < frutas.length; i++) {
            /*
             * Una vez que haya instanciado el Scanner no tengo que hacerlo una segunda vez
             */
            System.out.println("Escribe el nombre de una fruta");
            frutas[i] = teclado.nextLine();
        }
        System.out.println("El array de frutas es:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i] + ",");
        }
    }

    public static void ejercicio40() {
        /*
         * Crea un programa en Java que solicite al usuario el tamaÃƒÆ’Ã‚Â±o de un array
         * unidimensional
         * y luego le permita rellenarlo con nombres de animales introducidos por
         * teclado.
         * 
         * Requisitos:
         * 
         * Pedir al usuario el tamaÃƒÆ’Ã‚Â±o del array.
         * 
         * Crear un array de String con ese tamaÃƒÆ’Ã‚Â±o.
         * 
         * Rellenar el array con nombres de animales ingresados por el usuario.
         * 
         * Mostrar por pantalla el contenido final del array.
         */
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("CuÃƒÆ’Ã‚Â¡nto ocuparÃƒÆ’Ã‚Â¡ el array?");
        longitud = teclado.nextInt();
        /*
         * acordarse de esto!Si no0 lo pongo imprime mal
         */
        teclado.nextLine();
        String[] animales = new String[longitud];
        for (int i = 0; i < animales.length; i++) {
            System.out.println("Escribe el nombre de un animal");
            animales[i] = teclado.nextLine();
        }
        System.out.println("El array de animales es:");
        for (int i = 0; i < animales.length; i++) {
            System.out.print(animales[i] + ",");
        }
    }

    // Nivel 3: ordenacion y arrays dinamicos

    public static void ejercicio41() {
        /*
         * Nivel 4: OrdenaciÃƒÆ’Ã‚Â³n de un array
         * Ejercicio 8: Ordenar un array de menor a mayor
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 30, 10, 50, 20, 40, 60.
         * Ordena el array de menor a mayor.
         * 
         * Imprime el array ordenado.
         */
        int[] enteros = { 30, 10, 50, 20, 40, 60, };
        int apoyo;
        for (int i = 0; i < enteros.length; i++) {

            for (int j = 0; j < enteros.length - 1; j++) {
                if (enteros[j] > enteros[j + 1]) {
                    apoyo = enteros[j];
                    enteros[j] = enteros[j + 1];
                    enteros[j + 1] = apoyo;
                }

            }
        }
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + ", ");

        }

    }

    public static void ejercicio42() {
        /*
         * Nivel 4: OrdenaciÃƒÆ’Ã‚Â³n de un array
         * Ejercicio 8: Ordenar un array de menor a mayor
         * Declara un array de enteros llamado numeros con un tamaÃƒÆ’Ã‚Â±o de 6
         * elementos.
         * 
         * Inicializa el array con los valores 30, 10, 50, 20, 40, 60.
         * 
         * Usa el algoritmo de ordenaciÃƒÆ’Ã‚Â³n por selecciÃƒÆ’Ã‚Â³n para ordenar el
         * array de menor a
         * mayor.
         * 
         * Imprime el array ordenado.
         */
        int[] numeros = { 30, 10, 50, 20, 40, 60 };
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }
    }

    public static void ejercicio43() {
        /**
         * BURBUJA
         * Ejercicio 1: Ordenar un array de enteros
         * DescripciÃƒÆ’Ã‚Â³n:
         * Escribe un programa en Java que implemente el mÃƒÆ’Ã‚Â©todo de burbuja para
         * ordenar
         * un array de enteros en orden ascendente. El array inicial serÃƒÆ’Ã‚Â¡: {5, 3,
         * 8, 4,
         * 6}.
         */
        int[] enteros = { 5, 3, 8, 4, 6 };
        int aux;
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros.length - 1; j++) {
                if (enteros[j] > enteros[j + 1]) {
                    aux = enteros[j];
                    enteros[j] = enteros[j + 1];
                    enteros[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(+enteros[i] + ",");
        }
    }

    public static void ejercicio44() {
        /*
         * BURBUJA CON STRING
         * Ejercicio 2: Ordenar un array de cadenas (strings)
         * DescripciÃƒÆ’Ã‚Â³n:
         * Ahora, escribe un programa en Java que implemente el mÃƒÆ’Ã‚Â©todo de burbuja
         * para
         * ordenar un array de cadenas (strings) en orden alfabÃƒÆ’Ã‚Â©tico.
         * El array inicial serÃƒÆ’Ã‚Â¡: {"manzana", "banana", "uva", "pera", "kiwi"}.
         */
        String[] frutas = { "manzana", "banana", "uva", "pera", "kiwi" };
        String aux;
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas.length - 1; j++) {
                if (frutas[j].compareTo(frutas[j + 1]) < 0) {
                    aux = frutas[j];
                    frutas[j] = frutas[j + 1];
                    frutas[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i] + ",");
        }
    }

    public static void ejercicio45() {
        /*
         * Ejercicio: Ordenar un array de nÃƒÆ’Ã‚Âºmeros en orden descendente
         * Escribe un programa en Java que use el mÃƒÆ’Ã‚Â©todo de burbuja para ordenar
         * un
         * array de enteros en orden descendente (de mayor a menor).
         */
        int[] numeros = { 12, 5, 8, 19, 3, 7 };
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ";");
        }

    }

    public static void ejercicio46() {
        /*
         * Crea un programa en Java que realice lo siguiente:
         * 
         * Solicitar al usuario el tamaÃƒÆ’Ã‚Â±o de un array unidimensional de
         * nÃƒÆ’Ã‚Âºmeros enteros.
         * 
         * Rellenar el array con valores introducidos por teclado.
         * 
         * Ordenar el array de mayor a menor utilizando el mÃƒÆ’Ã‚Â©todo de la burbuja
         * (Bubble
         * Sort).
         * 
         * Mostrar el array antes y despuÃƒÆ’Ã‚Â©s de ordenarlo.
         */
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Introduce la longitud del array");
        longitud = teclado.nextInt();
        teclado.nextLine();
        int[] numeros = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un valor entero para la posiciÃƒÆ’Ã‚Â³n " + i);
            numeros[i] = teclado.nextInt();
        }
        // coloreo de rojo la imprsiÃƒÆ’Ã‚Â³n
        System.out.println("\033[31mEl array es:\033]0m");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }
        int aux;
        /*
         * importante -1
         */
        for (int i = 0; i < numeros.length - 1; i++) {
            /*
             * importante -1 -i
             */
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                /*
                 * > orden ascendente
                 * < orden descendente
                 */
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("El array ordenado es:");
        /*
         * como es un array unidimensional con un solo for me vale
         */
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }

    }

    public static void ejercicio47() {
        /*
         * Crea un programa en Java que realice lo siguiente:
         * 
         * Solicitar al usuario el tamaÃƒÆ’Ã‚Â±o de un array unidimensional de
         * nÃƒÆ’Ã‚Âºmeros enteros.
         * 
         * Rellenar el array con valores aleatorios entre 1 y 100 (usa Math.random()).
         * 
         * Mostrar el array generado.
         * 
         * Ordenar el array de menor a mayor utilizando el mÃƒÆ’Ã‚Â©todo de
         * selecciÃƒÆ’Ã‚Â³n
         * (Selection Sort).
         * 
         * Mostrar el array ordenado.
         */
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int tamano;
        System.out.println("Introduce el tamaÃƒÆ’Ã‚Â±o del array");
        tamano = teclado.nextInt();
        teclado.nextLine();
        int[] numeros = new int[tamano];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        System.out.println("El array es:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }
        System.out.println();
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("El array ordenado es:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }

    }

    // Nivel 4: matrices

    public static void ejercicio48() {
        /*
         * NO SOY CAPAZ DE HACERLO DEL TODO BIEN,HAY ALGO QUE NIO ENTIENDO DEL SEGUNDO
         * FOR
         * Crea un programa en Java que genere una matriz
         * de 2x2 con nÃƒÆ’Ã‚Âºmeros aleatorios entre 1 y 50 y la muestre en pantalla.
         */
        int[][] matriz = new int[2][2];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);
        }
    }

    public static void ejercicio49() {
        /*
         * Crea un programa que declare una matriz de 3x3 (3 filas y 3 columnas)
         * y la llene con nÃƒÆ’Ã‚Âºmeros aleatorios entre 1 y 10.
         * Luego, muestra toda la matriz en formato de filas y columnas.
         */
        int[][] matriz = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ejercicio50() {
        /*
         * RELLENAR UNA MATRIZ DE 2D CON RAMDOMS
         * 
         * Crea un programa en Java que genere una matriz de 2x2 con nÃƒÆ’Ã‚Âºmeros
         * aleatorios
         * entre 1 y 50 y la muestre en pantalla.
         */
        Random random = new Random();
        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(50) + 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ",");
            }
        }
    }

    public static void ejercicio51() {
        /*
         * RELLENAR UNA MATRIZ DE 2D CON RANDOMS
         * Crea un programa que declare una matriz de 3x3 (3 filas y 3 columnas) y la
         * llene con nÃƒÆ’Ã‚Âºmeros aleatorios entre 1 y 10. Luego, muestra toda la
         * matriz en
         * formato de filas y columnas.
         */
        int[][] matriz = new int[3][3];
        // importante acordarse de cÃƒÆ’Ã‚Â³mo instanciar el mÃƒÆ’Ã‚Â©todo Random
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            /*
             * importante aquÃƒÆ’Ã‚Â­ abajo que imprimamos el salto de lÃƒÆ’Ã‚Â­nea fuera
             * del for interno
             * pero dentro
             * del for externo
             */
            System.out.println();
        }
    }

    public static void ejercicio52() {
        /*
         * Modifica el programa anterior para que, despuÃƒÆ’Ã‚Â©s de mostrar la matriz,
         * pida al
         * usuario un nÃƒÆ’Ã‚Âºmero de fila (entre 1 y 3) y muestre solo los elementos
         * de esa
         * fila.
         */
        int[][] matriz = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            /*
             * importante aquÃƒÆ’Ã‚Â­ abajo que imprimamos el salto de lÃƒÆ’Ã‚Â­nea fuera
             * del for interno
             * pero dentro
             * del for externo
             */
            System.out.println();
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nÃƒÆ’Ã‚Âºmero de fila");
        int valor = teclado.nextInt();
        /*
         * aquÃƒÆ’Ã‚Â­ sÃƒÆ’Ã‚Â³lo usamos un for porque el usuario elige una fila
         * asÃƒÆ’Ã‚Â­ que nos ahorra
         * buscar entre las filas
         */
        for (int j = 0; j < matriz[valor - 1].length; j++) {
            System.out.print(matriz[valor - 1][j] + ",");
        }
    }

    public static void ejercicio53() {
        /*
         * Tienes una matriz de 3 filas y 4 columnas en Java:
         * 
         * java
         * Copiar
         * Editar
         * int[][] numeros = new int[3][4];
         * ÃƒÂ°Ã…Â¸Ã¢â‚¬Å“Ã…â€™ Tu tarea:
         * 
         * Rellena la matriz con nÃƒÆ’Ã‚Âºmeros aleatorios entre 10 y 99.
         * 
         * ImprÃƒÆ’Ã‚Â­mela en formato de matriz.
         */
        int[][] numeros = new int[3][4];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                /*
                 * AquÃƒÆ’Ã‚Â­ abajo dentro del parÃƒÆ’Ã‚Â©ntesis ponemos 90 porque asÃƒÆ’Ã‚Â­
                 * imprimimos nÃƒÆ’Ã‚Âºmeros del
                 * 0-90
                 * pero como queremos del 10-99 despuÃƒÆ’Ã‚Â©s ponemos el +10
                 */
                numeros[i][j] = random.nextInt(90) + 10;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println();
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
        }
    }

    public static void ejercicio54() {
        /*
         * Genere una matriz de 4 filas x 5 columnas con nÃƒÆ’Ã‚Âºmeros aleatorios entre
         * 100 y
         * 999.
         * 
         * Imprima la matriz en formato correcto, con cada nÃƒÆ’Ã‚Âºmero separado por un
         * espacio.
         */
        int[][] numeros = new int[4][5];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(900) + 100;
            }
        }
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio55() {
        /*
         *
         * 
         * Genera una matriz de 5x5 con nÃƒÆ’Ã‚Âºmeros aleatorios entre 1 y 99.
         * 
         * ImprÃƒÆ’Ã‚Â­mela en formato de matriz.
         * 
         * Suma todos los valores de la matriz y muestra el resultado al final.
         * 
         * 
         */
        int[][] numeros = new int[5][5];
        /*
         * Declaro la variable suma porque me piden la suma de todos
         * los valores
         */
        int suma = 0;
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                /*
                 * AquÃƒÆ’Ã‚Â­ en el parÃƒÆ’Ã‚Â©ntesis indico el rango del que sacarÃƒÆ’Ã‚Â© el
                 * Random,
                 * siempre empieza desde 0 por eso le sumo 1 para que nunca sea 0
                 * el valor
                 */
                numeros[i][j] = random.nextInt(99) + 1;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La suma de todos los resultados de la matriz es:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma = numeros[i][j] + suma;
            }
        }
        System.out.println(suma);
    }

    public static void ejercicio56() {
        /*
         * Genere una matriz de 4x6 con nÃƒÆ’Ã‚Âºmeros aleatorios entre 1 y 50.
         * 
         * Pida al usuario un nÃƒÆ’Ã‚Âºmero de fila (entre 1 y 4) y muestre los datos de
         * esa
         * fila.
         * 
         * Valide que el nÃƒÆ’Ã‚Âºmero de fila estÃƒÆ’Ã‚Â© en el rango correcto (si el
         * usuario ingresa
         * un nÃƒÆ’Ã‚Âºmero fuera de rango, debe pedirlo nuevamente).
         */
        int[][] numeros = new int[4][6];
        int fila;
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            /*
             * Usar array[i].length en el for interno es CLAVE para matrices no cuadradas.
             * Si usaras solo array.length, fallarÃƒÆ’Ã‚Â­a en matrices como [4][6].
             */
            for (int j = 0; j < numeros[i].length; j++) {

                numeros[i][j] = random.nextInt(50) + 1;
            }
        }
        /*
         * Hago un do while para que el usuario estÃƒÆ’Ã‚Â© obligado a meter una fila
         * que estÃƒÆ’Ã‚Â©
         * entre 1 y 4
         */
        do {
            System.out.println("Introduce el nÃƒÆ’Ã‚Âºmero de fila");
            fila = teclado.nextInt();
        } while (fila < 1 || fila > 4);
        /*
         * En este for recorro sÃƒÆ’Ã‚Â³lo las coulmnas de la fila que voy a mostrar por
         * eso es
         * de "j" y hasta
         * numeros[fila - 1] ya que usa las columnas de la fila que haya introducido el
         * usuario.
         * Es importante matizar el [fila - 1].length porque el array empieza en 0 y si
         * elijo la 4
         * fila voy a tener un error porque sÃƒÆ’Ã‚Â³lo llega hasta 3 (0,1,2 y 3)
         */
        for (int j = 0; j < numeros[fila - 1].length; j++) {
            System.out.print(numeros[fila - 1][j] + " ");
        }

    }

    public static void ejercicio57() {
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

    // Nivel 5: eliminacion y ejercicios pendientes

    public static void ejercicio58() {
        /*
         * NO SOY CAPAZ DE HACERLO DEL TODO BIEN
         * Escriba un programa que almacene en un array 15 nÃƒÆ’Ã‚Âºmeros aleatorios
         * double
         * comprendidos entre 1.00 y 50.00. Mostrar el contenido del array separando los
         * nÃƒÆ’Ã‚Âºmeros por guiÃƒÆ’Ã‚Â³n.
         * 
         */

    }

    public static void ejercicio59() {
        /*
         * Supongamos que tienes una lista de nombres de estudiantes en un curso y
         * necesitas eliminar un estudiante por su nombre. La lista estÃƒÆ’Ã‚Â¡
         * implementada
         * como un array de tamaÃƒÆ’Ã‚Â±o fijo.
         * 
         * Implementa un mÃƒÆ’Ã‚Â©todo en Java llamado eliminarEstudiante(String
         * nombre), que
         * recorra el array estudiantes, encuentre el estudiante con el nombre dado y lo
         * elimine desplazando los elementos hacia la izquierda. Si el nombre no existe,
         * imprime un mensaje indicando que el estudiante no fue encontrado.
         */

    }

    public static void ejercicio60() {
        /*
         * Define un vector de 10 posiciones e introduce las 5 primeras posiciones con
         * numeros enteros.
         * 
         * Borra cualquier posiciÃƒÆ’Ã‚Â³n y lo muestras.
         * 
         * Borra el elemento que tenga como valor 8
         */

        int[] enteros = new int[10];
        int valor = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un valor para la posiciÃƒÆ’Ã‚Â³n " + i);
            valor = teclado.nextInt();
            enteros[i] = valor;
        }

        /*
         * AsÃƒÆ’Ã‚Â­ es como se imprime un array,primero importo la clase
         * java.util.Arrays
         * y despuÃƒÆ’Ã‚Â©s imprimo con ese formato
         */
        System.out.println("Has generado el siguiente array:");
        System.out.println(Arrays.toString(enteros));
        int posicion;
        System.out.println("Introduce posicion a borrar:");
        posicion = teclado.nextInt();
        for (int i = posicion; i < enteros.length - 1; i++) {
            enteros[i] = enteros[i + 1];
        }
        /*
         * Pongo la ÃƒÆ’Ã‚Âºltima posiciÃƒÆ’Ã‚Â³n en 0
         */
        enteros[enteros.length - 1] = 0;
        System.out.println("El array despuÃƒÆ’Ã‚Â©s de eliminar la posiciÃƒÆ’Ã‚Â³n " + posicion + " es:");
        System.out.println(Arrays.toString(enteros));

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == 8) {
                for (int j = 0; j < enteros.length - 1; j++) {
                    enteros[i] = enteros[i + 1];
                }
            }
        }
        enteros[enteros.length - 1] = 0;
        System.out.println("El array despuÃƒÆ’Ã‚Â©s de eliminar el valor 8 es:");
        System.out.println(Arrays.toString(enteros));
    }

    public static void ejercicio61() {
        /*
         * Define un vector de 10 posiciones e introduce las primeras 6 posiciones con
         * nÃƒÆ’Ã‚Âºmeros enteros.
         * 
         * Muestra el vector por pantalla.
         * 
         * Elimina la posiciÃƒÆ’Ã‚Â³n 3 del vector (desplazando los elementos hacia la
         * izquierda).
         * 
         * Muestra el vector actualizado.
         * 
         * Busca un nÃƒÆ’Ã‚Âºmero especÃƒÆ’Ã‚Â­fico introducido por el usuario y
         * sustitÃƒÆ’Ã‚Âºyelo por un 0.
         * 
         * Muestra el vector final tras la sustituciÃƒÆ’Ã‚Â³n.
         */
        int[] enteros = new int[10];
        int posicion = 6;

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < posicion; i++) {
            System.out.println("Introduce un valor para la posicion " + i);
            /*
             * cualquier variable que ponga precedida del
             * teclado.nextInt serÃƒÆ’Ã‚Â¡ a la que se le asigne el valor
             */
            enteros[i] = teclado.nextInt();

        }
        System.out.println("El array generado es: " + Arrays.toString(enteros));
        /*
         * Esta es la forma clÃƒÆ’Ã‚Â¡sica de imprimirlo:
         * System.out.println("El array generado es: ");
         * for (int i = 0; i < enteros.length; i++) {
         * System.out.print(enteros[i] + ",");
         * }
         */
        // ELIMINO LA POSICION 3 DEL VECTOR
        for (int i = 3; i < posicion; i++) {
            enteros[i] = enteros[i + 1];
        }
        enteros[enteros.length - 1] = 0;
        System.out.println("El array eliminando la posiciÃƒÆ’Ã‚Â³n 3 serÃƒÆ’Ã‚Â­a " + Arrays.toString(enteros));
    }

    public static void ejercicio62() {
        // DISTINTAS OPERACIONES EN UN ARRAY:

        Scanner teclado = new Scanner(System.in);

        // DECLARAMOS EL VECTOR PARA VERLO BIEN

        int[] vector = new int[10];
        vector[0] = 2;
        vector[1] = 5;
        vector[2] = 9;
        vector[3] = 8;
        vector[4] = 6;
        vector[5] = 9;
        vector[6] = 8;
        vector[7] = 2;
        vector[8] = 1;
        vector[9] = 4;

        // BORRAR ELEMENTO SI SABEMOS LA POSICIÃƒÆ’Ã¢â‚¬Å“N:

        for (int i = 2; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }

        vector[vector.length - 1] = 0;
        System.out.println(Arrays.toString(vector));

        // BORRAR POSICIÃƒÆ’Ã¢â‚¬Å“N SI LA PASA EL USUARIO:

        System.out.println("Escribe la posicion que quieres borrar");
        int posicion = teclado.nextInt();
        for (int i = posicion; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }

        vector[vector.length - 1] = 0;
        System.out.println(Arrays.toString(vector));

        // BORRAR UN VALOR CONCRETO (EN ESTE CASO EL 8):

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 8) {
                for (int j = i; j < vector.length - 1; j++) {
                    vector[j] = vector[j + 1];
                }
                vector[vector.length - 1] = 0;
            }
        }

        System.out.println(Arrays.toString(vector));
        teclado.close();

        /*
         * AQUÃƒÆ’ ES LO MISMO PERO DE ALGO DISTINTO Y MENOS EFICIENTE
         * 
         * 
         * Scanner scan = new Scanner(System.in);
         * 
         * int listaNum[] = new int[10];
         * 
         * int posicion = 5;
         * 
         * // Introduce valores en el vector.
         * for (int i = 0; i < posicion; i++) {
         * System.out.println("Introduce un valor para la posicion " + i + " :");
         * listaNum[i] = scan.nextInt();
         * 
         * }
         * // Imprimir el vector
         * for (int i = 0; i < posicion; i++) {
         * System.out.println("El vector es: " + listaNum[i]);
         * }
         * System.out.println();
         * 
         * // Eliminar con la posicion del vector.
         * /*
         * System.out.println("Que posicion quieres quitar");
         * int posEliminada = scan.nextInt();
         * for (int i = posEliminada; i < posicion - 1; i++) {
         * listaNum[i] = listaNum[i + 1];
         * 
         * }
         * listaNum[posicion - 1] = 0;
         * posicion--;
         * // Muestra el vector
         * for (int i = 0; i < posicion; i++) {
         * System.out.println("El vector que queda es:" + listaNum[i]);
         * }
         */

        // Eliminar segun un valor

        /*
         * System.out.println("Introduce el valor que quieres eliminar:");
         * int valor = scan.nextInt();
         * for (int i = 0; i < posicion; i++) {
         * if (listaNum[i] == valor) {
         * for (int j = i; j < posicion - 1; j++) {
         * listaNum[j] = listaNum[j + 1];
         * 
         * }
         * listaNum[posicion - 1] = 0;
         * posicion--;
         * }
         * 
         * }
         * 
         * // Muestra el vector
         * for (int i = 0; i < posicion; i++) {
         * System.out.println("El vector que queda es:" + listaNum[i]);
         * }
         * 
         * 
         */
    }

    public static void ejercicio63() {
        /*
         * Escribe un programa en Java que realice las siguientes operaciones sobre un
         * array de enteros:
         * 
         * InicializaciÃƒÆ’Ã‚Â³n:
         * 
         * Crea un array de tamaÃƒÆ’Ã‚Â±o 10 e inicialÃƒÆ’Ã‚Â­zalo con los siguientes
         * valores:
         * [3, 7, 2, 5, 1, 7, 4, 9, 6, 2].
         * 
         * Eliminar elemento por posiciÃƒÆ’Ã‚Â³n:
         * 
         * Pide al usuario que ingrese una posiciÃƒÆ’Ã‚Â³n (ÃƒÆ’Ã‚Â­ndice) y elimina el
         * elemento en
         * esa posiciÃƒÆ’Ã‚Â³n, desplazando los elementos restantes hacia la izquierda y
         * rellenando con 0 al final.
         * 
         * Muestra el array resultante.
         * 
         * Eliminar todos los elementos con un valor especÃƒÆ’Ã‚Â­fico:
         * 
         * Elimina todos los nÃƒÆ’Ã‚Âºmeros 7 del array, desplazando los elementos
         * restantes y
         * rellenando con 0 al final.
         * 
         * Muestra el array modificado.
         * 
         * Mostrar resultados:
         * 
         * DespuÃƒÆ’Ã‚Â©s de cada operaciÃƒÆ’Ã‚Â³n, imprime el array actualizado usando
         * Arrays.toString().
         * 
         * Requisitos:
         * 
         * Usa un Scanner para la entrada del usuario.
         * 
         * Maneja correctamente los desplazamientos en el array.
         * 
         * Cierra el Scanner al final.
         * 
         * 
         */

        Scanner teclado = new Scanner(System.in);
        int[] numeros = { 3, 7, 2, 5, 1, 7, 4, 9, 6, 2 };
        System.out.println("El array es: " + Arrays.toString(numeros));
        System.out.println();

        int index;
        System.out.println("Introduce una posiciÃƒÆ’Ã‚Â³n a eliminar:");
        index = teclado.nextInt();
        /*
         * si no ponemos el -1 nos saltarÃƒÆ’Ã‚Â­a error porque dentro del bucle
         * vemos que le damos a posiciÃƒÆ’Ã‚Â³n de i el valor de posiciÃƒÆ’Ã‚Â³n de i +
         * 1
         * por lo que si estamos en la ÃƒÆ’Ã‚Âºltima posiciÃƒÆ’Ã‚Â³n no hay una
         * posiciÃƒÆ’Ã‚Â³n i + 1
         */
        for (int i = index; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        /*
         * AquÃƒÆ’Ã‚Â­,como arriba hemos corrido una posiciÃƒÆ’Ã‚Â³n a la izquierda en
         * todas las
         * posiciones
         * la ÃƒÆ’Ã‚Âºltima quedarÃƒÆ’Ã‚Â­a sin valor,por lo que le ponemos en 0
         */
        System.out.println();
        numeros[numeros.length - 1] = 0;
        System.out.println("El array sin la posiciÃƒÆ’Ã‚Â³n " + index + " es:" + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 7) {
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
            }
            numeros[numeros.length - 1] = 0;
        }
        System.out.println();
        // AquÃƒÆ’Ã‚Â­ aplico color con la estructura \033[31m------texto-----\033[0m
        System.out.println(
                "\033[31mEl array tras eliminar los valores 7 quedarÃƒÆ’Ã‚Â­a: \033[0m" + Arrays.toString(numeros));
    }

    public static void ejercicio64() {

    }

    public static void ejercicio65() {

    }

    public static void ejercicio66() {

    }

    public static void ejercicio67() {

    }

    public static void ejercicio68() {
        /*
         * Pide ocho numeros, guardalos en un vector y muestra la suma y la media.
         */
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[8];
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un numero:");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }

        double media = (double) suma / vector.length;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }

    public static void ejercicio69() {
        /*
         * Anade un numero al final de un vector creando una copia con una posicion mas.
         */
        Scanner sc = new Scanner(System.in);
        int[] vector = { 9, 2, 12, 8, 46, 7, 8 };

        System.out.println("Introduce el numero que quieres anadir:");
        int numeroNuevo = sc.nextInt();
        int[] copia = Arrays.copyOf(vector, vector.length + 1);
        copia[copia.length - 1] = numeroNuevo;

        System.out.println(Arrays.toString(copia));
    }

    public static void ejercicio70() {
        /*
         * Crea una matriz 4x5 con aleatorios entre 1 y 50, muestrala y enseña
         * la columna indicada por el usuario.
         */
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[4][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Introduce una columna del 1 al 5:");
        int columna = sc.nextInt() - 1;
        if (columna < 0 || columna >= matriz[0].length) {
            System.out.println("Columna no valida.");
            return;
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][columna]);
        }
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
        // ejercicio64();
        // ejercicio65();
        // ejercicio66();
        // ejercicio67();
        // ejercicio68();
        // ejercicio69();
        // ejercicio70();
    }
}
