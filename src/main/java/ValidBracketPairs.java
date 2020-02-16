import java.util.ArrayList;
import java.util.List;

public class ValidBracketPairs {

    public List<String> bracketPairs(int n) {
        List<String> str = new ArrayList<>();
        addBrackets(str, n, n, new char[n * 2], 0);
        return str;
    }

    private void addBrackets(List<String> str, int leftRem, int rightRem, char[] charList, int index) {
        if (leftRem >= 0 && rightRem >= leftRem) {
            if (leftRem == 0 && rightRem == 0) {
                str.add(String.copyValueOf(charList));
            } else {
                charList[index] = '(';
                addBrackets(str, leftRem - 1, rightRem, charList, index + 1);

                charList[index] = ')';
                addBrackets(str, leftRem, rightRem - 1, charList, index + 1);
            }
        }
    }

}
