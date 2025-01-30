//TEMA 2 ACTIVIDAD 2

import java.util.Scanner;


public class App {   

/*Ejercicio 1
Pide por teclado un String que contenga preguntando por tu nombre,
 después muestra un mensaje de bienvenida por consola.
  Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.*/
  public static void ejercicio1(){
    Scanner teclado = new Scanner(System.in);
    String nombre;
    System.out.println("¿Cómo te llamas? ");
    nombre = teclado.nextLine();
    System.out.println("Bienvenido " + nombre);
  }

/*Ejercicio 2
Pedir dos números y realizar operaciones básicas de suma,
 resta y multiplicación, enseñando el resultado.*/
 public static void ejercicio2(){
    Scanner teclado = new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Dime el primer número");
    num1 = teclado.nextInt();
    System.out.println("Dime el segundo número");
    num2 = teclado.nextInt();
    System.out.println("Haré algunas operaciones básias con él");
    System.out.println("El resultado de la suma de ambos número es" + (num1 + num2));
    System.out.println("El resultado de la resta de ambos número es" + (num1 - num2));
    System.out.println("El resultado de la multiplicación de ambos número es" + (num1 * num2));
 }

/*Ejercicio 3
Pedir un número calcular su raíz cuadra.*/
public static void ejercicio3(){
  Scanner teclado = new Scanner (System.in);
  int num;
  System.out.println("Dame un número");
  num=teclado.nextInt();
  System.out.println("El resultado de su raíz cuadrada  es" + Math.sqrt(num));
}

/*Ejercicio 4
Pedir dos números (base y exponente) y calcular la potencia.*/
public static void ejercicio4(){
  Scanner teclado = new Scanner (System.in);
  int num1;
  int num2;
  System.out.println("Dame la base");
  num1 = teclado.nextInt();
  System.out.println("Dame el exponente");
  num2 = teclado.nextInt();
  System.out.println("El resultado de la potencia " + num1 + " elevado a " + num2 + " es " + Math.pow(num1, num2) );
}

/*Ejercicio 5
Pedir el radio de un circulo y calcular su área. (A=pi*r^2) (Podemos usar Math.PI para el valor de pi o poner directamente el valor)*/
public static void ejercicio5(){
  Scanner teclado = new Scanner(System.in);
  int radio;
  System.out.println("dame el radio");
  radio = teclado.nextInt();
  System.out.println("El área del círculo es " + (Math.PI * Math.pow(radio,2)));
}

/*Ejercicio 6     
Pedir el radio de una circunferencia y calcular su longitud.(L=2+pi*r)*/
public static void ejercicio6(){
  Scanner teclado = new Scanner(System.in);
  int radio;
  System.out.println("Dame el radio");
  radio = teclado.nextInt();
  System.out.println("La longitud de la circunferencia es " + (2 * Math.PI * radio));
}

/*Ejercicio 7     
Pedir un password y comprobar si es igual que un String definido en el programa. Enseñar el resultado por pantalla.*/
public static void ejercicio7(){
  Scanner teclado = new Scanner(System.in);
  String pasword = "cincosydos";
  String cadena;
  System.out.println("Dime el pasword y te diré si es el correcto!");
  cadena = teclado.nextLine();
  System.out.println("Introdujistes el pasword correcto? " + cadena.equals(pasword));
}

/*Ejercicio 8     
Pedir una frase y enseñar por pantalla, la longitud, la primera y última letra.*/
/*Pista: La función substring nos permite extraer una subcadena de una cadena.*/
public static void ejercicio8(){
  Scanner teclado = new Scanner(System.in);
  String frase;
  int longitudFrase;
  System.out.println("Dime una frase y te devolveré su longitud y la primera y última letra");
  frase = teclado.nextLine();
  longitudFrase = frase.length();
  System.out.println("La longitud de la frase es " + frase.length() + " , su primera letra es " + frase.substring(0,1) + " y la última letra es " + frase.substring( frase.length() - 1, frase.length()));
}

/*Ejercicio 9     
Pedir por consola o pantalla una frase que contenga la palabra "amigo", como por ejemplo: “Hola amigo ¿cómo estás?”. El programa deberá enseñar el substring "amigo" extraído de la cadena introducida por consola.*/
/*Pista: La función indexOf del objeto cadena nos devuelve la posición en la que se encuentra una cadena dentro de otra.*/
public static void ejercicio9(){
}
    public static void main(String[] args) throws Exception {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        ejercicio9();
    }
}

