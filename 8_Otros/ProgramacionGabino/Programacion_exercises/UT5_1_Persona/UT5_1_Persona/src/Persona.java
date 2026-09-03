import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private final static char sexoDefecto = 'H';
    private float peso;
    private float altura;

    public Persona() {
        this.nombre = "Gabino";
        this.edad = 33;
        this.dni = generaDNI();
        this.sexo = 'H';
        this.peso = 105f;
        this.altura = 1.82f;
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni=generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        float IMC = this.peso / (this.altura * this.altura);
        if (IMC < 20) {
            return -1;
        } else if (20 <= IMC && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public static float pruebaPersonaGetPeso (Persona persona){
        return persona.getPeso();
    }

    public static float pruebaPersonaPeso (Persona persona){
        return persona.peso;
    }

    public boolean esMayorDeEdad() {
        return this.edad>=18;
    }

    public char comprobarSexo(char sexo) {
        if (sexo!='H' || sexo != 'F') {
            sexo = sexoDefecto;
        }
        return sexo;
    }

    public String toString() {
        return "Nombre: " + this.nombre
                + "\nEdad: " + this.edad
                + "\nDNI: " + this.dni
                + "\nSexo: " + this.sexo
                + "\nPeso: " + this.peso + "Kg"
                + "\nAltura: " + this.altura + "m";
    }

    public String generaDNI() {
        Random random = new Random();
        int num = random.nextInt(100_000_000);
        String dni = String.format("%08d", num);
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        dni += letras[num % 23];
        return dni;
    }
    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Dni
    public String getDni() {
        return dni;
    }
    //Sexo
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }
    //Peso
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    //Altura
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}