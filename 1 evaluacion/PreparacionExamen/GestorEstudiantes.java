/*
Ejercicio 10. Mini proyecto: Gestor de estudiantes modular
Crea una clase GestorEstudiantes con métodos para mostrar un menú, registrar estudiantes,
mostrar la lista y calcular la media del grupo. El método main solo debe llamar a menu().
🎯 Objetivo: Simular un programa completo con responsabilidades bien divididas y un flujo
modular.
*/

import java.util.Scanner;

public class GestorEstudiantes {
    String estudiantes[] = new String[20];

    // método menú
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String menu = "Elige una opción\n" + "1. Registar estudiantes\n" + "2. Mostrar lista estudiantes\n"
                + "3. Calcular media grupo\n" + "4. Salir";
        System.out.println(menu);
        int opcion = 0;
        while (opcion != 4) {
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
    public static registrarEstudiante(){
        
    }

    // metodo mostrar lista estudiantes
    public static mostrarEstudiantes(){
        
    }

    // método calcular media grupo
    public static calcularMedia(){
        
    }

    public static void main(String[] args) {
        // menu();
    }
}
