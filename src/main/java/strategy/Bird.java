package strategy;

public class Bird extends Animal{

    public Bird(String name, double weight) {
        super(name, weight);
        flyType = new ItFlys();
    }

}
