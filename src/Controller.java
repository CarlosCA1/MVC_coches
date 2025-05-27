//Los métodos llaman al model
public class Controller {

    public static Coche crearCoche(String modelo, String matricula) {
        return Model.crearCoche(modelo, matricula);
    }

    public static int subirVelocidad(String matricula) {
        return Model.subirVelocidad(matricula);
    }

    public static int bajarVelocidad(String matricula) {
        Model.crearCoche("Alpine", "HYU 4567");
        return Model.bajarVelocidad(matricula);
    }

    public static Coche getCoche(String matricula) {
        return Model.getCoche(matricula);
    }
}