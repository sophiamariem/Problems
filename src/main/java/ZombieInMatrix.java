import java.util.LinkedList;
import java.util.Queue;

//  Zombie in Matrix a.k.a. Rotting Oranges
public class ZombieInMatrix {
    private static final int PEOPLE = 0;
    private static final int ZOMBIE = 1;
    private static final int[] X_DIRECTION = {0, -1, 0, 1};
    private static final int[] Y_DIRECTION = {-1, 0, 1, 0};

    public int zombie(int[][] grid) {
        int days = 0;
        if (grid == null || grid.length == 0) {
            return days;
        }

        Queue<Coordinate> queue = new LinkedList<>();
        int peopleCount = addZombiesToQueueAndReturnPeopleCount(grid, queue);
        if (peopleCount == 0) {
            return days;
        }

        while (!queue.isEmpty()) {
            days++;

            int sizeofLastQueue = queue.size();
            for (int i = 0; i < sizeofLastQueue; i++) {
                Coordinate currentNode = queue.remove();
                for (int j = 0; j < 4; j++) {
                    int neighborX = currentNode.x + X_DIRECTION[j];
                    int neighborY = currentNode.y + Y_DIRECTION[j];

                    if (outOfBounds(grid, neighborX, neighborY)) {
                        continue;
                    }

                    if (grid[neighborX][neighborY] == PEOPLE) {
                        grid[neighborX][neighborY] = ZOMBIE;
                        queue.add(new Coordinate(neighborX, neighborY));
                        peopleCount--;
                        if (peopleCount == 0) {
                            return days;
                        }
                    }
                }
            }
        }
        return -1;
    }

    private int addZombiesToQueueAndReturnPeopleCount(int[][] grid, Queue<Coordinate> queue) {
        int peopleCount = 0;
        int row = grid.length;
        int column = grid[0].length;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (grid[r][c] == PEOPLE) {
                    peopleCount++;
                } else if (grid[r][c] == ZOMBIE) {
                    queue.add(new Coordinate(r, c));
                }
            }
        }
        return peopleCount;
    }

    private boolean outOfBounds(int[][] grid, int i, int j) {
        return j < 0 || j >= grid[0].length || i < 0 || i >= grid.length;
    }

    public class Coordinate {
        private int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}