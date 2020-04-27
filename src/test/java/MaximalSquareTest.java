import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalSquareTest {
    private MaximalSquare maximalSquare = new MaximalSquare();

    @Test
    public void test() {
        assertEquals(4, maximalSquare.maximalSquare(
                new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
        assertEquals(0, maximalSquare.maximalSquare(new char[][]{}));
    }
}
