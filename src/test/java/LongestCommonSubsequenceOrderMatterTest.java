import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class LongestCommonSubsequenceOrderMatterTest {
    private static final LongestCommonSubsequenceOrderMatter LCS = new LongestCommonSubsequenceOrderMatter();

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
    public void testCommonButNotAllInOrder() {
        String text1 = "ezupkr", text2 = "ubmrapg";
        assertEquals(2, LCS.longestCommonSubsequence(text1, text2));
    }

}
