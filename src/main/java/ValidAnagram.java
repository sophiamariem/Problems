import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        Map<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public boolean isAnagramCharArray(String s, String t) {
        int array[] = new int[26];     // assume string only lowercase

        for (char c : s.toCharArray()) {
            array[c - 97]++;
        }
        for (char c : t.toCharArray()) {
            array[c - 97]--;
        }

        for (int i : array) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
