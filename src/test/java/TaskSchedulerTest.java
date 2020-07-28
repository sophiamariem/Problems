import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSchedulerTest {

    private TaskScheduler taskScheduler = new TaskScheduler();

    @Test
    public void test() {
        assertEquals(8, taskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        assertEquals(6, taskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }

    @Test
    public void testF() {
        assertEquals(8, taskScheduler.leastIntervalF(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        assertEquals(6, taskScheduler.leastIntervalF(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }
}
