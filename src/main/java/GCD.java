import java.util.Arrays;

public class GCD {

        public int generalizedGCD(int num, int[] arr) {
            Arrays.sort(arr);

            int common = 1;
            int divide = 1;

            if (arr[arr.length - 1] < 0) {
                return 0;
            }

            if (num != arr.length) {
                return 0;
            }

            for (int j = 1; j <= arr[arr.length - 1]; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0 && arr[i] >= j && arr[i] % j == 0) {
                        divide = j;
                    } else {
                        divide = common;
                        j++;
                    }
                }
                common = divide;
            }
            return common;
        }
}