import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinPathSumTest {

    private MinPathSum minPathSum = new MinPathSum();

    @Test
    public void test() {
        assertEquals(7, minPathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        assertEquals(22, minPathSum.minPathSum(new int[][]{{9, 1, 4, 8}}));
        assertEquals(5, minPathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {1, 1, 1}}));
        assertEquals(6, minPathSum.minPathSum(new int[][]{{1, 2, 5}, {3, 2, 1}}));

        assertEquals(7, minPathSum.minPathSum2(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        assertEquals(22, minPathSum.minPathSum2(new int[][]{{9, 1, 4, 8}}));
        assertEquals(5, minPathSum.minPathSum2(new int[][]{{1, 3, 1}, {1, 5, 1}, {1, 1, 1}}));
        assertEquals(6, minPathSum.minPathSum2(new int[][]{{1, 2, 5}, {3, 2, 1}}));
    }
}