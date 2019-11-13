import abstraktefabrik.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstrakteFabrik2Test {
    private Client c;

    @BeforeEach
    void setUp() {
        c = new Client();
        IAbstrakteFabrik k2 =  new KonkreteFabrik2();
        c.setFabrik(k2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testKonkretesProduktA2(){
        IAbstraktesProduktA pA2 =  c.getFabrik().erzeugeProduktA();
        assertTrue(pA2 instanceof KonkretesProduktA2);
    }

    @Test
    void testKonkretesProduktB2(){
        IAbstraktesProduktB pB2 =  c.getFabrik().erzeugeProduktB();
        assertTrue(pB2 instanceof KonkretesProduktB2);
    }
}
