import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrangingCoinsTest {

    private ArrangingCoins arrangingCoins = new ArrangingCoins();

    @Test
    public void test() {
        assertEquals(2, arrangingCoins.arrangeCoins(5));
        assertEquals(3, arrangingCoins.arrangeCoins(8));
    }

    @Test
    public void testMaths() {
        assertEquals(2, arrangingCoins.arrangeCoinsMaths(5));
        assertEquals(3, arrangingCoins.arrangeCoinsMaths(8));
    }

}
