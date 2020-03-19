public class RegularExpressionMatching {

    // '.' Matches any single character.
    // '*' Matches zero or more of the preceding element.

    // 0(s * p)
    public boolean isMatch(String s, String p) {
        int inputLength = s.length();
        int patternLength = p.length();
        boolean[][] matchMemo = new boolean[inputLength + 1][patternLength + 1];

        // guaranteed matching if both empty
        matchMemo[0][0] = true;

        for (int i = 1; i < matchMemo[0].length; i++) {
            if (p.charAt(i - 1) == '*') {
                matchMemo[0][i] = matchMemo[0][i - 2];
            }
        }

        for (int i = 1; i < matchMemo.length; i++) {
            for (int j = 1; j < matchMemo[0].length; j++) {
                if (p.charAt(j - 1) == '.' || (p.charAt(j - 1) == s.charAt(i - 1))) {
                    matchMemo[i][j] = matchMemo[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    matchMemo[i][j] = matchMemo[i][j - 2];

                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        matchMemo[i][j] |= matchMemo[i - 1][j];
                    }
                } else {
                    matchMemo[i][j] = false;
                }
            }
        }
        return matchMemo[inputLength][patternLength];
    }
}
