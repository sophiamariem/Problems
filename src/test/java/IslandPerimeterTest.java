import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IslandPerimeterTest {

    private IslandPerimeter islandPerimeter = new IslandPerimeter();

    @Test
    public void test() {
        assertEquals(16,
                islandPerimeter.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
        assertEquals(16,
                islandPerimeter.islandPerimeterS(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }
}
