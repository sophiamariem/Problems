import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

    private static final char X = 'X';
    private static final char O = 'O';
    private static final char ONE = '1';

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            bfs(board, i, 0);
            bfs(board, i, m - 1);
        }

        for (int i = 0; i < m; i++) {
            bfs(board, 0, i);
            bfs(board, n - 1, i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == ONE) {
                    board[i][j] = O;
                } else {
                    board[i][j] = X;
                }
            }
        }
    }

    private void bfs(char[][] vec, int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(i, j));

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.x;
            int y = point.y;

            if (vec[x][y] == ONE || vec[x][y] == X) {
                continue;
            }

            vec[x][y] = ONE;
            if (x - 1 >= 0) {
                queue.offer(new Point(x - 1, y));
            }
            if (y - 1 >= 0) {
                queue.offer(new Point(x, y - 1));
            }
            if (x + 1 < vec.length) {
                queue.offer(new Point(x + 1, y));
            }
            if (y + 1 < vec[0].length) {
                queue.offer(new Point(x, y + 1));
            }
        }
    }

    private class Point {
        private int x, y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
