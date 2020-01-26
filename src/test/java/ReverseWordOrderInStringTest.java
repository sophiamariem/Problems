import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordOrderInStringTest {

    @Test
    public void testReverseWords() {
        ReverseWordOrderInString reverse = new ReverseWordOrderInString();
        assertEquals("me reverse world hello", reverse.reverseWordsInSentence("hello world reverse me"));
    }
}
