import java.util.HashSet;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) {
            return -1;
        }

        int result = 0;
        HashSet<Character> text1Chars = new HashSet<>();
        for (Character c : text1.toCharArray()) {
            text1Chars.add(c);
        }

        for (Character c : text2.toCharArray()) {
            if (text1Chars.contains(c)) {
                result++;
            }
        }
        return result;
    }
}
