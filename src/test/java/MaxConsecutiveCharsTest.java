import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveCharsTest {

    private MaxConsecutiveChars maxConsecutiveChars = new MaxConsecutiveChars();

    @Test
    public void test() {
        assertEquals("aabbcc", maxConsecutiveChars.maxCharacters("aaabbbcc", 2));
        assertEquals("abca", maxConsecutiveChars.maxCharacters("aaabbbccaaaaaaa", 1));
        assertEquals("abbcc", maxConsecutiveChars.maxCharacters("abbbccc", 2));
        assertEquals("", maxConsecutiveChars.maxCharacters("abcd", 0));
    }

    @Test
    public void testStackLike() {
        assertEquals("aabbcc", maxConsecutiveChars.maxCharactersStackLike("aaabbbcc", 2));
        assertEquals("abca", maxConsecutiveChars.maxCharactersStackLike("aaabbbccaaaaaaa", 1));
        assertEquals("abbcc", maxConsecutiveChars.maxCharactersStackLike("abbbccc", 2));
        assertEquals("", maxConsecutiveChars.maxCharactersStackLike("abcd", 0));
    }
}
