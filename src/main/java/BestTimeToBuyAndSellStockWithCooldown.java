public class BestTimeToBuyAndSellStockWithCooldown {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] dp = new int[prices.length];
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int tmp = i < 2 ? 0 : dp[i - 2];
            min = Math.min(min, prices[i] - tmp);
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
        }
        return dp[prices.length - 1];
    }
}
