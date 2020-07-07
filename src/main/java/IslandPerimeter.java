public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0) {
                    continue;
                }

                if (i == 0 || grid[i - 1][j] == 0) {
                    result++;
                }
                if (i == m - 1 || grid[i + 1][j] == 0) {
                    result++;
                }
                if (j == 0 || grid[i][j - 1] == 0) {
                    result++;
                }
                if (j == n - 1 || grid[i][j + 1] == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public int islandPerimeterS(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int result = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += count(grid, m, n, i, j);
            }
        }
        return result;
    }

    private int count(int[][] grid, int m, int n, int i, int j) {
        if (grid[i][j] == 0) {
            return 0;
        }

        int result = 0;
        for (int[] d : new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}}) {
            int row = i + d[0];
            int col = j + d[1];
            if (row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == 0) {
                result++;
            }
        }
        return result;
    }
}
