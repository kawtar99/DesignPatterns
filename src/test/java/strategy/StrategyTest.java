package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    public void shouldAddElements(){
        Context context = new Context(new AddStrategy());

        int result = context.executeStrategy(1, 2);

        assertEquals(result, 3);
    }

    @Test
    public void shouldMultiplyElements(){
        Context context = new Context(new MultiplyStrategy());
        int result = context.executeStrategy(1, 2);

        assertEquals(result, 2);
    }

    @Test
    public void shouldSubstractElements(){
        Context context = new Context(new SubstractStrategy());
        int result = context.executeStrategy(1, 2);

        assertEquals(result, -1);
    }

}