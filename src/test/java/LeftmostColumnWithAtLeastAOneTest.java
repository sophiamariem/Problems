import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftmostColumnWithAtLeastAOneTest {
    private LeftmostColumnWithAtLeastAOne leftmostColumnWithAtLeastAOne = new LeftmostColumnWithAtLeastAOne();

    @Test
    public void test() {
        assertEquals(1, leftmostColumnWithAtLeastAOne.leftMostColumnWithOne(new int[][]{{0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}}));
        assertEquals(-1, leftmostColumnWithAtLeastAOne.leftMostColumnWithOne(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}));
    }

    @Test
    public void testBinarySearch() {
        assertEquals(1, leftmostColumnWithAtLeastAOne.leftMostColumnWithOneBinarySearch(new int[][]{{0, 0, 0, 1}, {0, 0, 1, 1}, {0, 1, 1, 1}, {0, 0, 0, 0}}));
        assertEquals(-1, leftmostColumnWithAtLeastAOne.leftMostColumnWithOneBinarySearch(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}));
    }
}
