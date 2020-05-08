import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StraightLineTest {

    private StraightLine straightLine = new StraightLine();

    @Test
    public void test() {
        assertTrue(straightLine.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
        assertFalse(straightLine.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
    }
}
