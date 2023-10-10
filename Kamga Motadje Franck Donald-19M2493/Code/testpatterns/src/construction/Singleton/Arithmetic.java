package construction.singleton;

public class Arithmetic {
    public static void main(String[] args) {
        SingletonObject object2= SingletonObject.getInstance();
        object2.showMessage();
    }
}