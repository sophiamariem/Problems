import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {

    private ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void test() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void testW() {
        assertTrue(validPalindrome.isPalindromeW("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindromeW("race a car"));
    }
}
