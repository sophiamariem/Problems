public class SingleElementInSortedArray {

    // O(log(n))
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    right = mid - 2;
                } else {
                    left = mid;
                }
            }
        }

        return nums[left];
    }

    // O(n)
    public int singleNonDuplicateON(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            res ^= nums[i];
        }
        return res;
    }
}
