import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class ContiguousArrayTest {
    private ContiguousArray contiguousArray = new ContiguousArray();

    @Test
    public void test() {
        assertEquals(2, contiguousArray.findMaxLength(new int[]{0, 1}));
        assertEquals(2, contiguousArray.findMaxLength(new int[]{0, 1, 0}));
        assertEquals(2, contiguousArray.findMaxLength(new int[]{0, 1, 1}));
        assertEquals(4, contiguousArray.findMaxLength(new int[]{0, 1, 0, 1}));
        assertEquals(6, contiguousArray.findMaxLength(new int[]{0, 0, 1, 0, 0, 0, 1, 1}));
    }
}
