import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MinStackUsingJavaStackTest {

    @Test
    public void test() {
        MinStackUsingJavaStack minStack = new MinStackUsingJavaStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());

        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    public void testTwo() {
        MinStackUsingJavaStack minStack = new MinStackUsingJavaStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);

        assertEquals(0, minStack.getMin());

        minStack.pop();
        assertEquals(0, minStack.getMin());

        minStack.pop();
        assertEquals(0, minStack.getMin());

        minStack.pop();
        assertEquals(2, minStack.getMin());
    }

    @Test
    public void testThree() {
        MinStackUsingJavaStack minStack = new MinStackUsingJavaStack();
        minStack.push(1);
        minStack.push(2);

        assertEquals(2, minStack.top());
        assertEquals(1, minStack.getMin());

        minStack.pop();
        assertEquals(1, minStack.getMin());
        assertEquals(1, minStack.top());
    }

    @Test
    public void testFour() {
        MinStackUsingJavaStack minStack = new MinStackUsingJavaStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);

        minStack.pop();
        assertEquals(-1024, minStack.getMin());
        minStack.pop();
        assertEquals(-1024, minStack.getMin());
        minStack.pop();
        assertEquals(512, minStack.getMin());
    }
}
