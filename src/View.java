import java.util.Scanner;

public class View {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Coche nuevoCoche = null;
        int opcion;
        String matricula = "3455CXC"; // Valor predeterminado

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1: Crear coche");
            System.out.println("2: Subir velocidad");
            System.out.println("3: Bajar velocidad");
            System.out.println("4: Mostrar coche");
            System.out.println("5: Salir");
            System.out.print("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.nextLine(); // Limpiar entrada inválida
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    String modelo = "Seat";
                    nuevoCoche = Controller.crearCoche(modelo, matricula);
                    System.out.println("Creado coche de modelo " + nuevoCoche.modelo + " y matrícula " + nuevoCoche.matricula);
                    break;

                case 2:
                    if (Controller.getCoche(matricula) == null) {
                        System.out.println("Primero debes crear el coche.");
                        break;
                    }
                    int nuevaVelocidad = Controller.subirVelocidad(matricula);
                    System.out.println("Velocidad aumentada. Nueva velocidad: " + nuevaVelocidad + " km/h");
                    break;

                case 3:
                    if (Controller.getCoche(matricula) == null) {
                        System.out.println("Primero debes crear el coche.");
                        break;
                    }
                    nuevaVelocidad = Controller.bajarVelocidad(matricula);
                    System.out.println("Velocidad reducida. Nueva velocidad: " + nuevaVelocidad + " km/h");
                    break;


                case 4:
                    Coche cocheMostrado = Controller.getCoche(matricula);
                    if (cocheMostrado != null) {
                        System.out.println("Coche: " + cocheMostrado.modelo + ", Matrícula: " + cocheMostrado.matricula + ", Velocidad: " + cocheMostrado.velocidad + " km/h");
                    } else {
                        System.out.println("No se encontró ningún coche");
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (true);
    }

    public static boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + " km/h");
        return true;
    }
}
