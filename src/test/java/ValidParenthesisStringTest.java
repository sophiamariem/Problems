import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesisStringTest {

    private ValidParenthesisString validParenthesisString = new ValidParenthesisString();

    @Test
    public void test() {
        assertTrue(validParenthesisString.checkValidString("()"));
        assertTrue(validParenthesisString.checkValidString("(*)"));
        assertTrue(validParenthesisString.checkValidString("(*))"));
        assertTrue(validParenthesisString.checkValidString("*)"));
        assertFalse(validParenthesisString.checkValidString("*))"));
        assertTrue(validParenthesisString.checkValidString("(*()"));
    }
}
