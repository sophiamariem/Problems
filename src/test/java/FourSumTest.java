import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FourSumTest {

    private FourSum fourSum = new FourSum();

    @Test
    public void testOne() {
        List<List<Integer>> result = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-2, -1, 1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-2, 0, 0, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-1, 0, 0, 1)));

        assertEquals(expected.get(0), result.get(0));
        assertEquals(expected.get(1), result.get(1));
        assertEquals(expected.get(2), result.get(2));
    }

    @Test
    public void testTwo() {
        List<List<Integer>> result = fourSum.fourSum(new int[]{0, 0, 0, 0}, 0);
        assertEquals(Arrays.asList(0, 0, 0, 0), result.get(0));
    }

    @Test
    public void testThree() {
        List<List<Integer>> result = fourSum.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-3, -2, 2, 3)));
        expected.add(new ArrayList<>(Arrays.asList(-3, -1, 1, 3)));
        expected.add(new ArrayList<>(Arrays.asList(-3, 0, 0, 3)));
        expected.add(new ArrayList<>(Arrays.asList(-3, 0, 1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-2, -1, 0, 3)));
        expected.add(new ArrayList<>(Arrays.asList(-2, -1, 1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-2, 0, 0, 2)));
        expected.add(new ArrayList<>(Arrays.asList(-1, 0, 0, 1)));

        assertEquals(expected.get(0), result.get(0));
        assertEquals(expected.get(1), result.get(1));
        assertEquals(expected.get(2), result.get(2));
        assertEquals(expected.get(3), result.get(3));
        assertEquals(expected.get(4), result.get(4));
        assertEquals(expected.get(5), result.get(5));
        assertEquals(expected.get(6), result.get(6));
        assertEquals(expected.get(7), result.get(7));
    }
}
