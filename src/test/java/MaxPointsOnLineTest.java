import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxPointsOnLineTest {

    private MaxPointsOnLine maxPoints = new MaxPointsOnLine();

    @Test
    public void test() {
        assertEquals(3, maxPoints.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        assertEquals(4, maxPoints.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
        assertEquals(1, maxPoints.maxPoints(new int[][]{{0, 0}}));
        assertEquals(2, maxPoints.maxPoints(new int[][]{{0, 0}, {0, 0}}));
        assertEquals(2, maxPoints.maxPoints(new int[][]{{0, 0}, {1, 1}, {1, -1}}));
        assertEquals(3, maxPoints.maxPoints(new int[][]{{0, 0}, {1, 1}, {0, 0}}));
    }
}
