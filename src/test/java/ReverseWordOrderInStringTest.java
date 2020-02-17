import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordOrderInStringTest {

    @Test
    public void testReverseWords() {
        ReverseWordOrderInString reverse = new ReverseWordOrderInString();
        assertEquals("me reverse world hello", reverse.reverseWordsInSentence("hello world reverse me"));
    }
}
