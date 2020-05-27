import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PossibleBipartitionTest {

    private PossibleBipartition possibleBipartition = new PossibleBipartition();

    @Test
    public void test() {
        assertTrue(possibleBipartition.possibleBipartition(4, new int[][]{{1, 2}, {1, 3}, {2, 4}}));

        assertFalse(possibleBipartition.possibleBipartition(3, new int[][]{{1, 2}, {1, 3}, {2, 3}}));

        assertFalse(possibleBipartition.possibleBipartition(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}));
    }
}
