import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxBoxCandiesTest {

    private MaxBoxCandies maxBoxCandies = new MaxBoxCandies();

    @Test
    public void test() {
        assertEquals(16, maxBoxCandies
                .maxCandies(new int[]{1, 0, 1, 0}, new int[]{7, 5, 4, 100}, new int[][]{{}, {}, {1}, {}}, new int[][]{{1, 2}, {3}, {}, {}}, new int[]{0}));

        assertEquals(6, maxBoxCandies
                .maxCandies(new int[]{1, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1}, new int[][]{{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}},
                        new int[][]{{1, 2, 3, 4, 5}, {}, {}, {}, {}, {}}, new int[]{0}));

        assertEquals(1, maxBoxCandies
                .maxCandies(new int[]{1, 1, 1}, new int[]{100, 1, 100}, new int[][]{{}, {0, 2}, {}}, new int[][]{{}, {}, {}}, new int[]{1}));

        assertEquals(0, maxBoxCandies
                .maxCandies(new int[]{1}, new int[]{100}, new int[][]{{}}, new int[][]{{}}, new int[]{}));

        assertEquals(7, maxBoxCandies
                .maxCandies(new int[]{1, 1, 1}, new int[]{2, 3, 2}, new int[][]{{}, {}, {}}, new int[][]{{}, {}, {}}, new int[]{2, 1, 0}));
    }

}
