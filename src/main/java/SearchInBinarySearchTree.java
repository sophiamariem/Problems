public class SearchInBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && val != root.val) {
            root = (val < root.val) ? root.left : root.right;
        }
        return root;
    }

    public TreeNode searchBSTRecursive(TreeNode root, int val) {
        return (root == null || val == root.val) ? root :
                (val < root.val ? searchBST(root.left, val) : searchBST(root.right, val));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
