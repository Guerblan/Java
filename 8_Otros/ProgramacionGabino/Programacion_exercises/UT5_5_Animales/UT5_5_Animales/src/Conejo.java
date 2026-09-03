public class Conejo extends Animal {
    private int zanahoriasAlmacenadas;
    private String colorPelo;
    private String tipoOreja;
    private int tamanioOreja;

    public Conejo() {
        super();
        zanahoriasAlmacenadas = 0;
        colorPelo = "Blanco";
        tipoOreja = "Caida";
        tamanioOreja = 27;
    }

    public Conejo(String nombre, String tipoAlimentacion, int edad, int zanahoriasAlmacenadas, String colorPelo,
            String tipoOreja, int tamanioOreja) {
        super(nombre, tipoAlimentacion, edad);
        this.zanahoriasAlmacenadas = zanahoriasAlmacenadas;
        this.colorPelo = colorPelo;
        this.tipoOreja = tipoOreja;
        this.tamanioOreja = tamanioOreja;
    }

    public int getZanahoriasAlmacenadas() {
        return this.zanahoriasAlmacenadas;
    }

    public void setZanahoriasAlmacenadas(int zanahoriasAlmacenadas) {
        this.zanahoriasAlmacenadas = zanahoriasAlmacenadas;
    }

    public String getColorPelo() {
        return this.colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getTipoOreja() {
        return this.tipoOreja;
    }

    public void setTipoOreja(String tipoOreja) {
        this.tipoOreja = tipoOreja;
    }

    public int getTamanioOreja() {
        return this.tamanioOreja;
    }

    public void setTamanioOreja(int tamanioOreja) {
        this.tamanioOreja = tamanioOreja;
    }

    public void comerCable() {
        System.out.println("Hola soy " + getNombre() + " y me gustan los cables ÑOM");
    }

    @Override
    public void hacerSonido() {
        System.out.println("\nSoy un conejo");
    }

    @Override
    public String toString() {
        return super.toString() +
                " \nzanahoriasAlmacenadas='" + getZanahoriasAlmacenadas() + "'" +
                ", \ncolorPelo='" + getColorPelo() + "'" +
                ", \ntipoOreja='" + getTipoOreja() + "'" +
                ", \ntamanioOreja='" + getTamanioOreja() + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Conejo)) {
            return false;
        }
        Conejo conejo = (Conejo) obj;
        return super.equals(conejo) && this.zanahoriasAlmacenadas == conejo.zanahoriasAlmacenadas
                && this.colorPelo.equals(conejo.colorPelo) && this.tipoOreja.equals(conejo.tipoOreja)
                && this.tamanioOreja == conejo.tamanioOreja;
    }

}
