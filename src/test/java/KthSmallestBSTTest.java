import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthSmallestBSTTest {
    private KthSmallestBST kthSmallest = new KthSmallestBST();

    @Test
    public void testOne() {
        KthSmallestBST.BinaryTreeNode root = new KthSmallestBST.BinaryTreeNode(40);
        KthSmallestBST.BinaryTreeNode rootLeft = root.insertLeft(20);
        KthSmallestBST.BinaryTreeNode rootRight = root.insertRight(60);

        rootLeft.insertLeft(10);
        rootLeft.insertRight(30);

        rootRight.insertLeft(50);
        rootRight.insertRight(70);

        assertEquals(rootLeft.getValue(), kthSmallest.kthSmallest(root, 2));
    }

    @Test
    public void testTwo() {
        KthSmallestBST.BinaryTreeNode root = new KthSmallestBST.BinaryTreeNode(5);
        KthSmallestBST.BinaryTreeNode rootLeft = root.insertLeft(3);
        rootLeft.insertRight(6);

        KthSmallestBST.BinaryTreeNode rootLeftLeft = rootLeft.insertLeft(2);
        rootLeft.insertRight(4);
        rootLeftLeft.insertLeft(1);

        assertEquals(rootLeft.getValue(), kthSmallest.kthSmallest(root, 3));
    }
}
