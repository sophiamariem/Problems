public class StringCompression {

    public int compress(char[] chars) {
        int count = 0;
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i + 1 >= chars.length || chars[i] != chars[i + 1]) {
                if (count == 1) {
                    chars[idx] = chars[i];
                } else {
                    chars[idx] = chars[i];
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[++idx] = c;
                    }
                }
                count = 0;
                idx++;
            }
        }
        System.out.println(chars);
        return idx;
    }
}
