package testpatterns.methodefactory1;


public abstract class ProduitA{
    public abstract void methodeA();
}

public class ProduitA1 extends ProduitA{
    public void MethodeA(){
        system.out.println("je suis un produit A");
        System.out.println("ProduitA1.methodeA()");
    }
}

public class ProduitA2 extends ProduitA{
    public void methodeA(){
        system.out.println("je suis un produit B");
        system.out.println("ProduitA2.methodeA()");
    }
}