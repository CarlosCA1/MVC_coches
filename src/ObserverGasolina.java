/**
 * Observador que recibe notificaciones sobre el nivel de gasolina de un coche.
 * Si el nivel baja de un límite definido, llama a una alerta.
 */
public class ObserverGasolina {

    /** Límite mínimo de gasolina para mostrar la alerta */
    final static int LIMITE_GASOLINA = 10;

    /**
     * Método que se llama cuando cambia el estado del coche.
     * Comprueba el nivel de gasolina y llama a la View para que muestre una alerta si es necesario.
     *
     * @param coche El coche cuyo estado ha cambiado.
     */
    public static void update(Coche coche) {
        if (coche.litrosGasolina < LIMITE_GASOLINA) {
            View.alarmaRepostar(coche.matricula, coche.litrosGasolina);
        }
    }
}