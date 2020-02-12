import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PairFloatsSumEqualOrLessThanTest {

    @Test
    public void test() {
        PairFloatsSumEqualOrLessThan floatSumPairs = new PairFloatsSumEqualOrLessThan();

        float[] floats = new float[]{12.4f, 0.2f, 4.5f, 3.6f, 0.4f};
        List<PairFloatsSumEqualOrLessThan.Pair> pairList = new ArrayList<>();
        pairList.add(new PairFloatsSumEqualOrLessThan.Pair(0.2f, 0.4f));
        pairList.add(new PairFloatsSumEqualOrLessThan.Pair(0.2f, 3.6f));
        pairList.add(new PairFloatsSumEqualOrLessThan.Pair(0.4f, 3.6f));

        assertEquals(pairList, floatSumPairs.findPairs(floats, 4f));
    }
}
