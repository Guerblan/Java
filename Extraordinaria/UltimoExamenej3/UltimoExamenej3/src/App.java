import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Producto> ListaDeProductos = new ArrayList<>();
        Producto p1 = new Producto("Camiseta", 100);
        Producto p2 = new Producto("cinturón", 100);
        Producto p3 = new Producto("calcetines", 100);

        ListaDeProductos.add(p1);
        ListaDeProductos.add(p2);
        ListaDeProductos.add(p3);

        for (Producto producto : ListaDeProductos) {
            producto.aplicarDescuento();
        }

        double TotalPrecio = Utilidades.precioTotal(ListaDeProductos);
        System.out.println("Precio total = " + TotalPrecio);

    }
}
