import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonOverlappingIntervalsTest {

    private NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();

    @Test
    public void test() {
        assertEquals(1, nonOverlappingIntervals
                .eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
        assertEquals(2, nonOverlappingIntervals
                .eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
        assertEquals(0, nonOverlappingIntervals
                .eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }
}
