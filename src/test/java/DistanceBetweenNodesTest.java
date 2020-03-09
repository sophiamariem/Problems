import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistanceBetweenNodesTest {

    private DistanceBetweenNodes distanceBetweenNodes = new DistanceBetweenNodes();

    @Test
    public void test() {
        DistanceBetweenNodes.TreeNode root = new DistanceBetweenNodes.TreeNode(5);
        root.left = new DistanceBetweenNodes.TreeNode(3);
        root.right = new DistanceBetweenNodes.TreeNode(6);
        root.left.left = new DistanceBetweenNodes.TreeNode(2);
        root.left.right = new DistanceBetweenNodes.TreeNode(4);
        root.left.left.left = new DistanceBetweenNodes.TreeNode(1);
        root.right.right = new DistanceBetweenNodes.TreeNode(7);
        root.right.right.right = new DistanceBetweenNodes.TreeNode(8);

        assertEquals(3, distanceBetweenNodes.getDistanceBetween(root, 1, 4));
        assertEquals(6, distanceBetweenNodes.getDistanceBetween(root, 1, 8));
    }
}
