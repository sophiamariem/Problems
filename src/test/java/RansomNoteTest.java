import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RansomNoteTest {

    private RansomNote ransomNote = new RansomNote();

    @Test
    public void test() {
        assertFalse(ransomNote.canConstruct("a", "b"));
        assertFalse(ransomNote.canConstruct("aa", "ab"));
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }

    @Test
    public void testLw() {
        assertFalse(ransomNote.canConstructLw("a", "b"));
        assertFalse(ransomNote.canConstructLw("aa", "ab"));
        assertTrue(ransomNote.canConstructLw("aa", "aab"));
    }

    @Test
    public void testLwFast() {
        assertFalse(ransomNote.canConstructLwFast("a", "b"));
        assertFalse(ransomNote.canConstructLwFast("aa", "ab"));
        assertTrue(ransomNote.canConstructLwFast("aa", "aab"));
    }
}