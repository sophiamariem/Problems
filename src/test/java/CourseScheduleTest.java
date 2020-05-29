import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CourseScheduleTest {

    private CourseSchedule courseSchedule = new CourseSchedule();

    @Test
    public void test() {
        assertTrue(courseSchedule.canFinish(2, new int[][]{{1, 0}}));
        assertFalse(courseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
        assertTrue(courseSchedule.canFinish(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
    }

    @Test
    public void testTopological() {
        assertTrue(courseSchedule.canFinishTopological(2, new int[][]{{1, 0}}));
        assertFalse(courseSchedule.canFinishTopological(2, new int[][]{{1, 0}, {0, 1}}));
        assertTrue(courseSchedule.canFinishTopological(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
    }
}
