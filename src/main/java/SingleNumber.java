import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumberHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue().equals(1)) {
                return i.getKey();
            }
        }
        return -1;
    }

    // when every element is ensured to appear twice
    // X ^ X = 0,   X ^ Y ^ X = Y  so since all the numbers are repeated at max twice
    // all the repeated numbers will result in 0 and the only number that is not repeated will be in the result
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}
