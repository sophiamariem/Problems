import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfIslandsTest {

    private NumberOfIslands numIslands = new NumberOfIslands();

    @Test
    public void testOne() {
        char[][] t = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        assertEquals(1, numIslands.numIslands(t));
    }

    @Test
    public void testTwo() {
        char[][] t = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        assertEquals(3, numIslands.numIslands(t));
    }

    @Test
    public void testThree() {
        char[][] t = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'1', '0', '0', '0', '0'}};
        assertEquals(3, numIslands.numIslands(t));
    }

    @Test
    public void testFour() {
        char[][] t = new char[][]{{'1', '0', '1', '1', '0', '1', '1'}};
        assertEquals(3, numIslands.numIslands(t));
    }

}
