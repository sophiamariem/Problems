public class SumRootToLeafNumbers {
    private int result;

    public int sumNumbers(TreeNode root) {
        result = 0;
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            result += sum;
            return;
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
