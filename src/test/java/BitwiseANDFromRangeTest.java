import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitwiseANDFromRangeTest {

    private BitwiseANDFromRange bitwiseANDFromRange = new BitwiseANDFromRange();

    @Test
    public void test() {
        assertEquals(4, bitwiseANDFromRange.rangeBitwiseAnd(5, 7));
        assertEquals(0, bitwiseANDFromRange.rangeBitwiseAnd(0, 1));
    }

}
