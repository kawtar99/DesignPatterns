package decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public String assemble(){
        super.assemble();
        super.carType.append("Luxury car");
        return "Luxury car";
    }
}
