public class SortColors {

    // 0, 1, and 2 represent the color red, white, and blue respectively
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;

        while (i <= end) {
            if (nums[i] == 0) {
                swap(nums, i++, start++);
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, end--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
