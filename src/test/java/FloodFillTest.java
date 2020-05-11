import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FloodFillTest {
    private FloodFill floodFill = new FloodFill();

    @Test
    public void test() {
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
                floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    }
}
