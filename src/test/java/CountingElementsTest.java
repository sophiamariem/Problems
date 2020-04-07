import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountingElementsTest {
    private CountingElements countingElements = new CountingElements();

    @Test
    public void test() {
        assertEquals(2, countingElements.countElements(new int[]{1, 2, 3}));
        assertEquals(0, countingElements.countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
        assertEquals(3, countingElements.countElements(new int[]{1, 3, 2, 3, 5, 0}));
        assertEquals(2, countingElements.countElements(new int[]{1, 1, 2, 2}));
        assertEquals(1, countingElements.countElements(new int[]{3, 1, 5, 3, 7, 0, 5}));
        assertEquals(2, countingElements.countElements(new int[]{1, 1, 2}));
    }
}
