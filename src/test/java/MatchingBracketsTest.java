import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatchingBracketsTest {

    @Test
    public void test() {
        MatchingBrackets matching = new MatchingBrackets();
        assertEquals(MatchingBrackets.BALANCED, matching.matchBrackets("([{}])"));
        assertEquals(MatchingBrackets.UNBALANCED, matching.matchBrackets("({[}])"));
        assertEquals(MatchingBrackets.BALANCED, matching.matchBrackets(""));
        assertEquals(MatchingBrackets.BALANCED, matching.matchBrackets("([{([[{({{}})}]])}])"));
        assertEquals(MatchingBrackets.UNBALANCED, matching.matchBrackets("(]"));
        assertEquals(MatchingBrackets.UNBALANCED, matching.matchBrackets("["));
        assertEquals(MatchingBrackets.BALANCED, matching.matchBrackets("([{a}])"));
    }

    @Test
    public void testShort() {
        MatchingBrackets matching = new MatchingBrackets();
        assertTrue(matching.isValid("([{}])"));
        assertFalse(matching.isValid("({[}])"));
        assertTrue(matching.isValid(""));
        assertTrue(matching.isValid("([{([[{({{}})}]])}])"));
        assertFalse(matching.isValid("(]"));
        assertFalse(matching.isValid("["));
        assertFalse(matching.isValid("([{a}])"));
    }
}
