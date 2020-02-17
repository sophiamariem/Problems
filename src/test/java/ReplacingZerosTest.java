import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class ReplacingZerosTest {
    ReplacingZeros flippingZeros = new ReplacingZeros();

    @Test
    public void test() {
        assertEquals(new HashSet<>(Arrays.asList(5, 7)),
                flippingZeros.replaceZeros(new int[] {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 2));
        assertEquals(new HashSet<>(Arrays.asList(6, 7)),
                flippingZeros.replaceZeros(new int[]{1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1}, 2));
    }
}
