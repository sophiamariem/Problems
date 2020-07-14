import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AngleBetweenHandsOfAClockTest {
    private static final double DELTA = 1;
    private AngleBetweenHandsOfAClock angleBetweenHandsOfAClock = new AngleBetweenHandsOfAClock();

    @Test
    public void test() {
        assertEquals(165d,  angleBetweenHandsOfAClock.angleClock(12, 30), DELTA);
        assertEquals(75d, angleBetweenHandsOfAClock.angleClock(3, 30), DELTA);
        assertEquals(7.5d, angleBetweenHandsOfAClock.angleClock(3, 15), DELTA);
        assertEquals(155d, angleBetweenHandsOfAClock.angleClock(4, 50), DELTA);
        assertEquals(0d, angleBetweenHandsOfAClock.angleClock(12, 0), DELTA);
    }

}
