package abstraktefabrik;

public class KonkreteFabrik1 implements IAbstrakteFabrik {

    public IAbstraktesProduktA erzeugeProduktA(){
        return new KonkretesProduktA1();
    }

    public IAbstraktesProduktB erzeugeProduktB(){
        return new KonkretesProduktB1();
    }
}
