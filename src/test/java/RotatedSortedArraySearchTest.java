import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotatedSortedArraySearchTest {

    private RotatedSortedArraySearch rotatedSortedArraySearch = new RotatedSortedArraySearch();

    @Test
    public void test() {
        assertEquals(4, rotatedSortedArraySearch.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, rotatedSortedArraySearch.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }
}
