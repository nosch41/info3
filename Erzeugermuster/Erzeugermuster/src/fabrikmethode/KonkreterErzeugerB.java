package fabrikmethode;

public class KonkreterErzeugerB extends Erzeuger {
    @Override
    public Produkt fabrikmethode() {
        return new KonkretesProduktB();
    }
}
