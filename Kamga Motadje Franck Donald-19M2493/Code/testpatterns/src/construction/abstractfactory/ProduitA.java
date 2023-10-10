package construction.abstractfactory;

public abstract class  ProduitA{
    public abstract void methodA();
}

public class ProduitA1 extends ProduitA{
    public void methodA(){
        System.out.println("ProduitA1.methodA()");
    }
}

public class ProduitA2 extends ProduitA{
    public void methodA(){
        System.out.println("ProduitA2.methodA()");
    }
}