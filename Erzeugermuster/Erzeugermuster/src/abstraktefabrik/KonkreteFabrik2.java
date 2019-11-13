package abstraktefabrik;

public class KonkreteFabrik2 implements IAbstrakteFabrik {

    public IAbstraktesProduktA erzeugeProduktA(){
        return new KonkretesProduktA2();
    }

    public IAbstraktesProduktB erzeugeProduktB(){
        return new KonkretesProduktB2();
    }
}
