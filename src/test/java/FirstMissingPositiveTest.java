import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstMissingPositiveTest {

    private FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

    @Test
    public void test() {
        assertEquals(3, firstMissingPositive.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, firstMissingPositive.firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, firstMissingPositive.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        assertEquals(1, firstMissingPositive.firstMissingPositive(new int[]{15, 5, 89, 88}));
    }
}
