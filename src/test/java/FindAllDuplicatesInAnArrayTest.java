import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindAllDuplicatesInAnArrayTest {

    private static final List<Integer> EXPECTED = Arrays.asList(2, 3);
    private FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

    @Test
    public void test() {
        assertEquals(Arrays.asList(3, 2),
                findAllDuplicatesInAnArray.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void testWithSet() {
        assertEquals(EXPECTED,
                findAllDuplicatesInAnArray.findDuplicatesWithSet(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void testBySorting() {
        assertEquals(EXPECTED,
                findAllDuplicatesInAnArray.findDuplicatesBySorting(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void testFlipToNegative() {
        assertEquals(EXPECTED,
                findAllDuplicatesInAnArray.findDuplicatesFlipToNegative(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void testWithArray() {
        assertEquals(EXPECTED,
                findAllDuplicatesInAnArray.findDuplicatesWithArray(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    @Test
    public void testNeg() {
        assertEquals(EXPECTED,
                findAllDuplicatesInAnArray.findDuplicatesNeg(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
