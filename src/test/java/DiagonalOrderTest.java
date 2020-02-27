import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DiagonalOrderTest {

    private DiagonalOrder diagonal = new DiagonalOrder();

    @Test
    public void test(){
        assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9},
                diagonal.findDiagonalOrder(new int[][]{{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}));
    }
}
