import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfFourTest {

    private PowerOfFour powerOfFour = new PowerOfFour();

    @Test
    public void test() {
        assertTrue(powerOfFour.isPowerOfFour(16));
        assertFalse(powerOfFour.isPowerOfFour(5));
    }

    @Test
    public void testLib() {
        assertTrue(powerOfFour.isPowerOfFourLib(16));
        assertFalse(powerOfFour.isPowerOfFourLib(5));
    }

    @Test
    public void testMath() {
        assertTrue(powerOfFour.isPowerOfFourMath(16));
        assertFalse(powerOfFour.isPowerOfFourMath(5));
    }
}
