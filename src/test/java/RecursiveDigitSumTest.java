import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursiveDigitSumTest {

    private RecursiveDigitSum recursiveDigitSum = new RecursiveDigitSum();

    @Test
    public void test() {
        assertEquals(3, recursiveDigitSum.superDigit("148", 3));
        assertEquals(8, recursiveDigitSum.superDigit("9875", 4));
        assertEquals(9, recursiveDigitSum.superDigit("123", 3));
    }
}
