import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

public class IsGraphBipartiteTest {

    IsGraphBipartite isGraphBipartite = new IsGraphBipartite();

    @Test
    public void testDfs() {
        assertTrue(isGraphBipartite.isBipartiteDfs(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
        assertFalse(isGraphBipartite.isBipartiteDfs(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
    }

    @Test
    public void testBfs() {
        assertTrue(isGraphBipartite.isBipartiteBfs(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
        assertFalse(isGraphBipartite.isBipartiteBfs(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
    }
}
