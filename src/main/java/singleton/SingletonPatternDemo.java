package singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();

        //show the message
        object.showMessage();
    }

}
