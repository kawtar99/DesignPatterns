package decorator;

/**
 * The Decorator design pattern is used to modify the functionality of an object at runtime.
 */

public class CarDecorator implements Car{

    // HAS-A relationship with the component interface
    // should be accessible to child classes
    protected Car car;

    protected StringBuilder carType = new StringBuilder();

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public String assemble() {
        String assemble = this.car.assemble();
        carType.append(assemble);
        return assemble;
    }

    public StringBuilder getCarType() {
        return carType;
    }
}
