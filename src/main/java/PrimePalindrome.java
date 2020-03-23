public class PrimePalindrome {

    // prime has to be of odd length as all even length palindromes are divisible by 11 thus not prime (all but prime)
    public int primePalindrome(int N) {
        if (N >= 8 && N <= 11) {
            return 11;
        }
        // 100000 as per problems restrictions
        for (int i = 1; i < 100000; i++) {
            String numberAsString = Integer.toString(i);
            String reversed = new StringBuilder(numberAsString).reverse().toString();

            // create next odd length pali number
            int number = Integer.parseInt(numberAsString + reversed.substring(1));
            if (number >= N && isPrime(number)) {
                return number;
            }
        }
        return -1;
    }

    private boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num % 2 == 0) {
            return num == 2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
