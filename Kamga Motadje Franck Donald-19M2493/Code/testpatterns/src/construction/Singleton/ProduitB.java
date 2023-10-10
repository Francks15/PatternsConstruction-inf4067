package construction.abstractfactory;

public abstract class  ProduitB{
    public abstract void methodB();
}

public class ProduitB1 extends ProduitB{
    public void methodB(){
        System.out.println("ProduitA1.methodA()");
    }
}

public class ProduitB2 extends ProduitB{
    public void methodB(){
        System.out.println("ProduitA2.methodA()");
    }
}