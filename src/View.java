import java.util.Scanner;

/**
 * Clase View que implementa la interfaz {@code Observador}.
 * Se encarga de mostrar el menú de interacción al usuario y de recibir notificaciones
 * cuando cambia el estado del modelo (patrón Observer).
 */

public class View {

    // Método estático que muestra el menú principal y gestiona la interacción con el usuario
    public static void menu() {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entrada desde la consola
        Coche nuevoCoche = null;
        int opcion; // Almacena la opción elegida por el usuario
        String matricula = "3455CXC"; // Matrícula fija para el coche

        // Bucle principal del menú
        do {
            // Muestra las opciones del menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("1: Crear coche");
            System.out.println("2: Subir velocidad");
            System.out.println("3: Bajar velocidad");
            System.out.println("4: Mostrar coche");
            System.out.println("5: Avanzar");
            System.out.println("6: Mostrar litros de gasolina");
            System.out.println("7: Poner gasolina");
            System.out.println("8: Salir");
            System.out.print("Elige una opción: ");

            // Validación de entrada: si el usuario no escribe un número
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.nextLine(); // Limpia la entrada inválida
                continue;
            }

            opcion = scanner.nextInt(); // Lee la opción seleccionada
            scanner.nextLine(); // Limpia el buffer

            // Control de flujo según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Opción 1: crear un coche con modelo predeterminado "Seat" y matrícula fija
                    String modelo = "Seat";
                    nuevoCoche = Controller.crearCoche(modelo, matricula);
                    System.out.println("Coche creado");
                    break;

                case 2:
                    // Opción 2: subir velocidad del coche
                    if (Controller.getCoche(matricula) == null) {
                        System.out.println("Primero debes crear el coche.");
                        break;
                    }
                    int nuevaVelocidad = Controller.subirVelocidad(matricula);
                    System.out.println("Velocidad aumentada. Nueva velocidad: " + nuevaVelocidad + " km/h");
                    break;

                case 3:
                    // Opción 3: bajar velocidad del coche
                    if (Controller.getCoche(matricula) == null) {
                        System.out.println("Primero debes crear el coche.");
                        break;
                    }
                    nuevaVelocidad = Controller.bajarVelocidad(matricula);
                    System.out.println("Velocidad reducida. Nueva velocidad: " + nuevaVelocidad + " km/h");
                    break;

                case 4:
                    // Opción 4: mostrar información del coche
                    Coche cocheMostrado = Controller.getCoche(matricula);
                    if (cocheMostrado != null) {
                        System.out.println("Coche: " + cocheMostrado.modelo + ", Matrícula: " + cocheMostrado.matricula + ", Velocidad: " + cocheMostrado.velocidad + " km/h" + "Distancia: " + cocheMostrado.distancia + "km" + "Litros: " + cocheMostrado.litrosGasolina + "L");
                    } else {
                        System.out.println("No se encontró ningún coche");
                    }
                    break;

                case 5:
                    // avanzar
                    if (Controller.getCoche(matricula) == null) {
                        System.out.println("Primero debes crear el coche.");
                        break;
                    }
                    int nuevaDistancia = Controller.avanzaCoche(matricula);
                    System.out.println("Nueva distancia: " + nuevaDistancia + " km");
                    break;

                case 6:
                    // mostrar litros
                    int litrosRestantes = Controller.getLitros(matricula);
                    System.out.println("Coche: " + litrosRestantes + "L");
                    break;

                case 7:
                    // poner gasolina
                    if (Controller.getCoche(matricula) == null) {
                        System.out.println("Primero debes crear el coche.");
                        break;
                    }
                    int litros = Controller.ponerGasolina(matricula);
                    System.out.println("Se añadió 1 litro. Total ahora: " + litros + "L");
                    break;

                case 8:
                    // Opción 5: salir del programa
                    System.out.println("¡Hasta luego!");
                    scanner.close(); // Cierra el Scanner para liberar recursos
                    return; // Sale del método y del bucle

                default:
                    // Opción inválida
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (true); // Repite el menú hasta que se seleccione la opción 5 (salir)
    }
    /**
     * Muestra una alarma que avisa que es necesario repostar
     * @param matricula
     * @param l
     *
     */
    public static boolean alarmaRepostar(String matricula, Integer l) {
        System.out.println("[Alerta] Repostar: El coche de matrícula " + matricula +
                " tiene solo " + l + " litros.");
        return true;
    }
}
