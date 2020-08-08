import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathSumIIITest {

    private PathSumIII pathSumIII = new PathSumIII();

    @Test
    public void test() {
        PathSumIII.TreeNode one = new PathSumIII.TreeNode(1);
        PathSumIII.TreeNode otherThree = new PathSumIII.TreeNode(3);
        PathSumIII.TreeNode minusTwo = new PathSumIII.TreeNode(-2);

        PathSumIII.TreeNode two = new PathSumIII.TreeNode(2, null, one);
        PathSumIII.TreeNode three = new PathSumIII.TreeNode(3, otherThree, minusTwo);

        PathSumIII.TreeNode eleven = new PathSumIII.TreeNode(11);
        PathSumIII.TreeNode minusThree = new PathSumIII.TreeNode(-3, null, eleven);
        PathSumIII.TreeNode five = new PathSumIII.TreeNode(5, three, two);

        PathSumIII.TreeNode root = new PathSumIII.TreeNode(10, five, minusThree);

        assertEquals(3, pathSumIII.pathSum(root, 8));
        assertEquals(3, pathSumIII.pathSumWithMap(root, 8));
    }
}
