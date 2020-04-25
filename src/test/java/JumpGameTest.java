import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class JumpGameTest {
    private JumpGame jumpGame = new JumpGame();

    @Test
    public void test() {
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
