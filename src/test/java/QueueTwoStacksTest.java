import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTwoStacksTest {

    private QueueTwoStacks queueTwoStacks = new QueueTwoStacks();

    @Test
    public void testOne() {
        queueTwoStacks.enqueue(1);
        queueTwoStacks.enqueue(2);
        queueTwoStacks.enqueue(3);

        assertEquals(1, queueTwoStacks.dequeue());
        assertEquals(2, queueTwoStacks.dequeue());
        assertEquals(3, queueTwoStacks.dequeue());
    }

    @Test
    public void testTwo() {
        assertEquals(-1, queueTwoStacks.dequeue());

        queueTwoStacks.enqueue(1);
        assertEquals(1, queueTwoStacks.dequeue());
    }
}
