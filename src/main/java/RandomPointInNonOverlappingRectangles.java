import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPointInNonOverlappingRectangles {
    private int[][] rects;
    private int sum = 0;
    private List<Integer> sumList = new ArrayList<>();
    private Random rand = new Random();

    public RandomPointInNonOverlappingRectangles(int[][] rects) {
        this.rects = rects;
        for (int[] x : rects) {
            sum += (x[2] - x[0] + 1) * (x[3] - x[1] + 1);
            sumList.add(sum);
        }
    }

    public int[] pick() {
        int random = rand.nextInt(sum);

        int lo = 0;
        int hi = rects.length - 1;
        while (lo != hi) {
            int mid = (lo + hi) / 2;
            if (random >= sumList.get(mid)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        int[] x = rects[lo];
        int width = x[2] - x[0] + 1;
        int height = x[3] - x[1] + 1;
        int base = sumList.get(lo) - width * height;
        return new int[]{x[0] + (random - base) % width, x[1] + (random - base) / width};
    }
}
