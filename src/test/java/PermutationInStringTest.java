import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PermutationInStringTest {

    private PermutationInString permutationInString = new PermutationInString();

    @Test
    public void test() {
        assertTrue(permutationInString.checkInclusion("ab", "eidbaooo"));
        assertFalse(permutationInString.checkInclusion("ab", "eidboaoo"));
        assertTrue(permutationInString.checkInclusion("ab", "ab"));
        assertTrue(permutationInString.checkInclusion("abc", "bbbca"));
    }
}