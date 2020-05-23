import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntervalListIntersectionsTest {
    private IntervalListIntersections intervalListIntersections = new IntervalListIntersections();

    @Test
    public void test() {
        assertArrayEquals(new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}},
                intervalListIntersections.intervalIntersection(
                        new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                        new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}));
    }
}
