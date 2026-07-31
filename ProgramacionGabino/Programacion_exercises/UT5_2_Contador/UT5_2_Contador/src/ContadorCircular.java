
/* Implementa una clase ContadorCircular, que hace que el valor del contador vuelva al mínimo cuando se excede el máximo, y viceversa. */
import java.util.Scanner;

public class ContadorCircular {
    public static Scanner sc = new Scanner(System.in);
    /*
     * Propiedades:
     * nombre: Será el nombre del contador, útil para identificarlo.
     * valor: El valor actual del contador.
     * min: El valor mínimo que puede alcanzar (por defecto, 0).
     * max: El valor máximo que puede alcanzar (por defecto, 100).
     * step: El tamaño del incremento o decremento (por defecto, 1).
     */
    private String name;
    private int value;
    private int min;
    private int max;
    private int step;
    private int contador;
    private String historial;
    private String menu;

    public ContadorCircular() {
        this.name = "nombrePorDefecto";
        this.value = 0;
        this.min = 0;
        this.max = 100;
        this.step = 1;
        this.contador = 0;
        this.historial = "";
        this.menu = "\nMenu " + this.name // no cambia nombre
                + "\n1-Estado"
                + "\n2-Change name"
                + "\n3-Change min"
                + "\n4-Change max"
                + "\n5-Change step"
                + "\n6-Change value"
                + "\n7-Increase"
                + "\n8-Decrease"
                + "\n9-Reset"
                + "\n10-Show history"
                + "\n11-Reset history"
                + "\n0-Salir";

    }

    /*
     * Restricciones:
     * El valor mínimo no puede ser inferior a min.
     * El valor máximo no puede ser superior a max.
     */
    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.menu = "\nMenu " + this.name // no cambia nombre
                + "\n1-Estado"
                + "\n2-Change name"
                + "\n3-Change min"
                + "\n4-Change max"
                + "\n5-Change step"
                + "\n6-Change value"
                + "\n7-Increase"
                + "\n8-Decrease"
                + "\n9-Reset"
                + "\n10-Show history"
                + "\n11-Reset history"
                + "\n0-Salir";
    }

    // value
    public int getValue() {
        return value;
    }

    /*
     * Método para establecer valor manualmente:
     * Permite configurar el valor del contador directamente, siempre y cuando esté
     * dentro de los límites establecidos.
     */
    public void setValue(int value) {
        if (value >= min && value <= max) {
            contador++;
            historial += ("\nAction " + contador + "- Valor " + this.value + " cambiado a " + value);
            this.value = value;
        } else if (value < min) {
            value = max;
        } else {
            value = min;
        }
    }

    // min
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        contador++;
        historial += ("\nAction " + contador + "-  Min cambiado a " + min);
        this.min = min;
        if (value < min) {
            value = max;
        }
    }

    // max
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        contador++;
        historial += ("\nAction " + contador + "-  Max cambiado a " + max);
        this.max = max;
        if (value > max) {
            value = min;
        }
    }

    // step
    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getContador() {
        return contador;
    }

    // historial
    public String getHistorial() {
        return historial;
    }

    // menu
    public String getMenu() {
        return menu;
    }
    /*
     * Métodos obligatorios:
     * incrementar(): Incrementa el valor del contador según el paso (step),
     * respetando el valor máximo.
     * decrementar(): Decrementa el valor del contador según el paso (step),
     * respetando el valor mínimo.
     * mostrar(): Muestra el nombre y el valor actual del contador de manera
     * legible.
     * reiniciar(): Restablece el contador a su valor inicial (min).
     */

    public void incrementar() {
        contador++;
        if ((value + step) <= max) {
            historial += ("\nAction " + contador + "- Valor " + value + " + " + step + " = " + (value + step));
            this.value += step;
        } else {
            historial += ("\nAction " + contador + "- Valor " + value + " + " + step + " = " + min + "(Max superado)");
            value = min;
        }

    }

    public void decrementar() {
        contador++;
        if ((value - step) >= min) {
            historial += ("\nAction " + contador + "- Valor " + value + " - " + step + " = " + (value - step));
            value -= step;
        } else {
            historial += ("\nAction " + contador + "- Valor " + value + " - " + step + " = " + max + "(Min superado)");
            value = max;
        }
    }

    // no usado
    public String mostrar() {
        return ("Contador " + name + " = " + value);
    }

    public void reiniciar() {
        contador++;
        historial += ("\nAction " + contador + "- Valor " + value + " reseteado al min " + min);
        value = min;
    }

    /*
     * Historial de acciones: Agrega un historial de operaciones realizadas en el
     * contador. Este historial puede ser consultado con un método llamado
     * ver_historial().
     */
    public void ver_historial() {
        System.out.println("\nHistorial de " + name + getHistorial());
    }

    public void reset_historial() {
        historial = "";
        contador = 0;
    }

    // mostra info
    public String showState() {
        return ("\nObject info"
                + "\nName: " + name
                + "\nMin: " + min
                + "\nMax: " + max
                + "\nStep: " + step
                + "\nValue: " + value);
    }

    // menu
    public static void menu(ContadorCircular object) {
        int option;
        boolean flag = true;
        while (flag) {
            System.out.println(object.getMenu());
            System.out.print("\nElige una opcion: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> System.out.println(object.showState());
                case 2 -> {
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    object.setName(newName);
                }
                case 3 -> {
                    System.out.print("New Min: ");
                    int newMin = Integer.parseInt(sc.nextLine());
                    object.setMin(newMin);
                }
                case 4 -> {
                    System.out.print("New Max: ");
                    int newMax = Integer.parseInt(sc.nextLine());
                    object.setMax(newMax);
                }
                case 5 -> {
                    System.out.print("New Step: ");
                    int newStep = Integer.parseInt(sc.nextLine());
                    object.setStep(newStep);
                }
                case 6 -> {
                    System.out.print("New Value: ");
                    int newValue = Integer.parseInt(sc.nextLine());
                    object.setValue(newValue);
                }
                case 7 -> object.incrementar();
                case 8 -> object.decrementar();
                case 9 -> object.reiniciar();
                case 10 -> object.ver_historial();
                case 11 -> object.reset_historial();
                default -> flag = false;
            }
        }
    }
}
