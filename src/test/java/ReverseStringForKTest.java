import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringForKTest {

    private ReverseStringForK reverse = new ReverseStringForK();

    @Test
    public void test() {
        assertEquals("bacdfeg", reverse.reverseStr( "abcdefg", 2));
        assertEquals("bac", reverse.reverseStr( "abc", 2));
        assertEquals("bacd", reverse.reverseStr( "abcd", 2));
        assertEquals("cbad", reverse.reverseStr( "abcd", 3));

    }
}
