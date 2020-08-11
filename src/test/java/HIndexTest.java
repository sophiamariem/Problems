import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HIndexTest {

    private HIndex hIndex = new HIndex();

    @Test
    public void test() {
        assertEquals(3, hIndex.hIndex(new int[]{0, 1, 3, 5, 6}));
        assertEquals(1, hIndex.hIndex(new int[]{1, 0}));
    }

    @Test
    public void testWithSorting() {
        assertEquals(3, hIndex.hIndexWithSorting(new int[]{0, 1, 3, 5, 6}));
        assertEquals(1, hIndex.hIndexWithSorting(new int[]{1, 0}));
    }
}
