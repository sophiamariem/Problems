import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumWidthOfBinaryTreeTest {

    private MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();

    @Test
    public void testOne() {
        MaximumWidthOfBinaryTree.TreeNode root = new MaximumWidthOfBinaryTree.TreeNode(1);
        MaximumWidthOfBinaryTree.TreeNode rootL = new MaximumWidthOfBinaryTree.TreeNode(3);
        MaximumWidthOfBinaryTree.TreeNode rootR = new MaximumWidthOfBinaryTree.TreeNode(2);
        MaximumWidthOfBinaryTree.TreeNode leftL = new MaximumWidthOfBinaryTree.TreeNode(5);
        MaximumWidthOfBinaryTree.TreeNode leftR = new MaximumWidthOfBinaryTree.TreeNode(3);
        MaximumWidthOfBinaryTree.TreeNode rightR = new MaximumWidthOfBinaryTree.TreeNode(9);

        root.left = rootL;
        root.right = rootR;
        rootL.left = leftL;
        rootL.right = leftR;
        rootR.right = rightR;

        assertEquals(4, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
        assertEquals(4, maximumWidthOfBinaryTree.widthOfBinaryTreeF(root));
    }

    @Test
    public void testTwo() {
        MaximumWidthOfBinaryTree.TreeNode root = new MaximumWidthOfBinaryTree.TreeNode(1);
        MaximumWidthOfBinaryTree.TreeNode rootL = new MaximumWidthOfBinaryTree.TreeNode(3);
        MaximumWidthOfBinaryTree.TreeNode leftL = new MaximumWidthOfBinaryTree.TreeNode(5);
        MaximumWidthOfBinaryTree.TreeNode leftR = new MaximumWidthOfBinaryTree.TreeNode(3);

        root.left = rootL;
        rootL.left = leftL;
        rootL.right = leftR;

        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTreeF(root));
    }

    @Test
    public void testThree() {
        MaximumWidthOfBinaryTree.TreeNode root = new MaximumWidthOfBinaryTree.TreeNode(1);
        MaximumWidthOfBinaryTree.TreeNode rootL = new MaximumWidthOfBinaryTree.TreeNode(3);
        MaximumWidthOfBinaryTree.TreeNode rootR = new MaximumWidthOfBinaryTree.TreeNode(2);
        MaximumWidthOfBinaryTree.TreeNode leftL = new MaximumWidthOfBinaryTree.TreeNode(5);

        root.left = rootL;
        root.right = rootR;
        rootL.left = leftL;

        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
        assertEquals(2, maximumWidthOfBinaryTree.widthOfBinaryTreeF(root));
    }

    @Test
    public void testFour() {
        MaximumWidthOfBinaryTree.TreeNode root = new MaximumWidthOfBinaryTree.TreeNode(1);
        MaximumWidthOfBinaryTree.TreeNode rootL = new MaximumWidthOfBinaryTree.TreeNode(3);
        MaximumWidthOfBinaryTree.TreeNode rootR = new MaximumWidthOfBinaryTree.TreeNode(2);
        MaximumWidthOfBinaryTree.TreeNode leftL = new MaximumWidthOfBinaryTree.TreeNode(5);
        MaximumWidthOfBinaryTree.TreeNode rightR = new MaximumWidthOfBinaryTree.TreeNode(9);
        MaximumWidthOfBinaryTree.TreeNode leftLL = new MaximumWidthOfBinaryTree.TreeNode(6);
        MaximumWidthOfBinaryTree.TreeNode rightRR = new MaximumWidthOfBinaryTree.TreeNode(7);

        root.left = rootL;
        root.right = rootR;
        rootL.left = leftL;
        rootR.right = rightR;
        leftL.left = leftLL;
        rightR.right = rightRR;

        assertEquals(8, maximumWidthOfBinaryTree.widthOfBinaryTree(root));
        assertEquals(8, maximumWidthOfBinaryTree.widthOfBinaryTreeF(root));
    }
}
