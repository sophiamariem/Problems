import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestDuplicateSubstringTest {

    private LongestDuplicateSubstring longestDuplicateSubstring = new LongestDuplicateSubstring();

    @Test
    public void test() {
        assertEquals("ana", longestDuplicateSubstring.longestDupSubstring("banana"));
        assertEquals("", longestDuplicateSubstring.longestDupSubstring("abcd"));
    }
}
