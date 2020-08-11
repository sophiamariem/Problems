import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        int start = 0;
        int end = citations.length;
        int result = start;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int h = check(mid, citations);
            if (h >= mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private int check(int hindex, int[] citations) {
        int max = 0;
        for (int a : citations) {
            max += ((a >= hindex) ? 1 : 0);
        }
        return max;
    }

    public int hIndexWithSorting(int[] citations) {
        Arrays.sort(citations);
        int N = citations.length;

        int index = 0;
        while (index < N && N - index > citations[index]) {
            index++;
        }
        return N - index;
    }
}
