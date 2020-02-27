public class ReverseCharsInWords {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char[] chArray = word.toCharArray();
            for (int i = chArray.length - 1; i >= 0; i--) {
                sb.append(chArray[i]);
            }
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}
