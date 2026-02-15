import java.util.Collection;
import java.util.List;

public interface InterfazFabrica {

    /**
     * Inserta un robot en la colección elegida para la fábrica
     * @param robot
     * @return true si ha sido insertado correctamente
     */
    public boolean insertarRobot(Robot robot);

    /**
     * Elimina un robot de la coleccion elegida
     * @param robot Robot
     * @return True si se ha eliminado el robot, false en caso contrario
     */
    public boolean eliminarRobot(Robot robot);

    /**
     * Iterator
     * 
     * Elimina un robot de la coleccion elegida mediante su identificador.
     * @param identificador El identificador del robot
     * @return True si se ha eliminado el robot, false en caso contrario
     */
    public boolean eliminarRobot(int identificador);

    /**
     * Busca un robot en la coleccion elegida a partir de su identificador
     * @param identificador El identificador del robot
     * @return El robot cuyo identificador coincide con el proporcionado
     */
    public Robot buscarRobot(int identificador);

    /**
     * Devuelve el número de robots de la fábrica
     * @return El número de robots de la fábrica
     */
    public int getNRobots();

    /**
     * Busca un robot y cambia su estado a trabajando si no lo está, o a no trabajando si lo está.
     * @param identificador El identificador del robot
     */
    public void fichar(int identificador);

    /**
     * Devuelve una lista con grupos de robots. Deberán hacerse grupos aleatorios 
     * con todos los robots obreros de la fábrica que estén trabajando, devolviendo una lista de grupos de robots
     * Cada grupo de robot debe estar ordenado por identificador. La estructura seleccionada
     * para los grupos debe permitir comprobar si los robots están presentes en el grupo
     * de manera eficiente
     * 
     * Nota: puedes crear una lista auxiliar a partir de otra coleccion en caso de que lo necesites
     * usando su constructor parametrizado.
     * A partir de una lista -> new ArrayList(lista);
     * A partir de un mapa -> new ArrayList(mapa.keySet());
     * @return Una lista de una colección a elegir siguiendo los requisitos
     */
    public List<Collection<Robobrero>> roboequipos();


    /**
     * Devuelve un String que resuelva la siguiente pregunta de teoría:
     * ¿Qué colección utilizaríamos si quisiesemos crear una cola de robots, donde
     * insertamos los que llegan al final y extraemos del inicio para su procesado?
     * @return Un String, la solución a la pregunta de teoría
     */
    public String preguntaTeoria1();

    /**
     * Devuelve un String que resuelva la siguiente pregunta de teoría:
     * ¿Qué es una clase Abstracta?
     * @return Un String, la solución a la pregunta de teoría
     */
    public String preguntaTeoria2();
}
