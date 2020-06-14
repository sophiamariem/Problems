import java.util.*;

public class CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<Node>> map = new HashMap();

        for (int[] flight : flights) {
            if (!map.containsKey(flight[0])) {
                map.put(flight[0], new ArrayList());
            }
            map.get(flight[0]).add(new Node(flight[1], flight[2]));
        }

        int level = 0;

        Queue<Node> queue = new LinkedList();
        queue.add(new Node(src, 0));

        Map<Integer, Integer> visited = new HashMap();
        int min = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (level > K + 1) {
                break;
            }

            while (size-- > 0) {
                Node current = queue.poll();
                if (current.cost > min) {
                    continue;
                }
                visited.put(current.id, current.cost);

                if (current.id == dst) {
                    min = Math.min(min, current.cost);
                }

                if (map.containsKey(current.id)) {
                    for (Node next : map.get(current.id)) {
                        if (current.cost + next.cost > min) {
                            continue;
                        }
                        if (!visited.containsKey(next.id)) {
                            queue.add(new Node(next.id, current.cost + next.cost));
                        } else if (visited.get(next.id) > current.cost + next.cost) {
                            visited.put(next.id, current.cost + next.cost);
                            queue.add(new Node(next.id, current.cost + next.cost));
                        }
                    }
                }
            }
            level++;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private class Node {
        int id;
        int cost;

        private Node(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }

    }
}
