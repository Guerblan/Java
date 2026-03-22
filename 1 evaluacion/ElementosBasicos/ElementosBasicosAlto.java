import java.util.Scanner;

// Ejercicios redistribuidos desde ElementosBasicos.java

class ElementosBasicosAlto {

public static void ejercicio7(){
  Scanner teclado = new Scanner(System.in);
  String pasword = "cincosydos";
  String cadena;
  System.out.println("Dime el pasword y te diré si es el correcto!");
  cadena = teclado.nextLine();
  System.out.println("Introdujistes el pasword correcto? " + cadena.equals(pasword));
}

public static void ejercicio8(){
  Scanner teclado = new Scanner(System.in);
  String frase;
  System.out.println("Dime una frase y te devolveré su longitud y la primera y última letra");
  frase = teclado.nextLine();
  System.out.println("La longitud de la frase es " + frase.length() + " , su primera letra es " + frase.substring(0,1) + " y la última letra es " + frase.substring( frase.length() - 1, frase.length()));
}

public static void ejercicio9(){
  Scanner teclado = new Scanner(System.in);
  
    String frase;
    int posicionPalabra;
    String palabra;

    System.out.println("Dame una frase: ");
    frase = teclado.nextLine();

    System.out.println("Dime la palabra que quieres buscar dentro de la frase:");
    palabra = teclado.nextLine();

    // Con la función indexOf(cadena) obtenemos la posición de la frase en la que empieza la palabra
    // contenida en cadena=amigo
    // Como amigo tiene 5 caracteres, obtenemos la subcadena desde la posición en la que empieza la
    // cadena hasta la posición en la que empieza la cadena + 5
    posicionPalabra = frase.indexOf(palabra);



    // Para extraer la palabra amigo extremos la subcadena que va:
    // - Desde: Donde aparece la palabra amigo (posicionPalabra)
    // - Hasta: Donde aparece la palabra amigo (posicionPalabra) + el tamaño que tiene la palabra
    // amigo
    System.out.println(
        "Este es el resultado de extraer la palabra 'amigo' de la cadena introducida por teclado: "
            + frase.substring(posicionPalabra, posicionPalabra + palabra.length()));
  }

}
