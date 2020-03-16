
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    private static final double DELTA = 1;
    private MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    public void test() {
        assertEquals(2.0, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), DELTA);
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), DELTA);
    }
}
