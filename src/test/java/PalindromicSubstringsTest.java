import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromicSubstringsTest {

    private PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

    @Test
    public void test() {
        assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
        assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));
        assertEquals(6, palindromicSubstrings.countSubstrings("fdsklf"));

    }
}
