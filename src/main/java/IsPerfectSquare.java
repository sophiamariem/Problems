public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long i = 1;
        while (i * i < num) {
            i += 1;
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public boolean isPerfectSquareBs(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((double) mid == (double) num / mid) {
                return true;
            } else if ((double) mid < (double) num / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
