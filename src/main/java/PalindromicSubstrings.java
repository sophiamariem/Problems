public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += isPalindrome(i, i, s);//odd length
            count += isPalindrome(i, i + 1, s);//even length
        }

        return count;
    }

    private int isPalindrome(int i, int j, String s) {
        int count = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }
}
