import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UndirectedDPlusOneGraphColoring {

    // O(N + M) time where N is the number of nodes and M the number of edges, O(D) space
    public void colorGraph(GraphNode[] graph, String[] colors) {

        for (GraphNode node : graph) {
            Set<GraphNode> neighbors = node.getNeighbors();

            // checking if something is in a hash set is O(1), so doing it for all N nodes is O(N)
            if (neighbors.contains(node)) {
                throw new IllegalArgumentException(String.format("Found loop. Legal coloring impossible for node '%s'", node.getLabel()));
            }

            // iterating through node's neighbors
            // so in total, we cross each of the graphs M edges twice; once for the node on either end of each edge so O(M) time
            Set<String> illegalColors = new HashSet<>();
            for (GraphNode neighbor : neighbors) {
                if (neighbor.hasColor()) {
                    illegalColors.add(neighbor.getColor());
                }
            }

            // stop checking colors as soon as we find one that works
            // worst case we'll have to check one more color than the total number of neighbors
            // each edge in the graph adds two neighbors; one for the node on either end;
            // so there are 2*M neighbors so in total, we'll have to try O(N+M) colors
            for (String color : colors) {
                if (!illegalColors.contains(color)) {
                    node.setColor(color);
                    break;
                }
            }
        }
    }

    public static class GraphNode {
        private String label;
        private Set<GraphNode> neighbors;
        private Optional<String> color;

        public GraphNode(String label) {
            this.label = label;
            neighbors = new HashSet<>();
            color = Optional.empty();
        }

        public String getLabel() {
            return label;
        }

        public Set<GraphNode> getNeighbors() {
            return Collections.unmodifiableSet(neighbors);
        }

        public void addNeighbor(GraphNode neighbor) {
            neighbors.add(neighbor);
        }

        public boolean hasColor() {
            return color.isPresent();
        }

        public String getColor() {
            return color.get();
        }

        public void setColor(String color) {
            this.color = Optional.ofNullable(color);
        }
    }

}
