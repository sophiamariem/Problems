import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtoiFromLeetTest {

    private AtoiFromLeet atoi = new AtoiFromLeet();

    @Test
    public void testOne() {
        assertEquals(3, atoi.myAtoi("3.14159"));
    }

    @Test
    public void testTwo() {
        assertEquals(-2147483648, atoi.myAtoi("      -11919730356x"));
    }
}
