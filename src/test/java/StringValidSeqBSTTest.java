import org.junit.Test;

import static org.junit.Assert.*;

public class StringValidSeqBSTTest {

    private StringValidSeqBST stringValidSeqBST = new StringValidSeqBST();

    @Test
    public void test() {
        StringValidSeqBST.TreeNode root = new StringValidSeqBST.TreeNode(0);
        StringValidSeqBST.TreeNode rootLeft = new StringValidSeqBST.TreeNode(1);
        root.setLeft(rootLeft);

        StringValidSeqBST.TreeNode rootRight = new StringValidSeqBST.TreeNode(0);
        root.setRight(rootRight);

        StringValidSeqBST.TreeNode rootLeftLeft = new StringValidSeqBST.TreeNode(0);
        rootLeft.setLeft(rootLeftLeft);

        StringValidSeqBST.TreeNode rootLeftRight = new StringValidSeqBST.TreeNode(1);
        rootLeft.setRight(rootLeftRight);

        StringValidSeqBST.TreeNode rootLeftLeftRight = new StringValidSeqBST.TreeNode(1);
        rootLeftLeft.setRight(rootLeftLeftRight);

        StringValidSeqBST.TreeNode rootLeftRightLeft = new StringValidSeqBST.TreeNode(0);
        rootLeftRight.setLeft(rootLeftRightLeft);

        StringValidSeqBST.TreeNode rootLeftRightRight = new StringValidSeqBST.TreeNode(0);
        rootLeftRight.setRight(rootLeftRightRight);

        StringValidSeqBST.TreeNode rootRightLeft = new StringValidSeqBST.TreeNode(0);
        rootRight.setLeft(rootRightLeft);

        assertTrue(stringValidSeqBST.isValidSequence(root, new int[]{0, 1, 0, 1}));
        assertFalse(stringValidSeqBST.isValidSequence(root, new int[]{0, 0, 1}));
        assertFalse(stringValidSeqBST.isValidSequence(root, new int[]{0, 1, 1}));
    }
}
