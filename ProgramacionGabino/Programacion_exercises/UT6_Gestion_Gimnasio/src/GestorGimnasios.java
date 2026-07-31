public class GestorGimnasios {
    private int numMaxGimnasios;
    private Gimnasio[] gimnasios= new Gimnasio[numMaxGimnasios];
    private int numGimnasios = 0;
    private String name;

    public GestorGimnasios(){
        numMaxGimnasios = 10;
        name = "Default";
    }

    public GestorGimnasios(int numMaxGimnasios, String name){
        this.numMaxGimnasios = numMaxGimnasios;
        this.name = name;
    }

    public int getNumMaxGimnasios() {
        return this.numMaxGimnasios;
    }

    public Gimnasio [] getGimnasios(){
        return gimnasios;
    }

    public void setGimnasios(Gimnasio[] gimnasios){
        this.gimnasios = gimnasios;
    }

    public int getNumGimnasios(){
        return numGimnasios;
    }

    public void setNumGimnasios(int numGimnasios){
        this.numGimnasios = numGimnasios;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
            " numMaxGimnasios='" + getNumMaxGimnasios() + "'" +
            ", gimnasios='" + getGimnasios().toString() + "'" +
            ", numGimnasios='" + getNumGimnasios() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }





}
