import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        int[] arr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        return arr;
    }

    /* xor will cancel out duplicate -> We know xor will cancel out duplicates.
    So xor of all numbers = xor of two numbers that are not repeated
    since two are distinct  we can find at least 1 bit that is different between the two (x)
    so split all numbers into two groups,  with the set bit at x and the other with the unset bit at x
    then xor two groups separately, we cancel out duplicates within each group and what is left over is a distinct number
    tmp = tmp & ~(tmp-1) gives the rightmost set bit.*/
    public int[] singleNumberXor(int[] nums) {
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmp ^= nums[i];
        }
        tmp = tmp & ~(tmp - 1);
        int[] result = new int[2];
        for (int n : nums) {
            if ((n & tmp) == 0) {
                result[0] ^= n;
            } else {
                result[1] ^= n;
            }
        }
        return result;
    }
}