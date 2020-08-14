import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    public void test() {
        assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
        assertEquals(2, longestPalindrome.longestPalindrome("bb"));
    }

    @Test
    public void testWithCharArray() {
        assertEquals(7, longestPalindrome.longestPalindromeCharArray("abccccdd"));
        assertEquals(2, longestPalindrome.longestPalindromeCharArray("bb"));
    }
}
