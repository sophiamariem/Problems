public class ReverseWordOrderInString {

    public String reverseWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return null;
        }

        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);

            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
