import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    private UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void test() {
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
        assertEquals(28, uniquePaths.uniquePaths(7, 3));
    }

    @Test
    public void testTwo() {
        assertEquals(3, uniquePaths.uniquePaths2(3, 2));
        assertEquals(28, uniquePaths.uniquePaths2(7, 3));
    }

    @Test
    public void testCols() {
        assertEquals(3, uniquePaths.uniquePathsCols(3, 2));
        assertEquals(28, uniquePaths.uniquePathsCols(7, 3));
    }

    @Test
    public void testColsTwo() {
        assertEquals(3, uniquePaths.uniquePathsCols2(3, 2));
        assertEquals(28, uniquePaths.uniquePathsCols2(7, 3));
    }
}
