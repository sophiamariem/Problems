import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterInStringTest {

    private FirstUniqueCharacterInString firstUnique = new FirstUniqueCharacterInString();

    @Test
    public void test() {
        assertEquals(0, firstUnique.firstUniqChar("leetcode"));
        assertEquals(2, firstUnique.firstUniqChar("loveleetcode"));
        assertEquals(-1, firstUnique.firstUniqChar(""));
    }

    @Test
    public void testF() {
        assertEquals(0, firstUnique.firstUniqCharF("leetcode"));
        assertEquals(2, firstUnique.firstUniqCharF("loveleetcode"));
        assertEquals(-1, firstUnique.firstUniqCharF(""));
    }
}
