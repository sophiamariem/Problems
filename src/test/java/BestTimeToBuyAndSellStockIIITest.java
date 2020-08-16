import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockIIITest {

    private BestTimeToBuyAndSellStockIII stocks = new BestTimeToBuyAndSellStockIII();

    @Test
    public void test() {
        assertEquals(6, stocks.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        assertEquals(4, stocks.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, stocks.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void testMaxProfitScanLeftRight() {
        assertEquals(6, stocks.maxProfitScanLeftRight(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        assertEquals(4, stocks.maxProfitScanLeftRight(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, stocks.maxProfitScanLeftRight(new int[]{7, 6, 4, 3, 1}));
    }
}
