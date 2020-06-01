import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void test() {
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(4);
        root.left = new InvertBinaryTree.TreeNode(2);
        root.left.left = new InvertBinaryTree.TreeNode(1);
        root.left.right = new InvertBinaryTree.TreeNode(3);
        root.right = new InvertBinaryTree.TreeNode(7);
        root.right.left = new InvertBinaryTree.TreeNode(6);
        root.right.right = new InvertBinaryTree.TreeNode(9);

        InvertBinaryTree.TreeNode expected = new InvertBinaryTree.TreeNode(4);
        expected.left = new InvertBinaryTree.TreeNode(7);
        expected.left.left = new InvertBinaryTree.TreeNode(9);
        expected.left.right = new InvertBinaryTree.TreeNode(6);
        expected.right = new InvertBinaryTree.TreeNode(2);
        expected.right.left = new InvertBinaryTree.TreeNode(3);
        expected.right.right = new InvertBinaryTree.TreeNode(1);

        assertEquals(expected, invertBinaryTree.invertTree(root));
    }
}
