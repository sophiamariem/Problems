public class DetectCapital {

    public boolean detectCapitalUseG(String word) {
        boolean one = false;
        boolean two = false;
        boolean low = false;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                if (low) {
                    return false;
                }
                if (one) {
                    two = true;
                } else {
                    one = true;
                }
            } else {
                if (two) {
                    return false;
                }
                low = true;
            }
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0 || word.length() < 2) {
            return true;
        }

        boolean startsWithUpper = isCapital(word.charAt(0));
        boolean isUpper = isCapital(word.charAt(1));

        for (int i = 2; i < word.length(); i++) {
            if (isUpper != isCapital(word.charAt(i))) {
                return false;
            }
        }

        if (!startsWithUpper) {
            return !isUpper;
        }
        return true;
    }

    private boolean isCapital(char ch) {
        return 'A' <= ch && ch <= 'Z';
    }
}
