public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int[] longest = new int[2];
        for (int i = 0; i < s.length(); i++) {
            getNext(s, i, i, longest);
            getNext(s, i, i + 1, longest);
        }
        return s.substring(longest[0], longest[1]);
    }

    private void getNext(String s, int i, int j, int[] longest) {
        for (; i >= 0 && j < s.length(); i--, j++) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
        }
        if (j - (i + 1) > longest[1] - longest[0]) {
            longest[0] = i + 1;
            longest[1] = j;
        }
    }
}
