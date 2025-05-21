import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testModel {

    @Test
    @DisplayName("Get coche")
    void getCoche() {
        Model modelo1 = new Model();
        modelo1.crearCoche("Ferrari", "VXK 7240");
        Coche coche = modelo1.getCoche("VXK 7240");
        assertEquals("VXK 7240", coche.matricula);
        assertEquals("Ferrari", coche.modelo);
        assertNotNull(coche);
    }

    @Test
    @DisplayName("Subir velocidad")
    void subirVelocidad() {
        Model modelo2 = new Model();
        modelo2.crearCoche("Seat", "ABC 1234");
        int nuevaVelocidad = modelo2.subirVelocidad("ABC 1234");
        assertEquals(40, nuevaVelocidad);
    }

    @Test
    @DisplayName("Bajar velocidad")
    void bajarVelocidad() {
        Model modelo2 = new Model();
        modelo2.crearCoche("Seat", "ABC 1234");
        int nuevaVelocidad = modelo2.bajarVelocidad("ABC 1234");
        assertEquals(38, nuevaVelocidad);
    }


    @Test
    @DisplayName("Crear coche")
    void crearCoche() {
        Coche coche = Model.crearCoche("Seat", "ABC 1234");
        assertNotNull(coche);
        assertEquals("Seat", coche.modelo);
        assertEquals("ABC 1234", coche.matricula);
    }}
