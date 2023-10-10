package construction.abstractfactory;

public class client{
    public static void main(String[] args){
        IProduitFactory ProduitFactory1 = new ProduitFactory1();
        IProduitFactory ProduitFactory2 = new ProduitFactory2();

        ProduitA produitA=null;
        ProduitB produitB=null;

        system.out.println("Utilisation de La premiere Fabriaque");
        ProduitA= produitFactory1.getProduitA(); 
        ProduitB=produitFactory1.getProduitB();

        produitA.methodAA();
        ProduitB.methodB();

        system.out.println("Utilisation de la seconde Fabriaque");
        ProduitA= produitFactory2.getProduitA();
        ProduitB= produitFactory2.getProduitB();
        ProduitA.methodA();
        ProduitB.methodB();

    }
}

