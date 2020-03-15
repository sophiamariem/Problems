import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestBSTTest {

    private KthLargestBST kthLargestBST = new KthLargestBST();

    @Test
    public void testOne() {
        KthLargestBST.BinaryTreeNode root = new KthLargestBST.BinaryTreeNode(40);
        KthLargestBST.BinaryTreeNode rootLeft = root.insertLeft(20);
        KthLargestBST.BinaryTreeNode rootRight = root.insertRight(60);

        rootLeft.insertLeft(10);
        rootLeft.insertRight(30);

        rootRight.insertLeft(50);
        rootRight.insertRight(70);

        assertEquals(rootRight.getValue(), kthLargestBST.findKthLargest(root, 2));
    }

    @Test
    public void testTwo() {
        KthLargestBST.BinaryTreeNode root = new KthLargestBST.BinaryTreeNode(137);
        KthLargestBST.BinaryTreeNode rootLeft = root.insertLeft(42);
        KthLargestBST.BinaryTreeNode rootLeftRight = rootLeft.insertRight(99);

        assertEquals(rootLeftRight.getValue(), kthLargestBST.findKthLargest(root, 2));
    }
}
