import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1)) {
                count++;
            }
        }
        return count;
    }
}
