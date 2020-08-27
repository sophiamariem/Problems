import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindRightIntervalTest {

    private FindRightInterval findRightInterval = new FindRightInterval();

    @Test
    public void test() {
        assertArrayEquals(new int[]{-1}, findRightInterval.findRightInterval(new int[][]{{-1, 2}}));
        assertArrayEquals(new int[]{-1, 0, 1},
                findRightInterval.findRightInterval(new int[][]{{3, 4}, {2, 3}, {1, 2}}));
        assertArrayEquals(new int[]{-1, 2, -1},
                findRightInterval.findRightInterval(new int[][]{{1, 4}, {2, 3}, {3, 4}}));
    }

    @Test
    public void testWithTreeMap() {
        assertArrayEquals(new int[]{-1}, findRightInterval.findRightIntervalWithTreeMap(new int[][]{{-1, 2}}));
        assertArrayEquals(new int[]{-1, 0, 1},
                findRightInterval.findRightIntervalWithTreeMap(new int[][]{{3, 4}, {2, 3}, {1, 2}}));
        assertArrayEquals(new int[]{-1, 2, -1},
                findRightInterval.findRightIntervalWithTreeMap(new int[][]{{1, 4}, {2, 3}, {3, 4}}));
    }
}
