package construction.singleton;

public class SingletonObject{
    private static SingletonObject instance = new SinglentonObject();
    private SingletonObject();

   
    public static Singleton getInstance() {
     if (instance == null){instance = new
    Singleton();}
     return instance;
     }
    
     public static Singleton getInstance(int x, int y){
     if (instance == null) {
     instance = new Singleton(x, y);}
     return instance;} 
     // D'autres méthodes classiques et non "static".
     public int somme(int x, int y){
     return x+y;
    }
     public float moyenne(int x, int y){
     return somme(x, y)/2;}
    
    @Override
     public Object clone() throws
    CloneNotSupportedException { throw new CloneNotSupportedException();
}
}
    public void showMessage(){
        System.out.println("\nJe suis une instance mes
        valeurs sont : x = " + this.x + " et y = " +
        this.y);    }
}