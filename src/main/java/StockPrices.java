public class StockPrices {

    public int getMaxProfit(int[] stockPrices) {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("need at least 2");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < stockPrices.length; i++) {
            for (int j = i + 1; j < stockPrices.length; j++) {
                if (i != j && stockPrices[j] - stockPrices[i] > max) {
                    max = stockPrices[j] - stockPrices[i];
                }
            }
        }
        return max;
    }

    public int getMaxProfitGreedy(int[] stockPrices) {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("need at least 2");
        }

        int min = stockPrices[0];
        int max = stockPrices[1] - stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];
            int currentProfit = currentPrice - min;
            max = Math.max(max, currentProfit);
            // min after calculating current profit so as to not buy/sell on same day (as per instructions)
            min = Math.min(min, currentPrice);
        }
        return max;
    }
}
