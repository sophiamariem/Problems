
public class ContiguousSequence {

    public int getMaxSum(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            runningSum += a[i];
            if (maxSum < runningSum) {
                maxSum = runningSum;
            } else if (runningSum < 0) {
                runningSum = 0;
            }

            if (maxSum > currentMax) {
                currentMax = maxSum;
            }
            if (a[i] > currentMax) {
                currentMax = a[i];
            }
        }
        return Math.max(maxSum, currentMax);
    }
}