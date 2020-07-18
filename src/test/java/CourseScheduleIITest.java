import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CourseScheduleIITest {

    private CourseScheduleII courseScheduleII = new CourseScheduleII();

    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 1}, courseScheduleII.findOrder(2, new int[][]{{1, 0}}));

        assertArrayEquals(new int[]{0, 1, 2, 3}, courseScheduleII.findOrder(4,
                new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }
}
