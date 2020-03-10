import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class DistanceBetweenNodesTest {

    private DistanceBetweenNodes distanceBetweenNodes = new DistanceBetweenNodes();

    @Test
    public void test() {
        DistanceBetweenNodes.TreeNode root = new DistanceBetweenNodes.TreeNode(6);
        root.left = new DistanceBetweenNodes.TreeNode(4);
        root.right = new DistanceBetweenNodes.TreeNode(7);
        root.left.left = new DistanceBetweenNodes.TreeNode(2);
        root.left.right = new DistanceBetweenNodes.TreeNode(5);
        root.left.left.left = new DistanceBetweenNodes.TreeNode(1);
        root.left.left.right = new DistanceBetweenNodes.TreeNode(3);
        root.right.right = new DistanceBetweenNodes.TreeNode(8);
        root.right.right.right = new DistanceBetweenNodes.TreeNode(9);
        root.right.right.left = new DistanceBetweenNodes.TreeNode(10);

        assertEquals(2, distanceBetweenNodes.getDistanceBetween(root, 1, 4));
        assertEquals(5, distanceBetweenNodes.getDistanceBetween(root, 1, 8));
        assertEquals(2, distanceBetweenNodes.getDistanceBetween(root, 1, 3));
        assertEquals(1, distanceBetweenNodes.getDistanceBetween(root, 7, 8));
        assertThrows(IllegalArgumentException.class, () ->
                distanceBetweenNodes.getDistanceBetween(root, 10, 9));
    }
}
