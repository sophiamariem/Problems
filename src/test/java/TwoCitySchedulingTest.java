import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoCitySchedulingTest {

    private TwoCityScheduling twoCityScheduling = new TwoCityScheduling();

    @Test
    public void test() {
        assertEquals(110, twoCityScheduling.twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
    }
}
