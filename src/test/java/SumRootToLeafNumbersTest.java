import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumRootToLeafNumbersTest {

    private SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();

    @Test
    public void testOne() {
        SumRootToLeafNumbers.TreeNode root = new SumRootToLeafNumbers.TreeNode(1);
        root.left = new SumRootToLeafNumbers.TreeNode(2);
        root.right = new SumRootToLeafNumbers.TreeNode(3);

        assertEquals(25, sumRootToLeafNumbers.sumNumbers(root));
    }

    @Test
    public void testTwo() {
        SumRootToLeafNumbers.TreeNode root = new SumRootToLeafNumbers.TreeNode(4);
        root.left = new SumRootToLeafNumbers.TreeNode(9);
        root.left.left = new SumRootToLeafNumbers.TreeNode(5);
        root.left.right = new SumRootToLeafNumbers.TreeNode(1);
        root.right = new SumRootToLeafNumbers.TreeNode(0);

        assertEquals(1026, sumRootToLeafNumbers.sumNumbers(root));
    }
}
