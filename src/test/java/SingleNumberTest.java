import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void test() {
        assertEquals(1, singleNumber.singleNumberHashMap(new int[]{2, 2, 1}));
        assertEquals(4, singleNumber.singleNumberHashMap(new int[]{4, 1, 2, 1, 2}));
        assertEquals(4, singleNumber.singleNumberHashMap(new int[]{4, 1, 2, 1, 2, 2}));

        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
