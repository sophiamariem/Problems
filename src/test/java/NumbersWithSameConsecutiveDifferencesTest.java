import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumbersWithSameConsecutiveDifferencesTest {

    private NumbersWithSameConsecutiveDifferences consecutives;

    @Test
    public void test() {
        consecutives = new NumbersWithSameConsecutiveDifferences();
        assertArrayEquals(new int[]{181, 292, 707, 818, 929}, consecutives.numsSameConsecDiff(3, 7));
    }

    @Test
    public void testTwo() {
        consecutives = new NumbersWithSameConsecutiveDifferences();
        assertArrayEquals(new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98},
                consecutives.numsSameConsecDiff(2, 1));
    }
}
