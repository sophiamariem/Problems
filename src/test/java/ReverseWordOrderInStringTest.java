import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordOrderInStringTest {

    private ReverseWordOrderInString reverse = new ReverseWordOrderInString();

    @Test
    public void testReverseWords() {
        assertEquals("me reverse world hello", reverse.reverseWordsInSentence("hello world reverse me"));
    }

    @Test
    public void testReverseWordsWithMultipleSpacing() {
        assertEquals("me reverse world hello",
                reverse.reverseWordsInSentence(" hello world      reverse me "));
    }
}
