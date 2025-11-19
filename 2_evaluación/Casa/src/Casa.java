public class Casa {
    private int numHabitaciones;
    private int numMaxHabitaciones;
    private Habitacion[] habitaciones;
    public Habitacion[] habitacionesVisibles;
    public static int numCasas = 0;

    public Casa() {
        numMaxHabitaciones = 10;
        habitaciones = new Habitacion[numMaxHabitaciones];
        habitacionesVisibles = new Habitacion[numMaxHabitaciones];
        numCasas++;
    }

    public Casa(int numMaxHabitaciones) {
        this.numMaxHabitaciones = numMaxHabitaciones;
        habitaciones = new Habitacion[numMaxHabitaciones];
        habitacionesVisibles = new Habitacion[numMaxHabitaciones];
        Casa.numCasas++;
    }

    // getters and setters
    public int getNumHabitaciones() {
        return this.numHabitaciones;
    }

    public int getNumMaxHabitaciones() {
        return this.numMaxHabitaciones;
    }

    public Habitacion[] getHabitaciones() {
        return this.habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    /*
     * sobreescribo toString, esta es una forma mala que recorre todo el array y si
     * NO ES NULL lo sumo un String auxiliar (CASATOSTRING), el metodo correcto
     * seria utilizar una funcion add() y una variable numHabitaciones, de tal modo
     * que SOLO añadiera habitaciones utilizando add() que hiciera
     * NUMHABITACIONES++, asi solo recorreriamos las habitaciones !=NULL
     */
    @Override
    public String toString() {
        String casaToString = ""; // inicializo String
        for (int i = 0; i < habitaciones.length; i++) {
            if (getHabitaciones()[i] != null) {
                casaToString += habitaciones[i].toString(); // aunque habitaciones es privado, dentro de la misma clase
                                                            // puedo llamarlas sin el GET
            }
        }
        return casaToString;
    }
}
