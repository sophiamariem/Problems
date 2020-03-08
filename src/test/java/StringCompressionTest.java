import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressionTest {

    private StringCompression stringCompression = new StringCompression();

    @Test
    public void testOne() {
        assertEquals(6, stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    public void testTwo() {
        assertEquals(1, stringCompression.compress(new char[]{'a'}));
    }

    @Test
    public void testThree() {
        assertEquals(4, stringCompression
                .compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
