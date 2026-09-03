public class Caballo extends Animal {
    private int height;
    private int maxSpeed;

    //constructors
    public Caballo(){
        super();
        this.height = 0;
        maxSpeed = 0;
    }

    public Caballo(String nombre,String tipo_alimentacion,int edad, int height, int maxSpeed){
        super(nombre, tipo_alimentacion, edad);
        this.height = height;
        this.maxSpeed = maxSpeed;
    }
    // getters
    public int getHeight() {
        return this.height;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // setters
    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // methods
    @Override
    public void hacerSonido() {
        System.out.println("\nEstoy relinchando, soy un caballo");
    }

    public int correr(int distancia) {
        return distancia / maxSpeed;
    }

    @Override
    public String toString(){
        return super.toString()
        +"\naltura: "+this.height
        +"\nVelocidad máxima: "+maxSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Caballo)) {
            return false;
        }
        Caballo caballo = (Caballo) obj;
        return super.equals(caballo)
            && this.height == caballo.height
            && this.maxSpeed == caballo.maxSpeed;
    }
}
