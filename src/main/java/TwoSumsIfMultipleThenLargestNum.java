import java.util.HashMap;
import java.util.Map;

public class TwoSumsIfMultipleThenLargestNum {

    // need to return index instead of values, so can't sort and traverse based on that
    public int[] twoSumMaxPreferred(int[] nums, int target) {
        int[] result = new int[2];

        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> numbersMapped = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                i++;
            }
            int complement = target - nums[i];
            int largest = nums[i] > complement ? nums[i] : complement;
            if (numbersMapped.containsKey(complement) && largest > max) {
                result[0] = numbersMapped.get(complement);
                result[1] = i;
                max = largest;
            }
            numbersMapped.put(nums[i], i);
        }

        return result;
    }
}
