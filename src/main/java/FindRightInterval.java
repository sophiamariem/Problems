import java.util.Arrays;
import java.util.TreeMap;

public class FindRightInterval {

    public int[] findRightInterval(int[][] intervals) {
        int minStartPoint = Integer.MAX_VALUE;
        int maxEndPoint = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            minStartPoint = Math.min(minStartPoint, intervals[i][0]);
            maxEndPoint = Math.max(maxEndPoint, intervals[i][1]);
        }

        int[] buckets = new int[maxEndPoint - minStartPoint + 1];
        Arrays.fill(buckets, -1);
        for (int i = 0; i < intervals.length; i++) {
            buckets[intervals[i][0] - minStartPoint] = i;
        }

        for (int i = buckets.length - 2; i > -1; i--) {
            if (buckets[i] == -1) {
                buckets[i] = buckets[i + 1];
            }
        }

        int[] rightIntervals = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            rightIntervals[i] = buckets[intervals[i][1] - minStartPoint];
        }
        return rightIntervals;
    }

    public int[] findRightIntervalWithTreeMap(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }

        int[] result = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            Integer idx = map.ceilingKey(intervals[i][1]);
            result[i] = idx == null ? -1 : map.get(idx);
        }
        return result;
    }
}
