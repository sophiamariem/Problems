import java.util.*;

public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }

    public List<Integer> findDuplicatesWithSet(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                list.add(n);
            } else {
                set.add(n);
            }
        }
        return list;
    }

    public List<Integer> findDuplicatesBySorting(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public List<Integer> findDuplicatesFlipToNegative(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                list.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return list;
    }

    public List<Integer> findDuplicatesWithArray(int[] nums) {
        int[] counts = new int[nums.length + 1];
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            counts[n]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> findDuplicatesNeg(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]);
            if (nums[n - 1] < 0) {
                result.add(Math.abs(n));
            }
            nums[n - 1] = -nums[n - 1];
        }
        return result;
    }
}
