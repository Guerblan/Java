import java.util.Scanner;

public class UT5_1_Persona {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


        // Pide por teclado el nombre, la edad, sexo, peso y altura.
        String nombre = "Scannered";
        int edad = 10;
        char sexo = 'X';
        float peso = 30f;
        float altura = 1.3f;
        /*System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("\nEdad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("\nSexo: ");
        String sexoFrase = sc.nextLine();
        char sexo = sexoFrase.charAt(0);
        System.out.print("\nPeso: ");
        float peso = Float.parseFloat(sc.nextLine());
        System.out.print("\nAltura: ");
        float altura = Float.parseFloat(sc.nextLine());*/

        // Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores
        // variables pedidas por teclado, el segundo objeto obtendrá todos los
        // anteriores menos el peso y la altura y el último por defecto, para este
        // último utiliza los métodos set para darle a los atributos un valor.

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        
        System.out.println("\nPersona3 por defecto: \n"+persona3.toString()+"\n");

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        // Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso
        // o por debajo de su peso ideal con un mensaje.
        System.out.println("Persona1 tiene un peso de "+persona1.getPeso()+" y una altura de "+persona1.getAltura()+". Esta considerado "+readIMC(persona1.calcularIMC()));
        System.out.println("persona2 tiene un peso de "+persona2.getPeso()+" y una altura de "+persona2.getAltura()+". Esta considerado "+readIMC(persona2.calcularIMC()));
        System.out.println("persona3 tiene un peso de "+persona3.getPeso()+" y una altura de "+persona3.getAltura()+". Esta considerado "+readIMC(persona3.calcularIMC()));
        // Comprobar para cada objeto si es mayor de edad.
        ReadEsMayorDeEdad(persona1);
        ReadEsMayorDeEdad(persona2);
        ReadEsMayorDeEdad(persona3);
        // Por último, mostrar la información de cada objeto.
        System.out.println("\nPersona1: \n"+persona1.toString()+"\n");
        System.out.println("\nPersona2: \n"+persona2.toString()+"\n");
        System.out.println("\nPersona3: \n"+persona3.toString()+"\n");

        //Prueba de dos formas diferentes para métodos STATIC
        System.out.println("persona.getPeso() = " + Persona.pruebaPersonaGetPeso(persona3));
        System.out.println("persona.peso = " + Persona.pruebaPersonaPeso(persona3));

        /* float pruebaPeso = persona3.peso; */
        float pruebaFuncionPeso = Persona.pruebaPersonaPeso(persona3);
        float pruebaFuncionGetPeso = Persona.pruebaPersonaGetPeso(persona3);
    }

    public static String readIMC(int num){
        String condition="";
        switch (num) {
            case -1 -> condition="Flacucho";
            case 0 -> condition="Peso normal";
            case 1 -> condition="Gordo";
            default -> condition="Error";
        }
        return condition;
    }

    public static void ReadEsMayorDeEdad(Persona persona){
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
