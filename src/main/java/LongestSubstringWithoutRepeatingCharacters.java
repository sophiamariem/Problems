import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet();

        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
