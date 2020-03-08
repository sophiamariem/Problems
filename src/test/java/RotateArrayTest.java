import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayTest {
    private RotateArray rotateArray = new RotateArray();

    @Test
    public void test() {
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    public void testKLargerThanLength() {
        assertArrayEquals(new int[]{-1}, rotateArray.rotate(new int[]{-1}, 2));
    }
}
