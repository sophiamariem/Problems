import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        int primarySum = 0;
        int secondarySum = 0;

        int size = arr.size();

        int i = 0;
        int j = size - 1;
        while (i < size && j >= 0) {
            primarySum += (arr.get(i).get(i));
            secondarySum += (arr.get(i).get(j));
            j--;
            i++;
        }
        return Math.abs(secondarySum - primarySum);
    }

}
