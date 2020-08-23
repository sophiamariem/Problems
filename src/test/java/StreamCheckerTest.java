import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StreamCheckerTest {

    private StreamChecker streamChecker;

    @Test
    public void test() {
        streamChecker = new StreamChecker(new String[]{"cd", "f", "k" });
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('b'));
        assertFalse(streamChecker.query('c'));
        assertTrue(streamChecker.query('d'));
        assertFalse(streamChecker.query('e'));
        assertTrue(streamChecker.query('f'));
        assertFalse(streamChecker.query('g'));
        assertFalse(streamChecker.query('h'));
        assertFalse(streamChecker.query('i'));
        assertFalse(streamChecker.query('j'));
        assertFalse(streamChecker.query('k'));
        assertTrue(streamChecker.query('l'));
    }
}
