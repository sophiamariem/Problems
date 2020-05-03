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
}