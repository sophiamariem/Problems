
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void test() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}
