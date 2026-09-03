package vista;

import modelo.Tablero;

public class VistaConsola {

    public void mostrar(Tablero tablero) {
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 7; c++) {
                System.out.print("| " + tablero.getCasilla(f, c) + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public void mostrarMenu() {
        System.out.println("===== CUATRO EN RAYA =====");
        System.out.println("1. Jugar contra un amigo");
        System.out.println("2. Jugar contra la máquina");
        System.out.println("3. Instrucciones");
        System.out.println("4. Créditos");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    public void mostrarCreditos() {
        System.out.println("=== CRÉDITOS ===");
        System.out.println("Programado por: Pedro Guerrero Blanco");
        System.out.println("1º DAM - 2026");
        System.out.println("Gracias por jugar :)");
        System.out.println();
    }

    public void mostrarInstrucciones() {
        System.out.println("===== INSTRUCCIONES =====");
        System.out.println(" Cada jugador coloca una ficha por turno.");
        System.out.println(" El objetivo es conectar 4 fichas propias seguidas.");
        System.out.println(" Puede ser en horizontal, vertical o diagonal.");
        System.out.println(" Para jugar, escribe el número de la columna (0 a 6).");
        System.out.println(" Si la columna está llena, deberás elegir otra.");
        System.out.println(" En modo IA, la máquina jugará automáticamente.");
        System.out.println();
        System.out.println("Pulsa ENTER para volver al menú...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

}
