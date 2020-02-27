import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TargetSumTest {

    private TargetSum targetSum = new TargetSum();

    @Test
    public void testOne() {
        int[] input = {1, 1, 1, 1, 1};

        assertEquals(5, targetSum.findTargetSumWaysSimple(input, 3));
        assertEquals(5, targetSum.findTargetSumWays(input, 3));
        assertEquals(5, targetSum.findTargetSumWaysSubset(input, 3));
    }
}
