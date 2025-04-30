/**
 * Clase encargada de la interacción con el usuario
 */
public class View {

    public static void menu(){
        System.out.println("1: Crear coche");
        System.out.println("2: Subir velocidad");
        System.out.println("3: Bajar velocidad");
        System.out.println("4: Mostrar velocidad");
        System.out.println("5: Salir");
        Controller.inicio();
    }

    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
}
