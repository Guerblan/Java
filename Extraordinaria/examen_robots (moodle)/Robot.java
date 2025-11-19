public class Robot implements InterfazRobot {

    private int identificador;
    private String nombre;
    private String especialidad;
    private boolean trabajando = false;
    private int energia;
    private String[] kitHerramientas;
    static final int MAX_HERRAMIENTAS = 5;

    public Robot(int identificador, String nombre, String especialidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.especialidad = especialidad;
        trabajando=false;
        energia=80;
        kitHerramientas[] = new String[MAX_HERRAMIENTAS];

    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String[] getKitHerramientas() {
        return kitHerramientas;
    }

    public void setKitHerramientas(String[] kitHerramientas) {
        this.kitHerramientas = kitHerramientas;
    }

    public static int getMaxHerramientas() {
        return MAX_HERRAMIENTAS;
    }

}
