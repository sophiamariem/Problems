import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheTownJudgeTest {

    private FindTheTownJudge findTheTownJudge = new FindTheTownJudge();

    @Test
    public void test() {
        assertEquals(2, findTheTownJudge.findJudge(2, new int[][]{{1, 2}}));
        assertEquals(3, findTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        assertEquals(-1, findTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
        assertEquals(-1, findTheTownJudge.findJudge(3, new int[][]{{1, 2}, {2, 3}}));
        assertEquals(3, findTheTownJudge.findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));
    }
}
