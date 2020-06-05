import java.util.Random;
import java.util.TreeMap;

public class RandomPickWithWeight {
    TreeMap<Integer, Integer> tree = new TreeMap<>();
    Random random = new Random();
    int sum = 0;

    public RandomPickWithWeight(int[] w) {
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            tree.put(sum, i);
        }
    }

    public int pickIndex() {
        int curr = random.nextInt(sum);
        return tree.get(tree.higherKey(curr));
    }
}
