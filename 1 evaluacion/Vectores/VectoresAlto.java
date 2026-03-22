import java.util.Arrays;
import java.util.Scanner;

// Ejercicios redistribuidos desde Vectores.java

class VectoresAlto {

public static void ejercicio12() {
        /*
         * Realiza un programa que dado un array bidimensional lo
         * rellene de números enteros aleatorios del 2 al 12 (ambos
         * inclusive)
         */

    }

public static void ejercicio13() {
        /*
         * Realiza un programa que inserte en un array bidimensional
         * de 3x3 de números enteros, compuesto solamente por 0, tres
         * valores 1 en una posición aleatoria, no pueden solaparse, es
         * decir, ocupar la misma casilla alguno de los tres valores,
         * después muestra por pantalla el contenido del array.
         * 
         */

    }

public static void ejercicio14() {
        /*
         * Realiza un programa que pida al usuario el tamaño en las
         * dos dimensiones (X e Y) de un array bidimensional, construya
         * un array bidimensional (con esas dimensiones) con todas las
         * posiciones con el valor 0 y lo muestre por pantalla.
         * Posteriormente se va introducir en el array el valor 1 en todas
         * las posiciones exceptuando las que estén en los bordes
         * exteriores del array, ejemplo:(en la imagen del pdf del ejercicio)
         */

    }

public static void ejercicio15() {
        /*
         * Realiza un programa que inserte en un array bidimensional
         * de 5x5 de números enteros, compuesto solamente por 0, tres
         * valores 1 de manera aleatoria, no pueden solaparse, es decir,
         * ocupar la misma casilla alguno de los tres valores, ni pueden
         * estar en casillas contiguas vertical u horizontalmente
         * (diagonalmente sí) después muestra por pantalla el contenido
         * del array.
         * 
         */

    }

public static void ejercicio16() {
        /*
         * Realiza un programa en donde dado un array bidimensional
         * de tamaño 5x5 (con las posiciones con el valor 0) el usuario
         * puede introducir los números que él desee uno a uno, hasta
         * que introduzca la letra n. Cada vez que el usuario introduzca
         * un número se le mostrará el contenido del array. Ejemplo:
         * (en la imagen del pdf del ej)
         */

    }

public static void ejercicio17() {
        /*
         * Realiza un tablero de ajedrez con cuadros negros: \u25A1,
         * cuadro blancos: \u25A0 y una dama ۩ presenta la dama en
         * una posición cualquiera (al azar) del tablero (array
         * bidimensional) y vas a pedir la nueva coordenada de la dama
         * en el tablero, existen dos posibilidades: que no sea válida (se
         * informará al usuario que no es válida y que no se puede
         * realizar el movimiento) o que sea válida (en este caso se
         * mostrará la nueva disposición de la dama en el tablero), según
         * las reglas del ajedrez. En ambos casos se le pedirá al usuario
         * si desea seguir jugando (s->Sí y n->No) y en caso armativo se
         * le volverá a pedir las nuevas coordenadas y el proceso volverá
         * a empezar.
         */

    }

}

// ===== Practica extensa integrada =====


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class VectoresPracticaAlto {
    public static void ejercicio1() {

        /*
         * Ejercicio 1: Declaración e inicialización de arrays
         * Declara un array de enteros llamado numeros con un tamaño de 5 elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50.
         * 
         * Imprime el valor del tercer elemento del array.
         */

        int[] numeros = { 10, 20, 30, 40, 50 };
        System.out.println(numeros[2]);

    }

    public static void ejercicio2() {
        /*
         * Ejercicio 1.1: Declaración e inicialización de arrays
         * Declara un array de enteros llamado notas con un tamaño de 4 elementos.
         * 
         * Inicializa el array con los valores 8, 6, 9, 7.
         * 
         * Imprime el valor del cuarto elemento del array.
         */
        int[] notas = { 8, 6, 9, 7, };
        System.out.println(notas[3]);

    }

    public static void ejercicio3() {
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
        temperaturas[1] = 30;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }

    }

    public static void ejercicio4() {
        /*
         * Declara un array de enteros llamado precios con un tamaño de 4 elementos.
         * 
         * Inicializa el array con los valores 100, 200, 300, 400.
         * 
         * Cambia el valor del tercer elemento a 350.
         * Usa un bucle for para recorrer el array e imprimir cada uno de sus elementos
         * después de la modificación.
         * 
         * 
         */
        int[] precios = { 100, 200, 300, 400 };
        precios[2] = 350;
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

    }

    public static void ejercicio5() {
        /*
         * Ejercicio 4: Suma de elementos
         * Declara un array de enteros llamado valores con un tamaño de 5 elementos.
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

    public static void ejercicio6() {
        /*
         * Ejercicio 4.1: Suma de elementos
         * Declara un array de enteros llamado numeros con un tamaño de 6 elementos.
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

    public static void ejercicio7() {
        /*
         * Ejercicio 5: Búsqueda de un elemento
         * Declara un array de enteros llamado numeros con un tamaño de 6 elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50, 60.
         * 
         * Pide al usuario que ingrese un número (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el número ingresado por el usuario está en el
         * array.
         * 
         * Si el número está en el array, imprime un mensaje diciendo:
         * "El número X está en el array".
         * 
         * Si el número no está en el array, imprime un mensaje diciendo:
         * "El número X no está en el array".
         * 
         * Ejemplo de funcionamiento:
         * Si el usuario ingresa 30, el programa debería imprimir:
         * El número 30 está en el array.
         * 
         * Si el usuario ingresa 35, el programa debería imprimir:
         * El número 35 no está en el array.
         */

        Scanner teclado = new Scanner(System.in);
        boolean encontrado = false;
        int[] numeros = { 10, 20, 30, 40, 50, 60 };
        System.out.println("Ingresa un número");
        int num = teclado.nextInt();
        /**
         * aquí simplemento cambio a true el valor del booleano si está en el array.Sólo
         * eso
         */
        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                encontrado = true;
            }
        }
        /*
         * Para mejor impresión.En este condicional antes lo puse dentro del for pero
         * como este sólo sirve para
         * cambiar el valor del booleano cuando me salgo del for entonces hago el
         * condicional e imprimo
         */
        if (encontrado) {
            System.out.println("El numero " + num + " está en el array");
        } else {
            System.out.println("El numero " + num + " no está en el array");
        }

    }

    public static void ejercicio8() {
        /*
         * Ejercicio 5.1: Búsqueda de un elemento
         * Declara un array de enteros llamado edades con un tamaño de 5 elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario está en el
         * array.
         * 
         * Si la edad está en el array, imprime un mensaje diciendo:
         * "La edad X está en el array".
         * 
         * Si la edad no está en el array, imprime un mensaje diciendo:
         * "La edad X no está en el array".
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

    public static void ejercicio9() {
        /*
         * Ejercicio 7: Encontrar el valor máximo y mínimo en un array
         * Declara un array de enteros llamado numeros con un tamaño de 7 elementos.
         * 
         * Inicializa el array con los valores 10, 5, 20, 15, 30, 25, 40.
         * 
         * Usa un bucle for para encontrar el valor máximo en el array.
         * 
         * Usa otro bucle for para encontrar el valor mínimo en el array.
         * 
         * Imprime el valor máximo y el valor mínimo.
         */
        int[] numeros = { 10, 5, 20, 15, 30, 25, 40 };
        /*
         * Aquí no es buena práctica inicializar en esos valores.Es mucho más seguro
         * iniciar con el primer elemento del array
         * y comparar todos con ese,así servirá para culquiera que sean los valores del
         * array.Corrijo a continuación
         * 
         * int valormax=0;
         * int valormin=100;
         */
        /*
         * Si igualo los valores másximo y mínimo al valor de la primera posición del
         * array
         * ya sólo tendré que comparar valores con respecto a ese valor.Mejor forma de
         * plantearlo
         */
        int valormax = numeros[0];
        int valormin = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > valormax) {
                valormax = numeros[i];
            }
        }
        System.out.println("El valor máximo del array es " + valormax);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < valormin) {
                valormin = numeros[i];
            }
        }
        System.out.println("El valor mínimo del array es " + valormin);
    }

    public static void ejercicio10() {
        /*
         * Descripción:
         * Declara un array de enteros llamado numeros con un tamaño de 10 elementos.
         * Inicialízalo con los valores {12, 5, 8, 21, 30, 17, 40, 3, 14, 27}.
         * Usa un bucle for para recorrer el array y contar cuántos números son pares y
         * cuántos son impares.
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
        System.out.println("El número total de números pares en el array es " + contpar);
        System.out.println("El número total de números impares en el array es " + continpar);
    }

    public static void ejercicio11() {
        /*
         * Nivel 4: Ordenación de un array
         * Ejercicio 8: Ordenar un array de menor a mayor
         * Declara un array de enteros llamado numeros con un tamaño de 6 elementos.
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

    public static void ejercicio12() {
        /**
         * BURBUJA
         * Ejercicio 1: Ordenar un array de enteros
         * Descripción:
         * Escribe un programa en Java que implemente el método de burbuja para ordenar
         * un array de enteros en orden ascendente. El array inicial será: {5, 3, 8, 4,
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

    public static void ejercicio13() {
        /*
         * BURBUJA CON STRING
         * Ejercicio 2: Ordenar un array de cadenas (strings)
         * Descripción:
         * Ahora, escribe un programa en Java que implemente el método de burbuja para
         * ordenar un array de cadenas (strings) en orden alfabético.
         * El array inicial será: {"manzana", "banana", "uva", "pera", "kiwi"}.
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

    public static void ejercicio14() {
        /*
         * Ejercicio: Ordenar un array de números en orden descendente
         * Escribe un programa en Java que use el método de burbuja para ordenar un
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

    public static void ejercicio15() {
        /*
         * Nivel 4: Ordenación de un array
         * Ejercicio 8: Ordenar un array de menor a mayor
         * Declara un array de enteros llamado numeros con un tamaño de 6 elementos.
         * 
         * Inicializa el array con los valores 30, 10, 50, 20, 40, 60.
         * 
         * Usa el algoritmo de ordenación por selección para ordenar el array de menor a
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

    public static void ejercicio16() {
        // BUSCAR ELEMENTOS EN UN ARRAY
        /**
         * Ejercicio 6.1: Búsqueda de la posición de una edad
         * Declara un array de enteros llamado edades con un tamaño de 6 elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35, 40.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario está en el
         * array.
         * 
         * Si la edad está en el array, imprime un mensaje diciendo: "La edad X está en
         * el array en la posición Y".
         * 
         * Si la edad no está en el array, imprime un mensaje diciendo: "La edad X no
         * está en el array".
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
                System.out.println("La edad " + edad + " está en el array en la posición " + i);
            }
        }
        if (!edadEncontrada) {
            System.out.println("La edad " + edad + " no está en el array");
        }
    }

    public static void ejercicio17() {
        /*
         * 
         * Ejercicio: Búsqueda de la posición de un nombre en un array
         * Declara un array de cadenas (String) llamado nombres con un tamaño de 5
         * elementos.
         * 
         * Inicializa el array con los valores "Ana", "Carlos", "Lucía", "Pedro",
         * "Sofía".
         * 
         * Pide al usuario que ingrese un nombre (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el nombre ingresado por el usuario está en el
         * array.
         * 
         * Si el nombre está en el array, imprime un mensaje diciendo:
         * "El nombre X está en el array en la posición Y".
         * 
         * Si el nombre no está en el array, imprime un mensaje diciendo:
         * "El nombre X no está en el array".
         */
        String[] nombres = { "Ana", "Carlos", "Lucía", "Pedro", "Sofía" };
        Scanner teclado = new Scanner(System.in);
        String nombre;
        boolean coincide = false;
        System.out.println("Introduce un nombre");
        nombre = teclado.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equalsIgnoreCase(nombres[i])) {
                coincide = true;
                System.out.println("El nombre " + nombre + " está en el array");
            }
        }
        if (!coincide) {
            System.out.println("El nombre " + nombre + " no está en el array");
        }

    }

    public static void ejercicio18() {
        /*
         * Escriba un programa que llene un array con números del 1 al 10 y los muestre
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

    public static void ejercicio19() {
        /*
         * NO SOY CAPAZ DE HACERLO DEL TODO BIEN
         * Escriba un programa que almacene en un array 15 números aleatorios double
         * comprendidos entre 1.00 y 50.00. Mostrar el contenido del array separando los
         * números por guión.
         * 
         */

    }

    public static void ejercicio20() {
        /*
         * NO SOY CAPAZ DE HACERLO DEL TODO BIEN,HAY ALGO QUE NIO ENTIENDO DEL SEGUNDO
         * FOR
         * Crea un programa en Java que genere una matriz
         * de 2x2 con números aleatorios entre 1 y 50 y la muestre en pantalla.
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

    public static void ejercicio21() {
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

    public static void ejercicio22() {
        /*
         * Crea un programa que declare una matriz de 3x3 (3 filas y 3 columnas)
         * y la llene con números aleatorios entre 1 y 10.
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

    public static void ejercicio23() {
        /**
         * Ejercicio 5.2: Búsqueda de un elemento
         * Declara un array de enteros llamado precios con un tamaño de 6 elementos.
         * 
         * Inicializa el array con los valores 100, 200, 300, 400, 500, 600.
         * 
         * Pide al usuario que ingrese un precio (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el precio ingresado por el usuario está en el
         * array.
         * 
         * Si el precio está en el array, imprime un mensaje diciendo: "El precio X está
         * en el array".
         * 
         * Si el precio no está en el array, imprime un mensaje diciendo: "El precio X
         * no está en el array".
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
            System.out.println("El precio " + precio + " está en el array");
        } else {
            System.out.println("El precio " + precio + " no está en el array");
        }
    }

    public static void ejercicio24() {
        /**
         * Nivel 2.5: Búsqueda de la posición de un elemento en un array
         * Ejercicio 6: Búsqueda de la posición de un elemento
         * Declara un array de enteros llamado temperaturas con un tamaño de 5
         * elementos.
         * 
         * Inicializa el array con los valores 15, 20, 25, 30, 35.
         * 
         * Pide al usuario que ingrese una temperatura (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la temperatura ingresada por el usuario está
         * en el array.
         * 
         * Si la temperatura está en el array, imprime un mensaje diciendo: "La
         * temperatura X está en el array en la posición Y".
         * 
         * Si la temperatura no está en el array, imprime un mensaje diciendo: "La
         * temperatura X no está en el array".
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
            System.out.println("La temperatura " + temp + " está en el array en la posición " + posicion);
        } else {
            System.out.println("La temperatura " + temp + " no está en el array");
        }

    }

    public static void ejercicio25() {
        // BUSCAR ELEMENTOS EN UN ARRAY
        /**
         * Ejercicio 6.1: Búsqueda de la posición de una edad
         * Declara un array de enteros llamado edades con un tamaño de 6 elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35, 40.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario está en el
         * array.
         * 
         * Si la edad está en el array, imprime un mensaje diciendo: "La edad X está en
         * el array en la posición Y".
         * 
         * Si la edad no está en el array, imprime un mensaje diciendo: "La edad X no
         * está en el array".
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
                System.out.println("La edad " + edad + " está en el array en la posición " + i);
            }
        }
        if (!edadEncontrada) {
            System.out.println("La edad " + edad + " no está en el array");
        }

    }

    public static void ejercicio26() {
        /*
         * BUSCAR ELEMENTOS EN UN ARRAY
         * 
         * Declara un array de cadenas llamado nombres con un tamaño de 5 elementos.
         * 
         * Inicializa el array con los valores: "Ana", "Carlos", "Elena", "Luis",
         * "María".
         * 
         * Pide al usuario que ingrese un nombre (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para verificar si el nombre ingresado por el usuario está en
         * el array.
         * 
         * Si el nombre está en el array, imprime un mensaje diciendo:
         * "El nombre X está en la lista en la posición Y".
         * 
         * Si el nombre no está en el array, imprime un mensaje diciendo:
         * "El nombre X no está en la lista".
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
                                   * Este booleano lo uso para poder imprimir en una sola linea la solución.
                                   * En el if de abajo que está fuera del for si no tuviera el booleano se
                                   * imprimiría varias veces
                                   */
                System.out.println("El nombre " + nombre + " está en el array en la posición " + i);
            }
        }
        if (!encontrado) {/* Aquí gracias al booleano no está obligado a imprimirse */
            System.out.println("El nombre " + nombre + " no está en el array");
        }
    }

    public static void ejercicio27() {
        /*
         * RELLENAR UN ARRAY CON RAMDOMS
         * 
         * Crea un programa en el que:
         * 
         * Se declare un array de tamaño 5.
         * 
         * Se llenen los 5 espacios con números aleatorios entre 1 y 50.
         * 
         * Se muestren los números del array en pantalla.
         */
        int[] array = new int[5];
        /*
         * Aquí creo la instancia de la clase random,algo que haré siempre
         * que use el método random,al igual que en Scanner uso la instancia aquí tmb
         */
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
            /*
             * Aquí arriba esto igualando la posición de array[i]
             * a una generación de números aleatorios entre 1-50,así es como se escribiría
             */
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void ejercicio28() {
        /*
         * RELLENAR UNA MATRIZ DE 2D CON RAMDOMS
         * 
         * Crea un programa en Java que genere una matriz de 2x2 con números aleatorios
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

    public static void ejercicio29() {
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

    public static void ejercicio30() {
        /*
         * RELLENAR UNA MATRIZ DE 2D CON RANDOMS
         * Crea un programa que declare una matriz de 3x3 (3 filas y 3 columnas) y la
         * llene con números aleatorios entre 1 y 10. Luego, muestra toda la matriz en
         * formato de filas y columnas.
         */
        int[][] matriz = new int[3][3];
        // importante acordarse de cómo instanciar el método Random
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
             * importante aquí abajo que imprimamos el salto de línea fuera del for interno
             * pero dentro
             * del for externo
             */
            System.out.println();
        }
    }

    public static void ejercicio31() {
        /*
         * Modifica el programa anterior para que, después de mostrar la matriz, pida al
         * usuario un número de fila (entre 1 y 3) y muestre solo los elementos de esa
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
             * importante aquí abajo que imprimamos el salto de línea fuera del for interno
             * pero dentro
             * del for externo
             */
            System.out.println();
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de fila");
        int valor = teclado.nextInt();
        /*
         * aquí sólo usamos un for porque el usuario elige una fila así que nos ahorra
         * buscar entre las filas
         */
        for (int j = 0; j < matriz[valor - 1].length; j++) {
            System.out.print(matriz[valor - 1][j] + ",");
        }
    }

    public static void ejercicio32() {
        /*
         * Tienes una matriz de 3 filas y 4 columnas en Java:
         * 
         * java
         * Copiar
         * Editar
         * int[][] numeros = new int[3][4];
         * 📌 Tu tarea:
         * 
         * Rellena la matriz con números aleatorios entre 10 y 99.
         * 
         * Imprímela en formato de matriz.
         */
        int[][] numeros = new int[3][4];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                /*
                 * Aquí abajo dentro del paréntesis ponemos 90 porque así imprimimos números del
                 * 0-90
                 * pero como queremos del 10-99 después ponemos el +10
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

    public static void ejercicio33() {
        /*
         * Genere una matriz de 4 filas x 5 columnas con números aleatorios entre 100 y
         * 999.
         * 
         * Imprima la matriz en formato correcto, con cada número separado por un
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

    public static void ejercicio34() {
        /*
         *
         * 
         * Genera una matriz de 5x5 con números aleatorios entre 1 y 99.
         * 
         * Imprímela en formato de matriz.
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
                 * Aquí en el paréntesis indico el rango del que sacaré el Random,
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

    public static void ejercicio35() {
        /*
         * Genere una matriz de 4x6 con números aleatorios entre 1 y 50.
         * 
         * Pida al usuario un número de fila (entre 1 y 4) y muestre los datos de esa
         * fila.
         * 
         * Valide que el número de fila esté en el rango correcto (si el usuario ingresa
         * un número fuera de rango, debe pedirlo nuevamente).
         */
        int[][] numeros = new int[4][6];
        int fila;
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            /*
             * Usar array[i].length en el for interno es CLAVE para matrices no cuadradas.
             * Si usaras solo array.length, fallaría en matrices como [4][6].
             */
            for (int j = 0; j < numeros[i].length; j++) {

                numeros[i][j] = random.nextInt(50) + 1;
            }
        }
        /*
         * Hago un do while para que el usuario esté obligado a meter una fila que esté
         * entre 1 y 4
         */
        do {
            System.out.println("Introduce el número de fila");
            fila = teclado.nextInt();
        } while (fila < 1 || fila > 4);
        /*
         * En este for recorro sólo las coulmnas de la fila que voy a mostrar por eso es
         * de "j" y hasta
         * numeros[fila - 1] ya que usa las columnas de la fila que haya introducido el
         * usuario.
         * Es importante matizar el [fila - 1].length porque el array empieza en 0 y si
         * elijo la 4
         * fila voy a tener un error porque sólo llega hasta 3 (0,1,2 y 3)
         */
        for (int j = 0; j < numeros[fila - 1].length; j++) {
            System.out.print(numeros[fila - 1][j] + " ");
        }

    }

    public static void ejercicio36() {
        /*
         * Crea un programa en Java que solicite al usuario el tamaño de un array
         * unidimensional
         * y luego le permita rellenarlo con valores de tipo String (cadenas de texto)
         * introducidos por teclado.
         * 
         * Requisitos:
         * 
         * Pedir al usuario el tamaño del array.
         * 
         * Crear un array de String con ese tamaño.
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
         * aquí tengo que poner un salto de línea así,no sé muy bien porque pero
         * se imprimiría mal si no lo hago
         */
        teclado.nextLine();
        /*
         * Le doy al valor del array la variable longitud y listo,así es como pido por
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

    public static void ejercicio37() {
        /*
         * Crea un programa en Java que solicite al usuario el tamaño de un array
         * unidimensional
         * y luego le permita rellenarlo con nombres de animales introducidos por
         * teclado.
         * 
         * Requisitos:
         * 
         * Pedir al usuario el tamaño del array.
         * 
         * Crear un array de String con ese tamaño.
         * 
         * Rellenar el array con nombres de animales ingresados por el usuario.
         * 
         * Mostrar por pantalla el contenido final del array.
         */
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Cuánto ocupará el array?");
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

    public static void ejercicio38() {
        /*
         * Crea un programa en Java que realice lo siguiente:
         * 
         * Solicitar al usuario el tamaño de un array unidimensional de números enteros.
         * 
         * Rellenar el array con valores introducidos por teclado.
         * 
         * Ordenar el array de mayor a menor utilizando el método de la burbuja (Bubble
         * Sort).
         * 
         * Mostrar el array antes y después de ordenarlo.
         */
        Scanner teclado = new Scanner(System.in);
        int longitud;
        System.out.println("Introduce la longitud del array");
        longitud = teclado.nextInt();
        teclado.nextLine();
        int[] numeros = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un valor entero para la posición " + i);
            numeros[i] = teclado.nextInt();
        }
        // coloreo de rojo la imprsión
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

    public static void ejercicio39() {
        /*
         * Crea un programa en Java que realice lo siguiente:
         * 
         * Solicitar al usuario el tamaño de un array unidimensional de números enteros.
         * 
         * Rellenar el array con valores aleatorios entre 1 y 100 (usa Math.random()).
         * 
         * Mostrar el array generado.
         * 
         * Ordenar el array de menor a mayor utilizando el método de selección
         * (Selection Sort).
         * 
         * Mostrar el array ordenado.
         */
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int tamano;
        System.out.println("Introduce el tamaño del array");
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

    public static void ejercicio40() {
        /*
         * Crea un vector llamado temperaturas que almacene los siguientes valores: 23,
         * 12, 45, 8. Luego, imprime el segundo elemento del vector.
         * 
         * int [] temperatura = {23, 12, 45, 8};
         * System.out.println(temperatura[1]);
         */

        /*
         * Dado el vector int[] numeros = {10, 20, 30, 40, 50};,
         * intenta acceder e imprimir el elemento en la posición 5.
         * Explica qué ocurre y por qué.
         */
        /*
         * int[] numeros = {10, 20, 30, 40, 50};
         * System.out.println(numeros[5]);
         */

    }

    public static void ejercicio41() {
        /*
         * Supongamos que tienes una lista de nombres de estudiantes en un curso y
         * necesitas eliminar un estudiante por su nombre. La lista está implementada
         * como un array de tamaño fijo.
         * 
         * Implementa un método en Java llamado eliminarEstudiante(String nombre), que
         * recorra el array estudiantes, encuentre el estudiante con el nombre dado y lo
         * elimine desplazando los elementos hacia la izquierda. Si el nombre no existe,
         * imprime un mensaje indicando que el estudiante no fue encontrado.
         */

    }

    public static void ejercicio42() {
        /*
         * Define un vector de 10 posiciones e introduce las 5 primeras posiciones con
         * numeros enteros.
         * 
         * Borra cualquier posición y lo muestras.
         * 
         * Borra el elemento que tenga como valor 8
         */

        int[] enteros = new int[10];
        int valor = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un valor para la posición " + i);
            valor = teclado.nextInt();
            enteros[i] = valor;
        }

        /*
         * Así es como se imprime un array,primero importo la clase java.util.Arrays
         * y después imprimo con ese formato
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
         * Pongo la última posición en 0
         */
        enteros[enteros.length - 1] = 0;
        System.out.println("El array después de eliminar la posición " + posicion + " es:");
        System.out.println(Arrays.toString(enteros));

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == 8) {
                for (int j = 0; j < enteros.length - 1; j++) {
                    enteros[i] = enteros[i + 1];
                }
            }
        }
        enteros[enteros.length - 1] = 0;
        System.out.println("El array después de eliminar el valor 8 es:");
        System.out.println(Arrays.toString(enteros));
    }

    public static void ejercicio43() {
        /*
         * Define un vector de 10 posiciones e introduce las primeras 6 posiciones con
         * números enteros.
         * 
         * Muestra el vector por pantalla.
         * 
         * Elimina la posición 3 del vector (desplazando los elementos hacia la
         * izquierda).
         * 
         * Muestra el vector actualizado.
         * 
         * Busca un número específico introducido por el usuario y sustitúyelo por un 0.
         * 
         * Muestra el vector final tras la sustitución.
         */
        int[] enteros = new int[10];
        int posicion = 6;

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < posicion; i++) {
            System.out.println("Introduce un valor para la posicion " + i);
            /*
             * cualquier variable que ponga precedida del
             * teclado.nextInt será a la que se le asigne el valor
             */
            enteros[i] = teclado.nextInt();

        }
        System.out.println("El array generado es: " + Arrays.toString(enteros));
        /*
         * Esta es la forma clásica de imprimirlo:
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
        System.out.println("El array eliminando la posición 3 sería " + Arrays.toString(enteros));
    }

    public static void ejercicio44() {
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

        // BORRAR ELEMENTO SI SABEMOS LA POSICIÓN:

        for (int i = 2; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }

        vector[vector.length - 1] = 0;
        System.out.println(Arrays.toString(vector));

        // BORRAR POSICIÓN SI LA PASA EL USUARIO:

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
         * AQUÍ ES LO MISMO PERO DE ALGO DISTINTO Y MENOS EFICIENTE
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

    public static void ejercicio45() {
        /*
         * Escribe un programa en Java que realice las siguientes operaciones sobre un
         * array de enteros:
         * 
         * Inicialización:
         * 
         * Crea un array de tamaño 10 e inicialízalo con los siguientes valores:
         * [3, 7, 2, 5, 1, 7, 4, 9, 6, 2].
         * 
         * Eliminar elemento por posición:
         * 
         * Pide al usuario que ingrese una posición (índice) y elimina el elemento en
         * esa posición, desplazando los elementos restantes hacia la izquierda y
         * rellenando con 0 al final.
         * 
         * Muestra el array resultante.
         * 
         * Eliminar todos los elementos con un valor específico:
         * 
         * Elimina todos los números 7 del array, desplazando los elementos restantes y
         * rellenando con 0 al final.
         * 
         * Muestra el array modificado.
         * 
         * Mostrar resultados:
         * 
         * Después de cada operación, imprime el array actualizado usando
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
        System.out.println("Introduce una posición a eliminar:");
        index = teclado.nextInt();
        /*
         * si no ponemos el -1 nos saltaría error porque dentro del bucle
         * vemos que le damos a posición de i el valor de posición de i + 1
         * por lo que si estamos en la última posición no hay una posición i + 1
         */
        for (int i = index; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        /*
         * Aquí,como arriba hemos corrido una posición a la izquierda en todas las
         * posiciones
         * la última quedaría sin valor,por lo que le ponemos en 0
         */
        System.out.println();
        numeros[numeros.length - 1] = 0;
        System.out.println("El array sin la posición " + index + " es:" + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 7) {
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
            }
            numeros[numeros.length - 1] = 0;
        }
        System.out.println();
        // Aquí aplico color con la estructura \033[31m------texto-----\033[0m
        System.out.println("\033[31mEl array tras eliminar los valores 7 quedaría: \033[0m" + Arrays.toString(numeros));
    }

    public static void ejercicio46() {
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
        ejercicio48();
        // ejercicio49();
        // ejercicio50();

    }
}

