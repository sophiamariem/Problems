import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCostForTicketsTest {

    private MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();

    @Test
    public void test() {
        assertEquals(11, minimumCostForTickets.mincostTickets(new int[]{1, 4, 6, 7, 8, 20},
                new int[]{2, 7, 15}));
        assertEquals(17, minimumCostForTickets.mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31},
                new int[]{2, 7, 15}));
    }
}
