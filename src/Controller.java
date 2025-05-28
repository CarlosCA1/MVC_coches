/**
 * Clase Controlador que actúa como intermediario entre la vista y el modelo.
 * Redirige las acciones del usuario hacia los métodos correspondientes del modelo.
 */
public class Controller {

    /**
     * Crea un nuevo coche en el modelo.
     *
     * @param modelo    Modelo del coche.
     * @param matricula Matrícula única del coche.
     * @return El objeto Coche creado.
     */
    public static Coche crearCoche(String modelo, String matricula) {
        return Model.crearCoche(modelo, matricula);
    }

    /**
     * Aumenta la velocidad del coche con la matrícula dada.
     *
     * @param matricula Matrícula del coche.
     * @return Nueva velocidad del coche, o -1 si no se encuentra.
     */
    public static int subirVelocidad(String matricula) {
        return Model.subirVelocidad(matricula);
    }

    /**
     * Disminuye la velocidad del coche con la matrícula dada.
     *
     * @param matricula Matrícula del coche.
     * @return Nueva velocidad del coche, o -1 si no se encuentra.
     */
    public static int bajarVelocidad(String matricula) {
        Model.crearCoche("Alpine", "HYU 4567");
        return Model.bajarVelocidad(matricula);
    }

    /**
     * Obtiene un coche a partir de su matrícula.
     *
     * @param matricula Matrícula del coche.
     * @return El coche correspondiente o null si no existe.
     */
    public static Coche getCoche(String matricula) {
        return Model.getCoche(matricula);
    }

    public static int avanzaCoche(String matricula) {
        Model.crearCoche("Alpine", "HYU 4567");
        return Model.avanzaCoche(matricula);
    }

    public static int getLitros(String matricula) {
        return Model.getLitros(matricula);
    }
}