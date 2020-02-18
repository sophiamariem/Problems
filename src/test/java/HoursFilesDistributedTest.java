import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HoursFilesDistributedTest {

    private HoursFilesDistributed hoursFilesDistributed = new HoursFilesDistributed();

    @Test
    public void testOne() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 1, 1, 0, 1));
        grid.add(Arrays.asList(0, 1, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 1));
        grid.add(Arrays.asList(0, 1, 0, 0, 0));

        assertEquals(2, hoursFilesDistributed.minimumHours(4, 5, grid));
    }

    @Test
    public void testTwo() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 0, 1));
        grid.add(Arrays.asList(0, 0, 0));
        grid.add(Arrays.asList(1, 0, 0));
        grid.add(Arrays.asList(0, 0, 0));

        assertEquals(3, hoursFilesDistributed.minimumHours(4, 3, grid));
    }

    @Test
    public void testThree() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 1));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));

        assertEquals(9, hoursFilesDistributed.minimumHours(6, 9, grid));
    }

    @Test
    public void testFour() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0));

        assertEquals(-1, hoursFilesDistributed.minimumHours(4, 5, grid));
    }

    @Test
    public void testInvalidColumns() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(-1, hoursFilesDistributed.minimumHours(1, 9, grid));
        assertEquals(-1, hoursFilesDistributed.minimumHours(1, 2, grid));
    }

    @Test
    public void testInvalidRows() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(-1, hoursFilesDistributed.minimumHours(5, 4, grid));
        assertEquals(-1, hoursFilesDistributed.minimumHours(1, 4, grid));
    }

    @Test
    public void testRowsAndColumnsZero() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(1, 1, 0, 0));
        grid.add(Arrays.asList(1, 1, 0, 0));

        assertEquals(-1, hoursFilesDistributed.minimumHours(0, 4, grid));
        assertEquals(-1, hoursFilesDistributed.minimumHours(1, 0, grid));
        assertEquals(-1, hoursFilesDistributed.minimumHours(0, 0, grid));
    }

    @Test
    public void testNullGrid() {
        assertEquals(-1, hoursFilesDistributed.minimumHours(2, 4, null));
    }
}
