import java.util.*;

public class ReconstructItinerary {
    private Map<String, PriorityQueue<String>> map = new HashMap<>();
    private List<String> result = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            map.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            map.get(ticket.get(0)).offer(ticket.get(1));
        }
        dfs("JFK");
        return result;
    }

    public void dfs(String departure) {
        while (map.containsKey(departure) && !map.get(departure).isEmpty()) {
            dfs(map.get(departure).poll());
        }
        result.add(0, departure);
    }
}
