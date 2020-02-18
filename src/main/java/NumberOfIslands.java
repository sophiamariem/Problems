public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int islands = 0;

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return islands;
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '1') {
                    setOnlyOneForEachCluster(grid, r, c);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void setOnlyOneForEachCluster(char[][] grid, int r, int c) {
        if (!isWithinBounds(grid, r, c) || grid[r][c] != '1') {
            return;
        }

        grid[r][c] = '0';
        setOnlyOneForEachCluster(grid, r + 1, c);
        setOnlyOneForEachCluster(grid, r - 1, c);
        setOnlyOneForEachCluster(grid, r, c + 1);
        setOnlyOneForEachCluster(grid, r, c - 1);
    }

    private boolean isWithinBounds(char[][] grid, int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[r].length;
    }

}
