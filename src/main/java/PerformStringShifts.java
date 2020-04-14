public class PerformStringShifts {

    public String stringShift(String s, int[][] shift) {
        int finalShift = 0;

        for (int[] sh : shift) {
            if (sh[0] == 0) {
                finalShift += sh[1];
            } else {
                finalShift -= sh[1];
            }
        }

        int length = s.length();
        finalShift = ((finalShift % length) + length) % length;

        return s.substring(finalShift) + s.substring(0, finalShift);
    }
}
