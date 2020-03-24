import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GCDStringsTest {

    private GCDStrings gCDStrings = new GCDStrings();

    @Test
    public void test() {
        assertEquals("ABC", gCDStrings.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", gCDStrings.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", gCDStrings.gcdOfStrings("LEET", "CODE"));
    }
}
