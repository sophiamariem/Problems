import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfLeftLeavesTest {

    SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

    @Test
    public void test() {
        SumOfLeftLeaves.TreeNode fifteen = new SumOfLeftLeaves.TreeNode(15);
        SumOfLeftLeaves.TreeNode seven = new SumOfLeftLeaves.TreeNode(7);
        SumOfLeftLeaves.TreeNode nine = new SumOfLeftLeaves.TreeNode(9);
        SumOfLeftLeaves.TreeNode twenty = new SumOfLeftLeaves.TreeNode(20, fifteen, seven);

        SumOfLeftLeaves.TreeNode root = new SumOfLeftLeaves.TreeNode(3, nine, twenty);

        // There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
        assertEquals(24, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }
}
