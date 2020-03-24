public class MatrixZeroes {

    public int[][] setZeroesDfs(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    dfs(matrix, visited, i, j, rows, cols);
                }
            }
        }
        return matrix;
    }

    private void dfs(int[][] matrix, boolean[][] visited, int row, int col, int rows, int cols) {
        visited[row][col] = true;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][col] != 0) {
                visited[i][col] = true;
            }
            matrix[i][col] = 0;
        }

        for (int j = 0; j < cols; j++) {
            if (matrix[row][j] != 0) {
                visited[row][j] = true;
            }
            matrix[row][j] = 0;
        }
    }

    public int[][] setZeroes(int[][] matrix) {
        boolean firstRowHasZero = false;
        boolean firstColumnHasZero = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) firstColumnHasZero = true;
                    if (j == 0) firstRowHasZero = true;

                    if (i + j != 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstColumnHasZero == true) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if (firstRowHasZero == true) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        return matrix;
    }

    public int[][] setZeroesForRowColumn(int[][] matrix) {
        boolean[] row = new boolean[matrix[0].length];
        boolean[] col = new boolean[matrix.length];

        for (int i = 0; i < col.length; i++) {
            for (int j = 0; j < row.length; j++) {
                if (matrix[i][j] == 0) {
                    row[j] = true;
                    col[i] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                for (int j = 0; j < col.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < col.length; i++) {
            if (col[i]) {
                for (int j = 0; j < row.length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
