
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MostCommonLetterInStringTest {

    private MostCommonLetterInString mostCommonLetterInString = new MostCommonLetterInString();

    @Test
    public void test() {
        assertEquals('a', mostCommonLetterInString.mostOccuringChar("aaabbcc").charValue());
        assertEquals('a', mostCommonLetterInString.mostOccuringChar("aaabbbccc").charValue());
    }
}
