import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxRepeatedCharsForValueTest {

    private static final String INPUT = "aaaaabbbbbcccdd";
    private static final String EXPECTED = "aabbccdd";
    private MaxRepeatedCharsForValue maxCharsPerValue = new MaxRepeatedCharsForValue();

    @Test
    public void testStack() {
        assertEquals(EXPECTED, maxCharsPerValue.returnStringWithMaxRepeatedFor(INPUT, 2));
    }

    @Test
    public void testSet() {
        assertEquals(EXPECTED, maxCharsPerValue.returnStringWithMaxRepeatedForWithSet(INPUT, 2));
    }

    @Test
    public void testQueue() {
        assertEquals(EXPECTED, maxCharsPerValue.returnStringWithMaxRepeatedForWithQueue(INPUT, 2));
    }

}
