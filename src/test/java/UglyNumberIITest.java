import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumberIITest {

    private UglyNumberII uglyNumberII = new UglyNumberII();

    @Test
    public void test() {
        // 1, 2, 3, 4, 5, 6, 8, 9, 10, 12
        assertEquals(12, uglyNumberII.nthUglyNumber(10));
    }

    @Test
    public void testWithList() {
        assertEquals(12, uglyNumberII.nthUglyNumberWithList(10));
    }
}
