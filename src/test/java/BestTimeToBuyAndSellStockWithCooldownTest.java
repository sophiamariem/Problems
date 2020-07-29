import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockWithCooldownTest {

    private BestTimeToBuyAndSellStockWithCooldown stocks = new BestTimeToBuyAndSellStockWithCooldown();

    @Test
    public void test() {
        assertEquals(3, stocks.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
