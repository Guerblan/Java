
import java.util.ArrayList;;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Producto> ListaProductos = new ArrayList<>();
        Producto p1 = new Producto("zapato", 100);
        Producto p2 = new Producto("camisa", 100);
        Producto p3 = new Producto("bufanda", 100);

        ListaProductos.add(p1);
        ListaProductos.add(p2);
        ListaProductos.add(p3);

        for (Producto p : ListaProductos) {
           p.aplicarDescuento();
            System.out.println(p.getPrecio());
        }

        double totalPrecio = Utilidades.calcularPrecioTotal(ListaProductos);
        System.out.println("El precio total de tu producto es " + totalPrecio);
    }
}
