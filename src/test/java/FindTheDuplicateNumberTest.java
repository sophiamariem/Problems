import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDuplicateNumberTest {

    private FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

    @Test
    public void test() {
        assertEquals(2, findTheDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, findTheDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }

    @Test
    public void testSet() {
        assertEquals(2, findTheDuplicateNumber.findDuplicateWithSet(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, findTheDuplicateNumber.findDuplicateWithSet(new int[]{3, 1, 3, 4, 2}));
    }

    @Test
    public void testBrute() {
        assertEquals(2, findTheDuplicateNumber.findDuplicateBrute(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, findTheDuplicateNumber.findDuplicateBrute(new int[]{3, 1, 3, 4, 2}));
    }

    @Test
    public void testWithBinarySearch() {
        assertEquals(2, findTheDuplicateNumber.findDuplicateWithBinarySearch(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, findTheDuplicateNumber.findDuplicateWithBinarySearch(new int[]{3, 1, 3, 4, 2}));
    }
}
