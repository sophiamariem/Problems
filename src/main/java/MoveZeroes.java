public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (i < nums.length && j < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                swap(i, j, nums);
                i++;
                j++;
            } else if (nums[i] != 0) {
                i++;
                j++;
            } else if (nums[i] == 0) {
                j++;
            }
        }
        return nums;
    }

    public int[] moveZeroesShort(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                swap(i++, j, nums);
            }
        }
        return nums;
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
