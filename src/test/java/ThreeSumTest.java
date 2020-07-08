import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {

    private ThreeSum threeSum = new ThreeSum();

    @Test
    public void test() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        assertEquals(expected, threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(expected, threeSum.threeSumForK(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(expected, threeSum.threeSumA(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
