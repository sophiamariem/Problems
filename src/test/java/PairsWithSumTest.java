import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PairsWithSumTest {

    private PairsWithSum pairs = new PairsWithSum();

    @Test
    public void test() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(2, 8)));
        expected.add(new ArrayList<>(Arrays.asList(4, 6)));
        expected.add(new ArrayList<>(Arrays.asList(5, 5)));

        assertEquals(expected, pairs.pairSums(new int[]{2, 6, 7, 8, 4, 5, 12, 5, 1}, 10));
    }
}