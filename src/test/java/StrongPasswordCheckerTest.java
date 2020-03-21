import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrongPasswordCheckerTest {

    private StrongPasswordChecker strongPasswordChecker = new StrongPasswordChecker();

    @Test
    public void test() {
        assertEquals(0, strongPasswordChecker.strongPasswordChecker("aU8ipo"));
        assertEquals(1, strongPasswordChecker.strongPasswordChecker("aUpipo"));
        assertEquals(1, strongPasswordChecker.strongPasswordChecker("aUpppo"));
        assertEquals(6, strongPasswordChecker.strongPasswordChecker(""));
        assertEquals(3, strongPasswordChecker.strongPasswordChecker("1111111111"));
        assertEquals(0, strongPasswordChecker.strongPasswordChecker("aaAA11"));
        assertEquals(2, strongPasswordChecker.strongPasswordChecker("ABABABABABABABABABAB1"));
        assertEquals(2, strongPasswordChecker.strongPasswordChecker("ABCAB"));
        assertEquals(7, strongPasswordChecker.strongPasswordChecker("aaaaaaaaaaaaaaaaaaaaa"));
        assertEquals(3, strongPasswordChecker.strongPasswordChecker("abababababababababaaa"));
        assertEquals(3, strongPasswordChecker.strongPasswordChecker("..."));
        assertEquals(2, strongPasswordChecker.strongPasswordChecker("QQQQQ"));
        assertEquals(2, strongPasswordChecker.strongPasswordChecker("1Abababcaaaabababababa"));
        assertEquals(13, strongPasswordChecker.strongPasswordChecker("aaaaaaaAAAAAA6666bbbbaaaaaaABBC"));
    }
}
