import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CircularQueueTest {

    private CircularQueue circularQueue = new CircularQueue();

    @Test
    public void test() {
        circularQueue.enqueue(5);
        circularQueue.enqueue(6);
        circularQueue.enqueue(7);
        circularQueue.enqueue(8);
        circularQueue.enqueue(9);
        circularQueue.enqueue(10);
        circularQueue.enqueue(11);
        circularQueue.enqueue(12);
        circularQueue.enqueue(13);
        circularQueue.enqueue(14);
        circularQueue.enqueue(15);
        circularQueue.enqueue(16);

        assertArrayEquals(new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, circularQueue.getDataArray());

        circularQueue.dequeue();
        assertArrayEquals(new int[]{0, 6, 7, 8, 9, 10, 11, 12, 13, 14}, circularQueue.getDataArray());

        circularQueue.enqueue(15);
        assertArrayEquals(new int[]{15, 6, 7, 8, 9, 10, 11, 12, 13, 14}, circularQueue.getDataArray());
    }
}
