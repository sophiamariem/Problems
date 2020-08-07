import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VerticalOrderTraversalOfBinaryTreeTest {

    private VerticalOrderTraversalOfBinaryTree verticalOrderTraversalOfBinaryTree = new VerticalOrderTraversalOfBinaryTree();

    @Test
    public void test() {
        VerticalOrderTraversalOfBinaryTree.TreeNode fifteen = new VerticalOrderTraversalOfBinaryTree.TreeNode(15);
        VerticalOrderTraversalOfBinaryTree.TreeNode seven = new VerticalOrderTraversalOfBinaryTree.TreeNode(7);

        VerticalOrderTraversalOfBinaryTree.TreeNode nine = new VerticalOrderTraversalOfBinaryTree.TreeNode(9);
        VerticalOrderTraversalOfBinaryTree.TreeNode twenty = new VerticalOrderTraversalOfBinaryTree.TreeNode(20, fifteen, seven);

        VerticalOrderTraversalOfBinaryTree.TreeNode root = new VerticalOrderTraversalOfBinaryTree.TreeNode(3, nine, twenty);

        List<List<Integer>> result = verticalOrderTraversalOfBinaryTree.verticalTraversal(root);
        assertEquals(result.get(0), Arrays.asList(9));
        assertEquals(result.get(1), Arrays.asList(3, 15));
        assertEquals(result.get(2), Arrays.asList(20));
        assertEquals(result.get(3), Arrays.asList(7));
    }

    @Test
    public void testTwo() {
        VerticalOrderTraversalOfBinaryTree.TreeNode six = new VerticalOrderTraversalOfBinaryTree.TreeNode(6);
        VerticalOrderTraversalOfBinaryTree.TreeNode seven = new VerticalOrderTraversalOfBinaryTree.TreeNode(7);

        VerticalOrderTraversalOfBinaryTree.TreeNode four = new VerticalOrderTraversalOfBinaryTree.TreeNode(4);
        VerticalOrderTraversalOfBinaryTree.TreeNode five = new VerticalOrderTraversalOfBinaryTree.TreeNode(5);

        VerticalOrderTraversalOfBinaryTree.TreeNode two = new VerticalOrderTraversalOfBinaryTree.TreeNode(2, four, five);
        VerticalOrderTraversalOfBinaryTree.TreeNode three = new VerticalOrderTraversalOfBinaryTree.TreeNode(3, six, seven);

        VerticalOrderTraversalOfBinaryTree.TreeNode root = new VerticalOrderTraversalOfBinaryTree.TreeNode(1, two, three);

        List<List<Integer>> result = verticalOrderTraversalOfBinaryTree.verticalTraversal(root);
        assertEquals(result.get(0), Arrays.asList(4));
        assertEquals(result.get(1), Arrays.asList(2));
        assertEquals(result.get(2), Arrays.asList(1, 5, 6));
        assertEquals(result.get(3), Arrays.asList(3));
        assertEquals(result.get(4), Arrays.asList(7));
    }
}
