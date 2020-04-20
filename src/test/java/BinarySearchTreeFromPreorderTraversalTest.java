import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeFromPreorderTraversalTest {

    private BinarySearchTreeFromPreorderTraversal bstFromPre = new BinarySearchTreeFromPreorderTraversal();

    @Test
    public void test() {
        BinarySearchTreeFromPreorderTraversal.TreeNode root = new BinarySearchTreeFromPreorderTraversal.TreeNode(8);
        root.left = new BinarySearchTreeFromPreorderTraversal.TreeNode(5);
        root.left.left = new BinarySearchTreeFromPreorderTraversal.TreeNode(1);
        root.left.right = new BinarySearchTreeFromPreorderTraversal.TreeNode(7);
        root.right = new BinarySearchTreeFromPreorderTraversal.TreeNode(10);
        root.right.right = new BinarySearchTreeFromPreorderTraversal.TreeNode(12);

        assertEquals(root, bstFromPre.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12}));
    }
}
