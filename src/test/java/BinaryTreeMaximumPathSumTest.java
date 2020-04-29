import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaximumPathSumTest {

    private BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();

    @Test
    public void testOne() {
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(1);
        BinaryTreeMaximumPathSum.TreeNode rootLeft = new BinaryTreeMaximumPathSum.TreeNode(2);
        root.setLeft(rootLeft);
        BinaryTreeMaximumPathSum.TreeNode rootRight = new BinaryTreeMaximumPathSum.TreeNode(3);
        root.setRight(rootRight);

        assertEquals(6, binaryTreeMaximumPathSum.maxPathSum(root));
    }

    @Test
    public void testTwo() {
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(-10);
        BinaryTreeMaximumPathSum.TreeNode rootLeft = new BinaryTreeMaximumPathSum.TreeNode(9);
        root.setLeft(rootLeft);
        BinaryTreeMaximumPathSum.TreeNode rootRight = new BinaryTreeMaximumPathSum.TreeNode(20);
        root.setRight(rootRight);

        BinaryTreeMaximumPathSum.TreeNode rootRightLeft = new BinaryTreeMaximumPathSum.TreeNode(15);
        rootRight.setLeft(rootRightLeft);

        BinaryTreeMaximumPathSum.TreeNode rootRightRight = new BinaryTreeMaximumPathSum.TreeNode(7);
        rootRight.setRight(rootRightRight);

        assertEquals(42, binaryTreeMaximumPathSum.maxPathSum(root));
    }
}
