// Ejercicios redistribuidos desde Modularidad.java

class FuncionesAlto {

public static void ejercicio18() {
        /*
         * 18. Realiza una función llamada invertirArray que reciba un array
         * de enteros y devuelva otro array con las posiciones invertidas:
         * Ejemplos:
         * entrada: [1, 3, 6, 2, 4, 1] → salida: [1, 4, 2, 6, 3, 1]
         */
    }

public static void ejercicio19() {
        /*
         * 19. Realiza un método llamado ordenacionM que reciba un array
         * de enteros y un char, si el char tiene el valor ‘c’ realiza la
         * ordenación creciente, si el char tiene el valor ‘d’ realiza la
         * ordenación decreciente.
         * Ejemplo:
         * entrada: [2, 4, 1, 3, 9, 3, 1, 1], ‘c’ → salida: [1, 1, 2, 3, 3, 4, 9]
         * entrada: [2, 4, 1, 3, 9, 3, 1, 1], ‘d’ → salida: [9, 4, 3, 3, 2, 1, 1]
         */
    }

public static void ejercicio20() {
        /*
         * 20. Realiza una método que dado un array de números enteros
         * positivos mayor o igual que 1 (naturales) lo ordene según el
         * número de divisores que tiene cada número.
         * Ejemplo:el número 6 (tiene cuatro divisores: 1, 2, 3, 6), el número
         * 12 (tiene seis divisores: 1, 2, 3, 4, 6, 12), el número 17 (tiene dos
         * divisores: 1, 17), el número 5 (tiene dos divisores: 1 y 5). Por lo
         * tanto su orden sería:
         * entrada: [1, 5, 6, 17, 12] → salida: [12, 6, 17, 5, 1] (También podría
         * ir el 5 antes que el 17 puesto que tienen el mismo número de
         * divisores)
         * NOTA1: Haz primero una función compararPorNumDivisores que
         * reciba dos números enteros mayores o iguales que uno y los
         * compare de tal forma que:
         * si el primero tiene más divisores que el segundo la salida sea 1
         * si el segundo tiene más divisores que el primero la salida sea -1
         * si tienen ambos el mismo número de divisores la salida sea 0
         * NOTA2: Realiza una función numDivisores que reciba un número
         * entero mayor o igual que 1 y devuelva el número de divisores que
         * tiene ese número.
         * Ejemplo:
         * entrada: 1 → salida: 1
         * entrada 12 → salida: 6
         * entrada 5 → salida: 2
         * NOTA3: Realiza una función isDivisor que reciba dos números
         * enteros mayores o iguales que uno y devuelva si el segundo es
         * divisor del primero (true) o si no es divisor (false).
         * Ejemplo:
         * entrada: 12, 5 → salida: false
         * entrada 12, 6 → salida: true
         * entrada 5, 5 → salida: true
         */
    }

public static void ejercicio21() {
        /*
         * 21. Haz una función llamada desplazamiento que reciba un array
         * de char y un número entero mayor o igual que cero, y devuelva un
         * nuevo array que sea el resultado de desplazar los elementos el
         * número de posiciones introducido. Se consideran las posiciones
         * ciclicas, por ejemplo, si el array tiene tamaño 4 y el elemento de la
         * posición 3 debe desplazarse 2 posiciones, la nueva posición será
         * 1.
         * ejemplo:
         * entrada: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’], 3 → salida: [‘t’, ‘s’, ‘k’, ‘a’, ‘v’]
         * entrada: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’], 0 → salida: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’]
         * entrada: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’], 1 → salida: [ ‘k’, ‘a’, ‘v’, ‘t’, ‘s’]
         */
    }

public static void ejercicio22() {
        /*
         * 22. Realiza una función llamada sumatorioDivisoresArray que
         * realice el sumatorio de los divisores de todos los números de un
         * array.
         * Ejemplo:
         * entrada: [6, 5, 4] → salida: 25
         * seis tiene de divisores a 1, 2, 3 y 6
         * cinco tiene de divisores a 1 y 5
         * cuatro tiene de divisores a 1, 2 y 4
         * la suma total de todos los divisores de los números del array es:
         * (1+2+3+6)+(1+5)+(1+2+4) = 12+6+7 = 25
         */
    }

public static void ejercicio23() {
        /*
         * 23. Realiza una función llamada subsecuenciaCrecienteMasLarga
         * que dado un array de enteros te devuelva un entero que indique la
         * posición de inicio de la subsecuencia creciente más larga. En caso
         * de empate devuelve cualquiera de las posiciones de inicio de
         * ellas.
         * Ejemplo:
         * entrada: [2, 4, 1, 3, 5, 8, 12, 2, 3, 2, 1, 3, 5, 7, 8]
         * salida: 2
         * (La subsecuencia de enteros más larga en este caso es la que
         * comienza en la posición 2, y está formada por 1, 3, 5, 8, 12)
         */
    }

public static void ejercicio24() {
        /*
         * 24. Realiza un juego llamado alfil vs caballo, se juega en un tablero
         * 8x8 de casillas blancas □ (\u25A0) y casillas negras ■ (\u25A1)
         * semejante al ajedrez, se situarán de forma aleatoria las piezas
         * caballo ♞ (\u265E) y alfil ♗ (\u2657), teniendo en cuenta que
         * no estén en la misma casilla. Tras esto, el programa mostrará el
         * tablero con las piezas colocadas y dejará mover (le pedirá las
         * coordenadas por consola) al usuario1 y al usuario2 mostrando tras
         * cada movimiento el tablero con la nueva posición de las piezas. Si
         * alguno de los usuarios mete alguna coordenada incorrecta el
         * programa deberá avisarle y volverá a pedírsela. El juego acaba
         * cuando alguno de los dos usuarios se coma al otro. Es
         * conveniente que el tablero se muestre a los usuarios con las
         * columnas y filas numeradas con letras y números como en el
         * ejercicio 15.
         */
    }

public static void ejercicio25() {
        /*
         * 25. Realiza el juego anterior de nuevo, pero en esta ocasión, en
         * vez de dos usuarios enfrentándose, habrá solo uno, que se
         * enfrentará contra la máquina. La máquina seguirá el siguiente
         * algoritmo: si la pieza del usuario está en una posición donde
         * pueda comerla, se la comerá; si la pieza del usuario no está en
         * una posición comible se moverá a alguna otra posición
         * aleatoriamente que no pueda ser comida por el usuario en el
         * siguiente turno.
         */
    }

public static void ejercicio26() {
        /*
         * 26. Realiza un método llamado generarTresXAleatorias que reciba
         * un array 8x8 de char “espacio” y un número “cant” e introduzca
         * aleatoriamente cant veces bloques de tres X seguidas tanto
         * horizontal como verticalmente (de forma aleatoria). Las X no
         * podrán estar en la misma posición que otros bloques y tendrá que
         * dejarse un espacio tanto vertical como horizontalmente (no
         * diagonalmente) respecto a otros bloques de X. En las otras
         * casillas habrá rayas (-). Finalmente el programa deberá mostrar
         * por pantalla el tablero que ha generado el método.
         * 
         * ejemplo:para una entrada espacio= new char [8][8],cant=4,una posibe
         * salida sería:
         * (aquí vendría una imagen que está en el moodle)
         */
    }

}
