import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        return (node.val == sum ? 1 : 0) +
                dfs(node.left, sum - node.val) +
                dfs(node.right, sum - node.val);
    }

    public int pathSumWithMap(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        return dfs(root, sum, map, 0);
    }

    private int dfs(TreeNode curr, int target, Map<Integer, Integer> map, int currentSum) {
        if (curr == null) {
            return 0;
        }

        currentSum += curr.val;
        int result = map.getOrDefault(currentSum - target, 0);
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        result += dfs(curr.left, target, map, currentSum) + dfs(curr.right, target, map, currentSum);
        map.put(currentSum, map.get(currentSum) - 1);

        return result;
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
