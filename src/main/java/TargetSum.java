import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    private static Map<String, Integer> memo;

    public int findTargetSumWaysSimple(int[] nums, int S) {
        return dfs(nums, 0, S, 0);
    }

    private int dfs(int[] nums, int sum, int target, int idx) {
        if (nums.length == idx) {
            return sum == target ? 1 : 0;
        }
        return dfs(nums, sum + nums[idx], target, idx + 1) +
                dfs(nums, sum - nums[idx], target, idx + 1);
    }

    public int findTargetSumWays(int[] nums, int S) {
        memo = new HashMap<>();
        return findTargetSumWaysMemo(nums, S, 0, 0);
    }

    private int findTargetSumWaysMemo(int[] nums, int S, int idx, int sum) {
        String curSerial= serialize(idx, sum);
        if (memo.containsKey(curSerial)) {
            return memo.get(curSerial);
        }

        if (nums.length == idx) {
            return sum == S ? 1 : 0;
        }

        sum = findTargetSumWaysMemo(nums, S, idx + 1, sum + nums[idx]) +
                findTargetSumWaysMemo(nums, S, idx + 1, sum - nums[idx]);

        memo.put(curSerial, sum);

        return sum;
    }

    private static String serialize(int curIndex, int targetSum) {
        return curIndex + "," + targetSum;
    }

    public int findTargetSumWaysSubset(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || ((sum + target) & 1) == 1){
            return 0;
        }
        return subsetSum(nums, (sum + target) >>> 1);
    }

    private int subsetSum(int[] nums, int s) {
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int n : nums) {
            for (int i = s; i >= n; i--) {
                dp[i] += dp[i - n];
            }
        }
        return dp[s];
    }
}
