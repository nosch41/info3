package abstraktefabrik;

public class Client {
    private IAbstrakteFabrik f;

    public void setFabrik(IAbstrakteFabrik f){
        this.f = f;
    }

    public IAbstrakteFabrik getFabrik(){
        return f;
    }
}
