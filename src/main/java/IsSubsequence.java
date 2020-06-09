public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; i < s.length() && j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }

    public boolean isSubsequenceIdxOf(String s, String t) {
        int idx = -1;
        for (char c : s.toCharArray()) {
            idx = t.indexOf(c, idx + 1);
            if (idx == -1) {
                return false;
            }
        }
        return true;
    }
}
