public class Habitacion {
    protected String name;
    private static final String tipo = "Habitacion";

    public Habitacion(){
        name = "Default";
    }

    public Habitacion(String name){
        this.name = name;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //toString
    @Override
    public String toString(){
        return "\nName: " +name +
            ", Clase: "+tipo;
    }
}
