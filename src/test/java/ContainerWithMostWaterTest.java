import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void test() {
        assertEquals(49, containerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        assertEquals(49, containerWithMostWater.maxAreaTwoPointers(new int[] {1,8,6,2,5,4,8,3,7}));
    }

}
