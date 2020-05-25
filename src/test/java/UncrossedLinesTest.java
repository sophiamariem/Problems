import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UncrossedLinesTest {

    private UncrossedLines uncrossedLines = new UncrossedLines();

    @Test
    public void test() {
        assertEquals(2, uncrossedLines.maxUncrossedLines(new int[]{1, 4, 2}, new int[]{1, 2, 4}));
        assertEquals(3, uncrossedLines.maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2}));
        assertEquals(2, uncrossedLines.maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1}));
    }
}
