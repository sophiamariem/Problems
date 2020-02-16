import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class NQueensTest {

    private NQueens nQueens = new NQueens();

    @Test
    public void test() {
        ArrayList<Integer[]> result = nQueens.nQueens(4);

        ArrayList<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[]{1, 3, 0, 2});
        expected.add(new Integer[]{2, 0, 3, 1});

        assertArrayEquals(expected.get(0), result.get(0));
        assertArrayEquals(expected.get(1), result.get(1));
    }
}
