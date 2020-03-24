public class MaxConsecutiveChars {

    public String maxCharacters(String input, int k) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i != input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                for (int j = 0; j < count && j < k; j++) {
                    sb.append(input.charAt(i));
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    public String maxCharactersStackLike(String input, int k) {
        if (k >= input.length()) {
            return input;
        }

        if (k == 0) {
            return "";
        }

        char[] stackLikeArray = new char[k];
        int top = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (stackLikeArray[top] == input.charAt(i)) {
                if (top != k - 1) {
                    stackLikeArray[++top] = input.charAt(i);
                    sb.append(input.charAt(i));
                }
            } else {
                top = 0;
                stackLikeArray[top] = input.charAt(i);
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
