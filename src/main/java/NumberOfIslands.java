public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int islands = 0;

        if (grid == null) {
            return islands;
        }

        int rows = grid.length;
        int columns = grid[0].length;

        for (int r = 0; r < rows; r++) {
            int c = 0;
            while (c < columns) {
                if (r >= rows) {
                    return islands;
                }

                if (grid[r][c] == '1') {
                    if (r == rows - 1 || (r + 1 < rows && grid[r + 1][c] != '1')) {
                        islands++;
                    }
                    c = 0;
                    r++;
                } else {
                    c++;
                }
            }

        }
        return islands;
    }

}
