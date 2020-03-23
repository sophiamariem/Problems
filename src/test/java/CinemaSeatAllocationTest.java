import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CinemaSeatAllocationTest {

    private CinemaSeatAllocation cinemaSeatAllocation = new CinemaSeatAllocation();

    @Test
    public void test() {
        assertEquals(4, cinemaSeatAllocation.maxNumberOfFamilies(3, new int[][]{{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}}));
        assertEquals(2, cinemaSeatAllocation.maxNumberOfFamilies(2, new int[][]{{2, 1}, {1, 8}, {2, 6}}));
        assertEquals(4, cinemaSeatAllocation.maxNumberOfFamilies(4, new int[][]{{4, 3}, {1, 4}, {4, 6}, {1, 7}}));
    }
}
