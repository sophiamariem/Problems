public class ConvertOneStringToOther {

    public boolean stringConvert(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1ChArray = s1.toCharArray();
        char[] s2ChArray = s2.toCharArray();

        for (int i = 0; i < s1.length(); i++) {
            swap(s1ChArray, s2ChArray, i);
        }

        return String.valueOf(s1ChArray).equals(s2) && String.valueOf(s2ChArray).equals(s1);
    }

    private void swap(char[] s1ChArray, char[] s2ChArray, int index) {
        char temp = s1ChArray[index];
        s1ChArray[index] = s2ChArray[index];
        s2ChArray[index] = temp;
    }
}
