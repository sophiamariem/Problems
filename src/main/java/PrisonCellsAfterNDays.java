import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrisonCellsAfterNDays {

    public int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> seen = new HashMap<>();
        while (N > 0) {
            int[] cellsC = new int[8];
            seen.put(Arrays.toString(cells), N--);
            for (int i = 1; i < 7; i++) {
                cellsC[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }
            cells = cellsC;

            if (seen.containsKey(Arrays.toString(cells))) {
                N %= seen.get(Arrays.toString(cells)) - N;
            }
        }
        return cells;
    }

    /**
     * Pattern in loop. The length of loop can be 1, 7, or 14.
     * So once we enter the loop (after one step), every 14 steps must be the same state.
     * Once we enter the loop, remaining steps: N-1
     * Cycle of 14: (N-1)%14
     * To handle negative mod results: (N-1)%14 + 1
     */
    public int[] prisonAfterNDaysMagicNumber(int[] cells, int N) {
        for (N = (N - 1) % 14 + 1; N > 0; --N) {
            int[] cellsC = new int[8];
            for (int i = 1; i < 7; ++i)
                cellsC[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            cells = cellsC;
        }
        return cells;
    }
}
