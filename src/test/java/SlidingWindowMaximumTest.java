import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SlidingWindowMaximumTest {

    private SlidingWindowMaximum windowMax = new SlidingWindowMaximum();

    @Test
    public void testOne() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, windowMax.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    public void testTwo() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 5, 3}, windowMax.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, -1, 0}, 3));
    }
}
