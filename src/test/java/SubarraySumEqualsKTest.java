import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarraySumEqualsKTest {

    private SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

    @Test
    public void test() {
        assertEquals(2, subarraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2));
        assertEquals(2, subarraySumEqualsK.subarraySum(new int[]{3, 2, 1, 2}, 2));
    }
}
