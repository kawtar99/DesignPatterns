package singleton;

/**
 * Singleton Pattern can be achieved using enums
 *  Enum instance is thread-safe, and you don’t need to worry about double-checked
 */
public enum EnumSingleton {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}