public class StringRotation {

    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        String ADouble = A + A;
        return ADouble.contains(B);
    }
}
