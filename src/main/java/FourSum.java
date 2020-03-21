import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(4, nums, 0, target);
    }

    public List<List<Integer>> kSum(int k, int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > nums.length - start) {
            return result;
        } else if (k == 2) {
            int end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    result.add(new LinkedList<>(Arrays.asList(nums[start], nums[end])));
                    while (start < end && nums[start] == nums[++start]);
                    while (start < end && nums[end] == nums[--end]);
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
            return result;
        } else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                List<List<Integer>> tempLists = kSum(k - 1, nums, i + 1, target - nums[i]);
                for (List<Integer> temp : tempLists) {
                    temp.add(0, nums[i]);
                    result.add(temp);
                }
            }
            return result;
        }
    }
}
