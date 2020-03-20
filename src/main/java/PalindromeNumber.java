public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int temp = x;
        int reversed = 0;

        while (x > 0) {
            reversed *= 10;
            reversed += x % 10;
            x = x / 10;
        }

        return reversed == temp;
    }
}
