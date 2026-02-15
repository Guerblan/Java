public class Banco {
    private String nombre;
    private double interes;
    private cuentaCorriente[] cuentas;
    private int numeroTrabajadores;
}

public banco (String nombre, double interes, cuentaCorriente[] cuentas, int numeroTrabajadores){
    this.nombre = nombre;
    this.interes = interes;
    this.cuentas = cuentas;
    this.numeroTrabajadores = numeroTrabajadores;
    //

}

    public String getNombre() {
        return nombre;
    }

    public double getinteres() {
        return interes;
    }

    public cuentaCorriente[] getcuentas() {
        return cuentas;
    }

    public int getnumeroTrabajadores() {
        return numeroTrabajadores;
    }

/*
 * public void setNombre(String nombre) {
 * this.nombre = nombre;
 * }
 * 
 * public void setinteres(double interes) {
 * this.interes = interes;
 * }
 * 
 * public void setcuentas(cuentaCorriente[] cuentas ){
 * this.cuentas=cuentas;
 * }
 * 
 * public void setnumeroTrabajadores(int numeroTrabajadores){
 * this.numeroTrabajadores=numeroTrabajadores;
 * }
 */
