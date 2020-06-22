public class SingleNumberII {

    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < nums.length; i++) {
            // twos holds the num that appears twice
            twos |= ones & nums[i];

            // ones holds the num that appears once
            ones ^= nums[i];

            // threes holds the num that appears thrice
            int threes = ones & twos;

            // if num[i] appears three times, ones and twos will be cleared
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}
