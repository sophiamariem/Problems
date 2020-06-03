import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(c -> (c[0] - c[1])));
        int result = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; i++) {
            result += costs[i][0] + costs[i + n][1];
        }
        return result;
    }
}
