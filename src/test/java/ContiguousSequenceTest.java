import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContiguousSequenceTest {

    private ContiguousSequence contiguousSequence = new ContiguousSequence();

    @Test
    public void test() {
        int[] a = {2, -8, 3, -2, 4, -10};
        assertEquals(5, contiguousSequence.getMaxSum(a));

        int[] b = {-2, -8, -3, -2, -4, -10};
        assertEquals(-2, contiguousSequence.getMaxSum(b));
    }
}