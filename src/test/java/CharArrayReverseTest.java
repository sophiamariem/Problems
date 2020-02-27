import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharArrayReverseTest {

    private CharArrayReverse reverse = new CharArrayReverse();

    @Test
    public void test() {
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'},
                reverse.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'},
                reverse.reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}));
    }
}
