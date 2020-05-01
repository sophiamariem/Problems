import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {
    private static final FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    public void test() {
        int n = 5;
        int firstBad = 4;

        Map<Integer, Boolean> versions = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            versions.put(i, false);
        }
        versions.put(firstBad, true);
        firstBadVersion.setVersions(versions);

        FirstBadVersion.Solution test = firstBadVersion.new Solution();
        assertEquals(firstBad, test.firstBadVersion(n));
    }
}
