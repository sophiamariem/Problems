import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindAllAnagramsInAStringTest {

    private FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();

    @Test
    public void testOne() {
        List result = findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
        assertEquals(result.size(), 2);
        assertTrue(result.containsAll(Arrays.asList(0, 6)));
    }

    @Test
    public void testOneC() {
        List result = findAllAnagramsInAString.findAnagramsC("cbaebabacd", "abc");
        assertEquals(result.size(), 2);
        assertTrue(result.containsAll(Arrays.asList(0, 6)));
    }

    @Test
    public void testTwo() {
        List result = findAllAnagramsInAString.findAnagrams("abab", "ab");
        assertEquals(result.size(), 3);
        assertTrue(result.containsAll(Arrays.asList(0, 1, 2)));
    }

    @Test
    public void testTwoC() {
        List result = findAllAnagramsInAString.findAnagramsC("abab", "ab");
        assertEquals(result.size(), 3);
        assertTrue(result.containsAll(Arrays.asList(0, 1, 2)));
    }
}
