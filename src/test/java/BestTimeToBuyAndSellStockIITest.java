import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

    @Test
    public void test() {
        assertEquals(7, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, bestTimeToBuyAndSellStockII.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
