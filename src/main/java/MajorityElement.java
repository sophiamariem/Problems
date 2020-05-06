import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int num : map.keySet()) {
            pq.add(num);
        }

        return pq.peek();
    }

    public int majorityElementF(int[] nums) {
        int major = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }

    public int majorityElementHm(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n : nums) {
            if (map.get(n) > nums.length / 2) {
                return n;
            }
        }
        return -1;
    }
}
