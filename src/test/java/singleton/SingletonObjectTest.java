package singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonObjectTest {

    @Test
    void shouldBeTheSameInstance() {
        SingletonObject s1 = SingletonObject.getInstance();
        SingletonObject s2 = SingletonObject.getInstance();

        assertSame(s1, s2);
    }
}