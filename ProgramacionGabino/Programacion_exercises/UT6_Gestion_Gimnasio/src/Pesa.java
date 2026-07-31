public class Pesa extends Material implements Utilizable {
    private int peso;

    public Pesa() {
        super();
        peso = 0;
    }

    public Pesa(String name, int peso) {
        super();
        this.peso = peso;
    }

    // peso
    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pesa)) {
            return false;
        }
        Pesa pesa = (Pesa) o;
        return super.equals(pesa) && this.peso == pesa.peso;
    }

    @Override
    public String toString() {
        return "{" +
                super.toString() +
                " peso='" + getPeso() + "'" +
                "}";
    }

}
