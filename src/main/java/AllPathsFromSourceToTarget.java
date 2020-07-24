import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPathsFromSourceToTarget {

    private List<List<Integer>> result = new ArrayList<>();
    private Map<Integer, List<List<Integer>>> map;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, path, 0);
        return result;
    }

    private void dfs(int[][] graph, List<Integer> path, int node) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
        }
        for (int neighbour : graph[node]) {
            path.add(neighbour);
            dfs(graph, path, neighbour);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> allPathsSourceTargetDfs(int[][] graph) {
        return helper(graph, new ArrayList(), new ArrayList<>(), 0);
    }

    private List<List<Integer>> helper(int[][] graph, List<List<Integer>> result, List<Integer> path, int current) {
        path.add(current);
        if (current == graph.length - 1) {
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return result;
        }

        for (int neighbor : graph[current]) {
            helper(graph, result, path, neighbor);
        }
        path.remove(path.size() - 1);
        return result;
    }

    public List<List<Integer>> allPathsSourceTargetMemo(int[][] graph) {
        map = new HashMap<>();
        return dfs(graph, 0);
    }

    private List<List<Integer>> dfs(int[][] graph, int node) {
        if (map.containsKey(node)) {
            return map.get(node);
        }

        List<List<Integer>> result = new ArrayList<>();
        if (node == graph.length - 1) {
            List<Integer> list = new ArrayList<>();
            list.add(node);
            result.add(list);
            return result;
        }
        for (int neighbour : graph[node]) {
            List<List<Integer>> tmp = dfs(graph, neighbour);
            for (List<Integer> sublist : tmp) {
                List<Integer> list = new ArrayList<>(sublist);
                list.add(0, node);
                result.add(list);
            }
        }
        map.put(node, result);
        return result;
    }
}
