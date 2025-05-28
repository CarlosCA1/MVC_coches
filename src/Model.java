import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model{
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
        Coche coche = getCoche(matricula);
        if (coche == null) return -1;

        coche.velocidad = coche.velocidad + 1;
        //notificarObservadoresEstatico(coche); // Notifica cambio
        return coche.velocidad;
    }

    /**
     * Baja la velocidad 1 km/h
     * @param matricula
     * @return nueva velocidad
     */
    public static int bajarVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche == null) return -1;

        if (coche.velocidad > 0) {
            coche.velocidad = coche.velocidad - 1;
            //notificarObservadoresEstatico(coche); // Notifica solo si cambia
        }

        return coche.velocidad;
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
