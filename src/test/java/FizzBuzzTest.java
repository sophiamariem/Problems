import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test() {
        fizzBuzz.fizzBuzz();
    }

    @Test
    public void testN() {
        List<String> expected = fizzBuzz.fizzBuzz(15);
        assertEquals(15, expected.size());

        assertEquals("1", expected.get(0));
        assertEquals("2", expected.get(1));
        assertEquals("Fizz", expected.get(2));
        assertEquals("4", expected.get(3));
        assertEquals("Buzz", expected.get(4));
        assertEquals("Fizz", expected.get(5));
        assertEquals("7", expected.get(6));
        assertEquals("8", expected.get(7));
        assertEquals("Fizz", expected.get(8));
        assertEquals("Buzz", expected.get(9));
        assertEquals("11", expected.get(10));
        assertEquals("Fizz", expected.get(11));
        assertEquals("13", expected.get(12));
        assertEquals("14", expected.get(13));
        assertEquals("FizzBuzz", expected.get(14));
    }
}
