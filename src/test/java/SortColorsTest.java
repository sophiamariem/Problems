import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {

    private SortColors sortColors = new SortColors();

    @Test
    public void test() {
        int[] subj = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColors(subj);

        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, subj);
    }
}
