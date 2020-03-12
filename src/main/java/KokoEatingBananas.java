public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        // binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            for (int pile : piles) {
                count += (pile + mid - 1) / mid; // mid of pile
            }
            if (count > H) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
