import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CountCompleteTreeNodesTest {

    private CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();

    @Test
    public void test() {
        CountCompleteTreeNodes.TreeNode root = new CountCompleteTreeNodes.TreeNode(1);
        CountCompleteTreeNodes.TreeNode rootL = new CountCompleteTreeNodes.TreeNode(2);
        CountCompleteTreeNodes.TreeNode rootR = new CountCompleteTreeNodes.TreeNode(3);
        CountCompleteTreeNodes.TreeNode leftL = new CountCompleteTreeNodes.TreeNode(4);
        CountCompleteTreeNodes.TreeNode leftR = new CountCompleteTreeNodes.TreeNode(5);
        CountCompleteTreeNodes.TreeNode rightL = new CountCompleteTreeNodes.TreeNode(6);

        root.left = rootL;
        root.right = rootR;
        rootL.left = leftL;
        rootL.right = leftR;
        rootR.left = rightL;

        assertEquals(6, countCompleteTreeNodes.countNodes(root));

        assertEquals(6, countCompleteTreeNodes.countNodesBitManipulation(root));

    }
}
