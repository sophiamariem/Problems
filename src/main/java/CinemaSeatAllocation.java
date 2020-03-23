import java.util.HashMap;
import java.util.HashSet;

public class CinemaSeatAllocation {

    // for a family of four, 10 max seats on row ( 3 - 4 - 3)
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int reservedCount = reservedSeats.length;
        HashMap<Integer, HashSet<Integer>> reservedMap = new HashMap<>();

        for (int i = 0; i < reservedCount; i++) {
            reservedMap.putIfAbsent(reservedSeats[i][0], new HashSet<>());
            reservedMap.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }

        int options = 0;
        // get min options
        options += 2 * n - 2 * reservedMap.size();

        for (int i : reservedMap.keySet()) {
            boolean flag = false;
            HashSet<Integer> reserved = reservedMap.get(i);
            if (!reserved.contains(2) && !reserved.contains(3) && !reserved.contains(4) && !reserved.contains(5)) {
                options++;
                flag = true;
            }
            if (!reserved.contains(6) && !reserved.contains(7) && !reserved.contains(8) && !reserved.contains(9)) {
                options++;
                flag = true;
            }
            if (!flag && !reserved.contains(4) && !reserved.contains(5) && !reserved.contains(6) && !reserved.contains(7)) {
                options++;
            }
        }
        return options;
    }
}
