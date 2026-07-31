import java.util.Random;
import java.util.Scanner;

public class UT3_3_Bucles_2 {
    public static void main(String[] args) throws Exception {
        /*El código de los siguientes ejercicios estará contenido en funciones.
        Una función por cada uno de los ejercicios.
        En la función main debe haber un menú que permita la selección de la función
        que se ejecutará según lo indique el usuario por medio del teclado.*/
        Scanner sc = new Scanner(System.in);
        String opciones = "Opción 0 - Salir\n"+
            "Opción 1 - Cronómetro\n"+
            "Opción 2 - Potencia de dos número positivos\n"+
            "Opción 3 - Escribe la frase que escribas en vertical\n"+
            "Opción 4 - Chequea que números están dentro de un intervalo dado\n"+
            "Opción 5 - Adivina un número del 1 al 100 en 10 intentos\n";
        int opcion;
        boolean salir = false;
        do{
            System.out.println("\nElige una opción\n");
            System.out.println(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: cronometro();
                    break;
                case 2: potencia();
                    break;
                case 3: fraseVertical();
                    break;
                case 4: intervalo();
                    break;
                case 5: adivinar();
                   break;
            
                default: salir = true;
                sc.close();
                    break;
            }
        }while(!salir);
    }
    /*Ejercicio 1. Hacer un programa que muestre un cronómetro, indicando las horas, minutos y segundos. */
    public static void cronometro(){
        for(int horas=0; horas<24; horas++){
            for(int minutos=0; minutos<60;minutos++){
                for(int segundos=0; segundos<60; segundos++){
                    System.out.println(horas+":"+minutos+":"+segundos);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }
    /*Ejercicio 2. Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente),
    saque por pantalla el resultado de la potencia. 
    No se puede utilizar el operador de potencia. */
    public static void potencia(){
        Scanner sc = new Scanner(System.in);
        int potencia = 1;
        System.out.println("\nDame un número y su potencia");
        int num, exp;
        do{
            num = sc.nextInt();
            if (num<0) {
                System.out.println("\nEl número tiene que ser positivo, dame otro");
            }
        }while(num<0);
        do{
            exp = sc.nextInt();
            if (exp<0) {
                System.out.println("\nEl exponente tiene que ser positivo, dame otro");
            }
        }while(exp<0);
        for(int i = 1; i<=exp; i++){
            potencia*=num;
        }
        System.out.println("\nLa potencia de "+num+" elevado a "+exp+" es = "+potencia);
    }
    /*Ejercicio 3. Escribe un programa que pida una frase.
    El programa mostrará por pantalla cada letra de la frase en una línea distinta. */
    public static void fraseVertical() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEscribe una frase y la devolveré escrita en vertical\n");
        String frase = sc.nextLine();
        for(int i = 0; i<frase.length(); i++){
            System.out.println(frase.charAt(i));
        }
    }
    /*jercicio 4. Escribe un programa que pida el límite inferior y superior de un intervalo. 
    Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
    A continuación se van introduciendo números hasta que introduzcamos el 0. 
    Cuando termine el programa dará las siguientes informaciones
        – La suma de los números que están dentro del intervalo (intervalo abierto).
        – Cuántos números están fuera del intervalo.
        – Informa si hemos introducido algún número igual a los límites del intervalo. */
    public static void intervalo() {
    Scanner sc = new Scanner(System.in);
    int max, min, num;
    do{
        System.out.println("\nDame el límite inferior");
        min = sc.nextInt();
        System.out.println("\nDame el límite superior");
        max = sc.nextInt();
        if(max<min){
            System.out.println("\nLímite superior tiene que ser mayor al inferior, introducuce otros límites\n");
        }
    }while(max<min);
    int sumaIn = 0, numOut = 0, numLimit = 0;
    System.out.println("\nDime números, para introduciendo un 0");
    while ((num = sc.nextInt()) != 0) {
        if(num<max && num>min){
            sumaIn+=num;
        }else if (num>max || num< min) {
            numOut++;
        }else{
            numLimit++;
        }
    }
    System.out.println("\nLa suma de los números dentro del intervalo es "+sumaIn);
    System.out.println("Has introducido "+numOut+" números fuera del límite");
    System.out.println("Has introducido "+numLimit+" números iguales a uno de los límites");
    }
    /*Ejercicio 5. Crea una aplicación que permita adivinar un número.
    La aplicación genera un número aleatorio del 1 al 100.
    A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
    además de los intentos que te quedan (tienes 10 intentos para acertarlo). 
    El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado),
    si se llega al límite de intentos te muestra el número que había generado. */
    public static void adivinar() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numRandom = random.nextInt(99)+1;
        System.out.println("\n(El número secreto es "+numRandom+")\n");
        Boolean adivinanza = true;
        int i;
        System.out.println("\nIntenta adivinar el número\n");
        for(i = 10; i>=1 && adivinanza; i--){
            int num = sc.nextInt();
            if (num>numRandom) {
                System.out.println("El número introducido es mayor, te quedan "+(i-1)+" intentos\n");
            }else if(num<numRandom){
                System.out.println("El número introducido es menor, te quedan "+(i-1)+" intentos\n");
            }else{
                System.out.println("\nAcertaste en "+(10-i+1)+" intentos\n");
                adivinanza = false;
            }
        }
        if (i<1) {
            System.out.println("\nTe quedaste sin intentos\n");
        }
    }








}
