import java.util.HashMap;
import java.util.Map;

public class FirstBadVersion {
    Map<Integer, Boolean> versions = new HashMap<>();

    public void setVersions(Map<Integer, Boolean> versions) {
        this.versions = versions;
    }

    boolean isBadVersion(int version) {
        return versions.get(version);
    }

    public class Solution {

        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }
    }
}
