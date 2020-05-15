
public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] A) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int total = 0;
        int mxSum = 0;
        int mnSum = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];
            if (mxSum + A[i] > A[i]) {
                mxSum += A[i];
            } else {
                mxSum = A[i];
            }
            maxSum = Math.max(mxSum, maxSum);

            if (mnSum + A[i] < A[i]) {
                mnSum += A[i];
            } else {
                mnSum = A[i];
            }
            minSum = Math.min(mnSum, minSum);
        }
        return total == minSum ? maxSum : Math.max(maxSum, total - minSum);
    }
}

