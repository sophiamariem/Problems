import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReconstructItineraryTest {

    private ReconstructItinerary reconstructItinerary = new ReconstructItinerary();

    @Test
    public void testOne() {
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("MUC", "LHR"));
        input.add(Arrays.asList("JFK", "MUC"));
        input.add(Arrays.asList("SFO", "SJC"));
        input.add(Arrays.asList("LHR", "SFO"));

        assertEquals(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"), reconstructItinerary.findItinerary(input));
    }

    @Test
    public void testTwo() {
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("JFK", "SFO"));
        input.add(Arrays.asList("JFK", "ATL"));
        input.add(Arrays.asList("SFO", "ATL"));
        input.add(Arrays.asList("ATL", "JFK"));
        input.add(Arrays.asList("ATL", "SFO"));

        assertEquals(Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), reconstructItinerary.findItinerary(input));
    }
}
