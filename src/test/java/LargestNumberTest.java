import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestNumberTest {

    private LargestNumber largestNumber = new LargestNumber();

    @Test
    public void testOne() {
        assertEquals("210", largestNumber.largestNumber(new int[]{10, 2}));
        assertEquals("210", largestNumber.largestNumberFaster(new int[]{10, 2}));
    }

    @Test
    public void testTwo() {
        assertEquals("9534330", largestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        assertEquals("9534330", largestNumber.largestNumberFaster(new int[]{3, 30, 34, 5, 9}));
    }

    @Test
    public void testThree() {
        assertEquals("650", largestNumber.largestNumber(new int[]{05, 006, 0}));
        assertEquals("650", largestNumber.largestNumberFaster(new int[]{05, 006, 0}));
    }
}
