import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SubsetsOfSetTest {

    private SubsetsOfSet subsets = new SubsetsOfSet();

    @Test
    public void test() {
        ArrayList<ArrayList<Integer>> result = subsets.getSubsets(new ArrayList<>(Arrays.asList(23, 6, 90)));
        assertEquals(8, result.size());
    }
}
