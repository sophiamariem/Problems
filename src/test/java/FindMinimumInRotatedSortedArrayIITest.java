import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArrayIITest {

    private FindMinimumInRotatedSortedArrayII minimum = new FindMinimumInRotatedSortedArrayII();

    @Test
    public void test() {
        assertEquals(1, minimum.findMin(new int[]{1, 3, 5}));
        assertEquals(0, minimum.findMin(new int[]{2, 2, 2, 0, 1}));
    }
}
