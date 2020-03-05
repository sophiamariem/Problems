import java.util.HashSet;
import java.util.Set;

public class DistinctSubstring {

    public int distinctSubstring(String str) {
        Set<String> stringSet = new HashSet();

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                stringSet.add(str.substring(i, j));
            }
        }
        return stringSet.size();
    }
}
