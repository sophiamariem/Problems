import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsWithSum {

    public List<List<Integer>> pairSums(int[] array, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);

        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                List<Integer> pairs = new ArrayList<>(Arrays.asList(array[first], array[last]));
                result.add(pairs);
                first++;
                last--;
            } else {
                if (s < sum) {
                    first++;
                } else {
                    last--;
                }
            }
        }
        return result;
    }
}
