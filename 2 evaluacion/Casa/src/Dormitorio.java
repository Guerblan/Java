public class Dormitorio extends Habitacion{
    private int numCamas;
    private static final String tipo = "Dormitorio";

    public Dormitorio(){
        super();
        numCamas = 0;
    }

    public Dormitorio(String name, int numCamas){
        super(name);
        this.numCamas = numCamas;
    }

    //getters and setters
    public int getNumCamas(){
        return numCamas;
    }

    public void setNumCamas(int numCamas){
        this.numCamas = numCamas;
    }

    //toString
    @Override
    public String toString(){
        return super.toString() +
            ", Numero de camas: " + this.numCamas +
            ", Subclase: " + tipo;
    }
}
