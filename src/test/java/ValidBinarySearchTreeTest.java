import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidBinarySearchTreeTest {

    private ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();

    @Test
    public void test() {
        ValidBinarySearchTree.BinaryTreeNode root = new ValidBinarySearchTree.BinaryTreeNode(50);

        ValidBinarySearchTree.BinaryTreeNode rootLeft = new ValidBinarySearchTree.BinaryTreeNode(30);
        ValidBinarySearchTree.BinaryTreeNode rootLeftLeft = new ValidBinarySearchTree.BinaryTreeNode(20);
        ValidBinarySearchTree.BinaryTreeNode rootLeftRight = new ValidBinarySearchTree.BinaryTreeNode(60);

        ValidBinarySearchTree.BinaryTreeNode rootRight = new ValidBinarySearchTree.BinaryTreeNode(80);
        ValidBinarySearchTree.BinaryTreeNode rootRightLeft = new ValidBinarySearchTree.BinaryTreeNode(70);
        ValidBinarySearchTree.BinaryTreeNode rootRightRight = new ValidBinarySearchTree.BinaryTreeNode(90);

        root.insertLeft(rootLeft);
        root.insertRight(rootRight);

        rootLeft.insertLeft(rootLeftLeft);
        rootLeft.insertRight(rootLeftRight);

        rootRight.insertLeft(rootRightLeft);
        rootRight.insertRight(rootRightRight);

        assertFalse(validBinarySearchTree.isBinarySearchTree(root));


        ValidBinarySearchTree.BinaryTreeNode rootLeftRight2 = new ValidBinarySearchTree.BinaryTreeNode(40);
        rootLeft.insertRight(rootLeftRight2);

        assertTrue(validBinarySearchTree.isBinarySearchTree(root));
    }

}
