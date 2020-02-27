public class DiagonalOrder {

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int resultSize = m * n;
        int[] result = new int[resultSize];
        int row = 0;
        int col = 0;
        int d = 1;

        for (int i = 0; i < resultSize; i++) {
            result[i] = matrix[row][col];
            // two directions: -1,1 going upward right, and 1,-1 going downward left
            row -= d;
            col += d;

            if (rightOutBounds(m, row)) {
                row = m - 1;
                col += 2;
                d = changeDirection(d);
            }
            if (bottomOutOfBounds(n, col)) {
                col = n - 1;
                row += 2;
                d = changeDirection(d);
            }
            if (topOutOfBounds(row)) {
                row = 0;
                d = changeDirection(d);
            }
            if (leftOutOfBounds(col)) {
                col = 0;
                d = changeDirection(d);
            }
        }

        return result;
    }

    private boolean leftOutOfBounds(int col) {
        return col < 0;
    }

    private boolean topOutOfBounds(int row) {
        return row < 0;
    }

    private boolean bottomOutOfBounds(int n, int col) {
        return col >= n;
    }

    private boolean rightOutBounds(int m, int row) {
        return row >= m;
    }

    private int changeDirection(int d) {
        return -d;
    }
}
