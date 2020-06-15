import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInBinarySearchTreeTest {

    private SearchInBinarySearchTree searchInBinarySearchTree = new SearchInBinarySearchTree();

    @Test
    public void test() {
        SearchInBinarySearchTree.TreeNode rootLeftLeft = new SearchInBinarySearchTree.TreeNode(1);
        SearchInBinarySearchTree.TreeNode rootLeftRight = new SearchInBinarySearchTree.TreeNode(3);

        SearchInBinarySearchTree.TreeNode rootLeft = new SearchInBinarySearchTree.TreeNode(2, rootLeftLeft, rootLeftRight);
        SearchInBinarySearchTree.TreeNode rootRight = new SearchInBinarySearchTree.TreeNode(7);

        SearchInBinarySearchTree.TreeNode root = new SearchInBinarySearchTree.TreeNode(4, rootLeft, rootRight);

        assertEquals(rootLeft, searchInBinarySearchTree.searchBST(root, 2));

        assertEquals(rootLeft, searchInBinarySearchTree.searchBSTRecursive(root, 2));

    }
}
