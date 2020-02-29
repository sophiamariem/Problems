import org.junit.Test;

public class SortArrayWithoutSortingAlgorithmTest {

    private SortArrayWithoutSortingAlgorithm sort = new SortArrayWithoutSortingAlgorithm();

    @Test
    public void testOne() {
        sort.sort(new int[]{10, 10, 1, 4, 4, 100, 0});
    }

    @Test
    public void testTwo() {
        sort.sort(new int[]{10, 1, 4, 4, 90});
    }
}
