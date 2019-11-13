package fabrikmethode;

public class KonkreterErzeugerX extends Erzeuger {
    @Override
    public Produkt fabrikmethode() {
        return new KonkretesProduktX();
    }
}
