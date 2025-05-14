import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void inicio() {
        // Instanciamos la vista y el modelo

        // Crear tres coches
        Model.crearCoche("LaFerrari", "SBC 1234");
        Model.crearCoche("Alpine", "HYU 4567");
        Model.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = Model.subirVelocidad("SBC 1234");
        int nuevaVelocidad2 = Model.bajarVelocidad("SBC 1234");

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = View.muestraVelocidad("SBC 1234", Model.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("Correcto");
        } else {
            System.out.println("Error");
        }
    }

    public static Coche crearCoche(String modelo, String matricula) {
        return Model.crearCoche(modelo, matricula);
    }

    public static int subirVelocidad(String matricula) {
        Model.crearCoche("LaFerrari", "SBC 1234");
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