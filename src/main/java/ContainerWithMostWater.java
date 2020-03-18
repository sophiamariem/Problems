public class ContainerWithMostWater {

    // O(n2)
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int length = Math.min(height[i], height[j]);
                int width = j - i;
                int area = length * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    // O(n)
    public int maxAreaTwoPointers(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int length = Math.min(height[left], height[right]);
            int width = right - left;
            int area = length * width;
            maxArea = Math.max(maxArea, area);

            while (left < right && height[left] <= length) {
                left++;
            }
            while (left < right && height[right] <= length) {
                right--;
            }
        }
        return maxArea;
    }
}
