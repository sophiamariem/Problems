import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BackspaceStringCompareTest {

    private BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void test() {
        assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
        assertTrue(backspaceStringCompare.backspaceCompare("#", ""));
        assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void testRecursion() {
        assertTrue(backspaceStringCompare.backspaceCompareRecursion("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompareRecursion("ab##", "c#d#"));
        assertTrue(backspaceStringCompare.backspaceCompareRecursion("ab##", "c#d#"));
        assertFalse(backspaceStringCompare.backspaceCompareRecursion("a#c", "b"));
        assertTrue(backspaceStringCompare.backspaceCompareRecursion("#", ""));
        assertTrue(backspaceStringCompare.backspaceCompareRecursion("a##c", "#a#c"));
    }

    @Test
    public void testStack() {
        assertTrue(backspaceStringCompare.backspaceCompareStack("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompareStack("ab##", "c#d#"));
        assertTrue(backspaceStringCompare.backspaceCompareStack("ab##", "c#d#"));
        assertFalse(backspaceStringCompare.backspaceCompareStack("a#c", "b"));
        assertTrue(backspaceStringCompare.backspaceCompareStack("#", ""));
        assertTrue(backspaceStringCompare.backspaceCompareStack("a##c", "#a#c"));
    }
}
