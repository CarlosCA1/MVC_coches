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

    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     *
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula) {
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }


    public int subirVelocidad(String matricula) {
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

    public int bajarVelocidad(String matricula) {
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
     * @return
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
