import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchingBracketsTest {

    @Test
    public void test() {
        MatchingBrackets matching = new MatchingBrackets();
        assertEquals(MatchingBrackets.BALANCED, matching.matchBrackets("([{}])"));
        assertEquals(MatchingBrackets.UNBALANCED, matching.matchBrackets("({[}])"));
        assertEquals(MatchingBrackets.INVALID, matching.matchBrackets(""));

        assertEquals(MatchingBrackets.BALANCED, matching.matchBrackets("([{([[{({{}})}]])}])"));
    }
}
