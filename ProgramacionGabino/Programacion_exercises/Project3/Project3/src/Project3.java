import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) throws Exception {
        //1-Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
        String name = ("Gabino");
        System.out.println("Bienvenido "+ name);
    
        //2-Pedir un password y comprobar si es igual que un String definido en el programa. Enseñar el resultado por pantalla.
        String password = ("password");
        System.out.println("Escribe tu contraseña");
        Scanner sc = new Scanner(System.in);
        String insertedPassword = sc.nextLine();
        if (password.equals(insertedPassword)) {
            System.out.println("Contraseña correcta");}
            else {System.out.println("Contraseña incorrecta\n");}
        
        //3-Pedir una frase y enseñar por pantalla, la longitud, la primera y última letra.
        System.out.println("Dime una frase");
        String phrase = sc.nextLine();
        int lengthPhrase = phrase.length();
        System.out.println("La frase escrita tiene "+ lengthPhrase+" carácteres");
        System.out.println("El primer carácter es "+phrase.charAt(0));
        System.out.println("El último carácter es "+phrase.charAt(lengthPhrase-1)+"\n");

        //4-Pedir por consola o pantalla la frase “Hola amigo ¿cómo estás?”, y enseñar el substring amigo.
        System.out.println("Escribe la siguiente frase exactamente igual:\nHola amigo, como estas?");   //change to only English characters
        String typedPhrase = sc.nextLine();
        String amigo = ("amigo"); 
        int lengthAmigo = amigo.length(); //find length of amigo
        String amigoPhrase = ("Hola amigo, como estas?");
        Boolean findAmigo = typedPhrase.contains(amigo);    //check if "amigo" appears
        Boolean correctTypedPhrase = typedPhrase.equals(amigoPhrase);
        /*if phrase ok, all ok
         * else, if amigo found, half ok
         * else, all not ok
         */
        if (correctTypedPhrase==true) {
            int amigo1position = typedPhrase.indexOf(amigo);    //find position of 1º character of amigo
            String subAmigo = typedPhrase.substring(amigo1position, amigo1position+lengthAmigo);  //find amigo by position of its 1º and last characters (subAmigo)
            System.out.println("Has escrito bien la frase y he encontrado la palabra "+subAmigo);      
        }else{
                if (findAmigo==true) {
                    int amigo1position = typedPhrase.indexOf(amigo);    
                    String subAmigo = typedPhrase.substring(amigo1position, amigo1position+lengthAmigo);   
                    System.out.println("Has escrito mal la frase pero he encontrado la palabra "+subAmigo);
                }else{
                    System.out.println("No he encontrado la palabra "+amigo);
                }
        }
        
        sc.close();

        System.out.println("\nEND OF PROJECT3\n");
    }
}
