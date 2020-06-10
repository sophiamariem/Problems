import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    public void test() {
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
