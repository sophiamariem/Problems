import java.util.*;

public class KClosestPointsToOrigin {

    /// 40 ms
    public int[][] kClosestLz(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, K);
    }

    // 27 ms
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(p -> (p[0] * p[0] + p[1] * p[1])));

        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i] = points[i];
        }
        return result;
    }

    // 75 ms
    public int[][] kClosestPQ(int[][] points, int K) {
        Map<int[], Integer> map = new HashMap<>();
        Queue<int[]> queue = new PriorityQueue<>((Comparator.comparingInt(map::get)));

        for (int[] p : points) {
            map.put(p, p[0] * p[0] + p[1] * p[1]);
            queue.offer(p);
        }

        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
