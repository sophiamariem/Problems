import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }

        int[] result = new int[nums.length - k + 1];
        int idx = 0;
        Deque<Integer> deque = new ArrayDeque();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && windowNotCorrect(k, deque, i)) {
                deque.poll();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            if (i >= k - 1) {
                result[idx++] = nums[deque.peek()];
            }
        }
        return result;
    }

    private boolean windowNotCorrect(int k, Deque<Integer> deque, int i) {
        return deque.peek() < i - k + 1;
    }
}
