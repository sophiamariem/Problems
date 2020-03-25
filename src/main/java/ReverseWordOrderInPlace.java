public class ReverseWordOrderInPlace {

    public String reverseWords(char[] input) {
        reverseCharacters(input, 0, input.length - 1);

        int currentWordStartIdx = 0;
        for (int i = 0; i <= input.length; i++) {
            if (i == input.length || input[i] == ' ') {
                reverseCharacters(input, currentWordStartIdx, i - 1);
                currentWordStartIdx = i + 1;
            }
        }

        return String.valueOf(input);
    }

    private void reverseCharacters(char[] array, int leftIdx, int rightIdx) {
        while (leftIdx < rightIdx) {
            char temp = array[leftIdx];
            array[leftIdx] = array[rightIdx];
            array[rightIdx] = temp;
            leftIdx++;
            rightIdx--;
        }
    }
}
