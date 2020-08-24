public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int result = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            result = root.left.val;
        }
        return result + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
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
