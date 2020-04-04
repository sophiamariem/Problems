import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MoveZeroesTest {
    private MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12}));
        assertArrayEquals(new int[]{1}, moveZeroes.moveZeroes(new int[]{1}));
        assertArrayEquals(new int[]{1, 1, 0}, moveZeroes.moveZeroes(new int[]{1, 0, 1}));

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZeroes.moveZeroesShort(new int[]{0, 1, 0, 3, 12}));
        assertArrayEquals(new int[]{1}, moveZeroes.moveZeroesShort(new int[]{1}));
        assertArrayEquals(new int[]{1, 1, 0}, moveZeroes.moveZeroesShort(new int[]{1, 0, 1}));
    }
}
