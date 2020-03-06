import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StringForLinesSplitTest {

    private StringForLinesSplit stringForLines = new StringForLinesSplit();

    @Test
    public void testBasic() {
        List<String> expected = new ArrayList();
        expected.add("this");
        expected.add("is a");
        expected.add("test");

        List<String> result = stringForLines.stringForList("this is a test", 4);
        assertEquals(expected, result);
    }

    @Test
    public void testLimitBoundary() {
        List<String> expected = new ArrayList();
        expected.add("a b");
        expected.add("cde");

        List<String> result = stringForLines.stringForList("a b cde", 4);
        assertEquals(expected, result);
    }

    @Test
    public void testEmpty() {
        List<String> result = stringForLines.stringForList("", 2);
        assertEquals(new ArrayList(), result);
    }

    @Test
    public void testBasicFromPattern() {
        List<String> expected = new ArrayList();
        expected.add("this");
        expected.add("is a");
        expected.add("test");

        List<String> result = stringForLines.stringForListPattern("this is a test", 4);
        assertEquals(expected, result);
    }

    @Test
    public void testLimitBoundaryFromPattern() {
        List<String> expected = new ArrayList();
        expected.add("a b");
        expected.add("cde");

        List<String> result = stringForLines.stringForListPattern("a b cde", 4);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyFromPattern() {
        List<String> result = stringForLines.stringForListPattern("", 2);
        assertEquals(new ArrayList(), result);
    }
}
