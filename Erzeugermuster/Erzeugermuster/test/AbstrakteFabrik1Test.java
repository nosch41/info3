import abstraktefabrik.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstrakteFabrik1Test {
    private Client c;

    @BeforeEach
    void setUp() {
        c = new Client();
        IAbstrakteFabrik k1 =  new KonkreteFabrik1();
        c.setFabrik(k1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testKonkretesProduktA1(){
        IAbstraktesProduktA pA1 =  c.getFabrik().erzeugeProduktA();
        assertTrue(pA1 instanceof KonkretesProduktA1);
    }

    @Test
    void testKonkretesProduktB1(){
        IAbstraktesProduktB pB1 =  c.getFabrik().erzeugeProduktB();
        assertTrue(pB1 instanceof KonkretesProduktB1);
    }
}
