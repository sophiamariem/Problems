public class JumpGame {

    public boolean canJump(int[] nums) {
        int reach = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i > reach) {
                return false;
            }
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }
}
