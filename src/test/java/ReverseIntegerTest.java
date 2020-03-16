import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void test() {
        assertEquals(321, reverseInteger.reverse(123));
        assertEquals(-321, reverseInteger.reverse(-123));
        assertEquals(21, reverseInteger.reverse(120));
    }
}
