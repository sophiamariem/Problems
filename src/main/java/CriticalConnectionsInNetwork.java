import java.util.List;

import java.util.*;

// Tarjan algorithm -
// add nodes to the stack when first visited
// remove those nodes when a complete Strongly Connected Component (SCC) is found
//
// mark id of each node as unvisited
// start dfs - upon visiting a node assign it an id and a low link value, mark current node as visited
// on dfs callback - if previous node is on the stack then min current node's low link with last node'd low link
//
// once done visiting all neighbours, if current node started a connected component then pop it off and keep
// popping until current node is reached

public class CriticalConnectionsInNetwork {
    private int id = 0;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] nodes = new int[n];
        Arrays.fill(nodes, -1);

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < connections.size(); i++) {
            int from = connections.get(i).get(0);
            int to = connections.get(i).get(1);
            graph[from].add(to);
            graph[to].add(from);
        }

        int[] low = new int[n];
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nodes[i] == -1) {
                dfs(i, low, nodes, graph, result, 0);
            }
        }
        return result;
    }

    private void dfs(int pos, int[] low, int[] nodes, List<Integer>[] graph, List<List<Integer>> res, int node) {
        nodes[pos] = low[pos] = id++;

        for (int i = 0; i < graph[pos].size(); i++) {
            int current = graph[pos].get(i);
            if (current == node) {
                continue;
            }
            if (nodes[current] == -1) {
                dfs(current, low, nodes, graph, res, pos);
                low[pos] = Math.min(low[pos], low[current]);
                if (low[current] > nodes[pos]) {
                    res.add(Arrays.asList(pos, current));
                }
            }
            else {
                low[pos] = Math.min(low[pos], nodes[current]);
            }
        }
    }
}
