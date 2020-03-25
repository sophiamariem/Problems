import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordOrderInPlaceTest {
    private ReverseWordOrderInPlace reverse = new ReverseWordOrderInPlace();

    @Test
    public void testReverseWordsCharArray() {
        assertEquals("me reverse world hello", reverse
                .reverseWords(new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', 'r', 'e', 'v', 'e', 'r', 's', 'e', ' ', 'm', 'e' }));
    }
}
