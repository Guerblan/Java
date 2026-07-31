import java.util.Scanner;
import java.util.Random;

public class EJERCICIO4 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static boolean cronometroActivo;

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n---------------------------------Menú de Ejercicio---------------------------------\n");
        System.out.println("1. Cronómetro");
        System.out.println("2. Cálculo de potencia");
        System.out.println("3. Mostrar frase por letras");
        System.out.println("4. Números en intervalo");
        System.out.println("5. Adivinar número");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.print("Seleccione una opción: ");
    
    }

        
    private static void ejercicio1() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                              Ejercicio 1: Cronómetro                                  ");
        System.out.println("---------------------------------------------------------------------------------------\n");
        System.out.println("Cronómetro iniciado. Presione Enter para detener.\n");
        cronometroActivo = true;
        
        Thread cronometroThread = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (cronometroActivo) {
                long currentTime = System.currentTimeMillis() - startTime;
                long hours = currentTime / 3600000;
                long minutes = (currentTime % 3600000) / 60000;
                long seconds = (currentTime % 60000) / 1000;
                long milliseconds = currentTime % 1000;
                
                System.out.printf("\rTiempo transcurrido: %02d:%02d:%02d:%03d", hours, minutes, seconds, milliseconds );
                
                try {
                    Thread.sleep(10); // Actualizar cada 10 milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        cronometroThread.start();
        scanner.nextLine(); // Esperar hasta que el usuario presione Enter
        cronometroActivo = false;
        
        try {
            cronometroThread.join(); // Esperar a que el hilo del cronómetro termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nCronómetro detenido.\n");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    private static void ejercicio2() {
        System.out.println("            ---------------------------------------------------------------------------------------");
        System.out.println("                                      Ejercicio 2: Cálculo de potencia                                ");
        System.out.println("            ---------------------------------------------------------------------------------------\n");
                    System.out.print("          Ingrese la base (número real): ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese el exponente (entero positivo): ");
                    int exponente = scanner.nextInt();

                    double resultado = 1;
                    for (int i = 0; i < exponente; i++) {
                        resultado *= base;
                    }

                    System.out.printf("%.2f elevado a %d es: %.2f%n", base, exponente, resultado);
                   
    }

    private static void ejercicio3() {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        for (char c : frase.toCharArray()) {
            System.out.println(c);
        }
    }

    private static void ejercicio4() {
        int limiteInferior, limiteSuperior;
        do {
            System.out.print("Ingrese el límite inferior: ");
            limiteInferior = scanner.nextInt();
            System.out.print("Ingrese el límite superior: ");
            limiteSuperior = scanner.nextInt();

            if (limiteInferior >= limiteSuperior) {
                System.out.println("El límite inferior debe ser menor que el superior. Intente de nuevo.");
            }
        } while (limiteInferior >= limiteSuperior);

        int suma = 0, fueraIntervalo = 0, numero;
        boolean igualLimites = false;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero > limiteInferior && numero < limiteSuperior) {
                    suma += numero;
                } else if (numero <= limiteInferior || numero >= limiteSuperior) {
                    fueraIntervalo++;
                }

                if (numero == limiteInferior || numero == limiteSuperior) {
                    igualLimites = true;
                }
            }
        } while (numero != 0);

        System.out.println("Suma de números dentro del intervalo: " + suma);
        System.out.println("Números fuera del intervalo: " + fueraIntervalo);
        System.out.println("¿Se introdujo algún número igual a los límites? " + (igualLimites ? "Sí" : "No"));
    }

    private static void ejercicio5() {
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 10;
        int numeroUsuario;

        System.out.println("Adivina el número entre 1 y 100. Tienes 10 intentos.");

        while (intentos > 0) {
            System.out.printf("Intentos restantes: %d. Ingresa tu número: ", intentos);
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.printf("¡Felicidades! Has adivinado el número en %d intentos.%n", 11 - intentos);
                return;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }

            intentos--;
        }

        System.out.printf("Lo siento, has agotado tus intentos. El número era: %d%n", numeroSecreto);
    }
}