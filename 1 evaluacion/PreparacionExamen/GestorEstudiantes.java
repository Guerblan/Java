/*
Ejercicio 10. Mini proyecto: Gestor de estudiantes modular
Crea una clase GestorEstudiantes con métodos para mostrar un menú, registrar estudiantes,
mostrar la lista y calcular la media del grupo. El método main solo debe llamar a menu().
🎯 Objetivo: Simular un programa completo con responsabilidades bien divididas y un flujo
modular.
*/

import java.util.Scanner;

public class GestorEstudiantes {
    static int estudiantes[] = new int[20];

    static double notas[] = new double[20];

    static int contador = 0;

    // método menú
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String menu = "Elige una opción\n" + "1. Registar estudiantes\n" + "2. Mostrar lista estudiantes\n"
                + "3. Calcular media grupo\n" + "4. Salir";

        int opcion = 0;
        while (opcion != 4) {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    registrarEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    calcularMedia();
                    break;
                case 4:

                    break;
                default:
                    break;
            }
        }
    }

    // método registrar estudiantes
    public static void registrarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número identificador del estudiante que quieres registrar");
        int numEstudiante = sc.nextInt();
        System.out.println("Dime la nota del estudiante");
        double nota = sc.nextDouble();
        estudiantes[contador] = numEstudiante;
        notas[contador] = nota;
        contador++;
        System.out.println("Estudiante registrado correctamente");
    }

    // metodo mostrar lista estudiantes
    public static void mostrarEstudiantes() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Estudiante nº: " + estudiantes[i] + " / " + " nota: " + notas[i]);
        }
    }

    // método calcular media grupo
    public static void calcularMedia() {
        double sumaNotas = 0;
        for (int i = 0; i < contador; i++) {
            sumaNotas += notas[i];
        }
        System.out.println("La media de las notas de todos los alumnos es: " + sumaNotas / contador);
    }

    public static void main(String[] args) {
        menu();
    }
}
