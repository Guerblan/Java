public class profesor {
    String nombre;
    int legajo;
    double basico;
    int antiguedad;
    double sueldoTotal;

    public profesor(String nombre, int legajo, double basico, int antiguedad, double sueldoTotal) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.basico = basico;
        this.antiguedad = antiguedad;
        this.sueldoTotal = sueldoTotal;
    }

    public double calcularSueldo() {
        return sueldoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
}