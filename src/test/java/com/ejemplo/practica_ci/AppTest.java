package com.ejemplo.practica_ci;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSuma() {
        assertEquals(5, App.suma(2, 3)); // correcto
    }

    // Test que falla intencionadamente (lo usaremos en el vídeo)
    @Test
    public void testSumaConFallo() {
        assertEquals(10, App.suma(4, 5)); // incorrecto a propósito
    }
}
