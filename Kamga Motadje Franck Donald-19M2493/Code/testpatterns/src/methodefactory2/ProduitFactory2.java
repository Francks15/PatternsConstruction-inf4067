package testpatterns.methodefactory2;


public abstract class ProduitFactory{
    public ProduitA getProduitA() { return new createProduitA();}

    protected abstract ProduitA createProduitA();
}
//premiere fabrique

public class ProduitFactory1 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}
//frabrique 2
public class ProduitFactory2 extends ProduitFactory{
    protected ProduitA createProduitA(){ 
        return new ProduitA2();
    }
}