import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();

        while (n > 1) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
        }

        return true;
    }

    public boolean isHappyOverflow(int n) {
        // easily overflow here with invalid value
        char[] number = String.valueOf(n).toCharArray();

        int sum = 0;
        for (char c : number) {
            sum += Math.pow(Character.getNumericValue(c), 2);
        }

        if (sum != 1) {
            return isHappyOverflow(sum);
        }
        return true;
    }
}
