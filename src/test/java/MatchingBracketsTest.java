import static org.junit.Assert.assertEquals;

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
    }
}
