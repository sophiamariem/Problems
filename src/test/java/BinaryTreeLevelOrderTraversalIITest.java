import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalIITest {

    private BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();

    private BinaryTreeLevelOrderTraversalII.TreeNode root = new BinaryTreeLevelOrderTraversalII.TreeNode(3);
    private BinaryTreeLevelOrderTraversalII.TreeNode rootL = new BinaryTreeLevelOrderTraversalII.TreeNode(9);
    private BinaryTreeLevelOrderTraversalII.TreeNode rootR = new BinaryTreeLevelOrderTraversalII.TreeNode(20);
    private BinaryTreeLevelOrderTraversalII.TreeNode rightL = new BinaryTreeLevelOrderTraversalII.TreeNode(15);
    private BinaryTreeLevelOrderTraversalII.TreeNode leftL = new BinaryTreeLevelOrderTraversalII.TreeNode(7);

    @Before
    public void setup() {
        root.left = rootL;
        root.right = rootR;
        rootR.left = rightL;
        rootR.right = leftL;
    }
    
    @Test
    public void testBfs() {
        List<List<Integer>> result = binaryTreeLevelOrderTraversalII.levelOrderBottomBfs(root);

        assertEquals(Arrays.asList(15, 7), result.get(0));
        assertEquals(Arrays.asList(9, 20), result.get(1));
        assertEquals(Arrays.asList(3), result.get(2));
    }

    @Test
    public void testDfs() {
        List<List<Integer>> result = binaryTreeLevelOrderTraversalII.levelOrderBottomDfs(root);

        assertEquals(Arrays.asList(15, 7), result.get(0));
        assertEquals(Arrays.asList(9, 20), result.get(1));
        assertEquals(Arrays.asList(3), result.get(2));
    }
}
