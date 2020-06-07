import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChange2Test {

    private CoinChange2 coinChange2 = new CoinChange2();

    @Test
    public void test() {
        assertEquals(4, coinChange2.change(5, new int[]{1, 2, 5}));
        assertEquals(0, coinChange2.change(3, new int[]{2}));
        assertEquals(1, coinChange2.change(10, new int[]{10}));
    }
}
