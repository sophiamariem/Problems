import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public int findLongestSubsequence(int[] input) {
        if (input.length == 0) {
            return 0;
        }
        Arrays.sort(input);

        int longest = 1;
        int current = 1;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i+1]) {
                if (input[i] + 1 == input[i+1]) {
                    current += 1;
                } else {
                    longest = Math.max(longest, current);
                    current = 1;
                }
            }
        }
        return Math.max(longest, current);
    }

    public int longestConsecutive(int[] input) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : input) {
            set.add(i);
        }

        int longest = 0;
        for (int i : set) {
            // optimization, - to go through 0 so as to include all possibilities, beginning of new seq
            if (!set.contains(i - 1)) {
                int currentNum = i;
                int current = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    current += 1;
                }

                longest = Math.max(longest, current);

            }
        }

        return longest;
    }
}
