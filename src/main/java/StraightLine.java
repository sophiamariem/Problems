public class StraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3) {
            return true;
        }

        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int nx = coordinates[i][0] - coordinates[i - 1][0];
            int ny = coordinates[i][1] - coordinates[i - 1][1];

            if (y * nx != ny * x) {
                return false;
            }
        }
        return true;
    }
}