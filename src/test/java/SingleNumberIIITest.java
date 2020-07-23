import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SingleNumberIIITest {

    private SingleNumberIII singleNumberIII = new SingleNumberIII();

    @Test
    public void test() {
        assertArrayEquals(new int[]{3, 5}, singleNumberIII.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
    }

    @Test
    public void testXor() {
        assertArrayEquals(new int[]{5, 3}, singleNumberIII.singleNumberXor(new int[]{1, 2, 1, 3, 2, 5}));
    }
}
