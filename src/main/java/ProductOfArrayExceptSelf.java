public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        int product = 1;
        for (int i = 0; i < length; i++) {
            result[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }
        return result;
    }
}
