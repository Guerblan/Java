Manual de Usuario — Cuatro en Raya


1. Descripción
Este programa permite jugar al clásico Cuatro en Raya desde la consola.
Objetivo del juego: conseguir 4 fichas consecutivas en línea horizontal, vertical o diagonal antes que el rival.
El tablero es de 6 filas x 7 columnas.


2. Requisitos del sistema
Sistema operativo con soporte para Java (Windows, Linux, macOS).
Java 20 o superior instalado.


3. Ejecución del programa
Abrir terminal dentro de la carpeta del proyecto y ejecutar:
java Main


4. Menú principal
Al iniciar, aparece el siguiente menú:
CUATRO EN RAYA

1. Jugar contra un amigo
2. Jugar contra la máquina
3. Instrucciones
4. Créditos
0. Salir

Elige una opción:
Opción	Función
1	    Partida entre dos jugadores humanos
2	    Partida contra la IA (máquina con jugadas aleatorias)
3	    Muestra instrucciones del juego
4	    Muestra créditos
0	    Salir del programa


5. Desarrollo de la partida
5.1. Turnos
Jugador 1: ficha 'X'
Jugador 2 o IA: ficha 'O'
Siempre empieza 'X'

5.2. Cómo colocar una ficha
En tu turno, escribe el número de columna (0 a 6) y presiona ENTER:
Turno de X (Jugador 1). Elige columna (0-6)

5.3. Representación del tablero

Ejemplo:

|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   | X |   |   |   |
|   | O |   | X |   |   |   |
| X | O | X | O |   |   |   |


6. Posibles avisos de error
Situación	                Mensaje mostrado	                             Acción del usuario
Entrada no numérica	        Entrada no válida. Debes escribir un número.	 Introducir un número
Valor fuera del rango 0-6	Columna fuera de rango. Debe ser entre 0 y 6.	 Escribir un número entre 0 y 6
Columna llena	            Columna llena o inválida. Prueba de nuevo.	     Elegir otra columna


7. Finalización de la partida
7.1. Victoria
El programa reconoce automáticamente cuando un jugador gana:
Ha ganado X

7.2. Empate
Si el tablero se llena sin ganador:
Empate. No hay más movimientos posibles.
Al terminar una partida, se vuelve al menú principal.


8. Créditos
Muestra la autoría del proyecto según lo programado en el menú.


9. Resumen rápido
Acción	Entrada
Modo dos jugadores	1
Modo vs IA	2
Ver instrucciones	3
Ver créditos	4
Salir	0
Colocar ficha	0 a 6