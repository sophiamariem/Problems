import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{4, 3, 3, 0}, plusOne.plusOne(new int[]{4, 3, 2, 9}));
        assertArrayEquals(new int[]{1, 0, 0}, plusOne.plusOne(new int[]{9, 9}));
    }
}
