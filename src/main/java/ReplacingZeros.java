import java.util.HashSet;

public class ReplacingZeros {

    public HashSet replaceZeros(int[] input, int max) {
        HashSet<Integer> result = new HashSet<>();
        if (input == null || max < 0) {
            return result;
        }

        int left = 0;
        int zeroCount = 0;
        int window = 0;
        int leftOfMax = 0;

        for (int right = 0; right < input.length; right++) {
            if (input[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > max) {
                if (input[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            if (right - left + 1 > window) {
                window = right - left + 1;
                leftOfMax = left;
            }
        }

        for (int i = leftOfMax; i < window; i++) {
            if (input[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }

}
