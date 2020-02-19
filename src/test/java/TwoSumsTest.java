import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumsTest {
    private TwoSums twoSums = new TwoSums();

    @Test
    public void testOne() {
        assertArrayEquals(new int[] {0, 1}, twoSums.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    public void testTwo() {
        assertArrayEquals(new int[] {1, 2}, twoSums.twoSum(new int[] {3, 2, 4}, 6));
    }

    @Test
    public void testThree() {
        assertArrayEquals(new int[] {0, 2}, twoSums.twoSum(new int[] {3, 2, 3}, 6));
    }

    @Test
    public void testFour() {
        assertArrayEquals(new int[] {0, 2}, twoSums.twoSum(new int[] {3, 2, 3, 4}, 6));
    }

    @Test
    public void testOneHashMap() {
        assertArrayEquals(new int[] {0, 1}, twoSums.twoSumWithHashMap(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    public void testTwoHashMap() {
        assertArrayEquals(new int[] {1, 2}, twoSums.twoSumWithHashMap(new int[] {3, 2, 4}, 6));
    }

    @Test
    public void testThreeHashMap() {
        assertArrayEquals(new int[] {0, 2}, twoSums.twoSumWithHashMap(new int[] {3, 2, 3}, 6));
    }

    @Test
    public void testFourHashMap() {
        assertArrayEquals(new int[] {0, 2}, twoSums.twoSumWithHashMap(new int[] {3, 2, 3, 4}, 6));
    }
}
