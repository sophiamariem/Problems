import java.util.ArrayList;

public class NQueens {

    public ArrayList<Integer[]> nQueens(int n) {
        return nQueens(n, 0, new Integer[n], new ArrayList<>());
    }

    private ArrayList<Integer[]> nQueens(int n, int row, Integer[] columns, ArrayList<Integer[]> result) {
        if (row == n) {
            result.add(columns.clone());
        } else {
            for (int col = 0; col < n; col++) {
                if (checkValid(columns, row, col)) {
                    columns[row] = col;
                    nQueens(n, row + 1, columns, result);
                }
            }
        }
        return result;
    }

    private boolean checkValid(Integer[] columns, int row, int col) {
        for (int r = 0; r < row; r++) {
            int c = columns[r];

            if (c == col || onSameDiagonal(c, col, r, row)) {
                return false;
            }
        }
        return true;
    }

    private boolean onSameDiagonal(int c, int col, int r, int row) {
        int colDist = Math.abs(c - col);
        int rowDist = row - r;
        return colDist == rowDist;
    }
}
