import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DiagonalDifferenceTest {

    private DiagonalDifference diagonal = new DiagonalDifference();

    @Test
    public void test() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(11, 2, 4));
        input.add(Arrays.asList(4, 5, 6));
        input.add(Arrays.asList(10, 8, -12));
        assertEquals(15, diagonal.diagonalDifference(input));
    }
}
