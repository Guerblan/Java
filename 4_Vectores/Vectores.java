import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Vectores {

    // Ejercicios de vectores ordenados por dificultad.
    // Todas las entradas siguen el patron ejercicioN().

    // Nivel 1: declaración, inicialización y recorridos básicos

    public static void ejercicio1() {

        /*
         * Ejercicio 1: Declaración e inicialización de arrays
         * Declara un array de enteros llamado numeros con un tamaño de 5
         * elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50.
         * 
         * Imprime el valor del tercer elemento del array.
         */
    }

    public static void ejercicio2() {
        /*
         * Ejercicio 1.1: Declaración e inicialización de arrays
         * Declara un array de enteros llamado notas con un tamaño de 4
         * elementos.
         * 
         * Inicializa el array con los valores 8, 6, 9, 7.
         * 
         * Imprime el valor del cuarto elemento del array.
         */
    }

    public static void ejercicio3() {
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

    public static void ejercicio4() {
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
    }

    public static void ejercicio5() {
        /*
         * Declara un array de enteros llamado precios con un tamaño de 4
         * elementos.
         * 
         * Inicializa el array con los valores 100, 200, 300, 400.
         * 
         * Cambia el valor del tercer elemento a 350.
         * Usa un bucle for para recorrer el array e imprimir cada uno de sus elementos
         * después de la modificación.
         * 
         * 
         */
    }

    public static void ejercicio6() {
        /*
         * Crea un programa que declare e inicialice un array unidimensional
         * de 5 elementos con valores del 1 al 5. Luego, muestra todos los elementos del
         * array.
         */
    }

    public static void ejercicio7() {
        /*
         * RELLENAR UN ARRAY CON RAMDOMS
         * 
         * Crea un programa que declare e inicialice un array unidimensional de 5
         * elementos con valores del 1 al 5. Luego, muestra todos los elementos del
         * array.
         */
    }

    public static void ejercicio8() {
        /*
         * Escriba un programa que llene un array con números del 1 al 10 y los
         * muestre
         * por
         * pantalla.
         */
    }

    public static void ejercicio9() {
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
    }

    public static void ejercicio10() {
        /* Genera veinte enteros aleatorios entre 0 y 99 y guardalos en un array. */
    }

    public static void ejercicio11() {
        /* Pide n numeros, guardalos en un array y muestralos por pantalla. */
    }


    // Nivel 2: cálculos, búsquedas y análisis de vectores

    public static void ejercicio12() {
        /*
         * Ejercicio 4: Suma de elementos
         * Declara un array de enteros llamado valores con un tamaño de 5
         * elementos.
         * 
         * Inicializa el array con los valores 5, 10, 15, 20, 25.
         * 
         * Usa un bucle for para calcular la suma de todos los elementos del array.
         * 
         * Imprime el resultado de la suma.
         */
    }

    public static void ejercicio13() {
        /*
         * Ejercicio 4.1: Suma de elementos
         * Declara un array de enteros llamado numeros con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 2, 4, 6, 8, 10, 12.
         * 
         * Usa un bucle for para calcular la suma de todos los elementos del array.
         * 
         * Imprime el resultado de la suma.
         */
    }

    public static void ejercicio14() {
        /*
         * Pide ocho numeros, guardalos en un vector y muestra la suma y la media.
         */
    }

    public static void ejercicio15() {
        /*
         * Realizar un programa que defina un vector llamado "vector_numeros" de 10
         * enteros, a continuación lo inicialice con valores aleatorios (del 1 al 10) y
         * posteriormente muestre en pantalla cada elemento del vector junto con su
         * cuadrado y su cubo.
         */
    }

    public static void ejercicio16() {
        /*
         * Crea un vector de 10 números enteros y pide al usuario que introduzca sus
         * valores. Después, cuenta cuántos números son positivos, cuántos son negativos
         * y cuántos son iguales a cero. Muestra los resultados por pantalla.
         */
    }

    public static void ejercicio17() {
        /*
         * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por
         * un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las
         * notas, la nota media, la nota más alta que ha sacado y la menor.
         */
    }

    public static void ejercicio18() {
        /*
         * Ejercicio 5: Búsqueda de un elemento
         * Declara un array de enteros llamado numeros con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 10, 20, 30, 40, 50, 60.
         * 
         * Pide al usuario que ingrese un número (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el número ingresado por el usuario
         * está en el
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
    }

    public static void ejercicio19() {
        /*
         * Ejercicio 5.1: Búsqueda de un elemento
         * Declara un array de enteros llamado edades con un tamaño de 5
         * elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario está
         * en el
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
    }

    public static void ejercicio20() {
        /**
         * Ejercicio 5.2: Búsqueda de un elemento
         * Declara un array de enteros llamado precios con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 100, 200, 300, 400, 500, 600.
         * 
         * Pide al usuario que ingrese un precio (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el precio ingresado por el usuario
         * está en el
         * array.
         * 
         * Si el precio está en el array, imprime un mensaje diciendo: "El precio
         * X está
         * en el array".
         * 
         * Si el precio no está en el array, imprime un mensaje diciendo: "El
         * precio X
         * no está en el array".
         */
    }

    public static void ejercicio21() {
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
         * Usa un bucle for para buscar si la temperatura ingresada por el usuario
         * está
         * en el array.
         * 
         * Si la temperatura está en el array, imprime un mensaje diciendo: "La
         * temperatura X está en el array en la posición Y".
         * 
         * Si la temperatura no está en el array, imprime un mensaje diciendo:
         * "La
         * temperatura X no está en el array".
         */
    }

    public static void ejercicio22() {
        // BUSCAR ELEMENTOS EN UN ARRAY
        /**
         * Ejercicio 6.1: Búsqueda de la posición de una edad
         * Declara un array de enteros llamado edades con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35, 40.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario está
         * en el
         * array.
         * 
         * Si la edad está en el array, imprime un mensaje diciendo: "La edad X
         * está en
         * el array en la posición Y".
         * 
         * Si la edad no está en el array, imprime un mensaje diciendo: "La edad
         * X no
         * está en el array".
         */
    }

    public static void ejercicio23() {
        // BUSCAR ELEMENTOS EN UN ARRAY
        /**
         * Ejercicio 6.1: Búsqueda de la posición de una edad
         * Declara un array de enteros llamado edades con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 18, 22, 25, 30, 35, 40.
         * 
         * Pide al usuario que ingrese una edad (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si la edad ingresada por el usuario está
         * en el
         * array.
         * 
         * Si la edad está en el array, imprime un mensaje diciendo: "La edad X
         * está en
         * el array en la posición Y".
         * 
         * Si la edad no está en el array, imprime un mensaje diciendo: "La edad
         * X no
         * está en el array".
         */
    }

    public static void ejercicio24() {
        /*
         * 
         * Ejercicio: Búsqueda de la posición de un nombre en un array
         * Declara un array de cadenas (String) llamado nombres con un tamaño de
         * 5
         * elementos.
         * 
         * Inicializa el array con los valores "Ana", "Carlos", "Lucía", "Pedro",
         * "Sofía".
         * 
         * Pide al usuario que ingrese un nombre (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para buscar si el nombre ingresado por el usuario
         * está en el
         * array.
         * 
         * Si el nombre está en el array, imprime un mensaje diciendo:
         * "El nombre X está en el array en la posición Y".
         * 
         * Si el nombre no está en el array, imprime un mensaje diciendo:
         * "El nombre X no está en el array".
         */
    }

    public static void ejercicio25() {
        /*
         * BUSCAR ELEMENTOS EN UN ARRAY
         * 
         * Declara un array de cadenas llamado nombres con un tamaño de 5
         * elementos.
         * 
         * Inicializa el array con los valores: "Ana", "Carlos", "Elena", "Luis",
         * "María".
         * 
         * Pide al usuario que ingrese un nombre (puedes usar Scanner para esto).
         * 
         * Usa un bucle for para verificar si el nombre ingresado por el usuario
         * está en
         * el array.
         * 
         * Si el nombre está en el array, imprime un mensaje diciendo:
         * "El nombre X está en la lista en la posición Y".
         * 
         * Si el nombre no está en el array, imprime un mensaje diciendo:
         * "El nombre X no está en la lista".
         */
    }

    public static void ejercicio26() {
        /*
         * Crea un vector de 10 números enteros y pide al usuario que introduzca sus
         * valores. Solicita después un número y muestra cuántas veces aparece en el
         * vector y las posiciones en las que se encuentra. Si no aparece, muestra un
         * mensaje indicándolo.
         */
    }

    public static void ejercicio27() {
        /*
         * Ejercicio 7: Encontrar el valor máximo y mínimo en un array
         * Declara un array de enteros llamado numeros con un tamaño de 7
         * elementos.
         * 
         * Inicializa el array con los valores 10, 5, 20, 15, 30, 25, 40.
         * 
         * Usa un bucle for para encontrar el valor máximo en el array.
         * 
         * Usa otro bucle for para encontrar el valor mínimo en el array.
         * 
         * Imprime el valor máximo y el valor mínimo.
         */
    }

    public static void ejercicio28() {
        /* Pide diez numeros y muestra el maximo, el minimo y sus posiciones. */
    }

    public static void ejercicio29() {
        /*
         * Descripción:
         * Declara un array de enteros llamado numeros con un tamaño de 10
         * elementos.
         * Inicialízalo con los valores {12, 5, 8, 21, 30, 17, 40, 3, 14, 27}.
         * Usa un bucle for para recorrer el array y contar cuántos
         * números son pares y
         * cuántos son impares.
         * Imprime el resultado.
         */
    }


    // Nivel 3: entrada, transformación y combinación de vectores

    public static void ejercicio30() {
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
    }

    public static void ejercicio31() {
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
    }

    public static void ejercicio32() {
        /*
         * Pide enteros positivos hasta introducir -1 y muestra los valores guardados.
         */
    }

    public static void ejercicio33() {
        /*
         * Programa que declare un vector de diez elementos enteros y pida números para
         * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
         * Entonces se debe imprimir el vector (sólo los elementos introducidos).
         */
    }

    public static void ejercicio34() {
        /*
         * Pide un array de diez elementos y muestra otro con los elementos en orden
         * inverso.
         */
    }

    public static void ejercicio35() {
        /*
         * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector
         * con datos leídos por el teclado. Copia los elementos del vector en otro
         * vector pero en orden inverso, y muéstralo por la pantalla.
         */
    }

    public static void ejercicio36() {
        /* Pide ocho numeros y crea otro array que solo contenga los impares. */
    }

    public static void ejercicio37() {
        /* Pide nueve numeros y separa los pares y los impares en dos arrays. */
    }

    public static void ejercicio38() {
        /* Genera veinte numeros entre 1 y 50 y guarda los primos en otro array. */
    }

    public static void ejercicio39() {
        /*
         * Programa que declare tres vectores 'vector1', 'vector2' y 'vector3' de cinco
         * enteros cada uno, pida valores para 'vector1' y 'vector2' y calcule
         * vector3=vector1+vector2.
         */
    }

    public static void ejercicio40() {
        /*
         * Crea dos vectores de 5 números enteros y pide al usuario que introduzca sus
         * valores. Crea un tercer vector de 10 posiciones que contenga primero los
         * elementos del primer vector y después los elementos del segundo. Muestra el
         * vector resultante usando Arrays.toString().
         */
    }

    public static void ejercicio41() {
        /*
         * Anade un numero al final de un vector creando una copia con una posicion mas.
         */
    }

    public static void ejercicio42() {
        /*
         * Crea un vector de 8 números enteros y pide al usuario que introduzca sus
         * valores. Desplaza todos los elementos una posición hacia la derecha, haciendo
         * que el último elemento pase a ocupar la primera posición. Muestra el vector
         * antes y después del desplazamiento.
         */
    }

    public static void ejercicio43() {
        /*
         * NO SOY CAPAZ DE HACERLO DEL TODO BIEN
         * Escriba un programa que almacene en un array 15 números aleatorios
         * double
         * comprendidos entre 1.00 y 50.00. Mostrar el contenido del array separando los
         * números por guión.
         * 
         */
    }


    // Nivel 4: ordenación de vectores

    public static void ejercicio44() {
        /*
         * Copia un array de cinco valores y muestra la copia en orden ascendente y
         * descendente.
         */
    }

    public static void ejercicio45() {
        /*
         * Nivel 4: Ordenación de un array
         * Ejercicio 8: Ordenar un array de menor a mayor
         * Declara un array de enteros llamado numeros con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 30, 10, 50, 20, 40, 60.
         * Ordena el array de menor a mayor.
         * 
         * Imprime el array ordenado.
         */
    }

    public static void ejercicio46() {
        /*
         * Nivel 4: Ordenación de un array
         * Ejercicio 8: Ordenar un array de menor a mayor
         * Declara un array de enteros llamado numeros con un tamaño de 6
         * elementos.
         * 
         * Inicializa el array con los valores 30, 10, 50, 20, 40, 60.
         * 
         * Usa el algoritmo de ordenación por selección para ordenar el
         * array de menor a
         * mayor.
         * 
         * Imprime el array ordenado.
         */
    }

    public static void ejercicio47() {
        /* Ordena un array desordenado usando el algoritmo que prefieras. */
    }

    public static void ejercicio48() {
        /**
         * BURBUJA
         * Ejercicio 1: Ordenar un array de enteros
         * Descripción:
         * Escribe un programa en Java que implemente el método de burbuja para
         * ordenar
         * un array de enteros en orden ascendente. El array inicial será: {5, 3,
         * 8, 4,
         * 6}.
         */
    }

    public static void ejercicio49() {
        /*
         * BURBUJA CON STRING
         * Ejercicio 2: Ordenar un array de cadenas (strings)
         * Descripción:
         * Ahora, escribe un programa en Java que implemente el método de burbuja
         * para
         * ordenar un array de cadenas (strings) en orden alfabético.
         * El array inicial será: {"manzana", "banana", "uva", "pera", "kiwi"}.
         */
    }

    public static void ejercicio50() {
        /*
         * Ejercicio: Ordenar un array de números en orden descendente
         * Escribe un programa en Java que use el método de burbuja para ordenar
         * un
         * array de enteros en orden descendente (de mayor a menor).
         */
    }

    public static void ejercicio51() {
        /*
         * Crea un programa en Java que realice lo siguiente:
         * 
         * Solicitar al usuario el tamaño de un array unidimensional de
         * números enteros.
         * 
         * Rellenar el array con valores introducidos por teclado.
         * 
         * Ordenar el array de mayor a menor utilizando el método de la burbuja
         * (Bubble
         * Sort).
         * 
         * Mostrar el array antes y después de ordenarlo.
         */
    }

    public static void ejercicio52() {
        /*
         * Crea un programa en Java que realice lo siguiente:
         * 
         * Solicitar al usuario el tamaño de un array unidimensional de
         * números enteros.
         * 
         * Rellenar el array con valores aleatorios entre 1 y 100 (usa Math.random()).
         * 
         * Mostrar el array generado.
         * 
         * Ordenar el array de menor a mayor utilizando el método de
         * selección
         * (Selection Sort).
         * 
         * Mostrar el array ordenado.
         */
    }


    // Nivel 5: eliminación y desplazamiento de elementos

    public static void ejercicio53() {
        /*
         * Define un vector de 10 posiciones e introduce las 5 primeras posiciones con
         * numeros enteros.
         * 
         * Borra cualquier posición y lo muestras.
         * 
         * Borra el elemento que tenga como valor 8
         */
    }

    public static void ejercicio54() {
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
         * Busca un número específico introducido por el usuario y
         * sustitúyelo por un 0.
         * 
         * Muestra el vector final tras la sustitución.
         */
    }

    public static void ejercicio55() {
        /*
         * Realiza distintas operaciones sobre un vector de diez enteros: elimina un
         * elemento conociendo su posición, permite al usuario elegir otra posición
         * para eliminar y borra todos los elementos cuyo valor sea 8.
         */
        // DISTINTAS OPERACIONES EN UN ARRAY:
    }

    public static void ejercicio56() {
        /*
         * Escribe un programa en Java que realice las siguientes operaciones sobre un
         * array de enteros:
         * 
         * Inicialización:
         * 
         * Crea un array de tamaño 10 e inicialízalo con los siguientes
         * valores:
         * [3, 7, 2, 5, 1, 7, 4, 9, 6, 2].
         * 
         * Eliminar elemento por posición:
         * 
         * Pide al usuario que ingrese una posición (índice) y elimina el
         * elemento en
         * esa posición, desplazando los elementos restantes hacia la izquierda y
         * rellenando con 0 al final.
         * 
         * Muestra el array resultante.
         * 
         * Eliminar todos los elementos con un valor específico:
         * 
         * Elimina todos los números 7 del array, desplazando los elementos
         * restantes y
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
    }

    public static void ejercicio57() {
        /*
         * Supongamos que tienes una lista de nombres de estudiantes en un curso y
         * necesitas eliminar un estudiante por su nombre. La lista está
         * implementada
         * como un array de tamaño fijo.
         * 
         * Implementa un método en Java llamado eliminarEstudiante(String
         * nombre), que
         * recorra el array estudiantes, encuentre el estudiante con el nombre dado y lo
         * elimine desplazando los elementos hacia la izquierda. Si el nombre no existe,
         * imprime un mensaje indicando que el estudiante no fue encontrado.
         */
    }


    // Nivel 6: matrices y ejercicios avanzados

    public static void ejercicio58() {
        /* Muestra por pantalla un array bidimensional con el formato indicado. */
    }

    public static void ejercicio59() {
        /* Rellena un array bidimensional con aleatorios entre 2 y 12. */
    }

    public static void ejercicio60() {
        /*
         * NO SOY CAPAZ DE HACERLO DEL TODO BIEN,HAY ALGO QUE NIO ENTIENDO DEL SEGUNDO
         * FOR
         * Crea un programa en Java que genere una matriz
         * de 2x2 con números aleatorios entre 1 y 50 y la muestre en pantalla.
         */
    }

    public static void ejercicio61() {
        /*
         * RELLENAR UNA MATRIZ DE 2D CON RAMDOMS
         * 
         * Crea un programa en Java que genere una matriz de 2x2 con números
         * aleatorios
         * entre 1 y 50 y la muestre en pantalla.
         */
    }

    public static void ejercicio62() {
        /*
         * Crea un programa que declare una matriz de 3x3 (3 filas y 3 columnas)
         * y la llene con números aleatorios entre 1 y 10.
         * Luego, muestra toda la matriz en formato de filas y columnas.
         */
    }

    public static void ejercicio63() {
        /*
         * RELLENAR UNA MATRIZ DE 2D CON RANDOMS
         * Crea un programa que declare una matriz de 3x3 (3 filas y 3 columnas) y la
         * llene con números aleatorios entre 1 y 10. Luego, muestra toda la
         * matriz en
         * formato de filas y columnas.
         */
    }

    public static void ejercicio64() {
        /*
         * Pide al usuario los valores de una matriz de 4x4 y muestra la matriz
         * resultante por pantalla en formato de filas y columnas.
         */
    }

    public static void ejercicio65() {
        /*
         * Modifica el programa anterior para que, después de mostrar la matriz,
         * pida al
         * usuario un número de fila (entre 1 y 3) y muestre solo los elementos
         * de esa
         * fila.
         */
    }

    public static void ejercicio66() {
        /*
         * Tienes una matriz de 3 filas y 4 columnas en Java:
         * 
         * java
         * Copiar
         * Editar
         * int[][] numeros = new int[3][4];
         * Tu tarea:
         * 
         * Rellena la matriz con números aleatorios entre 10 y 99.
         * 
         * Imprímela en formato de matriz.
         */
    }

    public static void ejercicio67() {
        /*
         * Genere una matriz de 4 filas x 5 columnas con números aleatorios entre
         * 100 y
         * 999.
         * 
         * Imprima la matriz en formato correcto, con cada número separado por un
         * espacio.
         */
    }

    public static void ejercicio68() {
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
    }

    public static void ejercicio69() {
        /*
         * Genere una matriz de 4x6 con números aleatorios entre 1 y 50.
         * 
         * Pida al usuario un número de fila (entre 1 y 4) y muestre los datos de
         * esa
         * fila.
         * 
         * Valide que el número de fila esté en el rango correcto (si el
         * usuario ingresa
         * un número fuera de rango, debe pedirlo nuevamente).
         */
    }

    public static void ejercicio70() {
        /*
         * Crea una matriz 4x5 con aleatorios entre 1 y 50, muestrala y enseña
         * la columna indicada por el usuario.
         */
    }

    public static void ejercicio71() {
        /*
         * Crea una matriz del tamano pedido y rellena con unos las posiciones
         * interiores.
         */
    }

    public static void ejercicio72() {
        /* Coloca tres unos sin solaparse en posiciones aleatorias de una matriz 3x3. */
    }

    public static void ejercicio73() {
        /* Coloca tres unos no contiguos en una matriz 5x5. */
    }

    public static void ejercicio74() {
        /*
         * Permite introducir numeros en una matriz 5x5 hasta que se escriba la letra n.
         */
    }

    public static void ejercicio75() {
        /* Juego de una dama en un tablero de ajedrez con movimientos validos. */
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
        // ejercicio71();
        // ejercicio72();
        // ejercicio73();
        // ejercicio74();
        // ejercicio75();
    }
}
