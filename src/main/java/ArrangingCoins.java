public class ArrangingCoins {

    public int arrangeCoins(int n) {
        if (n == 1) {
            return 1;
        }

        long left = 1;
        long right = n;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long total = ((mid + 1) * mid) / 2;
            if (total == n) {
                return (int) mid;
            }
            if (total > n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return (int) left - 1;
    }

    /**
     * n = (x + 1) * x / 2
     * x² + x = 2n
     * x² + x + 1/4 - 1/4 = 2n
     * (x + 1/2)² = 2n + 1 / 4
     * (x + 1/2)² = (8n + 1) / 4
     * x + 1/2 = sqrt(8n + 1) / 2
     * x = (sqrt(8n + 1) / 2) - (1 / 2)
     * x = (sqrt(8n + 1) - 1) / 2
     */
    public int arrangeCoinsMaths(int n) {
        return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
    }
}
