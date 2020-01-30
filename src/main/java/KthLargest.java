public class KthLargest {

    public int findKthLargest(int[] input, int k) {
        if (input == null || k < 1 || k > input.length) {
            return 0;
        }

        return getKth(input.length - k, input, 0, input.length - 1);
    }

    private int getKth(int k, int[] input, int start, int end) {
        int pivot = input[end];

        int left = start;
        int right = end;

        while (left != right) {
            while (input[left] < pivot && left < right) {
                left++;
            }

            while (input[right] >= pivot && right > left) {
                right--;
            }

            swap(input, left, right);
        }
        swap(input, left, end);

        if (k == left) {
            return pivot;
        } else if (k < left) {
            return getKth(k, input, start, left-1);
        } else {
            return getKth(k, input, left, end);
        }
    }

    private void swap(int[] input, int left, int right) {
        int tmp = input[left];
        input[left] = input[right];
        input[right] = tmp;
    }

}
