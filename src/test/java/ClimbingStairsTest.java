import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    private ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void test() {
//        2 ways:
//        1. 1 step + 1 step
//        2. 2 steps
        assertEquals(2, climbingStairs.climbStairs(2));

//        3 ways
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step
        assertEquals(3, climbingStairs.climbStairs(3));
    }
}
