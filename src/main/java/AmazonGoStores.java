import java.util.List;

public class AmazonGoStores {

    public int numberAmazonGoStores(int rows, int columns, List<List<Integer>> grid) {
        int stores = 0;

        if (rows == 0 || columns == 0 || grid == null || rows != grid.size() || columns != grid.get(0).size()) {
            return stores;
        }

        for (int r = 0; r < rows; r++) {
            int c = 0;
            while (c < columns) {
                if (r >= rows) {
                    return stores;
                }
                if ((grid.get(r).get(c) == 1)) {
                    if (r == rows - 1 || (r + 1 < rows && grid.get(r + 1).get(c) != 1)) {
                        stores++;
                    }
                    c = 0;
                    r++;
                } else {
                    c++;
                }
            }

        }
        return stores;
    }
}
