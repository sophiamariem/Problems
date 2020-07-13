import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameTreeTest {

    private SameTree sameTree = new SameTree();

    @Test
    public void test() {
        SameTree.TreeNode root = new SameTree.TreeNode(1);
        SameTree.TreeNode rootL = new SameTree.TreeNode(2);
        SameTree.TreeNode rootR = new SameTree.TreeNode(3);

        root.left = rootL;
        root.right = rootR;

        assertTrue(sameTree.isSameTree(root, root));
    }

    @Test
    public void testTwo() {
        SameTree.TreeNode rootOne = new SameTree.TreeNode(1);
        SameTree.TreeNode rootL = new SameTree.TreeNode(2);

        rootOne.left = rootL;

        SameTree.TreeNode rootTwo = new SameTree.TreeNode(1);
        SameTree.TreeNode rootR = new SameTree.TreeNode(2);

        rootTwo.right = rootR;

        assertFalse(sameTree.isSameTree(rootOne, rootTwo));
    }

    @Test
    public void testThree() {
        SameTree.TreeNode root = new SameTree.TreeNode(1);
        SameTree.TreeNode rootL = new SameTree.TreeNode(2);
        SameTree.TreeNode rootR = new SameTree.TreeNode(1);

        root.left = rootL;
        root.right = rootR;

        SameTree.TreeNode rootTwo = new SameTree.TreeNode(1);
        SameTree.TreeNode rootTL = new SameTree.TreeNode(1);
        SameTree.TreeNode rootTR = new SameTree.TreeNode(2);

        root.left = rootTL;
        root.right = rootTR;

        assertFalse(sameTree.isSameTree(root, rootTwo));
    }
}
