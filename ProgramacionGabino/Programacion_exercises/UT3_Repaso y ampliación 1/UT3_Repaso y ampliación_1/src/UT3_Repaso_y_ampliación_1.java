import java.util.Scanner;

public class UT3_Repaso_y_ampliación_1 {
    public static void main(String[] args) throws Exception {
        
        String opciones = "\nElige una opción:"
        +"\n1-Contador"
        +"\n2-Capicua"
        +"\n3-Factorial";
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        int opcion;
        while (flag) {
            System.out.println(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: contador();
                    break;
                case 2: capicua();
                    break;
                case 3: factorial();
                    break;
                default: flag = false;
                sc.close();
                    break;
            }

            
        }
    }
    /*1.- Mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9,
    con la particularidad que cada vez que aparezca un 3, lo sustituya por una E. */
    public static void contador() {
        char unoE, dosE, tresE, cuatroE, cincoE;
        for (int uno = 0; uno <= 9; uno++) {
            unoE = (char) (uno + '0');
            if (uno == 3) {
                unoE = 'E';
            }
            for (int dos = 0; dos <= 9; dos++) {
                dosE = (char) (dos + '0');
                if (dos == 3) {
                    dosE = 'E';
                }
                for (int tres = 0; tres <= 9; tres++) {
                    tresE = (char) (tres + '0');
                    if (tres == 3) {
                        tresE = 'E';
                    }
                    for (int cuatro = 0; cuatro <= 9; cuatro++) {
                        cuatroE = (char) (cuatro + '0');
                        if (cuatro == 3) {
                            cuatroE = 'E';
                        }
                        for (int cinco = 0; cinco <= 9; cinco++) {
                            cincoE = (char) (cinco + '0');
                            if (cinco == 3) {
                                cincoE = 'E';
                            }
                            System.out.println(unoE + ":" + dosE + ":" + tresE + ":" + cuatroE + ":" + cincoE);
                            try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }
    }
    /*2.- Diseñar un programa que pida un número entre 0 y 9999 y decir si es capicúa. */
    public static void capicua() {
        boolean incorrecto = true;
        int num;
        do{
            System.out.println("\nDame un número entre 0 y 9999");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num>=0 && num<=9999) {
                incorrecto = !incorrecto;
            }
        }while(incorrecto);
        String numFrase = Integer.toString(num);
        boolean capicua = false;
        int contador = 0;
        for(int i = 0; i<(numFrase.length()/2);i++){
            if (numFrase.charAt(i)==numFrase.charAt(numFrase.length()-1-i)) {
                contador++;
            }
        }
        if (contador==numFrase.length()/2) {
            capicua = true;
            }
        if (capicua) {
            System.out.println("Capicua");
        }else{System.out.println("No capicua");}
    }
    /*3.- Diseñar un programa pida un número por teclado y devuelva su factorial.*/
    public static void factorial() {
        System.out.println("\nDame un número y te devolveré su factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial*=i;
        }
        System.out.println("Factorial = "+factorial);
    }








}
