public class Coche {
    private String marca;
    private int velocidad;

    public Coche(String marca,int velocidad){
        this.marca=marca;
        this.velocidad=velocidad;
    }

    public void mostrarValores(){
        System.out.println("La marca del coche es: "+ marca);
        System.out.println("La velocidad del coche es: "+ velocidad);

    }

    public void acelerar(int incremento){
        velocidad+=incremento;
    }

    public void decelerar(int decremento){
        velocidad-=decremento;
    }
}
