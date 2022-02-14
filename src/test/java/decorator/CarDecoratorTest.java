package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarDecoratorTest {


    @Test
    public void shouldAssembleCar(){
        CarDecorator sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        assertEquals(sportsCar.getCarType().toString(), "Basic CarSports car");
    }

    @Test
    public void shouldAssembleCarLuxury(){
        CarDecorator luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxuryCar.assemble();

        assertEquals(luxuryCar.getCarType().toString(), "Sports carLuxury car");
    }





}