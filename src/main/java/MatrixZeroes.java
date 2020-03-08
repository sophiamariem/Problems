public class MatrixZeroes {

    public int[][] setZeroesDfs(int[][] matrix) {
        int cols = matrix.length;
        int rows = matrix[0].length;
        boolean[][] visited = new boolean[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    dfs(matrix, visited, i, j, cols, rows);
                }
            }
        }
        return matrix;
    }

    private void dfs(int[][] matrix, boolean[][] visited, int col, int row, int cols, int rows) {
        visited[col][row] = true;

        for (int i = 0; i < cols; i++) {
            if (matrix[i][row] != 0) {
                visited[i][row] = true;
            }
            matrix[i][row] = 0;
        }

        for (int j = 0; j < rows; j++) {
            if (matrix[col][j] != 0) {
                visited[col][j] = true;
            }
            matrix[col][j] = 0;
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