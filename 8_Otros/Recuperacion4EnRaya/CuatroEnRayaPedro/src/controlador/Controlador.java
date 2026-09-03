package controlador;

import modelo.Tablero;
import vista.VistaConsola;
import java.util.Scanner;

public class Controlador {
    // Colores para distinguir Jugador 1, Jugador 2 e IA en la consola
    private static final String RESET = "\u001B[0m";
    private static final String AMARILLO = "\u001B[33m";
    private static final String VERDE = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";

    private Tablero tablero;
    private VistaConsola vista;
    private Scanner entrada;

    private int modoJuego;

    // Constructor: prepara todo lo necesario para empezar el juego
    public Controlador() {
        entrada = new Scanner(System.in);

        tablero = new Tablero(6, 7);
        vista = new VistaConsola();
    }

    // menú principal + partida
    public void iniciar() {
        boolean jugando = true;
        char turno = 'X';
        // MENÚ PRINCIPAL
        while (true) {
            vista.mostrarMenu();

            if (!entrada.hasNextInt()) {
                System.out.println("Entrada no válida. Debes escribir un número.");
                entrada.next();
                continue;
            }

            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del juego...");
                return;
            }

            if (opcion == 1 || opcion == 2) {
                modoJuego = opcion;
                break;
            }
            if (opcion == 3) {
                vista.mostrarInstrucciones();
                continue;
            }

            if (opcion == 4) {
                vista.mostrarCreditos();
                continue;
            }

            System.out.println("Opción no válida. Debes elegir 0, 1 o 2.");
        }
        // BUCLE DE PARTIDA
        while (jugando) {

            vista.mostrar(tablero);
            // Mensaje de turno con color según quién juega
            if (modoJuego == 2 && turno == 'O') {
                System.out.print(CYAN + "Turno de O (máquina). Elige columna (0-6): " + RESET);
            } else if (turno == 'X') {
                System.out.print(AMARILLO + "Turno de X (Jugador 1). Elige columna (0-6): " + RESET);
            } else {
                System.out.print(VERDE + "Turno de O (Jugador 2). Elige columna (0-6): " + RESET);
            }
            // Turno de la IA: elige columna aleatoria válida y salta lectura por teclado
            if (modoJuego == 2 && turno == 'O') {
                int columnaIA;
                do {
                    columnaIA = (int) (Math.random() * 7); // 0-6
                } while (!tablero.colocarFicha(columnaIA, turno));

                System.out.println("La máquina ha jugado en la columna " + columnaIA);
                turno = 'X';
                continue;
            }

            if (!entrada.hasNextInt()) {
                System.out.println("Entrada no válida. Debes escribir un número.");
                entrada.next();
                continue;
            }

            int columna = entrada.nextInt();

            if (columna < 0 || columna > 6) {
                System.out.println("Columna fuera de rango. Debe ser entre 0 y 6.");
                continue;
            }

            if (tablero.colocarFicha(columna, turno)) {

                turno = (turno == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Columna llena o inválida. Prueba de nuevo.");
            }

            char ultimaFicha = (turno == 'O') ? 'X' : 'O';
            if (tablero.hayGanador(ultimaFicha)) {
                vista.mostrar(tablero);
                System.out.println("Ha ganado " + ultimaFicha + "!");
                break;
            }

            boolean tableroLleno = true;
            for (int f = 0; f < 6; f++) {
                for (int c = 0; c < 7; c++) {
                    if (tablero.getCasilla(f, c) == ' ') {
                        tableroLleno = false;
                        break;
                    }
                }
                if (!tableroLleno) {
                    break;
                }
            }
            if (tableroLleno) {
                vista.mostrar(tablero);
                System.out.println("Empate. No hay más movimientos posibles.");
                break;
            }
        }
    }

}
