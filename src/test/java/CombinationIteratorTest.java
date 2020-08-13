import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationIteratorTest {

    @Test
    public void test() {
        CombinationIterator iterator = new CombinationIterator("abc", 2);

        assertEquals("ab", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("ac", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("bc", iterator.next());
        assertFalse(iterator.hasNext());
    }
}
