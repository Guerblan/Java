import java.util.ArrayList;
import java.util.List;

public class Utilidades {

    
    public static double precioTotal(List<Producto> ListaDeProductos) {
        double precioTotal = 0;
        for (Producto producto : ListaDeProductos) {
            precioTotal = precioTotal + producto.getPrecio();
        }
        return precioTotal;
    }

}
