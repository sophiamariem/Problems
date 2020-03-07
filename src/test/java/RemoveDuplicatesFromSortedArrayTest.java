import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray duplicateRemoval = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test() {
        assertEquals(6, duplicateRemoval.removeDuplicates(new int[]{3, 4, 4, 5, 6, 7, 7, 7, 8, 8}));
        assertEquals(6, duplicateRemoval.removeDuplicatesGetNewCount(new int[]{3, 4, 4, 5, 6, 7, 7, 7, 8, 8}));
    }
}
