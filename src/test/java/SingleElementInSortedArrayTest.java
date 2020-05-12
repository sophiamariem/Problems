import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleElementInSortedArrayTest {

    private SingleElementInSortedArray singleElementInSortedArray = new SingleElementInSortedArray();

    @Test
    public void testLogN() {
        assertEquals(2, singleElementInSortedArray.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        assertEquals(10, singleElementInSortedArray.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        assertEquals(2, singleElementInSortedArray.singleNonDuplicate(new int[]{1, 1, 2, 3, 3}));
        assertEquals(1, singleElementInSortedArray.singleNonDuplicate(new int[]{1, 2, 2, 3, 3}));
    }

    @Test
    public void testON() {
        assertEquals(2, singleElementInSortedArray.singleNonDuplicateON(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        assertEquals(10, singleElementInSortedArray.singleNonDuplicateON(new int[]{3, 3, 7, 7, 10, 11, 11}));
        assertEquals(2, singleElementInSortedArray.singleNonDuplicateON(new int[]{1, 1, 2, 3, 3}));
        assertEquals(1, singleElementInSortedArray.singleNonDuplicateON(new int[]{1, 2, 2, 3, 3}));
    }
}
