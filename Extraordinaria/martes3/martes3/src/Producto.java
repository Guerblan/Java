public class Producto implements DescuentoAplicable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double aplicarDescuento(double precio) {
        if (precio > 50) {

            return precio * 0.9;

        } else {
            return precio;
        }

    }

    public void aplicarDescuento() {
        this.precio = aplicarDescuento(this.precio);
    }

    public double getPrecio() {
        return precio;
    }

}
