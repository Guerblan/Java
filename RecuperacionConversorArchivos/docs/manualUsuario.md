Manual de Usuario – Conversor CSV / JSON / XML

1. ¿Para qué sirve?
Es un programa en Java que permite convertir ficheros entre CSV, JSON y XML
desde la consola. Se elige una carpeta, se carga un fichero y se pasa al formato
que quieras.

2. Antes de usarlo
- Tener Java instalado
- Tener los archivos preparados en una carpeta
- Saber la ruta de esa carpeta (por ejemplo: C:\Users\Usuario\Desktop\ConversionPruebas)

3. Cómo se abre
Abrir la consola en la carpeta del proyecto y escribir:

java App

4. Menú principal
Cuando arranca se ven estas opciones:

1. Seleccionar carpeta
2. Leer fichero
3. Convertir fichero
4. Salir

Se escribe el número de la opción y se pulsa ENTER.

5. Qué hace cada opción

Opción 1: Seleccionar carpeta
Pides al programa que apunte a la carpeta donde están los archivos. Si la ruta es correcta,
muestra lo que hay dentro.

Opción 2: Leer fichero
Hay que escribir el nombre del fichero con su extensión. Por ejemplo:
test.csv
personas.json
clientes.xml

Si lo encuentra, lo carga en memoria y te indica que se ha leído bien.

Opción 3: Convertir fichero
Primero pide el formato de destino (csv, json o xml)
y luego el nombre para el fichero nuevo (sin la extensión).
El archivo convertido aparece en la misma carpeta que elegiste antes.

Opción 4: Salir
Termina el programa.

6. Mensajes típicos y qué significan

"Carpeta no válida"
  → La ruta escrita no existe o está mal escrita

"El fichero no existe"
  → El nombre no coincide con ningún archivo dentro de la carpeta seleccionada

"Primero debes leer un fichero"
  → Hace falta usar antes la opción 2

"Formato no válido"
  → Solo admite csv, json o xml como destino

7. Ejemplo rápido de uso

1. Seleccionar carpeta
   C:\Users\Usuario\Desktop\ConversionPruebas

2. Leer fichero
   test.csv

3. Convertir fichero
   json
   salida   (crea salida.json en esa carpeta)

4. Salir
