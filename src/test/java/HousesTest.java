import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HousesTest {

    private final Houses houses = new Houses();

    @Test
    public void testOne() {
        List<Integer> solution = houses.cellCompete(new int[]{1, 0, 0, 0, 0, 1, 0, 0}, 1);
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1, 0, 1, 0)), solution);
    }

    @Test
    public void testTwo() {
        List<Integer> solution = houses.cellCompete(new int[]{1, 1, 1, 0, 1, 1, 1, 1}, 2);
        assertEquals(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 1, 1, 0)), solution);
    }
}
