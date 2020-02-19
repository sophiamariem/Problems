import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    // need to return index instead of values, so can't sort and traverse based on that
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSumWithHashMap(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> numbersMapped = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                i++;
            }
            int complement = target - nums[i];

            if (numbersMapped.containsKey(complement)) {
                result[0] = numbersMapped.get(complement);
                result[1] = i;
                return result;
            }
            numbersMapped.put(nums[i], i);
        }

        return result;
    }
}
