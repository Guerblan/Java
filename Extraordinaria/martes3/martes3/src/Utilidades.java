import java.util.ArrayList;

public class Utilidades {
    
    public static double calcularPrecioTotal(ArrayList<Producto>ListaProductos){
        double totalPrecio=0;
        for(Producto p:ListaProductos){
            totalPrecio += p.getPrecio();
        }
        return totalPrecio;
    }

    
}
