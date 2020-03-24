import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testMemo() {
        assertEquals(1, fibonacci.fib(2));
        assertEquals(2, fibonacci.fib(3));
        assertEquals(3, fibonacci.fib(4));
    }

    @Test
    public void testBottomUpMemo() {
        assertEquals(1, fibonacci.fibonacciBottomUpMemo(2));
        assertEquals(2, fibonacci.fibonacciBottomUpMemo(3));
        assertEquals(3, fibonacci.fibonacciBottomUpMemo(4));
    }

    @Test
    public void testBottomUp() {
        assertEquals(1, fibonacci.fibonacciBottomUp(2));
        assertEquals(2, fibonacci.fibonacciBottomUp(3));
        assertEquals(3, fibonacci.fibonacciBottomUp(4));
    }
}
