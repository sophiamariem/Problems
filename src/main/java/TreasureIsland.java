import java.util.LinkedList;
import java.util.Queue;

// Walls and Gates
public class TreasureIsland {
    private static final Character D = 'D';
    private static final Character X = 'X';

    private static final int[] X_DIRECTION = {0, -1, 0, 1};
    private static final int[] Y_DIRECTION = {-1, 0, 1, 0};

    public int treasureIslandMin(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0));
        grid[0][0] = D;

        int count = 0;
        while (!queue.isEmpty()) {
            count++;

            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                Coordinate coord = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int neighborsX = coord.x + X_DIRECTION[j];
                    int neighborsY = coord.y + Y_DIRECTION[j];

                    if (outOfBounds(grid, neighborsX, neighborsY) || grid[neighborsX][neighborsY] == D) {
                        continue;
                    }

                    if (grid[neighborsX][neighborsY] == X) {
                        return count;
                    }
                    grid[neighborsX][neighborsY] = D;
                    queue.add(new Coordinate(neighborsX, neighborsY));
                }
            }
        }
        return -1;
    }

    private boolean outOfBounds(char[][] grid, int i, int j) {
        return j < 0 || j >= grid[0].length || i < 0 || i >= grid.length;
    }

    private class Coordinate {
        private int x, y;

        private Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
