import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    public void test() {
        assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
