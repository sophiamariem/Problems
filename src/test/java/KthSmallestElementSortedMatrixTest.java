
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthSmallestElementSortedMatrixTest {
    private KthSmallestElementSortedMatrix kthSmallestElementSortedMatrix = new KthSmallestElementSortedMatrix();

    @Test
    public void test() {
        int[][] input = new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        assertEquals(13, kthSmallestElementSortedMatrix.kthSmallestMaxHeap(input, 8));
        assertEquals(13, kthSmallestElementSortedMatrix.kthSmallest(input, 8));
    }
}
