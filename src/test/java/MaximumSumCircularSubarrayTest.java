import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSumCircularSubarrayTest {

    private MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();

    @Test
    public void test() {
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        assertEquals(10, maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{5, -3, 5}));
        assertEquals(4, maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{3, -1, 2, -1}));
        assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{3, -2, 2, -3}));
        assertEquals(-1, maximumSumCircularSubarray.maxSubarraySumCircular(new int[]{-2, -3, -1}));
    }
}
