import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LastStoneWeightTest {

    private LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void test() {
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        assertEquals(2, lastStoneWeight.lastStoneWeight(new int[]{1, 3}));
        assertEquals(0, lastStoneWeight.lastStoneWeight(new int[]{2, 2}));
    }
}
