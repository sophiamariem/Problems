import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {

    public String getPermutation(int n, int k) {
        int[] fact = new int[n + 1];
        Arrays.fill(fact, 1);

        List<Integer> nums = new ArrayList();
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
            nums.add(i);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0, l = k - 1; i < n; i++) {
            int index = l / fact[n - 1 - i];
            result.append(nums.remove(index));
            l = l - index * fact[n - 1 - i];
        }
        return result.toString();
    }

}
