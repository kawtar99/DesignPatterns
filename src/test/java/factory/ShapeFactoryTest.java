package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    public void shouldReturnRectangle(){
        Shape rectangle = ShapeFactory.createShape("Rectangle");

        assertEquals(rectangle.getShape(), "I am a Rectangle!");
    }

    @Test
    public void shouldReturnCircle(){
        Shape circle = ShapeFactory.createShape("Circle");

        assertEquals(circle.getShape(), "I am a Circle!");
    }

}