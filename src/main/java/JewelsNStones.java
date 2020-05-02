import java.util.HashSet;
import java.util.Set;

public class JewelsNStones {

    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();

        for (char c : J.toCharArray()) {
            set.add(c);
        }

        int num = 0;
        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                num++;
            }
        }
        return num;
    }

    public int numJewelsInStonesN(String J, String S) {
        int count = 0;
        for (Character c : S.toCharArray()) {
            for (Character m : J.toCharArray()) {
                if (m == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
