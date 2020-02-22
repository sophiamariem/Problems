import java.util.ArrayList;
import java.util.List;

// Zombie in Matrix
public class HoursFilesDistributed {

    int minimumHours(int rows, int columns, List<List<Integer>> grid) {
        int hours = -1;

        if (rows == 0 || columns == 0 || grid == null || rows != grid.size() || columns != grid.get(0).size()) {
            return hours;
        }

        boolean keepSending = true;
        List<List<Integer>> newList = new ArrayList<>(grid.size());
        newToOld(rows, grid, newList);

        while (keepSending) {
            keepSending = send(rows, columns, grid, newList);
            if (keepSending) {
                if (hours == -1) {
                    hours = 0;
                }
                hours++;
                grid.clear();
                newToOld(rows, newList, grid);
            } else if (hours == -1) {
                return hours;
            }
        }

        return hours;
    }

    private void newToOld(int rows, List<List<Integer>> grid, List<List<Integer>> newList) {
        for (List<Integer> oldRows : grid) {
            List<Integer> rowList = new ArrayList<>(rows);
            newList.add(rowList);
            for (int col : oldRows) {
                rowList.add(col);
            }
        }
    }

    private boolean send(int rows, int columns, List<List<Integer>> old, List<List<Integer>> grid) {
        boolean keepSending = false;
        for (int r = 0; r < rows; r++) {
            List<Integer> gridRowOld = old.get(r);
            List<Integer> gridRowNew = grid.get(r);

            for (int c = 0; c < columns; c++) {
                if (gridRowOld.get(c) == 1) {
                    if (c - 1 >= 0 && gridRowOld.get(c - 1) == 0) {
                        gridRowNew.set(c - 1, 1);
                        keepSending = true;
                    }
                    if (c + 1 < columns && gridRowOld.get(c + 1) == 0) {
                        gridRowNew.set(c + 1, 1);
                        keepSending = true;
                    }
                    if (r - 1 >= 0 && old.get(r - 1).get(c) == 0) {
                        grid.get(r - 1).set(c, 1);
                        keepSending = true;
                    }
                    if (r + 1 < rows && old.get(r + 1).get(c) == 0) {
                        grid.get(r + 1).set(c, 1);
                        keepSending = true;
                    }

                }
            }
        }
        return keepSending;
    }

}
