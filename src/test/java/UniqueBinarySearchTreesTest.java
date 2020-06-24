import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueBinarySearchTreesTest {

    private UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();

    @Test
    public void test() {
        assertEquals(5, uniqueBinarySearchTrees.numTrees(3));
    }
}
