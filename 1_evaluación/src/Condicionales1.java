import java.util.Scanner;
public class Condicionales1{
    public static void ejercicio1(){
        /*• Ejercicio 1: Escribe un programa que pida un número y diga si es o no múltiplo de 3.*/
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingresa un número");
        num = teclado.nextInt();
        if(num % 3 == 0){
            System.out.println("El número introduciodo es múltiplo de 3");
        }else if(num % 3 != 0){
            System.out.println("El número introducido no es múltiplo de 3");
        }
    }

    public static void ejercicio2(){
        /*• Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y calcula y muestra el
        mayor de los tres.*/
    Scanner teclado = new  Scanner(System.in);
    int num1;
    int num2;
    int num3;
    System.out.println("Dame un número");
    num1 = teclado.nextInt();
    System.out.println("Dame otro número");
    num2 = teclado.nextInt();
    System.out.println("Dame un último número");
    num3 = teclado.nextInt();
    if(num1 > num2 & num1 > num3){
        System.out.println(num1 + " es el mayor de los 3 números"); 
    }else if (num2 > num1 & num2 > num3){
        System.out.println(num2 + " es el número mayor");
    }else if (num3 > num1 & num3 > num2){
        System.out.println(num3 + "es el nñumero más alto ");   
    }else{
        System.out.println("No hay un número claro que sea el más alto");
    }


    }



    public static void ejercicio3(){
        /*• Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H, M, S correspondientes
        a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
        Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será
        mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará
        comprendido entre 0 y 59 ambos incluidos.*/
        Scanner teclado = new Scanner(System.in);
        int numH = 0;
        int numM = 0;
        int numS = 0;
        System.out.println("Dime el número de horas");
        numH = teclado.nextInt();
        System.out.println("Dime el número de minutos");
        numM = teclado.nextInt();
        System.out.println("Dime el número de segundos");
        numS = teclado.nextInt();
        if(numH >= 0 && numH <= 24 && numM >= 0 && numM <= 60 && numS >= 00 && numS <= 60){
            System.out.println("La hora proporcionada es correcta");
        }else {
            System.out.println("La hora proporcionada es incorrecta");
        }

    }

    public static void ejercicio4(){
        /*
    • Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en pantalla
    el nombre en letras de ese número. Se debe controlar que se introduzca un número válido.*/
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Dame un número entre 0 y 10");
        num = teclado.nextInt();
        switch(num){
            
            case 1:
            System.out.println("Uno");
            break;
            case 2:
            System.out.println("Dos");
            break;
            case 3:
            System.out.println("Tres");
            break;
            case 4:
            System.out.println("Cuatro");
            break;
            case 5:
            System.out.println("Cinco");
            break;
            case 6:
            System.out.println("Seis");
            break;
            case 7:
            System.out.println("Siete");
            break;
            case 8:
            System.out.println("Ocho");
            break;
            case 9:
            System.out.println("Nueve");
            break;
            case 10:
            System.out.println("Diez");
            break;
            default:
            System.out.println("Número introducido no válido");

        }

    }


    public static void ejercicio5(){
        /*• Ejercicio 5: Escribe un programa que realice lo contrario que el anterior, es decir pide un número en
    letras y enseña un número.
    Aclaración: No es lo mismo la cadena "Uno" que "uno" o que "UNO", por lo tanto, para que el
    programa funcione correctamente deberías pasar todas las letras del nombre del número a
    mayúsculas o a minúsculas. Investiga cuál es la función del objeto String que nos permite realizar ese
    cambio.*/
    Scanner teclado = new Scanner(System.in);
    String num = "";
    System.out.println("Dime un número en palabras entre el uno y el diez");
    num = teclado.nextLine();

    switch(num.toLowerCase()){

        case "uno":
        System.out.println(1);
        break;

        case "dos":
        System.out.println(2);
        break;

        case "tres":
        System.out.println(3);
        break;

        case "cuatro":
        System.out.println(4);
        break;

        case "cinco":
        System.out.println(5);
        break;

        case "seis":
        System.out.println(6);
        break;

        case "siete":
        System.out.println(7);
        break;

        case "ocho":
        System.out.println(8);
        break;

        case "nueve":
        System.out.println(9);
        break;

        case "diez":
        System.out.println(10);
        break;

        default:
        System.out.println("Valor introducido no válido");

        }


    }

    public static void ejercicio6(){
        /*• Ejercicio 6: Escribe un programa que lea una variable entera mes y compruebe si el valor
    corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
    mostrará además el nombre del mes.
    Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.*/
        Scanner teclado = new Scanner(System.in);
        int mes = 0;
        int numdias = 0;
        System.out.println("Dime un número de mes");
        mes = teclado.nextInt();
        if(mes < 1 || mes > 12){
            System.out.println("Valor introducido no válido,debe estar entre 1-12");
        }else{
        switch (mes) {
            case 1:
                System.out.println("Enero");
                numdias = 31;
                break;

            case 2:
            System.out.println("Febrero");
                numdias = 28;
            break;
            
            case 3:
                System.out.println("Marzo");
                numdias = 31;
                break;

            case 4:
                System.out.println("Abril");
                numdias = 30;
            break;
            
            case 5:
                System.out.println("Mayo");
                numdias = 31;                
                break;

            case 6:
                System.out.println("Junio");
                numdias = 30;
            break;
            
            case 7:
                System.out.println("Julio");
                numdias = 31;
                break;

            case 8:
                System.out.println("Agosto");
                numdias = 31;
            break;
            
            case 9:
                System.out.println("Septiembre");
                numdias = 30;
                break;

            case 10:
                System.out.println("Octubre");
                numdias = 31;
            break;
            
            case 11:
                System.out.println("Noviembre");
                numdias = 30;
                break;

            case 12:
                System.out.println("Diciembre");
                numdias = 31;
            break;
            
        
            default:
            System.out.println("Valor introducido no válido");
                break;
        }
        System.out.println("El número de días es " + numdias);
                
        }
    }


    public static void ejercicio7(){
     /*• Ejercicio 7: Escribe un programa que pida la nota de las tres evaluaciones, y si están aprobadas
    realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si no, escribe que evaluación
    debe recuperar.*/
    Scanner teclado = new Scanner(System.in);
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;
    System.out.println("Introduce la primera nota"); 
    nota1 =teclado.nextDouble();
    System.out.println("Introduce la segunda nota"); 
    nota2 =teclado.nextDouble();  
    System.out.println("Introduce la tercera nota"); 
    nota3 =teclado.nextDouble();   
    if(nota1 >= 5 && nota2 >= 5 && nota3 >= 5){
        System.out.println("Estás aprobado con una nota de " + (nota1 + nota2 + nota3 )/ 3);  
    }else{
        System.out.println("Tienes que recuperar ");
        if (nota1 < 5) {
            System.out.println("la primera evaluación");
        }if(nota2 < 5){
            System.out.println("la segunda evaluación");
        }if(nota3 < 5){
            System.out.println("la tercera evaluación");
        }
    }

    }
    



/*• Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el número de
horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir de ahí, las restantes
horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total del sueldo.*/
    public static void ejercicio8(){
        Scanner teclado = new Scanner(System.in);
        int numhora;
        System.out.println("Introduce el número de horas trabajadas");
        numhora = teclado.nextInt();
        if(numhora>0&&numhora<=150){
            System.out.println("El sueldo es de " + (10*numhora)+ " euros");
        } 
        else if (numhora >150){
            System.out.println("El sueldo es de " + (20*numhora) + " euros");
        }
        else{
            System.out.println("No le corresponde sueldo");
        }

    }


    public static void ejercicio9(){
        /*• Ejercicio 9: Escribe un programa que diga si un año es bisiesto. No deber permitir aceptar años
        negativos. Un año es bisiesto si cumple una de las siguientes reglas:
        1. Divisible entre 4, divisible entre 100 y divisible entre 400.
        2. Divisible entre 4, NO divisible entre 100.*/
        Scanner teclado = new Scanner(System.in);
        int anio;
        System.out.println("Introduce el año");
        anio = teclado.nextInt();
        if((anio % 4 == 0  && anio % 100 == 0 && anio % 400 == 0)||(anio % 4 == 0 && anio % 100 == 0)){
            System.out.println("El año es bisiesto");
        }
        else if(anio < 0){
            System.out.println("El año introducido no es válido");
        }else{
            System.out.println("El año introducido no es bisiesto");
        }
    }

        




    public static void main(String[] args)  {
        ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();



        
    }
}

