import java.util.Scanner;

class Condicionales {
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número entero");
        num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 3");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 3");
        }
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Introduce un primer número");
        num1 = sc.nextInt();
        System.out.println("Introduce un segundo número");
        num2 = sc.nextInt();
        System.out.println("Introduce un tercer número");
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es " + num3);
        } else {
            System.out.println("No hay un único número mayor");
        }
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int hora;
        int min;
        int seg;
        System.out.println("Introduce la hora");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos");
        min = sc.nextInt();
        System.out.println("Introduce los segundos");
        seg = sc.nextInt();
        if (hora >= 0 && hora <= 23 && min >= 0 && min <= 59 && seg >= 0 && seg <= 59) {
            System.out.println("La hora " + hora + ":" + min + ":" + seg + " es válida");
        } else {
            System.out.println("Hora introducida inválida");
        }
    }

    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número del 0 al 10");
        num = sc.nextInt();
        switch (num) {
            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("Número introducido no válido");
                break;
        }
    }

    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Introduce un número con palabras");
        num = sc.nextLine().toLowerCase();
        switch (num) {
            case "cero":
                System.out.println(0);
                break;
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
                System.out.println("Valor introducido incorrecto");
                break;
        }
    }

    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("Introduce un número correspondiente a un mes");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("Valor introducido inválido");
                break;
        }
    }

    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        System.out.println("¿Qué nota has sacado en la primera evaluación?");
        nota1 = sc.nextInt();
        System.out.println("¿Qué nota has sacado en la segunda evaluación?");
        nota2 = sc.nextInt();
        System.out.println("¿Qué nota has sacado en la tercera evaluación?");
        nota3 = sc.nextInt();
        if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5) {
            int media = (nota1 + nota2 + nota3) / 3;
            System.out.println("La nota final es: " + media);
        } else {
            if (nota1 < 5) {
                System.out.println("Tienes que recuperar la primera evaluación");
            }
            if (nota2 < 5) {
                System.out.println("Tienes que recuperar la segunda evaluación");
            }
            if (nota3 < 5) {
                System.out.println("Tienes que recuperar la tercera evaluación");
            }
        }
    }

    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        int horas;
        System.out.println("¿Cuántas horas has trabajado?");
        horas = sc.nextInt();
        if (horas >= 0 && horas <= 150) {
            System.out.println("El sueldo a percibir es de: " + horas * 10 + " euros");
        } else if (horas > 150) {
            System.out.println("El sueldo a percibir es de: " + (((horas - 150) * 20) + 1500) + " euros");
        } else {
            System.out.println("Valor introducido inválido");
        }
    }

    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        int anio;
        System.out.println("Dime un año y te diré si es o no bisiesto");
        anio = sc.nextInt();
        if (anio < 0) {
            System.out.println("El año introducido no es válido");
        } else if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }

    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dame un número");
        num1 = sc.nextInt();
        System.out.println("Dame otro número");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println("Son iguales");
        }
    }

    public static void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un número y te diré si es par o impar");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
    }

    public static void ejercicio12() {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Dame un primer número");
        num1 = sc.nextInt();
        System.out.println("Dame un segundo número");
        num2 = sc.nextInt();
        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es " + resultado);
        } else {
            System.out.println("Error: no se puede dividir entre 0");
        }
    }

    public static void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("Introduce el exponente");
        exponente = sc.nextInt();
        double resultado;
        if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = Math.pow(base, exponente);
        }
        System.out.println("El resultado de elevar " + base + " a " + exponente + " es " + resultado);
    }

    public static void ejercicio14() {
        Scanner sc = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;
        System.out.println("Dame el primer lado del triángulo");
        lado1 = sc.nextInt();
        System.out.println("Dame el segundo lado del triángulo");
        lado2 = sc.nextInt();
        System.out.println("Dame el tercer lado del triángulo");
        lado3 = sc.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("El triángulo es escaleno");
        } else {
            System.out.println("El triángulo es isósceles");
        }

        if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3
                || lado1 * lado1 + lado3 * lado3 == lado2 * lado2
                || lado2 * lado2 + lado3 * lado3 == lado1 * lado1) {
            System.out.println("Además, el triángulo es rectángulo");
        }
    }

    public static void ejercicio15() {
        Scanner sc = new Scanner(System.in);
        int costeTotal;
        int numAlumnos;
        System.out.println("¿Qué número de alumnos asistirán a la excursión?");
        numAlumnos = sc.nextInt();
        if (numAlumnos >= 50) {
            costeTotal = numAlumnos * 40;
            System.out.println("El coste total del viaje es: " + costeTotal);
            System.out.println("Cada alumno paga 40 euros");
        } else if (numAlumnos >= 30) {
            costeTotal = numAlumnos * 48;
            System.out.println("El coste total del viaje es: " + costeTotal);
            System.out.println("Cada alumno paga 48 euros");
        } else if (numAlumnos >= 20) {
            costeTotal = numAlumnos * 56;
            System.out.println("El coste total del viaje es: " + costeTotal);
            System.out.println("Cada alumno paga 56 euros");
        } else if (numAlumnos > 0) {
            System.out.println("El coste total del viaje es: 2000 euros");
            System.out.println("Cada alumno paga " + (2000 / numAlumnos) + " euros");
        } else {
            System.out.println("Número de alumnos inválido");
        }
    }

    public static void ejercicio16() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dame un número entero");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es negativo");
        }
    }

    public static void ejercicio17() {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Dame tu edad");
        edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void ejercicio18() {

    }

    public static void ejercicio19() {

    }

    public static void ejercicio20() {

    }

    public static void ejercicio21() {

    }

    public static void ejercicio22() {

    }

    public static void ejercicio23() {

    }

    public static void ejercicio24() {

    }

    public static void ejercicio25() {

    }

    public static void ejercicio26() {

    }

    public static void ejercicio27() {

    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        // ejercicio14();
        // ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        // ejercicio24();
        // ejercicio25();
        // ejercicio26();
        // ejercicio27();
    }
}
