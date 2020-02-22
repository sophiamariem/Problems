import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StoreNumbersTest {

    private StoreNumbers storeNumbers = new StoreNumbers();

    @Test
    public void testOne() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(0, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0));
        grid.add(Arrays.asList(1, 0, 1, 1));
        grid.add(Arrays.asList(1, 1, 1, 1));

        assertEquals(3, storeNumbers.numberOfStores(5, 4, grid));
    }

    @Test
    public void testTwo() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 1, 1));
        grid.add(Arrays.asList(0, 0, 0, 0));
        assertEquals(2, storeNumbers.numberOfStores(4, 4, grid));
    }

    @Test
    public void testThree() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 0, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 1, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 1, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 1, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 1, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 1));
        assertEquals(7, storeNumbers.numberOfStores(7, 7, grid));
    }

    @Test
    public void testFour() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(0, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0));
        grid.add(Arrays.asList(1, 0, 1, 1));
        grid.add(Arrays.asList(1, 1, 1, 1));
        grid.add(Arrays.asList(1, 1, 1, 1));

        assertEquals(3, storeNumbers.numberOfStores(6, 4, grid));
    }

    @Test
    public void testFive() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(1, storeNumbers.numberOfStores(1, 4, grid));
    }

    @Test
    public void testSix() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(0, 0, 1, 0));
        grid.add(Arrays.asList(1, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 1, 0));

        assertEquals(4, storeNumbers.numberOfStores(5, 4, grid));
    }

    @Test
    public void testSeven() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 0, 1, 1, 0, 1, 1));

        assertEquals(3, storeNumbers.numberOfStores(1, 7, grid));
    }

    @Test
    public void testInvalidColumns() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(0, storeNumbers.numberOfStores(1, 9, grid));
        assertEquals(0, storeNumbers.numberOfStores(1, 2, grid));
    }

    @Test
    public void testInvalidRows() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(0, storeNumbers.numberOfStores(5, 4, grid));
        assertEquals(0, storeNumbers.numberOfStores(1, 4, grid));
    }

    @Test
    public void testRowsAndColumnsZero() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(0, storeNumbers.numberOfStores(0, 4, grid));
        assertEquals(0, storeNumbers.numberOfStores(1, 0, grid));
        assertEquals(0, storeNumbers.numberOfStores(0, 0, grid));
    }

    @Test
    public void testNullGrid() {
        assertEquals(0, storeNumbers.numberOfStores(2, 4, null));
    }

}
