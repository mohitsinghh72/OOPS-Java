public class Main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj1 = SingletonClass.getInstance();         // just one object is created other reference variable pointing to the first object.
        SingletonClass obj2 = SingletonClass.getInstance();

    }
}
class SingletonClass {
    private SingletonClass(){

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}