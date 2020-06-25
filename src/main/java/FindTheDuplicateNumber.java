import java.util.HashSet;
import java.util.Set;

// without modifying the array - so sorting not viable
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public int findDuplicateWithSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            } else {
                set.add(n);
            }
        }
        return -1;
    }

    public int findDuplicateBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    // pigeonhole principle
    public int findDuplicateWithBinarySearch(int[] nums) {
        int low = 0;
        int right = nums.length - 1;

        while (low < right) {
            int count = 0;
            int mid = low + (right - low) / 2;
            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
