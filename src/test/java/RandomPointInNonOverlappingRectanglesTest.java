import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class RandomPointInNonOverlappingRectanglesTest {

    @Test
    public void test() {
        RandomPointInNonOverlappingRectangles random =
                new RandomPointInNonOverlappingRectangles(new int[][]{{1, 1, 5, 5}});

        int[] result = random.pick();
        assertEquals(result.length, 2);
        assertThat(result[0], allOf(greaterThan(0), lessThan(6)));
        assertThat(result[1], allOf(greaterThan(0), lessThan(6)));

        int[] result2 = random.pick();
        assertEquals(result2.length, 2);
        assertThat(result2[0], allOf(greaterThan(0), lessThan(6)));
        assertThat(result2[1], allOf(greaterThan(0), lessThan(6)));

        int[] result3 = random.pick();
        assertEquals(result3.length, 2);
        assertThat(result3[0], allOf(greaterThan(0), lessThan(6)));
        assertThat(result3[1], allOf(greaterThan(0), lessThan(6)));
    }

    @Test
    public void testTwo() {
        RandomPointInNonOverlappingRectangles random =
                new RandomPointInNonOverlappingRectangles(new int[][]{{-2, -2, -1, -1}, {1, 0, 3, 0}});

        int[] result = random.pick();
        assertEquals(result.length, 2);
        assertThat(result[0], allOf(greaterThan(-3), lessThan(4)));
        assertThat(result[1], allOf(greaterThan(-3), lessThan(4)));

        int[] result2 = random.pick();
        assertEquals(result2.length, 2);
        assertThat(result2[0], allOf(greaterThan(-3), lessThan(4)));
        assertThat(result2[1], allOf(greaterThan(-3), lessThan(4)));

        int[] result3 = random.pick();
        assertEquals(result3.length, 2);
        assertThat(result3[0], allOf(greaterThan(-3), lessThan(4)));
        assertThat(result3[1], allOf(greaterThan(-3), lessThan(4)));

        int[] result4 = random.pick();
        assertEquals(result3.length, 2);
        assertThat(result4[0], allOf(greaterThan(-3), lessThan(4)));
        assertThat(result4[1], allOf(greaterThan(-3), lessThan(4)));

        int[] result5 = random.pick();
        assertEquals(result5.length, 2);
        assertThat(result5[0], allOf(greaterThan(-3), lessThan(4)));
        assertThat(result5[1], allOf(greaterThan(-3), lessThan(4)));
    }
}
