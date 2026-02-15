
import java.util.Scanner;

public class Bucles3 {
    
    public static void main (String []var0){
        /*Ejercicio 1: Diseña un programa que pide al usuario que ingrese la cantidad de números que va a
    introducir. Deberá leer la cantidad de números indicada y cuenta cuántos son positivos, negativos y
    ceros, cuantos pares y cuantos impares, mostrando esa información al finalizar la ejecución.*/
    Scanner teclado = new Scanner(System.in);
    int num = 0;
    int positivo = 0;
    int negativo = 0;
    int cero = 0;
    int par = 0;
    int impar = 0;
    System.out.println("Dime cuántos número deseas introucir");
    num = teclado.nextInt();
    if(num<=0){
        System.out.println("La cantidad de números introducidos ebe ser mayor que 0");
    }
    for(int i = 0;i<=num;i++){
        System.out.println("Introduce un número");
        int num2 = teclado.nextInt(); 
        if (num2>0) {
            positivo ++;
        }if(num2<0){
            negativo++;
        }if(num2==0){
            cero ++;
        }if(num2%2==0){
            par ++;
        }if(num2%2!=0){
            impar ++;
        }else{
            System.out.println("Valor introcucio no válido");
        }}
        System.out.println("la cantiad de número positivos es " + positivo);
        System.out.println("la cantiad de número negativos es " + negativo);
        System.out.println("la cantiad de ceros es " + cero);
        System.out.println("la cantiad de números pares es " + par);
        System.out.println("la cantiad de números impares es " + impar);
        System.out.println("La cantidad de números es" + (positivo + negativo + cero + par + impar));
    }


    /*• Ejercicio 2: Crea un programa que solicite un número y muestra su tabla de multiplicar del 1 al 10.*/
    public static void ejercicio2(){
    }





    /*• Ejercicio 3: Diseña un programa que permita al usuario convertir temperaturas de Celsius a
    Fahrenheit y viceversa. Ofrece un menú para elegir la conversión.
    (Para pasar de Celsius a Fahrenheit: (°C * 1,8) + 32 y de Fahrenheit a Celsius: (ºF-32)/1.8)*/
    public static void ejercicio3(){
    }
    
    
    
    /*• Ejercicio 4: Implementa un programa que pida un número entero al usuario y determine si es un
    número perfecto. Un número es perfecto si es igual a la suma de sus divisores propios. (Los divisores
    propios de un número son aquellos números por los que es divisible un número sin contar el
    número).*/
    public static void ejercicio4(){
    }
    
    
    
    
    /*• Ejercicio 5: Crea un programa que pida al usuario un número entero positivo y calcule la suma de
    todos los números primos hasta ese número.*/
    public static void ejercicio5(){
    }
    
    
    
    
    /*• Ejercicio 6: Diseña un programa que simule una casa de apuestas. Se comenzará con un saldo de
    100€. Pedirá al usuario que cantidad quiere apostar, la cual deberá estar entre 1 y el saldo
    disponible. Se deberá generar un booleano aleatorio (random.nextBoolean()), en caso de que salga
    true, el usuario gana el importe apostado. Se jugará a este juego mientras quiera el usuario y/o
    quede saldo.*/
    public static void ejercicio6(){
    }
    
    
    
    
    /*• Ejercicio 7: Crea un programa que simule una quiniela, para ello se deberá leer el resultado de 15
    partidos. El usuario deberá introducir 1, X o 2. Almacenaremos los valores en variables para luego
    poder usarlas. Debemos controlar que solo pueda introducir 1, X o 2
    Una vez pedidos todos los resultados iremos generando aleatoriamente el resultado de los partidos,
    si gana el equipo de casa (1), empatan(X) o gana el equipo visitante.
    Debemos mostrar para finaliza el resultado del partido y el que puso el usuario, y finalmente el
    número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el pleno al 15.
    Un ejemplo de funcionamiento sería:
    Programación UT.3: Estructuras de Control
    Página 2 de 2*/
    public static void ejercicio7(){
    }
    
    
    
    
    
    /*• Ejercicio 8: Crea un programa que lea una frase por teclado y la convierta al formato camelCase. Por
    ejemplo, si introducimos por teclado “hola como estás”, el programa deberá mostrar
    “HolaComoEstás”.
    Pistas:
    o Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando la función
    cadena.charAt(i), donde cadena es nuestra variable cadena y la i la posición del carácter.
    o Podemos pasar a minúscula un carácter con la función: Character.toLowerCase(c), donde c
    es el carácter a convertir.
    o Podemos pasar a mayúsculas un carácter con la función: Character.toUpperCase(c), donde c
    es el carácter a convertir.*/
    public static void ejercicio8(){
    }
}


