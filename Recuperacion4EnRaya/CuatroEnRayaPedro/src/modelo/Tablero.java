package modelo;

public class Tablero {
    private char[][] casillas;

    // Crea un tablero de 'filas x columnas' e inicializa todas las casillas vacías
    public Tablero(int filas, int columnas) {
        casillas = new char[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                casillas[f][c] = ' ';// espacio en blanco = casilla libre
            }
        }
    }

    public boolean colocarFicha(int columna, char ficha) {

        for (int fila = casillas.length - 1; fila >= 0; fila--) {
            if (casillas[fila][columna] == ' ') {
                casillas[fila][columna] = ficha;
                return true;
            }
        }
        return false;
    }

    public char getCasilla(int fila, int columna) {
        return casillas[fila][columna];
    }

    // Comprueba si la ficha tiene 4 seguidos
    public boolean hayGanador(char ficha) {

        int filas = casillas.length;
        int columnas = casillas[0].length;
        // Horizontal
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas - 3; c++) {
                if (casillas[f][c] == ficha &&
                        casillas[f][c + 1] == ficha &&
                        casillas[f][c + 2] == ficha &&
                        casillas[f][c + 3] == ficha) {
                    return true;
                }
            }
        }
        // Vertical
        for (int f = 0; f < filas - 3; f++) {
            for (int c = 0; c < columnas; c++) {
                if (casillas[f][c] == ficha &&
                        casillas[f + 1][c] == ficha &&
                        casillas[f + 2][c] == ficha &&
                        casillas[f + 3][c] == ficha) {
                    return true;
                }
            }
        }
        // Diagonal
        for (int f = 0; f < filas - 3; f++) {
            for (int c = 0; c < columnas - 3; c++) {
                if (casillas[f][c] == ficha &&
                        casillas[f + 1][c + 1] == ficha &&
                        casillas[f + 2][c + 2] == ficha &&
                        casillas[f + 3][c + 3] == ficha) {
                    return true;
                }
            }
        }

        for (int f = 3; f < filas; f++) {
            for (int c = 0; c < columnas - 3; c++) {
                if (casillas[f][c] == ficha &&
                        casillas[f - 1][c + 1] == ficha &&
                        casillas[f - 2][c + 2] == ficha &&
                        casillas[f - 3][c + 3] == ficha) {
                    return true;
                }
            }
        }

        return false;
    }

}
