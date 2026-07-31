import java.util.Scanner;//for installing libraries
import java.lang.Math;

public class Project2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime una frase o palabra para que la lea.");
        Scanner sc = new Scanner(System.in); /*program stops and wait for screen
        Asign var sc to scanner, but it not used, it's just needed for the f.Scanner*/

        String fraseLeida = sc.nextLine(); //asign scanner to var fraseLeida
        System.out.println("Hemos leido la frase: "+fraseLeida); //shows var fraseLeida
        System.out.println();

        //1-Pedir dos números y realizar operaciones básicas de suma, resta y multiplicación, enseñando el resultado.
        System.out.println("Vamos a realizar operaciones básicas con dos números,\ndame el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Dame otro número.");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println("El resultado de la suma es: "+suma);
        int subtraction = numero1 - numero2;
        System.out.println("El resultado de la resta es: "+subtraction);
        int multiplication = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: "+multiplication);
        double division = (double) numero1 / numero2;
        System.out.println("El resultado de la division es: "+division);
        System.out.println();

        //2-Pedir un número calcular su raíz cuadra.
        System.out.println("Dime un número para hacer su raiz cuadrada");
        int numsqrt = sc.nextInt();
        double sqrt1 = Math.sqrt(numsqrt);
        System.out.println("El resultado es: "+sqrt1);
        System.out.println();
        //square root printing result and not saving into a var
        System.out.println("Dime otra vez un número para hacer su raiz cuadrada");
        int numsqrt2 = sc.nextInt();
        System.out.println("La raiz cuadrada de "+numsqrt2 + " es " +Math.sqrt(numsqrt2));
        System.out.println();

        //3-Pedir dos números (base y exponente) y calcular la potencia
        System.out.println("Vamos a hacer una potencia, dime un numero para la base");
        int base = sc.nextInt();
        System.out.println("Ahora dime el exponente");
        int exp = sc.nextInt();
        double pow = Math.pow(base, exp);
        System.out.println("El resultado es: "+pow);
        System.out.println();

        //4-Pedir el radio de un circulo y calcular su área.
        System.out.println("Dime el radio de un círculo para calcular su área");
        int radio = sc.nextInt();
        double area = Math.pow(radio, 2)*Math.PI;
        System.out.println("El area es "+area);
        System.out.println();

        //5-Pedir el radio de una circunferencia y calcular su longitud.
        System.out.println("Dime el radio de una circunferencia para calcular su longitud");
        int radio2 = sc.nextInt();
        double longitude = 2*Math.PI*radio2;
        System.out.println("La longitud es: "+longitude);
        System.out.println();

        sc.close(); //close scanner for resources

    }
}
