import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomPickWithWeightTest {

    @Test
    public void testOne() {
        RandomPickWithWeight obj = new RandomPickWithWeight(new int[]{1});
        assertEquals(0, obj.pickIndex());
    }

    @Test
    public void test() {
        RandomPickWithWeight obj = new RandomPickWithWeight(new int[]{1, 3});
        obj.pickIndex();
    }
}
