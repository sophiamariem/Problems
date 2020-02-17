import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ValidBracketPairsTest {

    private ValidBracketPairs validBracketPairs = new ValidBracketPairs();

    @Test
    public void test() {
        List<String> result = validBracketPairs.bracketPairs(3);
        assertEquals(5, result.size());
        assertEquals("((()))", result.get(0));
        assertEquals("(()())", result.get(1));
        assertEquals("(())()", result.get(2));
        assertEquals("()(())", result.get(3));
        assertEquals("()()()", result.get(4));
    }
}
