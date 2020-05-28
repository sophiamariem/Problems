import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountingBitsTest {

    private CountingBits countingBits = new CountingBits();

    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 1, 1}, countingBits.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countingBits.countBits(5));
    }
}
