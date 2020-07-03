import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrisonCellsAfterNDaysTest {

    private PrisonCellsAfterNDays prisonCellsAfterNDays = new PrisonCellsAfterNDays();

    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 0, 0, 0, 0},
                prisonCellsAfterNDays.prisonAfterNDays(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7));

        assertArrayEquals(new int[]{0, 0, 1, 1, 1, 1, 1, 0},
                prisonCellsAfterNDays.prisonAfterNDays(new int[]{1, 0, 0, 1, 0, 0, 1, 0}, 1000000000));
    }

    @Test
    public void testMagicNumber() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 0, 0, 0, 0},
                prisonCellsAfterNDays.prisonAfterNDaysMagicNumber(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7));

        assertArrayEquals(new int[]{0, 0, 1, 1, 1, 1, 1, 0},
                prisonCellsAfterNDays.prisonAfterNDaysMagicNumber(new int[]{1, 0, 0, 1, 0, 0, 1, 0}, 1000000000));
    }
}
