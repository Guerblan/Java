public class Animal {

    protected String nombre, tipo_alimentacion;
    protected int edad;

    public Animal() {
        this.nombre = "Default.nombre";
        this.tipo_alimentacion = "";
        this.edad = 0;
    }

    public Animal(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    // setters
    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // methods
    public void hacerSonido() {
        System.out.println("\nSoy un animal");
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre()
                + "\nTipo de alimentación: " + getTipo_alimentacion()
                + "\nEdad: " + getEdad();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return this.nombre.equals(animal.nombre) && this.tipo_alimentacion.equals(animal.tipo_alimentacion) && this.edad == animal.edad;
    }

}
