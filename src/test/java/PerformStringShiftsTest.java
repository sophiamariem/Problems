
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerformStringShiftsTest {
    private PerformStringShifts performStringShifts = new PerformStringShifts();

    @Test
    public void test() {
        assertEquals("cab", performStringShifts.stringShift("abc", new int[][]{{0, 1}, {1, 2}}));
        assertEquals("efgabcd", performStringShifts.stringShift("abcdefg", new int[][]{{1, 1}, {1, 1}, {0, 2}, {1, 3}}));
    }
}
