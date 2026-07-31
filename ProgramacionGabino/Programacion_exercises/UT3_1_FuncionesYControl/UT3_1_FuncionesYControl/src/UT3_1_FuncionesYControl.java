import java.util.Scanner;

public class UT3_1_FuncionesYControl {
    public static void main(String[] args) throws Exception {
        /*El código de los siguientes ejercicios estará contenido en funciones.
        Una función por cada uno de los ejercicios.
        En la función main debe haber un menú que permita la selección de la función
        que se ejecutará según lo indique el usuario por medio del teclado.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije la opción que quieras realizar:");
        System.out.println("Opción 0: Salir de la aplicación");
        System.out.println("Opción 1: Comprobar si es multiplo de 3");
        System.out.println("Opción 2: Mayor y menor de 3 números enteros");
        System.out.println("Opción 3: Comprobar hora");
        System.out.println("Opción 4: Introduce número de mes y muestra número de días");
        System.out.println("Opción 5: Media de 3 evaluaciones aprobadas");
        System.out.println("Opción 6: Calculo de sueldo mensual por horas trabajadas");
        System.out.println("Opción 7: Comprueba si un número entero es par o impar");
        System.out.println("Opción 8: Pide número entero y devuelve sus letras");
        System.out.println("Opción 9: Escribe un número y devuelve numérico");
        System.out.println("Opción 10: Escribe una año, si es positivo comprueba si es bisiesto");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 0 -> System.out.println("");
            case 1 -> multiplo();
            case 2 -> minMax();
            case 3 -> hora();
            case 4 -> mes();
            case 5 -> media();
            case 6 -> sueldo();
            case 7 -> parImpar();
            case 8 -> letras();
            case 9 -> numero();
            case 10 -> bisiesto();
            default -> System.out.println("Opción inexistente");
            
        }
        sc.close();
        System.out.println("\nEnd of program\n");
 
    }
    
    //Ejercicio 1 - Escribe un programa que pida un número y diga si es o no múltiplo de 3.
    
    /* Función multiplo: determina si un num es multiplo de 3
     * Utiliza un IF para comprobar
     */
    public static void multiplo() {
        System.out.println("\nDime un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%3==0) {
            System.out.println("\nEl número "+num+" es múltiplo de 3");
        }else{System.out.println("\nEl número "+num+" no es múltiplo de 3");}
        sc.close();
    }
    
    //Ejercicio 2 - Escribe un programa que lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
    
    /* Función minMax: determina el número mayor entre 3 dados y lo muestra por pantalla
     * Utiliza dos IF enlazados
     */
    public static void minMax(){
        System.out.println("\nDame 3 números enteros");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>=num2 && num1>=num3) {
            System.out.println("\nEl número mayor es "+num1);
        }else if(num2>=num1 && num2>=num3){
            System.out.println("\nEl número mayor es "+num2);
        }else{System.out.println("\nEl número mayor es "+num3);}
        sc.close();
    }
    
    /*Ejercicio 3 - Escribe un programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente,
    y comprueba si la hora que indican es una hora válida.
    Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.
    El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos*/
    
    /* Función hora: chequea si se ha escrito una hora en formato correcto y la muestra por pantalla
     * Utiliza un IF para comprobar las 3 condiciones a la vez con OPERADORES LOGICOS
     */
    public static void hora() {
        System.out.println("\nDame los tres valores de una hora (hora, minutos y segundos)");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        if(h<24 && h>=0 && m<60 && m>=0 && s<60 && s>=0){
            System.out.println("\nLa hora es "+h+":"+m+":"+s);
        }else{System.out.println("\nLa hora es incorrecta");}
        sc.close();
    }
    
    /*Ejercicio 4 - Escribe un programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días,
    de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes.
    Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.*/
    
    /* Función mes: lee un numero entero y devuelve el numero de días del mes asociado
     * Utiliza un SWITCH
     */
    public static void mes() {
        System.out.println("\nDime el número del mes que deseas comprobar\n");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        switch (mes) {
            case 1 -> System.out.println("Enero tiene 31 días");
            case 2 -> System.out.println("Febrero tiene 28 días");
            case 3 -> System.out.println("Marzo tiene 31 días"); 
            case 4 -> System.out.println("Abril tiene 30 días"); 
            case 5 -> System.out.println("Mayo tiene 31 días");
            case 6 -> System.out.println("Junio tiene 30 días");
            case 7 -> System.out.println("Julio tiene 31 días");
            case 8 -> System.out.println("Agosto tiene 31 días");
            case 9 -> System.out.println("Septiembre tiene 30 días");
            case 10 -> System.out.println("Octubre tiene 31 días");
            case 11 -> System.out.println("Noviembre tiene 30 días");
            case 12 -> System.out.println("Diciembre tiene 31 días");  
            default -> System.out.println("Número invalido");
        }
        sc.close();    
    }
    
    /*Ejercicio 5 - Escribe un programa que pida la nota de las tres evaluaciones,
    y si están aprobadas realizar la media para calcular la nota final.
    Evaluación aprobada >= 5. Si no, escribe que evaluación debe recuperar.*/

    /* Función media: devuelve media de 3 numeros si todos son mayores de 5, también indica cual es menor
     * Utiliza boolean aprobado = true hasta que notaN<5
     * Si alguna notaN<5 imprime por pantalla que está suspensa y cambia aprobado a false
     * Imprime por pantalla la media de los 3 num
     */
    public static void media() {
        System.out.println("\nDame la nota de las 3 evaluaciones");
        Scanner sc = new Scanner(System.in);
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        boolean aprobado = true;
        if(nota1<5){
            System.out.println("Tienes que recuperar la primera evalución");
            aprobado = false;
        }
        if (nota2<5) {
            System.out.println("Tienes que recuperar la segunda evaluación");
            aprobado = false;
        }
        if(nota3<5){
            System.out.println("Tienes que recuperar la tercera evaluación");
            aprobado = false;
        }
        if (aprobado) {
            System.out.println("Tu nota media es "+(nota1+nota2+nota3)/3);
        }
        sc.close();
    }
    
    /*Ejercicio 6 - Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el número de horas trabajadas este mes.
    Las primeras 150 horas se pagan a 10€ y a partir de ahí, las restantes horas que superen las 150 se pagan a 20€.
    Debe aparecer por pantalla el total del sueldo*/
    
    /* Función sueldo: devuelve las primeras 150 horas x10 y el resto x20
     * Utiliza un IF para comprobar si las horas son superiores a 150
     */
    public static void sueldo() {
        System.out.println("\nDame el número de horas trabajadas este mes");
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int salario = 0; //En java, no sería necesario =0, pero en C sí
        if (horas>150){
            salario = (horas-150)*20 + 150*10;
        }else{salario = horas*10;}
        System.out.println("Tu sueldo es de "+salario+" euros este mes");
        sc.close();
    }
    
    //Ejercicio 7 - Escribe un programa que pida un número por teclado y muestre por pantalla si es par o impar.

    /* Función parImpar: devuelve si un número es par
     * Utiliza un IF para comprobar
     */
    public static void parImpar() {
        System.out.println("\nDime un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("\nEl número "+num+" es par");
        }else{System.out.println("\nEl número "+num+" es impar");}
        sc.close();
    }
    
    //Ejercicio 8 - Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en pantalla el nombre en letras de ese número.

    /* Función letras: lee un número en letras y devuelve el número con cifras
     * Utiliza un SWITCH
     */
    public static void letras(){
        System.out.println("Escribe un número entero del 0 al 10 en letras");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        switch (numero) {
            case 0 -> System.out.println("El número es cero");
            case 1 -> System.out.println("El número es uno");
            case 2 -> System.out.println("El número es dos");
            case 3 -> System.out.println("El número es tres");
            case 4 -> System.out.println("El número es cuatro");
            case 5 -> System.out.println("El número es cinco");
            case 6 -> System.out.println("El número es seis");
            case 7 -> System.out.println("El número es siete");
            case 8 -> System.out.println("El número es ocho");
            case 9 -> System.out.println("El número es nueve");
            case 10 -> System.out.println("El número es diez");
            default -> System.out.println("No has escrito un número correcto");
        }
        sc.close();
    }
    
    //Ejercicio 9 - Escribe un programa que realice lo contrario que el anterior, es decir pide un número en letras y enseña un número.

    /* Función numero: lee un número en letras y devuelve el número con cifras
     * Utiliza un SWITCH
     */
    public static void numero(){
        System.out.println("Escribe un número entero del 0 al 10 con números");
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();
        switch (numero) {
            case "cero" -> System.out.println("El número es 0");
            case "uno" -> System.out.println("El número es 1");
            case "dos" -> System.out.println("El número es 2");
            case "tres" -> System.out.println("El número es 3");
            case "cuatro" -> System.out.println("El número es 4");
            case "cinco" -> System.out.println("El número es 5");
            case "seis" -> System.out.println("El número es 6");
            case "siete" -> System.out.println("El número es 7");
            case "ocho" -> System.out.println("El número es 8");
            case "nueve" -> System.out.println("El número es 9");
            case "diez" -> System.out.println("El número es 10");
            default -> System.out.println("No has escrito un número correcto");
        }
        sc.close();
    }
    
    //Ejercicio 10 - Escribe un programa que diga si un año es bisiesto. No deber permitir aceptar años negativos.
    
    /* Función bisiesto: comprueba si un numero es positivo y si es bisiesto
     * Utiliza un IF para comprobar la condición con multiples OPERADORES LOGICOS 
     */
    public static void bisiesto() {
        System.out.println("Dime un año escrito en números");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year>=0 && (year%4==0 && (year%100!=0 || year%400==0))) {
            System.out.println(year+" es bisiesto");         
        }else{System.out.println(year+" no es bisiesto");}
    
        sc.close();
    }   
}
