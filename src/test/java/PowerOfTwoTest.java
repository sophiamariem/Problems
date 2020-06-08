import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfTwoTest {

    private PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    public void test() {
        assertTrue(powerOfTwo.isPowerOfTwo(1));
        assertTrue(powerOfTwo.isPowerOfTwo(16));
        assertFalse(powerOfTwo.isPowerOfTwo(218));
    }

    @Test
    public void testBit() {
        assertTrue(powerOfTwo.isPowerOfTwoBit(1));
        assertTrue(powerOfTwo.isPowerOfTwoBit(16));
        assertFalse(powerOfTwo.isPowerOfTwoBit(218));
    }
}
