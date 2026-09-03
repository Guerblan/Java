import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class UT3_2_Bucles {
    public static void main(String[] args) throws Exception {
    /*El código de los siguientes ejercicios estará contenido en funciones.
    Una función por cada uno de los ejercicios. En la función main debe haber un menú
    que permita la selección de la función que se ejecutará según lo indique el usuario por medio del teclado.*/
        String opciones = "\nOpción 0: Salir\n"
        +"Opción 1: Raiz de un numero no negativo\n"
        +"Opción 2: Media hasta negativo\n"
        +"Opción 3: Números del 100 al 0 de 7 en 7\n"
        +"Opción 4: Multiplicación primeros 10 impares\n"
        +"Opción 5: Información de 10 números\n"
        +"Opción 6: Tabla de multiplicar\n"
        +"Opción 7: Sueldo máximo\n"
        +"Opción 8: Adivinar un número\n"
        +"Opción 9: Número primo\n"
        +"Opción 10: Caja fuerte\n";
        /*System.out.println("Elije la opción que quieras realizar:");
        System.out.println("Opción 0: Salir");
        System.out.println("Opción 1: Cuadrado de un numero no negativo");
        System.out.println("Opción 2: Media hasta negativo");
        System.out.println("Opción 3: Números del 100 al 0 de 7 en 7");
        System.out.println("Opción 4: Multiplicación primeros 10 impares");
        System.out.println("Opción 5: Información de 10 números");
        System.out.println("Opción 6: Tabla de multiplicar");
        System.out.println("Opción 7: Sueldo máximo");
        System.out.println("Opción 8: Adivinar un número");
        System.out.println("Opción 9: Número primo");
        System.out.println("Opción 10: Caja fuerte");*/
        boolean flag = true;
        while (flag) {
            System.out.println(opciones);
            Scanner sc = new Scanner(System.in);
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 0: flag = false;
                    sc.close(); break;
                case 1 : cuadrado(); break;
                case 2 : media(); break;
                case 3 : enumeracion(); break;
                case 4 : multiplicacion(); break;
                case 5 : info(); break;
                case 6 : tabla(); break;
                case 7 : sueldo(); break;
                case 8 : adivinar(); break;
                case 9 : primo(); break;
                case 10 : cajaFuerte(); break;
                case 11 : infoPrueba(); break;
                case 12 : infoPrueba2(); break;
                default : System.out.println("Opción inexistente");
            }
        }
        System.out.println("\nEnd of program\n");
 
    }

    //Ejercicio 1 - Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
    public static void cuadrado() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("\nDime un número y te daré la raiz mientras no sea negativo");
        while ((num = sc.nextInt()) >= 0) {
            System.out.println("El cuadrado de "+Math.pow(num, 2)+"\n1");
        }
    }
 

    //Ejercicio 2 - Pedir números hasta que se introduzca uno negativo, y calcular la media.
    public static void media(){
        Scanner sc = new Scanner(System.in);
        float num;
        float i = 0;
        int suma =0;
        System.out.println("Dime números y te hará media");
        while ((num = sc.nextFloat()) >= 0) {
            suma += num;
            i++;
        }
        System.out.println("La media de los números positivos es "+suma/i);
    }
 

    //Ejercicio 3 - Escribir todos los números del 100 al 0 de 7 en 7.
    public static void enumeracion(){
        System.out.println("\nCuenta atrás desde 100 de 7 en 7");
        for(int i = 100; i>=0;){
            System.out.println(i);
            i-=7;
        }
    }
 

    //Ejercicio 4 - Diseñar un programa que muestre el producto de los 10 primeros números impares.
    public static void multiplicacion(){
        int multiplicacion = 1;
        int i=1;
        for(int j=1; i<=10; j++){
            if(j%2!=0){
                multiplicacion*=j;
                i++;
            }               
        }       
        System.out.println("\nLa multiplicación de los 10 primeros impares es "+multiplicacion+"\n");
    }
    
    

    //Ejercicio 5 - Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
    public static void info(){
        int positivos = 0;
        int numPositivos = 0;
        int negativos = 0;
        int numNegativos = 0;
        int ceros = 0;
        System.out.println("\nDame 10 números\n");
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=10; i++){
            int num = sc.nextInt();
            if (num>0) {
                positivos+=num;
                numPositivos++;
            } else if (num<0) {
                negativos+=num;
                numNegativos++;
            }else{
                ceros++;
            }
        }
        if (numPositivos!=0) {
            System.out.println("La media de los número positivos es "+positivos/numPositivos);
        }
        if (numNegativos!=0) {
            System.out.println("La media de los números negativos es "+negativos/numNegativos);
        }
        System.out.println("Has introducido "+ceros+" ceros\n");
    }
    /*Otro método a la fúnción info(). Lee tambieén 0 dentro del número.
     * Transforma int num en String numLetras y chequea cada char con un bucle for.
     * Lee 0 dentro del número
     * No lee números al principio del 0 por el Integer.parseInt()
     * Comprueba si num es positivo o negativo y acumula su valor
     */
    public static void infoPrueba(){
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int numPositivos = 0;
        int negativos = 0;
        int numNegativos = 0;
        int ceros = 0;
        System.out.println("\nDame 10 números\n");
        for(int i=1; i<=2; i++){    // Pedir hasta 10 num
            int num = sc.nextInt();
            String numString = ""+num; // Transformar num en string
            for(int j=0;j<=(numString.length()-1);j++){ // Recorrer todo el string comparando cada char con 0, if TRUE => ceros++
                if(numString.charAt(j)=='0'){
                    ceros++;
                }
            } 
            if (num>=0) { 
                positivos+=num;
                numPositivos++;
            }else{negativos+=num;
                numNegativos++;
            }
        }
        System.out.println("\nLa media de los números positivos es "+positivos/numPositivos);
        if (numNegativos>0) {
            System.out.println("La media de los número negativos es "+negativos/numNegativos);
        }else{System.out.println("No hay números negativos");}
        System.out.println("Has introducido un total de "+ceros+" ceros\n");
        
    }
    
    /*Otro método a la fúnción info(). Lee cualquier 0 introducido.
     * Guarda los números introducidos en un String numLetra.
     * Chequea cada char con un '0'.
     * Transforma numLetra en int num.
     * Comprueba si es positivo o negativo y acumula su valor
     */
    public static void infoPrueba2(){
        System.out.println("\nDame 10 números\n");
        int positivos = 0;
        int numPositivos = 0;
        int negativos = 0;
        int numNegativos = 0;
        int ceros = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i<=2; i++){
            String numLetra = sc.nextLine();
            int num = Integer.parseInt(numLetra);
            for(int j = 0; j<numLetra.length(); j++){
                if (numLetra.charAt(j)=='0') {
                    ceros++;
                }
            }
            if (num>0) {
                positivos+=num;
                numPositivos++;
            }
            if (num<0) {
                negativos+=num;
                numNegativos++;
            }
            if (num==0) {
                ceros++;
            }
        }
        if (numPositivos!=0) {
            System.out.println("La media de los número positivos es "+positivos/numPositivos);
        }
        if (numNegativos!=0) {
            System.out.println("La media de los números negativos es "+negativos/numNegativos);
        }
        System.out.println("Has introducido "+ceros+" ceros\n");
    }

    //Ejercicio 6 - Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
    public static void tabla(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDame un número y te devuelvo su tabla de multiplicar\n");
        int num =   sc.nextInt();
        while (num<0 || num>10) {   //comprueba si 0<num<10 y si no, pide otro por pantalla
            System.out.println("\nEl número es incorrecto, dame otro número diferente\n");
            num = sc.nextInt();
        }
        System.out.println("\nTabla de multiplicar del "+num);
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
 

    //Ejercicio 7 - Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
    public static void sueldo(){
        int sueldoMax = Integer.MIN_VALUE;  //inicializa sueldoMAX con el mínimo valor (asi admitimos hasta sueldos negativos)
        System.out.println("\nDime cuantos sueldos quieres introducir");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\nIntroduce "+n+" sueldos");
        for(int i = 1; i<=n; i++){
            int sueldoTemp = sc.nextInt();
            if(sueldoTemp>sueldoMax){
                sueldoMax=sueldoTemp;
            }
        }
        System.out.println("\nEl sueldo máximo es: "+sueldoMax+" euros");
    }
 

    /*Ejercicio 8 - Realizar un juego para adivinar un número.
    Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
    El proceso termina cuando el usuario acierta.*/
    public static void adivinar(){
        System.out.println("\nVoy a elegir un número al azar entre 0 y 100, adivinalo!\n");
        // OTRA FORMA --> int numRandom = (int)(Math.random()*100);
        Random random = new Random();
        int numRandom = random.nextInt(99)+1;
        System.out.println("(Este es el número secreto: "+numRandom+")");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int num = sc.nextInt();
            if (num!=numRandom) {
                if (num>numRandom) {
                    System.out.println("Mi número es menor, prueba otra vez!\n");
                }else{System.out.println("Mi número es mayor, prueba otra vez!\n");}
            }else{
                flag = false;
                System.out.println("Has acertado!!");
            }
        }
    }
 

    /*Ejercicio 9 - Escribe un programa que pida un número N y comprueba si es un número primo.
    Recuerda un número primo es aquel que solo se puede dividir entre el mismo y la unidad,
    en cualquier otro caso la división tiene decimales.*/
    public static void primo(){
        System.out.println("\nDime un número y voy a averiguar si es primo\n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean primo = true;
        for(int i=2; i<num/2 && primo; i++){    //i<num/2 --> No puede haber un divisor mayor que la mitad del propio número
            if(num%i==0){
                primo = false;
            }
        }
        if (primo) {
            System.out.println("\nEl número "+num+" es primo");            
        }else{System.out.println("\nEl número "+num+" no es primo");}
    }
 

    /*Ejercicio 10 - Realiza el control de acceso a una caja fuerte. La combinación será un número de cuatro cifras.
    El programa nos pide la combinación para abrirla. Si no acertamos,
    se nos mostrará el mensaje “Clave incorrecta le quedan x intentos”,
    si agota los intentos mostrará el mensaje “Lo siento has agotado las 4 oportunidades”
    y si acertamos se nos dirá “Has abierto la caja fuerte”.*/
    public static void cajaFuerte(){
        int password = (int)(Math.random()*1000);
        System.out.println("\n(La contraseña secreta es: "+password+")");
        boolean locked = false;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=4 && !locked; i++){
            System.out.println("\nIntroduce la contraseña de 4 cifras, te quedan "+(5-i)+" intentos");
            int num = sc.nextInt();
            if (num==password) {
                locked = true;
                
            }
        }
        if (locked) {
            System.out.println("\nCaja fuerte abierta, felicidades!\n");
        }else{System.out.println("\nCaja fuerte bloqueada\n");}
    }
}
