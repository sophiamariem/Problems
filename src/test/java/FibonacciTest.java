import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void test() {
        assertEquals(1, fibonacci.fib(2));
        assertEquals(2, fibonacci.fib(3));
        assertEquals(3, fibonacci.fib(4));
    }
}
