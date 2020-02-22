import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CriticalConnectionsInNetworkTest {

    private CriticalConnectionsInNetwork criticalConnections = new CriticalConnectionsInNetwork();

    @Test
    public void test() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0,1)));
        list.add(new ArrayList<>(Arrays.asList(1,2)));
        list.add(new ArrayList<>(Arrays.asList(2,0)));
        list.add(new ArrayList<>(Arrays.asList(1,3)));

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,3)));

        assertEquals(expected, criticalConnections.criticalConnections(4, list));
    }
}
