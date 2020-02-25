import java.util.Stack;

public class MatchingBrackets {

    protected static final String UNBALANCED = "Unbalanced";
    protected static final String BALANCED = "Balanced";
    protected static final String INVALID = "INVALID";

    private static final char BRACKET_OPEN = '(';
    private static final char SQUARE_OPEN = '[';
    private static final char CURLY_OPEN = '{';
    private static final char BRACKET_CLOSE = ')';
    private static final char SQUARE_CLOSE = ']';
    private static final char CURLY_CLOSE = '}';

    public String matchBrackets(String input) {
        Stack<Character> stack = new Stack();

        if (input == null) {
            return INVALID;
        }

        if (input.isEmpty()) {
            return BALANCED;
        }
        char[] charArray = input.toCharArray();
        return Boolean.TRUE.equals(checkMatching(stack, charArray)) ? BALANCED : UNBALANCED;
    }

    private boolean checkMatching(Stack<Character> stack, char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == BRACKET_OPEN || charArray[i] == SQUARE_OPEN || charArray[i] == CURLY_OPEN) {
                stack.push(charArray[i]);
            } else if (charArray[i] == BRACKET_CLOSE && !checkCorresponding(stack, BRACKET_OPEN)) {
                return false;
            } else if (charArray[i] == SQUARE_CLOSE && !checkCorresponding(stack, SQUARE_OPEN)) {
                return false;
            } else if (charArray[i] == CURLY_CLOSE && !checkCorresponding(stack, CURLY_OPEN)) {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean checkCorresponding(Stack<Character> stack, char c) {
        if (stack.isEmpty()) {
            return false;
        }
        if (stack.peek() == c) {
            stack.pop();
            return true;
        }
        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String left = "([{";
        String right = ")]}";
        for (char c : s.toCharArray()) {
            if (left.indexOf(c) > -1)
                stack.push(c);
            else if (stack.empty() || left.indexOf(stack.pop()) != right.indexOf(c))
                return false;
        }
        return stack.empty();
    }
}
