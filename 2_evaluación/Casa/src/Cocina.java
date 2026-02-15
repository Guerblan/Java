public class Cocina extends Habitacion {
    private static String tipo = "Cocina";

    public Cocina(){
        super();
    }

    public Cocina(String name){
        super(name);
    }

    //toString
    public String toString(){
        return super.toString()+
            ", Subclase: "+tipo;
    }
}
