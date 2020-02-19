import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MostFrequentCharTest {

    private MostFrequentChar mostFrequentChar = new MostFrequentChar();

    @Test
    public void testOne() {
        assertEquals('e', mostFrequentChar.mostFrequentChar("tree"));
    }

    @Test
    public void testTwo() {
        assertEquals('c', mostFrequentChar.mostFrequentChar("ccbb"));
    }

    @Test
    public void testThree() {
        assertEquals('c', mostFrequentChar.mostFrequentChar("c"));
    }

    @Test
    public void testFour() {
        assertEquals('c', mostFrequentChar.mostFrequentChar("cb"));
    }
}
