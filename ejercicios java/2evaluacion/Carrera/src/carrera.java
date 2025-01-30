import java.util.ArrayList;

public class carrera {
    String nombre;
    String facultad;
    ArrayList<materia> coleccionMaterias;
    ArrayList<carrera> coleccionCarreras;
    int numeroMaterias;

    public carrera(String nombre, String facultad, ArrayList<materia> coleccionMaterias,
            ArrayList<carrera> coleccionCarreras,
            int numeroMaterias) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.coleccionMaterias = coleccionMaterias;
        this.coleccionCarreras = coleccionCarreras;
        this.numeroMaterias = numeroMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public ArrayList<materia> getcoleccionMaterias() {
        return coleccionMaterias;
    }

    public ArrayList<carrera> getcolecionCarreras() {
        return coleccionCarreras;
    }

    public int getnumeroMaterias() {
        return numeroMaterias;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setfacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setcoleccionMaterias(ArrayList<materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public void setcoleccionCarreras(ArrayList<carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void setnumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public void agregarMateria(materia Materia) {

    }

    public void eliminarMateria(materia Materia) {

    }

    public int contarMaterias() {
        return numeroMaterias;
    }

    public ArrayList<materia> encontrarMateria() {
        return coleccionMaterias;
    }

    public void crearColeccion() {

    }

    public void agregarCarrera(carrera Carrera) {

    }

    public void eliminarCarrera(carrera Carrera) {

    }

}
