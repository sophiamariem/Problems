import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void test() {
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
    }
}
