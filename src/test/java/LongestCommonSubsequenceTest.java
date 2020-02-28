import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LongestCommonSubsequenceTest {

    private static final LongestCommonSubsequence LCS = new LongestCommonSubsequence();

    @Test
    public void testWithCommonSubsequence() {
        String text1 = "abcde", text2 = "ace";
        assertEquals(3, LCS.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testNoCommonSubsequence() {
        String text1 = "abc", text2 = "def";
        assertEquals(0, LCS.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testWithDuplicateCommonSubsequence() {
        String text1 = "abccde", text2 = "acce";
        assertEquals(4, LCS.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testWithDuplicateCommonSubsequenceNotExact() {
        String text1 = "abccde", text2 = "acice";
        assertEquals(4, LCS.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testWithDuplicateCommonSubsequenceUnordered() {
        String text1 = "abccde", text2 = "caice";
        assertEquals(4, LCS.longestCommonSubsequence(text1, text2));
    }
}
