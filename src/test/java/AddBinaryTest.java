import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    private AddBinary addBinary = new AddBinary();

    @Test
    public void test() {
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }
}
