import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnLine {

    public int maxPoints(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        int result = 1;

        for (int i = points.length - 1; i > 0; i--) {
            Map<Double, Integer> slopeMap = new HashMap<>();
            int duplicates = 0;
            int max = 0;

            for (int j = 0; j < i; j++) {
                int[] p1 = points[j];
                int[] p2 = points[i];

                if (p1[1] == p2[1] && p1[0] == p2[0]) {
                    duplicates++;
                    continue;
                }

                double slope = Double.MAX_VALUE;
                if (!(p2[0] - p1[0] == 0)) {
                    slope = (double) (p2[1] - p1[1]) / (p2[0] - p1[0]);
                }

                int current = slopeMap.getOrDefault(slope, 1) + 1;
                slopeMap.put(slope, current);
                max = Math.max(max, current);
            }
            int maxValue = (max == 0 && duplicates > 0) ? duplicates + 1 : max + duplicates;
            result = Math.max(result, maxValue);
        }
        return result;
    }
}
