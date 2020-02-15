import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtoiTest {

    private Atoi atoi = new Atoi();

    @Test
    public void test() {
        assertEquals(4578, atoi.atoi("4578"));
    }

    @Test
    public void testNegative() {
        assertEquals(-4578, atoi.atoi("-4578"));
    }

    @Test
    public void testInvalid() {
        assertEquals(4578, atoi.atoi("045s7g8"));
    }
}
