public interface InterfazRobot {

    static final int MAX_HERRAMIENTAS = 5;

    //Función que agrega una herramienta del kit de herramientas
    boolean agregarHerramienta(String herramienta);

    //Función para eliminar una herramienta del kit de herramientas
    boolean borrarHerramienta(String herramienta);
    
    //Método para el robot, sobrescrito en la subclase
    abstract void trabajar() throws Exception;

    //sobreescritura del método equals de Object.
    boolean equals(Object obj);
    
    //sobreescritura del método hashCode de Object.
    int hashCode();
    
    //sobreescritura del método toString de Object, para mostrar del robot
    String toString();

    //sobreescritura del método compareTo de comparable
    int compareTo(Robot robot);
}
