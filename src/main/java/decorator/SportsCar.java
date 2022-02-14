package decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public String assemble(){
        super.assemble();
        super.carType.append("Sports car");
        return "Sports car";
    }
}
