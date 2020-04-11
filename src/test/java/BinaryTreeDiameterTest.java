import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class BinaryTreeDiameterTest {
    private BinaryTreeDiameter binaryTreeDiameter = new BinaryTreeDiameter();

    @Test
    public void test() {
        BinaryTreeDiameter.TreeNode root = new BinaryTreeDiameter.TreeNode(1);
        BinaryTreeDiameter.TreeNode rootL = new BinaryTreeDiameter.TreeNode(2);
        BinaryTreeDiameter.TreeNode rootR = new BinaryTreeDiameter.TreeNode(3);
        BinaryTreeDiameter.TreeNode leftL = new BinaryTreeDiameter.TreeNode(4);
        BinaryTreeDiameter.TreeNode leftR = new BinaryTreeDiameter.TreeNode(5);

        root.left = rootL;
        root.right = rootR;
        rootL.left = leftL;
        rootL.right = leftR;

        assertEquals(3, binaryTreeDiameter.diameterOfBinaryTree(root));
    }
}
