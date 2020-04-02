import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

public class HappyNumberTest {

    private HappyNumber happyNumber = new HappyNumber();

    @Test
    public void test() {
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(2));

        assertTrue(happyNumber.isHappyOverflow(19));
    }

    @Test(expected = StackOverflowError.class)
    public void testOverflow() {
        happyNumber.isHappyOverflow(2);
    }
}
