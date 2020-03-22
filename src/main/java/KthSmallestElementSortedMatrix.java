import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementSortedMatrix {

    public int kthSmallestMaxHeap(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        int row = matrix.length;
        int column = matrix[0].length;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                int num = matrix[r][c];
                if (heap.size() < k) {
                    heap.add(num);
                } else if (num < heap.peek()) {
                    heap.poll();
                    heap.add(num);
                }
            }
        }

        return heap.peek();
    }

    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length - 1][ matrix[0].length - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            int j = matrix[0].length - 1;

            for (int i = 0; i < matrix.length; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count += (j + 1);
            }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
