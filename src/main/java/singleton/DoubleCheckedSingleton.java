package singleton;

public class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
    }
}
