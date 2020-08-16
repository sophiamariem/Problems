import java.util.Arrays;

public class BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[2][n];
        for (int t = 1; t <= 2; t++) {
            int max = -Integer.MAX_VALUE;
            for (int d = 1; d < n; d++) {
                max = Math.max(max, dp[0][d - 1] - prices[d - 1]);
                dp[1][d] = Math.max(dp[1][d - 1], max + prices[d]);
            }
            dp[0] = Arrays.copyOf(dp[1], n);
        }
        return dp[1][n - 1];
    }

    public int maxProfitScanLeftRight(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int profit = 0;

        int[] left = new int[n];
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        int[] right = new int[n];
        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], max - prices[i]);
            max = Math.max(max, prices[i]);
            profit = Math.max(profit, left[i] + right[i]);
        }
        return profit;
    }
}
