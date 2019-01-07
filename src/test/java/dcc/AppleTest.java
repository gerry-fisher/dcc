package dcc;

import dcc.impl.Apple;
import org.junit.Test;

public class AppleTest {

    private Apple apple;

    public void setUp() {

    }

    @Test
    public void shouldHaveAName_WhenCreated() throws Exception {
        apple = new Apple(2.0);
    }

    @Test(expected = Exception.class)
    public void shouldHavePriceGreaterThanZero_WhenCreated() throws Exception {
        apple = new Apple(0.0);
    }
}
