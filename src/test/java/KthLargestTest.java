import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestTest {

    @Test
    public void test() {
        int[] input = new int[]{8, 19, 2, 78, 42, 6, 12};

        KthLargest kthLargest = new KthLargest();
        assertEquals(19, kthLargest.findKthLargest(input, 3));
    }
}
