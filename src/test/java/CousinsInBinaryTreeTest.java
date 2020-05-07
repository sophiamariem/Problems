import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CousinsInBinaryTreeTest {
    private CousinsInBinaryTree cousins = new CousinsInBinaryTree();

    @Test
    public void testOne() {
        CousinsInBinaryTree.TreeNode root = new CousinsInBinaryTree.TreeNode(1);
        root.left = new CousinsInBinaryTree.TreeNode(2);
        root.right = new CousinsInBinaryTree.TreeNode(3);
        root.left.left = new CousinsInBinaryTree.TreeNode(4);

        assertFalse(cousins.isCousins(root, 4, 3));
    }

    @Test
    public void testTwo() {
        CousinsInBinaryTree.TreeNode root = new CousinsInBinaryTree.TreeNode(1);
        root.left = new CousinsInBinaryTree.TreeNode(2);
        root.right = new CousinsInBinaryTree.TreeNode(3);
        root.left.right = new CousinsInBinaryTree.TreeNode(4);
        root.right.right = new CousinsInBinaryTree.TreeNode(5);

        assertTrue(cousins.isCousins(root, 5, 4));
    }

    @Test
    public void testThree() {
        CousinsInBinaryTree.TreeNode root = new CousinsInBinaryTree.TreeNode(1);
        root.left = new CousinsInBinaryTree.TreeNode(2);
        root.right = new CousinsInBinaryTree.TreeNode(3);
        root.left.right = new CousinsInBinaryTree.TreeNode(4);

        assertFalse(cousins.isCousins(root, 2, 3));
    }
}
