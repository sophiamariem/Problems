import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KClosestPointsToOriginTest {

    private KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();

    @Test
    public void test() {
        assertArrayEquals(new int[][]{{-2, 2}}, kClosestPointsToOrigin.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));

        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, kClosestPointsToOrigin
                .kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }

    @Test
    public void testLz() {
        assertArrayEquals(new int[][]{{-2, 2}}, kClosestPointsToOrigin.kClosestLz(new int[][]{{1, 3}, {-2, 2}}, 1));

        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, kClosestPointsToOrigin
                .kClosestLz(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }

    @Test
    public void testPQ() {
        assertArrayEquals(new int[][]{{-2, 2}}, kClosestPointsToOrigin.kClosestPQ(new int[][]{{1, 3}, {-2, 2}}, 1));

        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, kClosestPointsToOrigin
                .kClosestPQ(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }
}
