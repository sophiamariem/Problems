public class HIndex {

    public int hIndex(int[] citations) {
        int start = 1;
        int end = citations.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int idx = citations.length - mid;
            if (citations[idx] >= mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
