import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimePalindromeTest {

    private PrimePalindrome primePalindrome = new PrimePalindrome();

    @Test
    public void test() {
        assertEquals(7, primePalindrome.primePalindrome(6));
        assertEquals(11, primePalindrome.primePalindrome(8));
        assertEquals(101, primePalindrome.primePalindrome(13));
        assertEquals(181, primePalindrome.primePalindrome(157));
    }
}
