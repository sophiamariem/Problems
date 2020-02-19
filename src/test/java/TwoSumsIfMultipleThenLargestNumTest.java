import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumsIfMultipleThenLargestNumTest {

    private TwoSumsIfMultipleThenLargestNum twoSums = new TwoSumsIfMultipleThenLargestNum();

    @Test
    public void testOne() {
        assertArrayEquals(new int[] {0, 1}, twoSums.twoSumMaxPreferred(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    public void testTwo() {
        assertArrayEquals(new int[] {1, 2}, twoSums.twoSumMaxPreferred(new int[] {3, 2, 4}, 6));
    }

    @Test
    public void testThree() {
        assertArrayEquals(new int[] {0, 2}, twoSums.twoSumMaxPreferred(new int[] {3, 2, 3}, 6));
    }

    @Test
    public void testMaxPreferredIndeed() {
        assertArrayEquals(new int[] {1, 3}, twoSums.twoSumMaxPreferred(new int[] {3, 2, 3, 4}, 6));
    }
}
