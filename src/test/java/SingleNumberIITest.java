import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleNumberIITest {

    private SingleNumberII singleNumber = new SingleNumberII();

    @Test
    public void test() {
        assertEquals(3, singleNumber.singleNumber(new int[]{2, 2, 3, 2}));
        assertEquals(99, singleNumber.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}
