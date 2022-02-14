package strategy;

/**
 * In Strategy pattern, we first create an abstraction of algorithm.
 * This is an interface having the abstract operation.
 * Then we create implementations of this abstraction and these are called strategies.
 */
public interface Flys {

    public String fly();
}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "It can fly";
    }
}

class CantFly implements Flys{


    @Override
    public String fly() {
        return "It can't fly";
    }
}
