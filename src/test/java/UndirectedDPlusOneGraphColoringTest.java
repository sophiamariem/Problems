import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UndirectedDPlusOneGraphColoringTest {

    private UndirectedDPlusOneGraphColoring undirectedDPlusOneGraphColoring = new UndirectedDPlusOneGraphColoring();
    private UndirectedDPlusOneGraphColoring.GraphNode a = new UndirectedDPlusOneGraphColoring.GraphNode("a");
    private UndirectedDPlusOneGraphColoring.GraphNode b = new UndirectedDPlusOneGraphColoring.GraphNode("b");
    private UndirectedDPlusOneGraphColoring.GraphNode c = new UndirectedDPlusOneGraphColoring.GraphNode("c");
    private UndirectedDPlusOneGraphColoring.GraphNode[] graph = new UndirectedDPlusOneGraphColoring.GraphNode[]{a, b, c};

    @Before
    public void setUp() {
        a.addNeighbor(b);
        b.addNeighbor(a);
        b.addNeighbor(c);
        c.addNeighbor(b);
    }

    @Test
    public void testOne() {
        undirectedDPlusOneGraphColoring.colorGraph(graph, new String[]{"black", "red", "blue", "purple"});
        assertTrue(a.hasColor());
        assertTrue(b.hasColor());
        assertTrue(c.hasColor());
    }

    @Test
    public void testTwo() {
        undirectedDPlusOneGraphColoring.colorGraph(graph, new String[]{"black", "red", "blue"});
        assertTrue(a.hasColor());
        assertTrue(b.hasColor());
        assertTrue(c.hasColor());
    }

    @Test
    public void testThree() {
        undirectedDPlusOneGraphColoring.colorGraph(graph, new String[]{"black", "red"});
        assertTrue(a.hasColor());
        assertTrue(b.hasColor());
        assertTrue(c.hasColor());
    }

    @Test
    public void testFour() {
        undirectedDPlusOneGraphColoring.colorGraph(graph, new String[]{"black"});
        assertTrue(a.hasColor());
        assertFalse(b.hasColor());
        assertTrue(c.hasColor());
    }
}
