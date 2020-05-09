import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPerfectSquareTest {
    private IsPerfectSquare perfectSquare = new IsPerfectSquare();

    @Test
    public void test() {
        assertTrue(perfectSquare.isPerfectSquare(16));
        assertFalse(perfectSquare.isPerfectSquare(14));
        assertFalse(perfectSquare.isPerfectSquare(5));
    }

    @Test
    public void testBs() {
        assertTrue(perfectSquare.isPerfectSquareBs(16));
        assertFalse(perfectSquare.isPerfectSquareBs(14));
        assertFalse(perfectSquare.isPerfectSquareBs(5));
    }
}
