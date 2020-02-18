import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargest2Test {

    private KthLargest2 kthLargest = new KthLargest2();

    @Test
    public void testOne() {
        int[] input = new int[]{8, 19, 2, 78, 42, 6, 12};

        assertEquals(19, kthLargest.findKthLargest(input, 3));
    }

    @Test
    public void testTwo() {
        int[] input = new int[]{99, 99};

        assertEquals(99, kthLargest.findKthLargest(input, 1));
    }

}
