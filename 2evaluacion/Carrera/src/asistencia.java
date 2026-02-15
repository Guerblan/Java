public class asistencia {
    String fecha;
    int numAlumnos;

    public asistencia(String fecha, int numAlumnos) {
        this.fecha = fecha;
        this.numAlumnos = numAlumnos;
    }

    public void agregarAlumno(alumno Alumno) {

    }

    public void eliminarAlumno(alumno Alumno) {

    }

    public int contarAlumnos() {
        return numAlumnos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
}