import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheapestFlightsWithinKStopsTest {

    private CheapestFlightsWithinKStops cheapestFlightsWithinKStops = new CheapestFlightsWithinKStops();

    @Test
    public void test() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};

        assertEquals(200, cheapestFlightsWithinKStops.findCheapestPrice(3, flights, 0, 2, 1));

        assertEquals(500, cheapestFlightsWithinKStops.findCheapestPrice(3, flights, 0, 2, 0));
    }
}
