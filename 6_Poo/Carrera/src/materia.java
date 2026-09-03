public class materia {
    String nombre;
    profesor titular;
    int numAlumnos;
    String asistencia;

    public materia(String profesor, profesor titular, int numAlumnos) {
        this.nombre = nombre;
        this.titular = titular;
        this.numAlumnos = numAlumnos;
        this.asistencia = asistencia;
    }

    public void agregarAlumno(alumno Alumno) {

    }

    public void eliminarAlumno(alumno Alumno) {

    }

    public void agregarAsistencia(asistencia Asistencia) {

    }

    public void eliminarAsistencia(asistencia Asistencia) {

    }

    public int calcularInscritos() {
        return numAlumnos;
    }

    public String calcularAsistencia(asistencia fechaAsistencia) {
        return asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public profesor getTitular() {
        return titular;
    }

    public void setTitular(profesor titular) {
        this.titular = titular;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
}
