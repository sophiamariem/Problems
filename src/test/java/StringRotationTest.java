import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringRotationTest {

    private StringRotation stringRotation = new StringRotation();

    @Test
    public void test() {
        assertTrue(stringRotation.rotateString("abcde", "cdeab"));
        assertFalse(stringRotation.rotateString("abcde", "abced"));
    }
}
