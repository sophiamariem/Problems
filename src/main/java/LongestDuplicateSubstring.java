import java.util.*;

public class LongestDuplicateSubstring {

    private static final long mod = (long) Math.pow(2, 32);
    private static final int a = 26;

    public String longestDupSubstring(String S) {
        int n = S.length();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = (int) S.charAt(i) - (int) 'a';
        }

        int left = 1;
        int right = n;

        while (left < right) {
            int m = left + (right - left) / 2;
            if (searchPattern(m, n, s) == -1) {
                right = m;
            } else {
                left = m + 1;
            }
        }

        int start = searchPattern(left - 1, n, s);
        return start != -1 ? S.substring(start, start + left - 1) : "";
    }

    public int searchPattern(int L, int n, int[] s) {
        long h = 0;

        for (int i = 0; i < L; ++i) {
            h = (h * a + s[i]) % mod;
        }

        Set<Long> seen = new HashSet<>();
        seen.add(h);

        long d = 1;
        for (int i = 0; i < L - 1; ++i) {
            d = (d * a) % mod;
        }

        for (int i = 1; i < n - L + 1; i++) {
            h = (h - s[i - 1] * d % mod + mod) % mod;
            h = (h * a + s[i + L - 1]) % mod;
            if (seen.contains(h)) {
                return i;
            }
            seen.add(h);
        }
        return -1;
    }
}
