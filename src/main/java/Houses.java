import java.util.ArrayList;
import java.util.List;

// Prison Cells after N days
public class Houses {

    public List<Integer> cellCompete(int[] states, int days) {
        int[] newStates = states.clone();

        for (int day = 1; day <= days; day++) {
            calculateForDay(states, newStates);
            states = newStates.clone();
        }

        return convertToList(newStates);
    }

    private void calculateForDay(int[] states, int[] newStates) {
        for (int i = 0; i < states.length; i++) {
            int left = 0;
            int right = 0;

            if (i != (states.length - 1)) {
                right = states[i + 1];
            }
            if (i != 0) {
                left = states[i-1];
            }
            setValueForCurrentState(newStates, i, left, right);
        }
    }

    private void setValueForCurrentState(int[] newStates, int i, int state, int state2) {
        newStates[i] = 1;
        if (adjacentBothSameValue(state, state2)) {
            newStates[i] = 0;
        }
    }

    private boolean adjacentBothSameValue(int left, int right) {
        return left == right;
    }

    private List<Integer> convertToList(int[] newStates) {
        List<Integer> intList = new ArrayList<>();
        for (int i : newStates) {
            intList.add(i);
        }
        return intList;
    }
}
