import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AllPathsFromSourceToTargetTest {

    private AllPathsFromSourceToTarget allPathsFromSourceToTarget = new AllPathsFromSourceToTarget();
    private List<List<Integer>> expected = new ArrayList<>();

    @Before
    public void setUp() {
        expected.add(Arrays.asList(0, 1, 3));
        expected.add(Arrays.asList(0, 2, 3));

    }

    @Test
    public void test() {
        assertEquals(expected, allPathsFromSourceToTarget.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
    }

    @Test
    public void testDfsAlternateWay() {
        assertEquals(expected, allPathsFromSourceToTarget.allPathsSourceTargetDfs(new int[][]{{1, 2}, {3}, {3}, {}}));
    }

    @Test
    public void testMemo() {
        assertEquals(expected, allPathsFromSourceToTarget.allPathsSourceTargetMemo(new int[][]{{1, 2}, {3}, {3}, {}}));
    }
}
