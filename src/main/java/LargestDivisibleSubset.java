import java.util.*;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] dp = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(nums);

        int max = -1;
        int idx = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        map.put(i, j);
                    }
                }
            }

            if (dp[i] > max) {
                max = dp[i];
                idx = i;
            }
        }

        if (idx >= 0) {
            result.add(nums[idx]);
        }

        while (map.containsKey(idx)) {
            idx = map.get(idx);
            result.add(nums[idx]);
        }

        return result;
    }
}
