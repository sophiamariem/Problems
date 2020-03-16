public class MedianOfTwoSortedArrays {

    // find the median by partitioning the two arrays into 2 equal halves (count sum of left elements for each is equal to count sum of right elements)
    // and all elements must obey -> leftmost element of first partition of first array <= rightmost element of right partition of second array
    // and leftmost element of second partition of second array <= rightmost element of first partition of first array
    // to find this partition we do binary search on the smallest array
    // O(log (m+n))
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return findMedianSortedArrays(nums1, nums2, 0, nums1.length);
        }
        return findMedianSortedArrays(nums2, nums1, 0, nums2.length);
    }

    private double findMedianSortedArrays(int[] small, int[] large, int i, int j) {
        int smallLength = small.length;
        int largeLength = large.length;

        while (i <= j) {
            int smallPartition = i + j / 2;
            int largePartition = (smallLength + largeLength + 1) / 2 - smallPartition; // + 1 to guarantee upper rounding if odd

            int maxLeftX = (smallPartition == 0) ? Integer.MIN_VALUE : small[smallPartition - 1];
            int minRightX = (smallPartition == smallLength) ? Integer.MAX_VALUE : small[smallPartition];

            int maxLeftY = (largePartition == 0) ? Integer.MIN_VALUE : large[largePartition - 1];
            int minRightY = (largePartition == largeLength) ? Integer.MAX_VALUE : large[largePartition];

            // correct partition found
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((smallLength + largeLength) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }

            } else if (maxLeftX > minRightY) { // maxLeftX > minRightY -> left--
                j = smallPartition - 1;
            } else { // minRightY > minRightY -> right++
                i = smallPartition + 1;
            }

        }
        return 0;
    }
}
