public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return checkInclusionFor(s2, s1);
        }
        return checkInclusionFor(s1, s2);
    }

    private boolean checkInclusionFor(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        int[] letters = new int[26]; // assuming lowercase ASCII
        for (int i = 0; i < len1; i++) {
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }
        if (allZero(letters)) {
            return true;
        }

        // sliding window
        for (int i = len1; i < len2; i++) {
            letters[s2.charAt(i) - 'a']--;
            letters[s2.charAt(i - len1) - 'a']++;

            if (allZero(letters)) {
                return true;
            }
        }

        return false;
    }

    private boolean allZero(int[] letters) {
        for (int i = 0; i < 26; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
