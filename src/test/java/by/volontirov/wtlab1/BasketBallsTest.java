package by.volontirov.wtlab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasketBallsTest {
    private Basket basket;
    @Before
    public void init() {
        basket = new Basket();
        basket.addBall(new Ball(5, Color.BLACK));
        basket.addBall(new Ball(10, Color.BLUE));
        basket.addBall(new Ball(1, Color.BLUE));
    }
    @Test
    public void getBallsWeightTest() {
        final int expectedWeight = 16;
        final int actualWeight = basket.getBallsWeight();
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void getBlueBallsCountTest() {
        final long expectedCount = 2;
        final long actualCount = basket.getBlueBallsCount();
        Assert.assertEquals(expectedCount, actualCount);
    }
}
