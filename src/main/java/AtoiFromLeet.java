public class AtoiFromLeet {

    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        boolean skipFirst = false;
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            isNegative = true;
            skipFirst = true;
        }
        if (str.charAt(0) == '+') {
            skipFirst = true;
        }

        double result = 0;
        for (int i = skipFirst ? 1 : 0; i < str.length(); i++) {
            if (isValid(str, i)) {
                result = (result * 10) + (str.charAt(i) - '0');
            } else if (result == 0) {
                return 0;
            } else {
                int resultint = (int) result;
                resultint = isNegative ? -resultint : resultint;
                return resultint;
            }
        }

        if (isNegative) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }

    private boolean isValid(String numberString, int i) {
        return numberString.charAt(i) >= '0' && numberString.charAt(i) <= '9';
    }

}
