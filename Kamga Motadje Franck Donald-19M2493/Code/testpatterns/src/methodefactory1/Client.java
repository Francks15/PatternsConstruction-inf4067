package testpatterns.methodefactory1;

public class Client{
    public static void main(String[] args) throws Exception {
        ProduitFactory produitFactory = new ProduitFactory();
        ProduitA porduitA = null;

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();

        produitA = produitFactory.getProduitA(3);
        produitA.methodeA();
    }
}