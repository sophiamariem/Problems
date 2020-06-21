import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonGameTest {

    private DungeonGame dungeonGame = new DungeonGame();

    @Test
    public void test() {
        assertEquals(7, dungeonGame.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}));
    }
}
