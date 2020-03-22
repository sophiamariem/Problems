import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    // O(m log m + n log n) where m and n array lengths
    public int[] intersectionUsingSets(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums1) {
            setA.add(num);
        }

        for (int num : nums2) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }

        return getIntersectionResult(intersection);
    }

    // O(m log n)
    public int[] intersectionUsingBinarySearch(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();

        Arrays.sort(nums2);
        for (int num : nums1) {
            // Arrays.binarySearch(nums2, num) >= 0 // slightly faster cause bitwise right shift at partition
            if (binarySearch(nums2, num)) {
                intersection.add(num);
            }
        }

        return getIntersectionResult(intersection);
    }

    public int[] intersectionUsingTwoPointers(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return getIntersectionResult(intersection);
    }

    private boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    private int[] getIntersectionResult(Set<Integer> intersection) {
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }
}
