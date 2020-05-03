public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[256];

        for (char c : magazine.toCharArray()) {
            a[c]++;
        }

        for (char c : ransomNote.toCharArray()) {
            a[c]--;
            if (a[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstructLw(String ransomNote, String magazine) {
        int[] a = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            int idx = magazine.charAt(i) - 'a';
            a[idx]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';

            a[idx]--;
            if (a[idx] < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstructLwFast(String ransomNote, String magazine) {
        int caps[] = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 'a']);
            if (index == -1) {
                return false;
            }
            caps[c - 97] = index + 1;
        }
        return true;
    }
}
