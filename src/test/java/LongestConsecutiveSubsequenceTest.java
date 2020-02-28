import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecutiveSubsequenceTest {

    @Test
    public void test() {
        LongestConsecutiveSubsequence longest = new LongestConsecutiveSubsequence();

        int[] input = new int[]{100, 4, 200, 1, 3, 2};
        assertEquals(4, longest.findLongestSubsequence(input));
        assertEquals(4, longest.longestConsecutive(input));
    }
}
