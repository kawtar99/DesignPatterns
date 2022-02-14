package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void shouldBeAbleToFly(){
        Animal bird = new Bird("Tweety", 1.2);

        String couldFly = bird.tryToFly();

        assertEquals(couldFly, "It can fly");
    }

    @Test
    public void shouldNotBeAbleToFly(){
        Animal dog = new Dog("Sparky", 3.3);
        String couldNotFly = dog.tryToFly();
        assertEquals(couldNotFly, "It can't fly");
    }
}