import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistinctSubstringTest {

    private DistinctSubstring distinctSubstring = new DistinctSubstring();

    @Test
    public void test() {
        assertEquals(10, distinctSubstring.distinctSubstring("abcd"));
        assertEquals(4, distinctSubstring.distinctSubstring("aaaa"));
    }
}
