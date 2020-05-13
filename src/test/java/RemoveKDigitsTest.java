import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveKDigitsTest {

    private RemoveKDigits removeKDigits = new RemoveKDigits();

    @Test
    public void test() {
        assertEquals("1219", removeKDigits.removeKdigits("1432219", 3));
        assertEquals("200", removeKDigits.removeKdigits("10200", 1));
        assertEquals("0", removeKDigits.removeKdigits("10", 2));
        assertEquals("11", removeKDigits.removeKdigits("112", 1));
    }

    @Test
    public void testStack() {
        assertEquals("1219", removeKDigits.removeKdigitsStack("1432219", 3));
        assertEquals("200", removeKDigits.removeKdigitsStack("10200", 1));
        assertEquals("0", removeKDigits.removeKdigitsStack("10", 2));
        assertEquals("11", removeKDigits.removeKdigitsStack("112", 1));
    }

    @Test
    public void testPretendStack() {
        assertEquals("1219", removeKDigits.removeKdigitsPretendStack("1432219", 3));
        assertEquals("200", removeKDigits.removeKdigitsPretendStack("10200", 1));
        assertEquals("0", removeKDigits.removeKdigitsPretendStack("10", 2));
        assertEquals("11", removeKDigits.removeKdigitsPretendStack("112", 1));
    }
}
