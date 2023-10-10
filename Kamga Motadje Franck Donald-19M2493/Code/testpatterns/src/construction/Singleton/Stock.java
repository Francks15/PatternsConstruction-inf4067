package construction.abstractfactory;

public abstract class  Stock{
    public abstract void methodS();
}

public class Stock1 extends Stock{
    public void methodA(){
        System.out.println("Stock1.methodS()");
    }
}

public class Stock2 extends Stock{
    public void methodA(){
        System.out.println("Stock2.methodS()");
    }
}