package construction.abstractfactory;

public class ProduitFactory1 implements IProduitFactory{
    public ProduitA getProduitA{
        return new ProduitA1();
    }
public ProduitB getProduitB(){
    return new ProduitB1();
}



public ProduitB getProduitB(){
    return ProduitB2();
}
}