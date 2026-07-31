import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.Scanner;

public class UT3_4_Funciones {

    //public static Scanner sc = new Scanner(System.in);
    //Como la utilizamos en todas las funciones (main y auxialeres), emjor declararla globalmente !!!
    public static void main(String[] args) throws Exception {
        /*
         * Implementa los siguientes ejercicios en distintas funciones dentro de un
         * mismo archivo .java.
         * Ten en cuenta que tendrás que crear, además de la función del ejercicio,
         * una o dos más que resuelvan el algoritmo propuesto, tal como se indica.
         */
        String opciones = "\n1- Pide dos números y devuelve cual es múltiplo"
                + "\n2- Pedir número de días y temperatura máxima y mínima, devolver media"
                + "\n3- Pedir frase y devolverla con espacios"
                + "\n4- Pedir radio y devolver area y perímetro"
                + "\n5- Pedir usuario y contraseña, informar de número de intentos"
                + "\n6- Pedir dos números y calcular MCD por Euclides"
                + "\n7- Convertir hora\n";
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(opciones);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    pedirNumeros();
                    break;
                case 2:
                    pedirDias();
                    break;
                case 3:
                    pedirFrase();
                    break;
                case 4:
                    pedirRadio();
                    break;
                case 5:
                    intentos();
                    break;
                case 6:
                    pedirEuclides();
                    break;
                case 7:
                    menuHora();
                    break;

                default:
                    flag = false;
                    break;
            }
        }
        sc.close();
    }

    /*
     * Ejercicio 1 - Crea una función que pida dos números enteros al usuario
     * y diga si alguno de ellos es múltiplo del otro. Crea una función EsMultiplo
     * que reciba los dos números, y devuelve si el primero es múltiplo del segundo.
     */
    public static void pedirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDame dos números y devuelvo es multiplo del otro: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (EsMultiplo(num1, num2)) {
            System.out.println(num1 + " es multiplo de " + num2);
        }else if (EsMultiplo(num2, num1)) {
            System.out.println(num2 + " es multiplo de " + num1);
        }else{System.out.println("Ninguno es múltiplo");}
    }

    public static Boolean EsMultiplo(int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }

    /*
     * Ejercicio 2 - Crear una función que calcule la temperatura media de un día
     * a partir de la temperatura máxima y mínima. Crear otra función, que
     * utilizando la anterior,
     * vaya pidiendo la temperatura máxima y mínima de cada día y vaya mostrando la
     * media.
     * El programa pedirá el número de días que se van a introducir.
     */
    public static void pedirDias() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDame el número de días de los que quieres calcular la temperatura media: ");
        int numDias = sc.nextInt();
        for (int i = 0; i < numDias; i++) {
            System.out.print("\nDame la temperatura máxima y mínima del día " + (i + 1) + ": ");
            int max = sc.nextInt();
            int min = sc.nextInt();
            System.out.println("\nLa temperatura media del día " + (i + 1) + " es " + temperaturaMedia(max, min));
        }
    }

    public static double temperaturaMedia(int temperaturaMax, int temperaturaMin) {
        return (temperaturaMax + temperaturaMin) / 2.0;

    }

    /*
     * Ejercicio 3 - Crea una función “ConvertirEspaciado”, que reciba como
     * parámetro un texto
     * y devuelve una cadena con un espacio adicional tras cada letra.
     * Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea una función donde se
     * utilice, pidiendo un texto por teclado.
     */
    public static void pedirFrase() {
        System.out.println("\nIntroduce una frase y te la devolveré espaciada");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println(ConvertirEspaciado2(frase));
    }

    public static String ConvertirEspaciado(String fraseOriginal) {
        String frase = "";
        for (int i = 0; i < fraseOriginal.length(); i++) {
            char letra = fraseOriginal.charAt(i);
            if (letra != ' ') {
                frase += letra + " ";
            }
        }
        return frase;
    }

    public static char[] ConvertirEspaciado2(String fraseOriginal) {
        int espacios = 0;
        for (int i = 0; i < fraseOriginal.length(); i++) {
            if (fraseOriginal.charAt(i) == 0) {
                espacios++;
            }
        }
        char[] fraseEspaciada = new char[(fraseOriginal.length() - espacios) * 2 - 1];
        for (int i = 0; i < fraseEspaciada.length; i++) {
            fraseEspaciada[i] = ' ';
        }
        for (int i = 0, j = 0; i < fraseOriginal.length(); i++, j += 2) {
            if (fraseOriginal.charAt(i) == ' ') {
                i++;
            } else {
                fraseEspaciada[j] = fraseOriginal.charAt(i);
            }
        }
        return fraseEspaciada;
    }

    /*
     * Ejercicio 4 - Diseñar una función que calcule el área y el perímetro de una
     * circunferencia.
     * Utilízala en otra función que lea el radio de una circunferencia y muestre su
     * área y perímetro.
     */
    public static void pedirRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDame un radio y te devolveré el perimetro y área: ");
        int radio = sc.nextInt();
        System.out.println("El perimetro es " + perimetroYarea(radio)[0] + " y el área es " + perimetroYarea(radio)[1]);
    }

    public static int[] perimetroYarea(int radio) {
        int[] calculos = { 2 * radio * (int) (Math.PI), (int) ((Math.PI * Math.pow(radio, 2))) };
        return calculos;

    }

    /*
     * Ejercicio 5 - Crear una subrutina llamada “Login”,
     * que recibe un nombre de usuario y una contraseña y te devuelve Verdadero si
     * el nombre de usuario es “usuario1” y la contraseña es “asdasd”.
     * Además recibe el número de intentos que se ha intentado hacer login y si no
     * se ha podido hacer login incremente este valor.
     * Crear una función donde se pida un nombre de usuario y una contraseña y se
     * intente hacer login, solamente tenemos tres oportunidades para intentarlo.
     */
    public static void intentos() {
        System.out.println("\nEscribe tu usuario y contraseña: ");
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        for (int i = 0; i < 3 && flag; i++) {
            String usuario = sc.nextLine();
            String password = sc.nextLine();
            if (Login(usuario, password)) {
                System.out.println("\nUsuario y contraseña correctas");
                flag = !flag;
            } else {
                System.out.println("Usuario y/o contraseña incorrecta, te quedan " + (3 - 1 - i) + " intentos");
            }
        }
    }

    public static boolean Login(String usuario, String password) {
        boolean correcto = false;
        if (usuario.equals("usuario1")) {
            if (password.equals("asdasd")) {
                correcto = true;
            }
        }
        return correcto;
    }

    /*
     * Ejercicio 6 - Crear una función que calcule el MCD de dos números por el
     * método de Euclides. El método de Euclides es el siguiente:
     * Se divide el número mayor entre el menor.
     * Si la división es exacta, el divisor es el MCD.
     * Si la división no es exacta, dividimos el divisor entre el resto obtenido
     * y se continúa de esta forma hasta obtener una división exacta, siendo el
     * último divisor el MCD.
     * Utilízala en otra función que lea dos números enteros y muestre el MCD.
     */
    public static void pedirEuclides() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce dos números y te calcularé el MCD: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("MCD = " + Euclides(num1, num2));

    }

    public static int Euclides(int num1, int num2) {
        int dividendo = Math.max(num1, num2);
        int divisor = Math.min(num1, num2);
        int resto = 1;
        while (resto != 0) {
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;

        }
        return dividendo;
    }

    /*
     * Ejercicio 7 - Escribir dos funciones que permitan calcular:
     * La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
     * La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
     * Escribe una función con un menú donde se pueda elegir la opción
     * de convertir a segundos, convertir a horas,minutos y segundos o salir del
     * programa.
     */
    public static void menuHora() {
        String opciones = "\nElije una opción:"
                + "\n1- Hora a segundos"
                + "\n2- Segundos a hora";
        Scanner sc = new Scanner(System.in);
        int opcion, horas, minutos, segundos;
        Boolean flag = true;
        while (flag) {
            System.out.println(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Dime las horas: ");
                    horas = sc.nextInt();
                    System.out.print("Dime los minutos: ");
                    minutos = sc.nextInt();
                    System.out.print("Dime los segundos: ");
                    segundos = sc.nextInt();
                    System.out.println(horas + ":" + minutos + ":" + segundos + " son "
                            + dateToSegundos(horas, minutos, segundos) + " segundos");
                    break;
                case 2:
                    System.out.print("Dime los segundos: ");
                    segundos = sc.nextInt();
                    System.out.println(segundos + " segundos es equivalente a " + segundosToDate(segundos));
                    break;
                default:
                    flag = !flag;
                    break;
            }

        }
    }

    public static int dateToSegundos(int horas, int minutos, int segundos) {
        int horaSegundos = horas * 3600 + minutos * 60 + segundos;
        return horaSegundos;
    }

    public static String segundosToDate(int segundos) {
        String segundosHora = (segundos / 3600 + ":" + (segundos % 3600) / 60 + ":" + (segundos % 3600) % 60);
        return segundosHora;
    }
}
