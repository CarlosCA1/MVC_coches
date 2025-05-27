import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     *
     * @param modelo    del coche
     * @param matricula identificador unico
     * @return el coche creado
     */

    public static Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     *
     * @param matricula a buscar
     * @return coche o null si no existe
     */
    public static Coche getCoche(String matricula) {
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }


    /**
     * Sube la velocidad 1 km/h
     * @param matricula
     * @return nueva velocidad
     */
    public static int subirVelocidad(String matricula) {
        // busca el coche
        getCoche(matricula).velocidad = getCoche(matricula).velocidad + 1;

        //Si el valor es nulo, retorna -1
        if(getCoche(matricula).velocidad==null){
            return -1;
        } else {
            // retorna la nueva velocidad
            return getCoche(matricula).velocidad;
        }
    }

    /**
     * Baja la velocidad 1 km/h
     * @param matricula
     * @return nueva velocidad
     */
    public static int bajarVelocidad(String matricula) {
        // busca el coche
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - 1;

        //Si el valor es nulo, retorna -1
        if (getCoche(matricula).velocidad==null){
            return -1;
        }

        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }


    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return velocidad
     */
    public static int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
