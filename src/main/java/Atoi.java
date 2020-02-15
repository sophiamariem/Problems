public class Atoi {

    public int atoi(String numberString) {
        if (numberString == null || numberString.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;
        if (numberString.charAt(0) == '-') {
            isNegative = true;
        }

        numberString = numberString.replaceAll(" ", "");

        int result = 0;
        for(int i = isNegative ? 1 : 0  ; i < numberString.length(); i++) {
            if (isValid(numberString, i)) {
                result = (result * 10) + (numberString.charAt(i) - '0');
            }
        }

        if (isNegative) {
            return -result;
        }
        return result;
    }

    private boolean isValid(String numberString, int i) {
        return numberString.charAt(i) >= '0' && numberString.charAt(i) <= '9';
    }

}
