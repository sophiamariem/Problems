import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayIntersectionTest {

    private ArrayIntersection arrayIntersection = new ArrayIntersection();

    @Test
    public void testUsingSets() {
        assertArrayEquals(new int[]{2}, arrayIntersection.intersectionUsingSets(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, arrayIntersection.intersectionUsingSets(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

    @Test
    public void testUsingBinarySearch() {
        assertArrayEquals(new int[]{2}, arrayIntersection.intersectionUsingBinarySearch(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, arrayIntersection.intersectionUsingBinarySearch(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

    @Test
    public void testUsingTwoPointers() {
        assertArrayEquals(new int[]{2}, arrayIntersection.intersectionUsingTwoPointers(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, arrayIntersection.intersectionUsingTwoPointers(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }
}
