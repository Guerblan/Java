import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio 1 - Un alumno tiene las siguientes notas en los exámenes: 5.25, 7.85, 3.4 Calcula cual es la media de este trimestre.
        A parte todos los alumnos reciben 1 punto más a la media por un trabajo que hicieron, muestra por pantalla su nota final.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular tu nota media, dime las notas de tus 3 asignaturas:");
        float nota1 = sc.nextFloat();   
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float notaMedia = funcionMedia(nota1, nota2, nota3);
        System.out.println("Tu nota media es "+notaMedia);
        float notaFinal = notaMedia + 1;
        System.out.println("\nDebido a que hiciste el trabajo,\ntu nota final será "+notaFinal);

        /*Ejercicio 2 - Pide por teclado un número.
        Muestra por pantalla el resultado de multiplicar ese número por 2, utilizando para ello un desplazamiento de bits. */
        System.out.println("\nVamos a multiplicar un número por 2, utilizando un desplazamiento de bits.\nDime un número:");
        int numInt = sc.nextInt();
        System.out.println("El nuevo número es "+desplazamientoBit(numInt)+" (método transformando a binario y vicevera)");
        //Otra forma de resolver Ejercicio 2, utilizando <<
        System.out.println("El nuevo número es "+desplazamientoBit2(numInt)+" (método directo)");

        /*Ejercicio 3 - Realiza una división de dos números pedidos por teclado. Muestra el resultado de la división junto con su resto. */
        System.out.println("\nVamos a realizar una division entera y te devolveré el resultado y su resto.");
        System.out.println("Dime el dividendo:");
        int dividendo = sc.nextInt();
        System.out.println("Dime el divisor:");
        int divisor = sc.nextInt();
        System.out.println("\nEl resultado de la división es "+cociente(dividendo,divisor));
        System.out.println("El resto es "+resto(dividendo, divisor));
        System.out.println("\nAhora voy a mostrar el resto obtenido por otro método:");
        System.out.println("El resto es "+resto2(dividendo, divisor));

        //Ejercicio 4 - Imprime por pantalla el número entero más grande posible. Busca cual es la función que permite realizar esto.
        int maxInt = Integer.MAX_VALUE;
        System.out.println("\nEl número entero más grande es el "+maxInt);


        sc.close();
        System.out.println("\nEND OF PROGRAM\n");
    }
    /**
     * Devuelve el valor medio en float de tres int
     * @param value1 = primer int
     * @param value2 = segundo int
     * @param value3 = tercer int
     * @return float media
     */
    public static float funcionMedia(float value1, float value2, float value3){
        // float media = (value1+value2+value3) / 3;
        // return media;
        return (value1+value2+value3) / 3; //float media in unnecessary
    }
    /**
     * Multiplica un número por 2 utilizando desplazamiento de bit.
     * (Transforma el número en binario, desplaza un bit a la izquierda y vuelve a transformarlo en int)
     * @param num = numero int que se quiere multiplicar por 2
     * @return int = num * 2
     */
    public static int desplazamientoBit (int num){
        String numBinary = Integer.toBinaryString(num);
        int numBinary2 = Integer.parseInt(numBinary+"0",2);
        return numBinary2;
    }
    /**
     * Multiplica un número por 2 utilizando desplazamiento de bit.
     * (utiliza la expresion << para desplazar directamente un bit del int sin transformarlo en binario)
     * @param num numero int que se quiere multiplicar por 2
     * @return int = num *2
     */
    public static int desplazamientoBit2 (int num){
        int numInt2 = num << 1;
        return numInt2;
    }
    /**
     * Divide dos numero int y devuelve el cociente
     * @param dividendo num int que es dividido
     * @param divisor num int que divide
     * @return cociente int
     */
    public static int cociente (int dividendo, int divisor){
        int cociente = dividendo/divisor;;
        return cociente;
    }
    /**
     * Divide dos numeros int y devuelve el resto
     * @param dividendo num int que es dividido
     * @param divisor num int que divide
     * @return resto int
     */
    public static int resto (int dividendo, int divisor){
        int resto = dividendo-(divisor*cociente(dividendo, divisor));
        return resto;
    }
    /**
     * Divide dos numeros int y devuelve el resto
     * Esta funcino utiliza otro metodo mas directo --> %
     * @param dividendo num int que es dividido
     * @param divisor num int que divide
     * @return resto int
     */
    public static int resto2 (int dividendo, int divisor){
        int resto2 = dividendo%divisor;
        return resto2;
    }



}
