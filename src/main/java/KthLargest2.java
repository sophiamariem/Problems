public class KthLargest2 {

    public int findKthLargest(int[] input, int k) {
        if (input == null || k < 1 || k > input.length) {
            return 0;
        }

        int[] sorted = quicksort(input, 0, input.length - 1);
        return sorted[input.length - k];
    }

    private int[] quicksort(int[] array, int left, int right) {
        if (left >= right) { // out of bounds
            return array;
        }

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
        return array;
    }

    private int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
