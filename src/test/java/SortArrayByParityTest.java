import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayByParityTest {

    private SortArrayByParity sortArrayByParity = new SortArrayByParity();

    @Test
    public void test() {
        assertArrayEquals(new int[]{2, 4, 3, 1}, sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }
}
