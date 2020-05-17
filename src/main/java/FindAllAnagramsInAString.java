import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {

    // 20 ms
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : p.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int fast = 0;
        int slow = 0;
        int diff = count.size();

        List<Integer> result = new ArrayList<>();
        while (fast < s.length()) {
            char c = s.charAt(fast++);
            if (count.containsKey(c)) {
                if (count.get(c) - 1 == 0) {
                    diff--;
                }
                count.put(c, count.get(c) - 1);
            }

            if (fast > p.length()) {
                char d = s.charAt(slow++);
                if (count.containsKey(d)) {
                    if (count.get(d) == 0) {
                        diff++;
                    }
                    count.put(d, count.get(d) + 1);
                }
            }

            if (diff == 0) {
                result.add(slow);
            }
        }

        return result;
    }

    // 7 ms
    public List<Integer> findAnagramsC(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()) {
            return result;
        }

        int count[] = new int[26];
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            count[c - 'a']++;
        }

        int cnt[] = new int[26];
        for (int i = 0; i < p.length(); i++) {
            int pos = s.charAt(i) - 'a';
            cnt[pos]++;
        }

        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] != cnt[i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            int pos = s.charAt(i - p.length()) - 'a';
            cnt[s.charAt(i) - 'a']++;
            cnt[pos]--;
            flag = true;
            for (int j = 0; j < 26; j++) {
                if (count[j] != cnt[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

}
