public class App {
    public static void main(String[] args) {
        //instancio una CASA
        Casa casita = new Casa(12);

        /* creo varias habitaciones para meterlas en un array de HABITACIONES, ahi caben tanto habitaciones como sus subclases */
        /* si el array fuera de DORMITORIOS no cabrian COCINAS ni HABITACIONES */
        Habitacion habitacion1 = new Habitacion();
        Habitacion habitacion2 = new Dormitorio();
        Habitacion habitacion3 = new Cocina();

        Dormitorio dormitorio1 = new Dormitorio();
        
        Cocina cocina1 = new Cocina();

        /* meto todos los objetos de HABITACION o sus subclases DORMITORIO y COCINA en el array HABITACIONES */
        /* HABITACIONES [ ] es privado, asique uso el metodo GET */
        casita.getHabitaciones()[0]=habitacion1;
        casita.getHabitaciones()[1]=habitacion2;
        casita.getHabitaciones()[2]=habitacion3;
        casita.getHabitaciones()[3]=dormitorio1;
        casita.getHabitaciones()[4]=cocina1;

        /* HABITACIONESVISIBLES [ ] es publico asique puedo acceder sin GET */
        casita.habitacionesVisibles[1]=habitacion1;

        //imprimo por pantalla
        System.out.println(casita.toString());
    }
}
