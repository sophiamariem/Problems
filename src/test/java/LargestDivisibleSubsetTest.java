import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class LargestDivisibleSubsetTest {

    private LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();

    @Test
    public void test() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertTrue(largestDivisibleSubset.largestDivisibleSubset(new int[]{1, 2, 3}).containsAll(expected));

        expected.add(4);
        expected.add(8);
        assertTrue(largestDivisibleSubset.largestDivisibleSubset(new int[]{1, 2, 4, 8}).containsAll(expected));
    }
}
