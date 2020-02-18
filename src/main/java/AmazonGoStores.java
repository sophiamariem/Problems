import java.util.List;

public class AmazonGoStores {

    public int numberAmazonGoStores(int rows, int columns, List<List<Integer>> grid) {
        int stores = 0;

        if (rows == 0 || columns == 0 || grid == null || rows != grid.size() || columns != grid.get(0).size()) {
            return stores;
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid.get(r).get(c) == 1) {
                    onlyOnePerCluster(grid, r, c);
                    stores++;
                }
            }
        }

        return stores;
    }

    private void onlyOnePerCluster(List<List<Integer>> grid, int r, int c) {
        if (!isWithinBounds(grid, r, c) || grid.get(r).get(c) != 1) {
            return;
        }

        grid.get(r).set(c, 0);
        onlyOnePerCluster(grid, r + 1, c);
        onlyOnePerCluster(grid, r - 1, c);
        onlyOnePerCluster(grid, r, c + 1);
        onlyOnePerCluster(grid, r, c - 1);
    }

    private boolean isWithinBounds(List<List<Integer>> grid, int r, int c) {
        return r >= 0 && r < grid.size() && c >= 0 && c < grid.get(r).size();
    }
}
