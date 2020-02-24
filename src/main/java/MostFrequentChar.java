public class MostFrequentChar {

    public char mostFrequentChar(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("input is null or empty");
        }

        int[] chars = new int[Character.MAX_VALUE];

        for (char c : s.toCharArray()) {
            chars[c] = chars[c] + 1;
        }

        int max = -1;
        int maxIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (max < chars[s.charAt(i)]) {
                max = chars[s.charAt(i)];
                maxIdx = i;
            }
        }

        return s.charAt(maxIdx);
    }
}