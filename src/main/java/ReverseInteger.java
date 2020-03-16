public class ReverseInteger {

    public int reverse(int x) {
        // expecting 32bit number, using long to handle potential integer overfows
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        // if integer overflows return 0 as per problem
        return reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE ? 0 : (int) reversed;
    }
}
