public class MinimumCostForTickets {

    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        if (days == null || days.length == 0) {
            return 0;
        }

        for (int i = 1, idx = 0; i < 366; i++) {
            if (idx == days.length) {
                return dp[i - 1];
            }
            if (i < days[idx]) {
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = Math.min(
                    dp[Math.max(0, i - 30)] + costs[2],
                    Math.min(
                            dp[Math.max(0, i - 7)] + costs[1], dp[Math.max(0, i - 1)] + costs[0]
                    )
            );
            idx++;
        }
        return dp[365];
    }
}
