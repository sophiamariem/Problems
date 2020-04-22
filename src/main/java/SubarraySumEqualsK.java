import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int runningSum = 0;

        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (preSum.containsKey(runningSum - k)) {
                count += preSum.get(runningSum - k);
            }
            preSum.put(runningSum, preSum.getOrDefault(runningSum, 0) + 1);
        }

        return count;
    }
}
