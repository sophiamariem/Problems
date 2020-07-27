import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructBinaryTreeFromInorderPostorderTraversalTest {

    private ConstructBinaryTreeFromInorderPostorderTraversal bst =
            new ConstructBinaryTreeFromInorderPostorderTraversal();

    @Test
    public void test() {
        ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode nine =
                new ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode(9);

        ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode fifteen =
                new ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode(15);
        ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode seven =
                new ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode(7);

        ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode twenty =
                new ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode(20, fifteen, seven);

        ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode root =
                new ConstructBinaryTreeFromInorderPostorderTraversal.TreeNode(3, nine, twenty);
        assertEquals(root, bst.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));

        assertEquals(root, bst.buildTreeAlt(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));
    }

}
