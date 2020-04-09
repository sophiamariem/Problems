import java.util.Stack;

//  # means a backspace character.
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        StringBuilder sbForS = new StringBuilder(S);
        StringBuilder sbForT = new StringBuilder(T);

        modifyAccordingly(sbForS);
        modifyAccordingly(sbForT);

        return sbForS.toString().equals(sbForT.toString());
    }

    private void modifyAccordingly(StringBuilder sb) {
        int size = sb.length();
        for (int i = 0; i < size; i++) {
            if (sb.charAt(i) == '#') {
                sb.deleteCharAt(i);
                if (i - 1 >= 0) {
                    sb.deleteCharAt(i - 1);
                    size -= 2;
                } else {
                    size--;
                }

                i = -1;
            }
        }
    }

    public boolean backspaceCompareRecursion(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;

        while (true) {
            for (int back = 0; i >= 0 && (back > 0 || S.charAt(i) == '#'); --i) {
                back += S.charAt(i) == '#' ? 1 : -1;
            }
            for (int back = 0; j >= 0 && (back > 0 || T.charAt(j) == '#'); --j) {
                back += T.charAt(j) == '#' ? 1 : -1;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                i--;
                j--;
            } else {
                return i == -1 && j == -1;
            }
        }
    }

    public boolean backspaceCompareStack(String S, String T) {
        return stackFor(S).equals(stackFor(T));
    }

    public String stackFor(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}
