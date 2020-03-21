import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperEggDropTest {

    private SuperEggDrop superEggDrop = new SuperEggDrop();

    @Test
    public void test() {
        assertEquals(2, superEggDrop.superEggDrop(1, 2));
        assertEquals(3, superEggDrop.superEggDrop(2, 6));
        assertEquals(4, superEggDrop.superEggDrop(3, 14));
    }

    @Test
    public void testKMoves() {
        assertEquals(2, superEggDrop.superEggDropKMoves(1, 2));
        assertEquals(3, superEggDrop.superEggDropKMoves(2, 6));
        assertEquals(4, superEggDrop.superEggDropKMoves(3, 14));
    }
}
