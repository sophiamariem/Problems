import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddDigitsTest {

    private AddDigits addDigits = new AddDigits();

    @Test
    public void test() {
        //  3 + 8 = 11, 1 + 1 = 2 -> Since 2 has only one digit, return it.
        assertEquals(2, addDigits.addDigits(38));

        assertEquals(2, addDigits.addDigitsRoot(38));

        assertEquals(2, addDigits.addDigitsRootS(38));
    }
}
