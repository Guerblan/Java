public class Perro extends Animal {
    private Size size;
    private String race;
    private int energy; 
    private Fur fur;

    public Perro(){
        super();
        this.size = Size.MEDIUM;
        this.race = "Default race";
        this.energy = 5;
        this.fur = Fur.MEDIUM;
    }

    public Perro(String nombre,String tipo_alimentacion,int edad, Size size, String race, int energy, Fur fur){
        super(nombre,tipo_alimentacion, edad);
        this.size = size;
        this.race = race;
        this.energy = (energy>=0 && energy <=0) ? energy : 0;
        this.fur = fur;
    }

    //getters
    public Size getSize(){
        return size;
    }

    public String getRace(){
        return race;
    }

    public int getEnergy(){
        return energy;
    }

    public Fur getFur(){
        return fur;
    }

    //setters
    public void setSize(Size size){
        this.size = size;
    }

    public void setRace(String race){
        this.race = race;
    }

    public void setEnergy (int energy){
        if (energy <= 10 && energy >= 1) {
            this.energy = energy;
        }
    }

    public void setFur (Fur fur){
        this.fur = fur;
    }

    
    //methods
    @Override
    public void hacerSonido(){
        switch (size) {
            case Size.SMALL -> System.out.println("\nSoy un perro pequeño");
            case Size.MEDIUM -> System.out.println("\nSoy un perro normal");
            case Size.BIG -> System.out.println("\nSoy un perro grande");
            default -> System.out.println("\nSoy un perro sin tamaño");
        }
    }

    @Override
    public String toString(){
        return super.toString()
        +"\nSize: "+this.size
        +"\nRaza: "+race
        +"\nEnergía: "+energy
        +"\nPelaje: "+this.fur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Perro)) {
            return false;
        }
        Perro perro = (Perro) obj;
        return super.equals(perro)
            && this.size == perro.size
            && this.race.equals(perro.race)
            && this.energy == perro.energy
            && this.fur == perro.fur;
    }
}


