import java.util.Scanner;

class Funciones {

    public static void holaMundo() {
        /*
         * 1. Realiza un metodo llamado holaMundo que al ser llamada
         * muestre por consola el mensaje "Hola Mundo!".
         */
        System.out.println("Hola Mundo!");
    }

    public static int suma(int num, int num1) {
        /*
         * 2. Realiza una funcion llamada suma que sume dos numeros enteros
         * y te devuelva el resultado, posteriormente llamala desde el main y
         * muestra su resultado.
         */
        return num + num1;
    }

    public static void eco(int n) {
        /*
         * 3. Realiza un metodo llamado eco con un parametro de entrada n,
         * que al ser llamada muestre por consola el mensaje "ECO" un
         * numero n de veces.
         */
        for (int i = 0; i < n; i++) {
            System.out.println("ECO");
        }
    }

    public static void mayorOMenor(int a, int b) {
        /*
         * 4. Implementa un metodo que pidan dos numeros, determinen cual
         * es mayor y cual es menor, y muestren el resultado.
         */
        if (a > b) {
            System.out.println(a + " es mayor que b");
        } else if (b > a) {
            System.out.println(b + " es mayor que a");
        } else {
            System.out.println("Ambos numero son iguales");
        }
    }

    public static void mostrarIntermedios(int a, int b) {
        /*
         * 7. Escribe un metodo llamado mostrarIntermedios que tenga dos
         * parametros de entrada a y b (numeros enteros) y muestre todos
         * los numeros pares entre ambos numeros (a y b inclusive).
         */
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static double areaDeCirculo(int r) {
        /*
         * 8. Realiza una funcion areaCirculo que reciba un parametro r y te
         * devuelva el area de un circulo de radio r.
         * Nota: En un circulo: area = pi * r * 2
         * Nota: en Java podemos usar el numero pi con la constante de la
         * clase Math.PI.
         */
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    public static void ejercicio6() {
        /*
         * 6. Crea un metodo que valide un numero entero positivo y otro
         * que muestre su tabla de multiplicar.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();
        mostrarTabla(n);
    }

    public static boolean esPositivo(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarTabla(int n) {
        if (esPositivo(n)) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * n);
            }
        } else {
            System.out.println("No es positivo");
        }
    }

    public static void ejercicio5() {
        /*
         * 5. Crea metodos para leer una edad, clasificarla en categorias
         * (nino, adolescente, adulto, mayor) y mostrar el resultado.
         */
        int edad = leerEdad();
        mostrarResultado(edad);
    }

    public static int leerEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una edad");
        int edad = sc.nextInt();
        return edad;
    }

    public static String categoria(int edad) {
        if (edad < 12) {
            return "nino";
        } else if (edad < 18) {
            return "adolescente";
        } else if (edad < 60) {
            return "adulto";
        } else {
            return "mayor";
        }
    }

    public static void mostrarResultado(int edad) {
        System.out.println(categoria(edad));
    }

    public static void ejercicio12() {
        /*
         * 12. Implementa metodos para pedir tres notas, calcular la media,
         * obtener la calificacion textual y mostrar los resultados.
         */
        mostrarResultados();
    }

    public static double obtenerNota() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una primera nota");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce una segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Introduce una tercera nota");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static String obtenerCalificacionTextual(double media) {
        String calificacion1 = "Suspenso";
        String calificacion2 = "Aprobado";
        String calificacion3 = "Sobresaliente";
        if (media < 5) {
            return calificacion1;
        } else if (media >= 5 && media <= 8) {
            return calificacion2;
        } else {
            return calificacion3;
        }
    }

    public static void mostrarResultados() {
        System.out.println(obtenerCalificacionTextual(obtenerNota()));
    }

    public static void ejercicio10() {
        /*
         * 10. Crea una clase CalculadoraModular con metodos para sumar,
         * restar, multiplicar y dividir dos numeros. Cada operacion debe
         * ser un metodo independiente. Desde el main, pide dos numeros
         * y una operacion al usuario.
         */
    }

    public static void ejercicio37() {
        /*
         * 37. Cifrado simple.
         * Crea metodos para leer una palabra, cifrarla sustituyendo vocales por
         * el siguiente caracter, y mostrar el resultado.
         */
    }

    public static void ejercicio11() {
        /*
         * 11. Simula un inicio de sesion con tres metodos:
         *
         * validarUsuario, mostrarResultado y ejecutarPrograma.
         * El metodo main solo debe llamar a ejecutarPrograma().
         */
        ejecutarPrograma();
    }

    public static boolean validarUsuario() {
        Scanner sc = new Scanner(System.in);
        boolean usuarioValido = true;
        String usuario = "";
        System.out.println("Introduce el usuario");
        usuario = sc.nextLine();
        if (usuario.length() == 0) {
            usuarioValido = false;
            return usuarioValido;
        } else {
            return usuarioValido;
        }
    }

    public static void mostrarResultado(boolean validarUsuario) {
        if (!validarUsuario) {
            System.out.println("Error al introducir usuario");
        } else {
            System.out.println("Usuario validado con exito");
        }
    }

    public static void ejecutarPrograma() {
        mostrarResultado(validarUsuario());
    }

    public static void ejercicio9() {
        /*
         * 9. Implementa metodos para calcular el area de figuras
         * geometricas (cuadrado, rectangulo y circulo) y un metodo
         * menu() que gestione las opciones.
         */
    }

    public static double areaCuadrado(int lado) {
        double areaCuadrad = Math.pow(lado, 2);
        return areaCuadrad;
    }

    public static int areaRectangulo(int ladoLar, int ladoPeq) {
        int areaRectangulo = ladoLar * ladoPeq;
        return areaRectangulo;
    }

    public static double areaCirculo(int r) {
        double areaCirc = Math.PI * Math.pow(r, 2);
        return areaCirc;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADOR DE AREAS");
        System.out.println("--------------------------");
        System.out.println("1_Calcular area cuadrado");
        System.out.println("2_Calcular area rectangulo");
        System.out.println("3_Calcular area circulo");
        System.out.println("4_Salir");
        System.out.println("--------------------------");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Elige que area quieres calcular");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el lado");
                    int lado = sc.nextInt();
                    System.out.println(areaCuadrado(lado));
                    break;
                case 2:
                    System.out.println("Introduce el lado pequeno del rectangulo");
                    int ladoPeq = sc.nextInt();
                    System.out.println("Introduce el lado largo del rectangulo");
                    int ladoLar = sc.nextInt();
                    System.out.println(areaRectangulo(ladoLar, ladoPeq));
                    break;
                case 3:
                    System.out.println("Introduce el radio del circulo");
                    int r = sc.nextInt();
                    System.out.println(areaCirculo(r));
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    break;
            }
        }
    }

    public static void ejercicio38() {
        /*
         * 38. Sistema de menu modular.
         * Desarrolla un programa con un menu principal que llame a metodos distintos
         * segun la opcion elegida.
         */
    }

    public static void ejercicio15() {
        /*
         * 15. Realiza un metodo llamado mostrar que te muestre un array
         * bidimensional por consola.
         */
        int[][] matriz = {
                { 3, 5, 2 },
                { 4, 2, 1 } };
        mostrarArray(matriz);
    }

    public static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio16() {
        /*
         * 16. Realiza una funcion llamada busqueda que dado un array de
         * enteros y un elemento a buscar te devuelva el valor de la posicion
         * donde se encuentra el elemento a buscar en el array (una
         * cualquiera de sus apariciones).
         */

        int[] array = { 3, 4, 1, 1, 6, 2, 7, 6 };
        int valor = 6;
        busqueda(array, valor);
    }

    public static int busqueda(int[] array, int valor) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {

                return i;
            }

        }
        return -1;

    }

    public static void ejercicio17() {
        /*
         * 17. Realiza un metodo llamado sumaPorElementoM que reciba un
         * array de enteros y un entero y le sume a cada posicion del array
         * recibido el entero recibido. (Ojo, es un metodo)
         */
        int[] array = { 3, 5, 5, 7, 23, 5, 8, 7, 1 };
        int num = 8;
        sumaPorElementoM(array, num);
    }

    public static void sumaPorElementoM(int[] lista, int num) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] += num;
        }
    }

    public static void ejercicio18() {
        /*
         * 18. Realiza una funcion llamada sumaPorElementoF que reciba un
         * array de enteros y un entero y devuelva un array con el tamano
         * del array recibido y que contiene en cada posicion la suma del
         * elemento del array recibido con el entero recibido
         * (comportamiento parecido al ejercicio anterior). (Ojo, es una
         * funcion)
         */
        int[] array = { 3, 4, 6, 45, 23, 7, 11, 23, 3 };
        int num = 4;
        int[] resultado = sumaPorElementoF(array, num);

    }

    public static int[] sumaPorElementoF(int[] array, int num) {
        int[] arrayNuevo = new int[array.length];
        for (int i = 0; i < arrayNuevo.length; i++) {
            arrayNuevo[i] = array[i] + num;
        }
        return arrayNuevo;
    }

    public static void ejercicio19() {
        /*
         * 19. Trata de explicar las diferencias entre el comportamiento del
         * metodo del ejercicio 17 y de la funcion del ejercicio 18. Fijate como
         * se utilizan en el main.
         */
        /*
         * En el ejercicio 18 se ha de crear un array nuevo,dándole las dimensiones del
         * array
         * que entra por parámetro,por último,retorna algo,es decir usa return.
         * 
         * En el 17 simplemente realiza la operación.
         * Además en el 18 guardamos el resultado en un nuevo array llamado resultado,el
         * cual será la
         * llamada a la función.El 17 no necesita eso,solo la llamada
         */
    }

    public static void ejercicio20() {
        /*
         * 20. Realiza una funcion llamada negacionBooleana que reciba un
         * array de booleanos y devuelva un array de las mismas
         * dimensiones pero donde antes habia un true pasara a haber un
         * false y donde antes habia un false pasara a haber un true.
         */
        boolean[] array = { true, false, true, false, false, false, true };
        boolean[] arrayResultante = negacionBooleana(array);

    }

    public static boolean[] negacionBooleana(boolean[] lista) {
        boolean[] nuevoArray = new boolean[lista.length];
        for (int i = 0; i < nuevoArray.length; i++) {
            if (lista[i] == true) {
                nuevoArray[i] = false;
            } else {
                nuevoArray[i] = true;
            }
        }
        return nuevoArray;

    }

    public static void ejercicio22() {
        /*
         * 22. Realiza una funcion que cree un array bidimensional de char
         * 10x10 y lo inicialice poniendo en todas sus posiciones el valor '-'.
         */
        char[][] nuevaMatriz = crearMatriz();

    }

    public static char[][] crearMatriz() {
        char[][] matriz = new char[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '-';
            }
        }
        return matriz;
    }

    public static void ejercicio23() {
        /*
         * 23. Haz un metodo llamado mostrarTableroRaya que genere un
         * tablero de 10x10 donde en todas las casillas esta el caracter '-'
         * y muestre el tablero. (Nota: utiliza la funcion anterior)
         */
    }

    public static void ejercicio24() {
        /*
         * 24. Realiza una funcion copyArrayMasUno que reciba un array y
         * devuelva un array con los elementos copiados y una posicion mas
         * con el valor 0.
         */
    }

    public static void ejercicio26() {
        /*
         * 26. Realiza una funcion llamada invertirArray que reciba un array
         * de enteros y devuelva otro array con las posiciones invertidas.
         * Ejemplo:
         * entrada: [1, 3, 6, 2, 4, 1] -> salida: [1, 4, 2, 6, 3, 1]
         */
    }

    public static void ejercicio29() {
        /*
         * 29. Haz una funcion llamada desplazamiento que reciba un array
         * de char y un numero entero mayor o igual que cero, y devuelva un
         * nuevo array que sea el resultado de desplazar los elementos el
         * numero de posiciones introducido.
         * Ejemplos:
         * entrada: ['a', 'v', 't', 's', 'k'], 3 -> salida: ['t', 's', 'k', 'a', 'v']
         * entrada: ['a', 'v', 't', 's', 'k'], 0 -> salida: ['a', 'v', 't', 's', 'k']
         * entrada: ['a', 'v', 't', 's', 'k'], 1 -> salida: ['k', 'a', 'v', 't', 's']
         */
    }

    public static void ejercicio25() {
        /*
         * 25. Realiza una funcion llamada noRepetidos que reciba un array
         * de enteros que pueden estar repetidos y devuelva un nuevo array
         * sin ningun entero repetido. (Nota: usa la funcion anterior)
         * Ejemplos:
         * entrada: [1, 3, 0, 1, 3, 6, 2, 1] -> salida: [1, 3, 0, 6, 2]
         * entrada: [1, 1, 0, 1, 2, 1, 2, 1] -> salida: [1, 0, 2]
         */
    }

    public static void ejercicio21() {
        /*
         * 21. Haz una funcion llamada factorial que reciba un entero y te
         * devuelva el resultado del factorial de ese numero. Usa esa funcion
         * factorial para llamarla desde un metodo llamado factorialArray que
         * reciba un array de enteros (se presupone que mayores de 0) y
         * cambie el valor de cada posicion por la del factorial del numero
         * que contiene. (Ojo, es un metodo).
         */
    }

    public static void ejercicio27() {
        /*
         * 27. Realiza un metodo llamado ordenacionM que reciba un array
         * de enteros y un char, si el char tiene el valor 'c' realiza la
         * ordenacion creciente, si el char tiene el valor 'd' realiza la
         * ordenacion decreciente.
         * Ejemplo:
         * entrada: [2, 4, 1, 3, 9, 3, 1, 1], 'c' -> salida: [1, 1, 2, 3, 3, 4, 9]
         * entrada: [2, 4, 1, 3, 9, 3, 1, 1], 'd' -> salida: [9, 4, 3, 3, 2, 1, 1]
         */
    }

    public static void ejercicio28() {
        /*
         * 28. Realiza un metodo que dado un array de numeros enteros
         * positivos mayor o igual que 1 lo ordene segun el numero de
         * divisores que tiene cada numero.
         * Ejemplo:
         * entrada: [1, 5, 6, 17, 12] -> salida: [12, 6, 17, 5, 1]
         * Nota 1: Haz primero una funcion compararPorNumDivisores.
         * Nota 2: Realiza una funcion numDivisores.
         * Nota 3: Realiza una funcion isDivisor.
         */
    }

    public static void ejercicio30() {
        /*
         * 30. Realiza una funcion llamada sumatorioDivisoresArray que
         * realice el sumatorio de los divisores de todos los numeros de un
         * array.
         * Ejemplo:
         * entrada: [6, 5, 4] -> salida: 25
         */
    }

    public static void ejercicio31() {
        /*
         * 31. Realiza una funcion llamada subsecuenciaCrecienteMasLarga
         * que dado un array de enteros te devuelva un entero que indique la
         * posicion de inicio de la subsecuencia creciente mas larga.
         * Ejemplo:
         * entrada: [2, 4, 1, 3, 5, 8, 12, 2, 3, 2, 1, 3, 5, 7, 8]
         * salida: 2
         */
    }

    public static void ejercicio39() {
        /*
         * 39. Mini proyecto: Gestor de estudiantes modular.
         * Crea una clase GestorEstudiantes con metodos para mostrar un menu,
         * registrar estudiantes, mostrar la lista y calcular la media del grupo.
         * El metodo main solo debe llamar a menu().
         */
    }

    public static void ejercicio33() {
        /*
         * 33. Realiza un juego llamado alfil vs caballo en un tablero 8x8,
         * colocando ambas piezas aleatoriamente y permitiendo moverlas por
         * turnos hasta que una capture a la otra.
         */
    }

    public static void ejercicio35() {
        /*
         * 35. Realiza un metodo llamado generarTresXAleatorias que reciba
         * un array 8x8 de char "espacio" y un numero "cant" e introduzca
         * aleatoriamente cant veces bloques de tres X seguidas tanto
         * horizontal como verticalmente.
         */
    }

    public static void ejercicio34() {
        /*
         * 34. Realiza el juego anterior de nuevo, pero en esta ocasion,
         * habra solo un usuario que se enfrentara contra la maquina.
         */
    }

    public static void ejercicio32() {
        /*
         * 32. Crea una clase GestorEstudiantes con metodos para mostrar
         * un menu, registrar estudiantes, mostrar la lista y calcular la
         * media del grupo. El metodo main solo debe llamar a menu().
         */
    }

    public static void ejercicio36() {
        /*
         * 36. Calculos basicos modulares.
         * Crea una clase CalculadoraModular con metodos para sumar, restar,
         * multiplicar y dividir dos numeros. Cada operacion debe ser un metodo
         * independiente. Desde el main, pide dos numeros y una operacion al usuario.
         */
    }

    public static void main(String[] args) throws Exception {
        // holaMundo();
        // System.out.println(suma(3, 5));
        // eco(3);
        // mayorOMenor(4, 8);
        // mostrarIntermedios(2, 10);
        // System.out.println(areaDeCirculo(5));
        // ejercicio6();
        // ejercicio5();
        // ejercicio12();
        // ejercicio10();
        // ejercicio37();
        // ejercicio11();
        // menu();
        // ejercicio38();
        // ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();
        // ejercicio26();
        // ejercicio29();
        // ejercicio25();
        // ejercicio21();
        // ejercicio27();
        // ejercicio28();
        // ejercicio30();
        // ejercicio31();
        // ejercicio39();
        // ejercicio33();
        // ejercicio35();
        // ejercicio34();
        // ejercicio32();
        // ejercicio36();
    }
}
