import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetectCapitalTest {

    private DetectCapital detectCapital = new DetectCapital();

    @Test
    public void testSimple() {
        assertTrue(detectCapital.detectCapitalUseG("USA"));
        assertFalse(detectCapital.detectCapitalUseG("FlaG"));
        assertFalse(detectCapital.detectCapitalUseG("oN"));
    }

    @Test
    public void test() {
        assertTrue(detectCapital.detectCapitalUse("USA"));
        assertFalse(detectCapital.detectCapitalUse("FlaG"));
        assertFalse(detectCapital.detectCapitalUse("oN"));
    }
}
