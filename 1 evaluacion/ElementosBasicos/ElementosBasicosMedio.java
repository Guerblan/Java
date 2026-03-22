import java.util.Scanner;

// Ejercicios redistribuidos desde ElementosBasicos.java

class ElementosBasicosMedio {

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

public static void ejercicio5(){
  Scanner teclado = new Scanner(System.in);
  int radio;
  System.out.println("dame el radio");
  radio = teclado.nextInt();
  System.out.println("El área del círculo es " + (Math.PI * Math.pow(radio,2)));
}

public static void ejercicio6(){
  Scanner teclado = new Scanner(System.in);
  int radio;
  System.out.println("Dame el radio");
  radio = teclado.nextInt();
  System.out.println("La longitud de la circunferencia es " + (2 * Math.PI * radio));
}

}
