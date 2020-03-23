import java.util.LinkedList;
import java.util.Queue;

public class MaxBoxCandies {

    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        Queue<Integer> availableBoxes = new LinkedList<>();
        for (int box : initialBoxes) {
            availableBoxes.offer(box);
        }

        int sum = 0;
        boolean done = false;
        while (!done) {
            done = true;
            int boxes = availableBoxes.size();
            for (int i = 0; i < boxes; i++) {

                int box = availableBoxes.poll();
                if (status[box] == 1) {
                    sum += candies[box];
                    for (int key : keys[box]) {
                        status[key] = 1;
                    }
                    for (int newBox : containedBoxes[box]) {
                        availableBoxes.offer(newBox);
                    }
                    done = false;
                } else {
                    availableBoxes.offer(box);
                }
            }
        }
        return sum;
    }
}
