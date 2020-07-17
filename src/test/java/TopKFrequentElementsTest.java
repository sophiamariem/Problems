import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TopKFrequentElementsTest {

    private TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    public void test() {
        assertArrayEquals(new int[]{2, 1}, topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{1}, topKFrequentElements.topKFrequent(new int[]{1}, 1));
    }

    @Test
    public void testBucketSort() {
        assertArrayEquals(new int[]{1, 2}, topKFrequentElements
                .topKFrequentBucketSort(new int[]{1, 1, 1, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{1}, topKFrequentElements
                .topKFrequentBucketSort(new int[]{1}, 1));
    }
}
