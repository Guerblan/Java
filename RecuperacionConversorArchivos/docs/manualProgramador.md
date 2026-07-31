Manual del Programador – Conversor CSV / JSON / XML

1. Resumen del proyecto
Programa en Java que convierte ficheros entre CSV, JSON y XML desde la consola.
La organización del proyecto es parecida a MVC, pero en plan básico para tener cada cosa en su sitio.

2. Estructura del proyecto
Dentro de src tengo las carpetas:

/controlador → controla el menú y lo que pasa en el programa
/modelo → carga/guarda los datos y trabaja con los ficheros
/vista → muestra cosas por consola y lee lo que escribe el usuario

App.java → archivo principal que arranca el programa

3. Funcionamiento (resumen)
- El usuario elige opciones del menú.
- El Controlador responde según la opción.
- GestorArchivos trabaja con rutas y archivos.
- GestorDatos es el que lee/convierte los datos.
- VistaConsola se encarga de pedir datos y mostrar mensajes.

4. Explicación de las clases (en breve)
App.java → inicia el programa creando el Controlador.

Controlador.java → aquí está el menú y las llamadas al resto de clases. No convierte nada, solo organiza.

GestorArchivos.java → comprueba si la carpeta y los archivos existen y devuelve rutas listas para usar.

GestorDatos.java → lee el fichero (csv, json o xml), lo guarda en memoria y lo exporta al formato elegido.

VistaConsola.java → pide al usuario rutas, nombres y formatos y muestra lo que va pasando.

5. Tipos de datos
- List<String> → para las cabeceras
- List<List<String>> → para los registros
- Path → para las rutas de los ficheros

6. Flujos principales (lo básico)
Leer fichero:
1) Seleccionar carpeta
2) Escribir el nombre del fichero
3) El programa detecta si es csv/json/xml y lo carga

Convertir fichero:
1) Elegir a qué formato pasar
2) Escribir nombre del archivo nuevo
3) Se guarda en la misma carpeta

7. Errores más típicos
“Carpeta no válida” → ruta mal escrita o no existe
“El fichero no existe” → el nombre no coincide con la carpeta
“No hay datos” → se intenta convertir sin haber leído antes
“Formato no válido” → no es csv, json o xml

8. Ejecución rápida
Desde la carpeta del proyecto:

javac -encoding UTF-8 -d bin src\App.java
cd bin
java App

(esto compila y arranca el programa)
