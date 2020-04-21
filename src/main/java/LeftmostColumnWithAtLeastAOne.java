public class LeftmostColumnWithAtLeastAOne {

    // O (n + m)
    public int leftMostColumnWithOne(int[][] binaryMatrix) {
        int result = -1;
        for (int r = 0, c = binaryMatrix[0].length - 1; r < binaryMatrix.length && c >= 0; ) {
            if (binaryMatrix[r][c] == 1) {
                result = c;
                c--;
            } else {
                r++;
            }
        }
        return result;
    }

    // O(n * log m)
    public int leftMostColumnWithOneBinarySearch(int[][] binaryMatrix) {
        int rows = binaryMatrix.length;
        int cols = binaryMatrix[0].length;

        int min = rows;
        for (int r = 0; r < cols; r++) {
            int col = binarySearch(binaryMatrix, r);
            min = Math.min(min, col);
        }
        return min == rows ? -1 : min;
    }

    private int binarySearch(int[][] binaryMatrix, int row) {
        int start = 0;
        int end = binaryMatrix[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = binaryMatrix[row][mid];
            if (val == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
