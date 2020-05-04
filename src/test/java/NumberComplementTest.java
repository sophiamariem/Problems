import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComplementTest {

    private NumberComplement numberComplement = new NumberComplement();

    @Test
    public void testOne() {
        assertEquals(2, numberComplement.findComplementOne(5));
        assertEquals(0, numberComplement.findComplementOne(1));
    }

    @Test
    public void testTwo() {
        assertEquals(2, numberComplement.findComplementTwo(5));
        assertEquals(0, numberComplement.findComplementTwo(1));
    }

    @Test
    public void testThree() {
        assertEquals(2, numberComplement.findComplementThree(5));
        assertEquals(0, numberComplement.findComplementThree(1));
    }
}
