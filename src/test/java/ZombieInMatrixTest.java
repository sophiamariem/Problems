import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZombieInMatrixTest {

    private final ZombieInMatrix zombieInMatrix = new ZombieInMatrix();

    @Test
    public void testOne() {
        int[][] grid = new int[][]{{0, 1, 1, 0, 1}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 1}, {0, 1, 0, 0, 0}};
        assertEquals(2, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testOneWithWalls() {
        int[][] grid = new int[][]{{0, 1, 1, 2, 1}, {0, 2, 0, 1, 0}, {0, 0, 0, 2, 1}, {0, 1, 2, 0, 0}};
        assertEquals(2, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testTwo() {
        int[][] grid = new int[][]{{0, 1, 1}, {0, 0, 0}, {1, 0, 0}, {0, 0, 0}};
        assertEquals(3, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testThree() {
        int[][] grid = new int[][]{
                {1, 0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(9, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testFour() {
        int[][] grid = new int[][]{{0}, {1}, {0}, {0}};
        assertEquals(2, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testFive() {
        int[][] grid = new int[][]{{1}, {1}, {1}, {0}, {0}};
        assertEquals(2, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testJustPeople() {
        int[][] grid = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        assertEquals(-1, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testJustZombies() {
        int[][] grid = new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        assertEquals(0, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testJustWalls() {
        int[][] grid = new int[][]{{2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}};
        assertEquals(0, zombieInMatrix.zombie(grid));
    }

    @Test
    public void testNullGrid() {
        assertEquals(0, zombieInMatrix.zombie(null));
    }
}
