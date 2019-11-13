package GloCiNo;

public class KonkreterErzeugerPayPal extends Erzeuger {
    public Zahlweise fabrikmethode() {
        return new PayPal();
    }
}
