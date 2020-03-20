public class ZigZagConversion {

    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        int length = s.length();

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }


        int i = 0;
        while (i < length) {
            for (int j = 0; j < numRows && i < length; j++) {
                sb[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j >= 1 && i < length; j--) {
                sb[j].append(s.charAt(i++));
            }
        }

        return String.join("", sb);
    }
}
