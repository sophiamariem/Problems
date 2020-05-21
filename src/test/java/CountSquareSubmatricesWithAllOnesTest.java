import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountSquareSubmatricesWithAllOnesTest {

    private CountSquareSubmatricesWithAllOnes countSq = new CountSquareSubmatricesWithAllOnes();

    @Test
    public void test() {
        assertEquals(15, countSq.countSquares(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}}));
        assertEquals(7, countSq.countSquares(new int[][]{{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}));
    }
}
