import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StockPricesTest {

    private StockPrices stockPrices = new StockPrices();

    @Test
    public void test() {
        assertEquals(6, stockPrices.getMaxProfit(new int[]{10, 7, 5, 8, 11, 9}));
        assertEquals(-1, stockPrices.getMaxProfit(new int[]{10, 7, 5, 4, 3, 2}));
        assertEquals(5, stockPrices.getMaxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void testGreedy() {
        assertEquals(6, stockPrices.getMaxProfitGreedy(new int[]{10, 7, 5, 8, 11, 9}));
        assertEquals(-1, stockPrices.getMaxProfitGreedy(new int[]{10, 7, 5, 4, 3, 2}));
        assertEquals(5, stockPrices.getMaxProfitGreedy(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
