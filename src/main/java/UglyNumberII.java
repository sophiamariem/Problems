import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {

    // Ugly numbers are positive numbers whose prime factors only include 2, 3, 5x
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n + 1];
        ugly[0] = 1;

        int idxFor2 = 0;
        int idxFor3 = 0;
        int idxFor5 = 0;

        for (int i = 1; i < n; i++) {
            ugly[i] = Math.min(ugly[idxFor2] * 2, Math.min(ugly[idxFor3] * 3, ugly[idxFor5] * 5));
            if (ugly[i] == ugly[idxFor2] * 2) {
                idxFor2++;
            }
            if (ugly[i] == ugly[idxFor3] * 3) {
                idxFor3++;
            }
            if (ugly[i] == ugly[idxFor5] * 5) {
                idxFor5++;
            }
        }
        return ugly[n - 1];
    }

    public int nthUglyNumberWithList(int n) {
        if (n <= 0) {
            return 0;
        }

        List<Integer> ugly = new ArrayList<>();
        ugly.add(1);

        int idxFor2 = 1;
        int idxFor3 = 1;
        int idxFor5 = 1;

        int head2 = 2, head3 = 3, head5 = 5;

        while (ugly.size() < n) {
            int min = Math.min(head2, Math.min(head3, head5));

            ugly.add(min);
            if (min == head2) {
                head2 = ugly.get(idxFor2++) * 2;
            }
            if (min == head3) {
                head3 = ugly.get(idxFor3++) * 3;
            }
            if (min == head5) {
                head5 = ugly.get(idxFor5++) * 5;
            }
        }
        return ugly.get(ugly.size() - 1);
    }
}
