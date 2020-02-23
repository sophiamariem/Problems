public class ReverseWordOrderInString {

    public String reverseWordsInSentence(String sentence) {
        if (sentence == null) {
            return null;
        }

        if (sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                reversed.append(words[i]).append(" ");;
            }
        }
        return reversed.toString().trim();
    }
}
