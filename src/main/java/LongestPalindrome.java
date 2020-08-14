import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) % 2 == 0) {
                result++;
            }
        }
        return Math.min(s.length(), result * 2 + 1);
    }

    public int longestPalindromeCharArray(String s) {
        int[] chars = new int[128];
        char[] array = s.toCharArray();
        for (char c : array) {
            chars[c]++;
        }
        int single = 0;
        for (int c : chars) {
            if (c % 2 != 0) {
                single++;
            }
        }
        return single > 1 ? array.length - single + 1 : array.length;
    }
}
