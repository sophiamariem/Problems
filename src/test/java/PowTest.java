import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowTest {
    private static final double DELTA = 1;
    private Pow pow = new Pow();

    @Test
    public void test() {
        assertEquals(1024.00000, pow.myPow(2.00000, 10), DELTA);
        assertEquals(9.26100, pow.myPow(2.10000, 3), DELTA);
        assertEquals(0.25000, pow.myPow(2.00000, -2), DELTA);
    }

    @Test
    public void testRecursive() {
        assertEquals(1024.00000, pow.myPowRecursive(2.00000, 10), DELTA);
        assertEquals(9.26100, pow.myPowRecursive(2.10000, 3), DELTA);
        assertEquals(0.25000, pow.myPowRecursive(2.00000, -2), DELTA);
    }
}
