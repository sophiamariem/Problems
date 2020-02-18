import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;

public class CombinationSumTest {
    private CombinationSum combinationSum = new CombinationSum();

    @Test
    public void testOne() {
        List<List<Integer>> result = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertThat(result.get(0), IsIterableContainingInOrder.contains(2, 2, 3));
        assertThat(result.get(1), IsIterableContainingInOrder.contains(7));
    }

    @Test
    public void testTwo() {
        List<List<Integer>> result = combinationSum.combinationSum(new int[]{2, 3, 5}, 8);
        assertThat(result.get(0), IsIterableContainingInOrder.contains(2, 2, 2, 2));
        assertThat(result.get(1), IsIterableContainingInOrder.contains(2, 3, 3));
        assertThat(result.get(2), IsIterableContainingInOrder.contains(3, 5));
    }
}
