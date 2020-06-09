import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSubsequenceTest {

    private IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    public void test() {
        assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
        assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void testIdxOf() {
        assertTrue(isSubsequence.isSubsequenceIdxOf("abc", "ahbgdc"));
        assertFalse(isSubsequence.isSubsequenceIdxOf("axc", "ahbgdc"));
    }
}
