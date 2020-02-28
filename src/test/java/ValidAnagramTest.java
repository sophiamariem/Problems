import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidAnagramTest {

    private ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testOne() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat", "var"));
    }

    @Test
    public void testTwo() {
        assertTrue(validAnagram.isAnagramCharArray("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagramCharArray("rat", "var"));
    }
}
