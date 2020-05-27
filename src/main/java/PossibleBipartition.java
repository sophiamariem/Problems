import java.util.ArrayList;
import java.util.List;

public class PossibleBipartition {

    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] dislike : dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }

        int[] colors = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (colors[i] == 0 && !colorFound(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean colorFound(List<List<Integer>> graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }

        colors[node] = color;
        for (int x : graph.get(node)) {
            if (!colorFound(graph, colors, -color, x)) {
                return false;
            }
        }
        return true;
    }
}
