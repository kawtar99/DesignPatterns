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



}