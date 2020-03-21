public class SuperEggDrop {

    // O(KNlogN)
    public int superEggDrop(int K, int N) {
        int[][] memo = new int[K + 1][N + 1];
        return helper(K, N, memo);
    }

    private int helper(int K, int N, int[][] memo) {
        if (N <= 1) {
            return N;
        }
        if (K == 1) {
            return N;
        }
        if (memo[K][N] > 0) {
            return memo[K][N];
        }

        int low = 1;
        int high = N;
        int result = N;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int left = helper(K - 1, mid - 1, memo);
            int right = helper(K, N - mid, memo);
            result = Math.min(result, Math.max(left, right) + 1);

            if (left == right) {
                break;
            } else if (left < right) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        memo[K][N] = result;
        return result;
    }

    /*
    The dp equation is dp[moves][k] = dp[moves - 1][k - 1] + dp[moves - 1][k] + 1,  which means we do 1 move to a floor
    if the egg breaks then we can check dp[moves - 1][k - 1] floors
    if the egg doesn't breaks then we can check dp[moves - 1][k] floors as we still have k eggs but 1 less move
    */

    // O(KlogN)
    public int superEggDropKMoves(int K, int N) {
        int[][] dp = new int[N + 1][K + 1];
        int result = 0;
        while (dp[result][K] < N) {
            ++result;
            for (int k = 1; k <= K; ++k) {
                dp[result][k] = dp[result - 1][k - 1] + dp[result - 1][k] + 1;
            }
        }
        return result;
    }
}
