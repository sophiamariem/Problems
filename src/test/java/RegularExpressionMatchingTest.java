import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularExpressionMatchingTest {

    private RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

    @Test
    public void test() {
        assertFalse(regularExpressionMatching.isMatch("aa", "a"));
        assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
        assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
        assertFalse(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
        assertTrue(regularExpressionMatching.isMatch("aaa", "ab*a*c*a"));
    }
}
