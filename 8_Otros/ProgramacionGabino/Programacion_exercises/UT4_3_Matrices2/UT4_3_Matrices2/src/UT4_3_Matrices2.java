import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class UT4_3_Matrices2 {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        String opciones = "\nOpción 1 - AleatoriosNoRepetidos\n" +
                "Opción 2 - Kilometros\n" +
                "Opción 3 - Articulos\n" +
                "Opción 4 - Quiniela\n";
        int opcion;
        boolean salir = true;
        do {
            System.out.println("\n" + opciones);
            System.out.print("\nElige una opción:");
            opcion = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (opcion) {
                case 1 -> AleatoriosNoRepetidos();
                case 2 -> Kilometros();
                case 3 -> Articulos();
                case 4 -> Quiniela();
                default -> {
                    salir = false;
                    sc.close();
                }
            }
        } while (salir);
    }

    /*
     * Ejercicio 1
     * 
     * Generar un arreglo con números aleatorios no repetidos entre sí.
     */
    public static void AleatoriosNoRepetidos() {
        int size = 5;
        int[] aleatorios = new int[size];
        boolean flag = true;
        int contador = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            do {
                flag = true;
                aleatorios[i] = random.nextInt(size) + 1;
                for (int j = 0; j < i && flag; j++) {
                    if (aleatorios[i] == aleatorios[j]) {
                        flag = false;
                        contador++;
                    }
                }
            } while (!flag);
        }
        System.out.println(Arrays.toString(aleatorios)
                + "\nSe ha repetido " + contador + " veces");
    }

    /*
     * Ejercicio 2
     * 
     * De una empresa de transporte se quiere guardar el nombre de los conductores
     * que tiene, y los kilómetros que conducen cada día de la semana.
     * 
     * Para guardar esta información se van a utilizar dos arreglos:
     * 
     * Nombre: Vector para guardar los nombres de los conductores.
     * 
     * kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
     * 
     * Se quiere generar un nuevo vector (“totalKms”) con los kilómetros totales que
     * realiza cada conductor.
     * 
     * Al finalizar se muestra la lista con los nombres de conductores y los
     * kilómetros que han realizado.
     */
    public static void Kilometros() {
        System.out.print("\n¿Cuantos empleados quieres guardar? ");
        int num = Integer.parseInt(sc.nextLine());
        String[] nombres = new String[num];
        int[][] km = new int[num][7];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Empleado " + (i + 1);
        }
        int[] kmTotal = new int[num];
        for (int i = 0; i < km.length; i++) {
            for (int j = 0; j < km[0].length; j++) {
                km[i][j] = random.nextInt(50);
                kmTotal[i] += km[i][j];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print("\n" + nombres[i] + " ha realizado un total de " + kmTotal[i] + " km"
                    + "\nKm realizados: ");
            for (int j = 0; j < km[0].length; j++) {
                System.out.print(km[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 3
     * 
     * Crear un programa que lea los precios de 5 artículos y las cantidades
     * vendidas por una empresa en sus 4 sucursales. Informar:
     * 
     * Las cantidades totales de cada artículo.
     * 
     * La cantidad de artículos en la sucursal 2.
     * 
     * La cantidad del artículo 3 en la sucursal 1.
     * 
     * La recaudación total de cada sucursal.
     * 
     * La recaudación total de la empresa.
     * 
     * La sucursal de mayor recaudación.
     */
    public static void Articulos() {
        int[] precios = { 1, 2, 3, 4, 5 }; // Precios predefinidos
        int[][] cantidades = new int[5][4];
        int[] cantidadesPorProducto = new int[5];
        int artSucursal2 = 0;
        int[] recaudacionSucursal = new int[4];
        // Rellenar con randoms de 0 a 10
        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 0; j < cantidades[0].length; j++) {
                cantidades[i][j] = random.nextInt(11);
            }
            System.out.println("Producto " + (i + 1) + ": " + Arrays.toString(cantidades[i]) + " Precio por unidad = "
                    + precios[i] + " euro");
        }
        System.out.println("\nCantidad total por artículo:");
        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 0; j < cantidades[0].length; j++) {
                cantidadesPorProducto[i] += cantidades[i][j]; // Sumar cantidades de un mismo producto i en cada
                                                              // sucursal j
                if (j == 1) { // Sumar solo articulos de la sucursal 2
                    artSucursal2 += cantidades[i][j];
                }
                recaudacionSucursal[j] += cantidades[i][j] * precios[i]; // Asignar recaudacion a cada sucursal
            }
            System.out.println("Producto " + (i + 1) + ": " + cantidadesPorProducto[i] + " unidades.");
        }
        System.out.println("\nCantidad de artículos en la sucursal 2: " + artSucursal2 + " unidades");
        // Busqueda especifica dentro de la matriz
        System.out.println("Se han vendido " + cantidades[2][0] + " unidades del artículo 3 en la sucursal 1");
        int recaudacionMax = (int) Float.MIN_VALUE; // Asignar valor min y transformar en int
        int sucursalMax = 5;
        int recaudacionTotal = 0;
        for (int i = 0; i < recaudacionSucursal.length; i++) {
            System.out.println("La sucursal " + (i + 1) + " ha recaudado " + recaudacionSucursal[i] + " euro");
            // Buscar sucursal con mas recaudacion
            if (recaudacionMax < recaudacionSucursal[i]) {
                recaudacionMax = recaudacionSucursal[i];
                sucursalMax = i;
            }
            recaudacionTotal += recaudacionSucursal[i];
        }
        System.out.println("La recaudación total de la empresa ha sido: " + recaudacionTotal + " euro");
        System.out.println("La sucursal que más ha recaudado ha sido la sucursal " + (sucursalMax + 1));
    }

    /*
     * Ejercicio 4
     * 
     * Crear un programa de ordenador para gestionar los resultados de la quiniela
     * de fútbol. Para ello vamos a utilizar dos tablas:
     * 
     * Equipos: Que es una tabla de cadenas donde guardamos en cada columna el
     * nombre de los equipos de cada partido. En la quiniela se indican 15 partidos.
     * 
     * Resultados: Es una tabla de enteros donde se indica el resultado. También
     * tiene dos columnas, en la primera se guarda el número de goles del equipo que
     * está guardado en la primera columna de la tabla anterior, y en la segunda los
     * goles del otro equipo.
     * 
     * El programa irá pidiendo los nombres de los equipos de cada partido y el
     * resultado del partido, a continuación se imprimirá la quiniela de esa
     * jornada.
     */
    public static void Quiniela() {
        int partidos = 15;
        boolean repeat;
        int [][] teams = new int[partidos][2];
        int [][] resultados = new int[partidos][2];
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[0].length; j++) {
                do{
                    repeat = false;
                    teams[i][j] = random.nextInt(30)+1;
                    for (int i2 = 0; i2 <= i && !repeat; i2++) {
                        for (int j2 = 0; j2 < teams[0].length && !(i2==i && j2==j) && !repeat; j2++) {
                            if (teams[i][j]==teams[i2][j2]) {
                                repeat = true;
                            }
                        }
                    }
                }while(repeat);
                /*repetido:
                do{
                    repeat=false;
                    teams[i][j] = random.nextInt(30)+1;
                    for (int i2 = 0; i2 <= i; i2++) {
                        for (int j2 = 0; j2 < teams[0].length; j2++) {
                            if (i2==i && j2==i) {
                                break repetido;
                            }
                            if (teams[i][j]==teams[i2][j2]) {
                                continue repetido;
                            }
                        }
                    }
                }while(repeat);*/

                resultados[i][j] = random.nextInt(6);
            }
            System.out.println("Partido "+(i+1)+":"
            +"\tEquipo "+teams[i][0]+"\tVS\tEquipo "+teams[i][1]
            +"\tResultado = "+resultados[i][0]+" - "+resultados[i][1]);
        }
    }
}
