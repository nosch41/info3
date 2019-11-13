import fabrikmethode.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KonkreterErzeugerXTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fabrikmethodeA() {
        KonkreterErzeugerA e1 = new KonkreterErzeugerA();
        Produkt p1 = e1.fabrikmethode();
        assertTrue(p1 instanceof KonkretesProduktA);
    }

    @Test
    void fabrikmethodeB() {
        KonkreterErzeugerB e1 = new KonkreterErzeugerB();
        Produkt p1 = e1.fabrikmethode();
        assertTrue(p1 instanceof KonkretesProduktB);
    }
}