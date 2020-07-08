import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum(list, nums, i + 1, nums.length - 1, nums[i]);
            }
        }
        return list;
    }

    private void twoSum(List<List<Integer>> list, int[] nums, int start, int end, int x) {
        while (start < end) {
            int target = -x;
            int y = nums[start];
            int z = nums[end];

            if (y + z == target) {
                list.add(Arrays.asList(x, y, z));
                while (start < end && nums[start] == nums[start + 1]) {
                    start++;
                }
                while (start < end && nums[end] == nums[end - 1]) {
                    end--;
                }
                start++;
                end--;
            } else if (y + z < target) {
                start++;
            } else {
                end--;
            }
        }
    }

    public List<List<Integer>> threeSumForK(int[] nums) {
        Arrays.sort(nums);
        return kSum(3, nums, 0, 0);
    }

    private List<List<Integer>> kSum(int k, int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > nums.length - start) {
            return result;
        } else if (k == 2) {
            int end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    result.add(new LinkedList<>(Arrays.asList(nums[start], nums[end])));
                    while (start < end && nums[start] == nums[++start]) ;
                    while (start < end && nums[end] == nums[--end]) ;
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

    public List<List<Integer>> threeSumA(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] > -nums[i]) {
                    right--;
                } else if (nums[left] + nums[right] < -nums[i]) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
            while (i + 1 < nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }

}
