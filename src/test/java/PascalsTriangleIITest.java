import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleIITest {

    private PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();

    @Test
    public void test() {
        List<Integer> result = pascalsTriangleII.getRow(3);
        assertEquals(Arrays.asList(1, 3, 3, 1), result);
    }
}
