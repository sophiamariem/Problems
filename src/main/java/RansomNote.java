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
}
