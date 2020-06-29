import java.util.Arrays;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[n - 1][m - 1];
    }

    public int uniquePathsCols(int m, int n) {
        int[] pre = new int[m];
        int[] cur = new int[m];

        for (int i = 0; i < m; i++) {
            pre[i] = 1;
            cur[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                cur[j] = cur[j - 1] + pre[j];
            }
            pre = cur;
        }
        return cur[m - 1];
    }

    public int uniquePathsCols2(int m, int n) {
        int[] cur = new int[m];
        Arrays.fill(cur, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[m - 1];
    }
}
