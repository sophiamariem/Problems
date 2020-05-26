import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// contiguous binary even numbers of 0 and 1
public class ContiguousArray {

    // 20 ms
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

    // 7 ms
    public int findMaxLengthArray(int[] nums) {
        int max = 0;
        int sum = 0;

        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : 1);

            if (arr[sum + nums.length] >= -1) {
                max = Math.max(max, i - arr[sum + nums.length]);
            } else {
                arr[sum + nums.length] = i;
            }
        }
        return max;
    }
}
