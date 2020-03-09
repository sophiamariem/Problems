import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumDistanceBetweenBSTNodesTest {

    private MinimumDistanceBetweenBSTNodes minimumDistanceBetweenBSTNodes = new MinimumDistanceBetweenBSTNodes();

    @Test
    public void testOne() {
        MinimumDistanceBetweenBSTNodes.TreeNode root = new MinimumDistanceBetweenBSTNodes.TreeNode(4);
        root.left = new MinimumDistanceBetweenBSTNodes.TreeNode(2);
        root.left.left = new MinimumDistanceBetweenBSTNodes.TreeNode(1);
        root.left.right = new MinimumDistanceBetweenBSTNodes.TreeNode(3);
        root.right = new MinimumDistanceBetweenBSTNodes.TreeNode(6);
        assertEquals(1, minimumDistanceBetweenBSTNodes.minDiffInBST(root));
    }

    @Test
    public void testTwo() {
        MinimumDistanceBetweenBSTNodes.TreeNode root = new MinimumDistanceBetweenBSTNodes.TreeNode(1);
        root.left = new MinimumDistanceBetweenBSTNodes.TreeNode(0);
        root.right = new MinimumDistanceBetweenBSTNodes.TreeNode(48);
        root.right.left = new MinimumDistanceBetweenBSTNodes.TreeNode(12);
        root.right.right = new MinimumDistanceBetweenBSTNodes.TreeNode(49);
        assertEquals(1, minimumDistanceBetweenBSTNodes.minDiffInBST(root));
    }
}
