import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew")); //wke, pwke is a subsequence and not a substring
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab"));
        assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("qrsvbspk"));
    }
}
