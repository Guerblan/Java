# Manual del Programador — Cuatro en Raya (versión consola)

## 1. Introducción

Este documento describe la estructura interna y el funcionamiento del proyecto **Cuatro en Raya** desarrollado en Java, con una arquitectura basada en el patrón **Modelo–Vista–Controlador (MVC)**.

El objetivo de este manual es permitir que cualquier desarrollador pueda:
- Entender cómo está organizado el código.
- Localizar rápidamente cada componente.
- Continuar trabajando sobre el proyecto manteniendo la estructura existente.

---

## 2. Arquitectura general (MVC)

El proyecto está dividido en tres capas principales:

- **Modelo (`modelo.Tablero`)**  
  Contiene el estado del tablero (matriz de casillas) y la lógica del juego:
  - Colocar fichas en una columna.
  - Comprobar si un jugador ha ganado.
  - Comprobar si el tablero está lleno (empate).

- **Vista (`vista.VistaConsola`)**  
  Se encarga exclusivamente de mostrar información por consola:
  - Menú principal.
  - Tablero del juego.
  - Instrucciones.
  - Créditos.
  
  *No* decide reglas del juego, *no* controla turnos y *no* gestiona lógica: solo recibe datos y los muestra.

- **Controlador (`controlador.Controlador`)**  
  Coordina el funcionamiento general del juego:
  - Gestiona el menú y la selección de opciones.
  - Lee la entrada del usuario desde teclado (mediante `Scanner`).
  - Usa el modelo para actualizar el tablero.
  - Usa la vista para mostrar el estado del juego.
  - Gestiona los dos modos disponibles: jugador contra jugador y jugador contra la máquina.  
    En el modo contra la máquina, esta realiza sus jugadas generando columnas aleatorias válidas.

El punto de entrada del programa es la clase **`Main`**, que crea una instancia de `Controlador` y llama a su método `iniciar()`, comenzando la aplicación.

---

## 3. Diagrama de clases (texto)

A continuación se muestra la relación entre las clases según la estructura actual del proyecto:


**Descripción del diagrama:**
- **Main**: inicia el programa creando el `Controlador`.
- **Controlador**: coordina el flujo, recibe entradas y organiza la partida.
- **Tablero**: almacena y gestiona el estado del juego (matriz y reglas internas).
- **VistaConsola**: muestra la interfaz por consola, sin tomar decisiones de lógica.
- **Scanner**: se utiliza para leer la entrada de datos (columna deseada, opciones de menú, etc.).

Este diagrama representa cómo están conectadas las clases entre sí sin necesidad de herramientas externas o gráficos, facilitando su comprensión directa.


## 4. Flujo de ejecución del programa

A continuación se describe el flujo del programa desde que se inicia hasta que termina una partida, basado únicamente en el funcionamiento actual:

1. **Inicio**
   - Se ejecuta `Main`.
   - `Main` crea una instancia de `Controlador`.
   - Se llama al método `iniciar()` del `Controlador`.

2. **Menú principal**
   - El controlador muestra el menú mediante `VistaConsola`.
   - El usuario introduce una opción mediante teclado (`Scanner`).
   - El controlador interpreta la opción:
     - `1` → Modo jugador contra jugador.
     - `2` → Modo jugador contra máquina.
     - `3` → Mostrar instrucciones.
     - `4` → Mostrar créditos.
     - `0` → Salir de la aplicación.

3. **Inicio de partida**
   - Se crea un objeto `Tablero` si no estaba creado.
   - Se muestra el tablero inicial vacío por consola.
   - Se establece el turno inicial en `'X'`.

4. **Ciclo de juego**
   - Mientras no haya ganador ni empate:
     1. Se muestra el tablero actualizado.
     2. Se muestra un mensaje indicando de quién es el turno.
     3. El jugador (o la máquina en modo IA) elige una columna:
        - En modo IA, se genera una columna aleatoria válida.
     4. El controlador llama a `tablero.colocarFicha()` con la columna elegida.
     5. Se comprueba si la jugada genera victoria llamando a `tablero.hayGanador()`.
     6. Si no hay victoria, se comprueba si el tablero está lleno.
     7. Si no hay empate, se cambia el turno (de `'X'` a `'O'` o viceversa).

5. **Final de partida**
   - Si hay ganador: el controlador muestra un mensaje indicando quién ganó.
   - Si hay empate: el controlador muestra el mensaje correspondiente.
   - El programa regresa al menú principal sin reiniciar la aplicación.

---

## 5. Documentación de las clases

### 5.1. Clase `Main`

**Ubicación:** raíz del proyecto  
**Responsabilidad principal:** punto de entrada de la aplicación.

**Comportamiento actual:**
- Contiene el método `main(String[] args)`.
- Crea una instancia de `Controlador`.
- Llama al método `iniciar()` para arrancar el programa.

---

### 5.2. Clase `controlador.Controlador`

**Responsabilidad principal:** gestionar el flujo del programa.

**Tareas que realiza:**
- Mostrar el menú principal mediante la vista.
- Leer entradas del usuario con `Scanner`.
- Indicar a `Tablero` dónde colocar fichas.
- Llamar a la vista para mostrar el tablero e información del juego.
- Gestionar los dos modos disponibles:
  - Jugador contra jugador.
  - Jugador contra máquina (columnas aleatorias válidas).

**Métodos relevantes:**
- `iniciar()` → organiza el flujo principal del programa.
- Métodos internos para leer opciones, validar entrada y alternar turnos.

**Datos que gestiona:**
- Instancia de `Tablero`.
- Instancia de `VistaConsola`.
- Instancia de `Scanner`.
- Variable de turno (`'X'` o `'O'`).
- Variable para controlar el modo de juego.

---

### 5.3. Clase `modelo.Tablero`

**Responsabilidad principal:** mantener y modificar el estado del juego.

**Estructura interna:**
- Matriz `char[][] casillas` de tamaño **6x7**.
  - `'X'` → jugador 1
  - `'O'` → jugador 2 o máquina
  - `' '` → casilla vacía

**Métodos principales:**
- `colocarFicha(int columna, char ficha)`
  - Busca la primera posición libre desde abajo.
  - Inserta la ficha si es posible.
  - Devuelve `true` si la inserción fue correcta; `false` si la columna está llena.
- `hayGanador(char ficha)`
  - Comprueba si esa ficha tiene 4 en raya: horizontal, vertical o diagonal.
- `getCasilla(int fila, int columna)`
  - Devuelve el contenido de una casilla concreta.
  
---

### 5.4. Clase `vista.VistaConsola`

**Responsabilidad principal:** mostrar la información en pantalla.

**Tareas que realiza:**
- Mostrar el tablero en formato texto.
- Mostrar el menú principal.
- Mostrar instrucciones y créditos.
- Mostrar mensajes relacionados con la partida.

**Limitaciones intencionales:**
- No gestiona entradas del usuario.
- No evalúa jugadas.
- No decide reglas ni condiciones de victoria.

---

## 6. Compilación y ejecución

A continuación se muestra cómo compilar y ejecutar el proyecto desde consola usando el JDK:

### 6.1. Compilación
Ubicarse en la carpeta donde está el código fuente y ejecutar:

```bash
javac Main.java

6.2. Ejecución
java Main
