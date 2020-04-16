public class ValidParenthesisString {
    private Boolean[][] memo;

    public boolean checkValidString(String s) {
        memo = new Boolean[s.length() + 1][s.length() + 1];
        return check(s, 0, 0);
    }

    private boolean check(String s, int start, int count) {
        if (count < 0) {
            return false;
        }

        int y = count;
        if (memo[start][y] != null) {
            return memo[start][y];
        }

        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            } else if (c == '*') {
                memo[start][y] = (check(s, i + 1, count + 1) || check(s, i + 1, count - 1) || check(s, i + 1, count));
                return memo[start][y];
            }
        }

        memo[start][y] = (count == 0);
        return memo[start][y];
    }
}
