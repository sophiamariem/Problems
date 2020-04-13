import java.util.HashMap;
import java.util.Map;

// contiguous binary even numbers of 0 and 1
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int max = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
