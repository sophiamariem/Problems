import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {

    public boolean isBipartiteDfs(int[][] graph) {
        int length = graph.length;
        // colors : 0 - unvisited, 1 black, -1 yellow
        int[] colors = new int[length];

        for (int i = 0; i < length; i++) {
            if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean validColor(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int adjacent : graph[node]) {
            if (!validColor(graph, colors, -color, adjacent)) {
                return false;
            }
        }
        return true;
    }

    public boolean isBipartiteBfs(int[][] graph) {
        int length = graph.length;
        int[] colors = new int[length];

        for (int i = 0; i < length; i++) {

            if (colors[i] != 0) {
                continue;
            } else {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                colors[i] = 1;

                while (!queue.isEmpty()) {
                    Integer node = queue.poll();

                    for (int adjacent : graph[node]) {
                        if (colors[adjacent] == 0) {
                            queue.add(adjacent);
                            colors[adjacent] = -colors[node];
                        } else if (colors[adjacent] == colors[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
