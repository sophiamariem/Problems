import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreasureIslandTest {

    private TreasureIsland treasureIsland = new TreasureIsland();

    @Test
    public void test() {
        char[][] input = {{'O', 'A', 'O', 'O'}, {'D', 'O', 'D', 'O'}, {'O', 'O', 'O', 'O'}, {'X', 'D', 'D', 'O'}};
        // Route is (0, 0), (0, 1), (1, 1), (2, 1), (2, 0), (3, 0) The minimum route takes 5 steps.
        assertEquals(5, treasureIsland.treasureIslandMin(input));
    }
}
