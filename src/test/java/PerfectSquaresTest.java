import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerfectSquaresTest {

    private PerfectSquares perfectSquares = new PerfectSquares();

    @Test
    public void test() {
        assertEquals(3, perfectSquares.numSquares(12));
        assertEquals(2, perfectSquares.numSquares(13));
    }
}
