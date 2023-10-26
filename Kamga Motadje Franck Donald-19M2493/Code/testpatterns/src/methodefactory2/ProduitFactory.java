package testpatterns.methodefactory2;

public abstract class ProduitFactory{
    public ProduitA getProduitA() {
        return new createProduitA();
    }
    protected abstract ProduitA createProduitA();
}