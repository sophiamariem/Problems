import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDTest {

    private GCD gcd = new GCD();

    @Test
    public void testOne() {
        int result = gcd.generalizedGCD(5, new int[]{2, 3, 4, 5, 6});
        assertEquals(1, result);
    }

    @Test
    public void testTwo() {
        int result = gcd.generalizedGCD(5, new int[]{2, 4, 6, 8, 10});
        assertEquals(2, result);
    }

}