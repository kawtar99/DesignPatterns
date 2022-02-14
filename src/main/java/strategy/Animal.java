package strategy;

public class Animal {

    private String name;
    private double weight;

    protected Flys flyType;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String tryToFly(){
        return flyType.fly();
    }

    public void setNewFlyingStrategy(Flys flys){
        flyType = flys;
    }
}
