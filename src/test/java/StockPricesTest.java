import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StockPricesTest {

    private StockPrices stockPrices = new StockPrices();

    @Test
    public void test() {
        assertEquals(6, stockPrices.getMaxProfit(new int[] {10, 7, 5, 8, 11, 9}));
        assertEquals(-1, stockPrices.getMaxProfit(new int[] {10, 7, 5, 4, 3, 2}));
    }

    @Test
    public void testGreedy() {
        assertEquals(6, stockPrices.getMaxProfitGreedy(new int[] {10, 7, 5, 8, 11, 9}));
        assertEquals(-1, stockPrices.getMaxProfitGreedy(new int[] {10, 7, 5, 4, 3, 2}));
    }
}
