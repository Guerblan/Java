public class Maquina extends Material implements Utilizable, Ocupable {
    private Estado estado;

    public Maquina() {
        super();
    }

    public Maquina(String name) {
        super();
        estado = Estado.LIBRE;
    }

    // estado
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    @Override
    public void ocupar(){
        setEstado(Estado.OCUPADO);
    }
    @Override
    public void desocupar(){
        setEstado(Estado.LIBRE);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof Maquina)) {
            return false;
        }
        Maquina maquina = (Maquina) o;
        return super.equals(maquina) && this.estado == maquina.estado;
    }
    
    @Override
    public String toString() {
        return "{" +
                super.toString() +
                " estado='" + getEstado() + "'" +
                "}";
    }

}
