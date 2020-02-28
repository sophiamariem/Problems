import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConvertOneStringToOtherTest {

    private ConvertOneStringToOther stringToOther = new ConvertOneStringToOther();

    @Test
    public void test() {
        assertTrue(stringToOther.stringConvert("abc", "cde"));
        assertFalse(stringToOther.stringConvert("abc", "cdef"));
    }
}
