
public class Gato extends Animal {
    private String color;
    private FurLength furLength;
    private int independancyLevel;

    public Gato() {
        super();
        color = "Default color";
        furLength = FurLength.MEDIUM;
        independancyLevel = 5;
    }

    public Gato(String nombre, String tipo_alimentacion, int edad, String color, FurLength furLength,
            int independancyLevel) {
        super(nombre, tipo_alimentacion, edad);
        this.color = color;
        this.furLength = furLength;
        this.independancyLevel = independancyLevel;
    }

    // getters
    public String getColor() {
        return this.color;
    }

    public FurLength getFurLength() {
        return this.furLength;
    }

    public int getIndependacyLevel() {
        return this.independancyLevel;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setFurLength(FurLength furLength) {
        this.furLength = furLength;
    }

    public void setIndependencyLevel(int independancyLevel) {
        if (independancyLevel <= 10 && independancyLevel >= 1) {
            this.independancyLevel = independancyLevel;
        }
    }

    // methods
    @Override
    public void hacerSonido() {
        System.out.println("\nSoy un gato");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nColor: " + this.color
                + "\nTamaño del pelaje: " + furLength
                + "\nNivel de independencia: " + independancyLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Gato)) {
            return false;
        }
        Gato gato = (Gato) obj;
        return super.equals(gato) && this.color.equals(gato.color)
            && this.furLength == gato.furLength
            && this.independancyLevel == gato.independancyLevel;
    }
}
