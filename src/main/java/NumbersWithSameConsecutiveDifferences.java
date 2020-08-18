import java.util.ArrayList;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {
    List<Integer> list = new ArrayList<>();

    public int[] numsSameConsecDiff(int N, int K) {
        for (int i = 1; i <= 9; i++) {
            helper(i, N - 1, K);
        }
        if (N == 1) {
            list.add(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void helper(int curr, int N, int K) {
        if (N == 0) {
            list.add(curr);
            return;
        }

        int d = curr % 10;
        if (0 <= (d - K) && (d - K) <= 9) {
            helper(curr * 10 + (d - K), N - 1, K);
        }
        if (K != 0 && 0 <= (d + K) && (d + K) <= 9) {
            helper(curr * 10 + (d + K), N - 1, K);
        }
    }
}
