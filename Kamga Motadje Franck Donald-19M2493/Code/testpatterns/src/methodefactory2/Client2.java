package testpatterns.methodefactory2;


public class Client2{
    public static void main(String[] args) throws Exception{
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA porduitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        ProduitA = produitFactorygetProduitA();
        produitA.methodeA();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactorygetProduitA();
    produitA.methodeA();   }
}