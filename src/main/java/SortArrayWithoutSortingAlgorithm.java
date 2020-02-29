public class SortArrayWithoutSortingAlgorithm {

    public int[] sort(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        int[] result = new int[max - min + 1];

        for (int i : array) {
            result[i - min]++;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i]; j++) {
                System.out.print(i + min + " ");
            }
        }
        return result;
    }
}
