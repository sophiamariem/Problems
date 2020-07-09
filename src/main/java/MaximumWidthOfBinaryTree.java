import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumWidthOfBinaryTree {
    private Map<Integer, int[]> map = new HashMap<>();
    private List<Integer> mins;
    private List<Integer> maxs;
    private int maxWidth;

    public int widthOfBinaryTree(TreeNode root) {
        max(root, 0, 0);

        int result = 1;
        for (int[] val : map.values()) {
            result = Math.max(result, val[1] - val[0] + 1);
        }
        return result;
    }

    private void max(TreeNode root, int level, int pos) {
        if (root == null) {
            return;
        }

        int[] val = map.get(level);
        if (val == null) {
            val = new int[2];
            val[0] = Integer.MAX_VALUE;
            val[1] = Integer.MIN_VALUE;
        }

        val[0] = Math.min(val[0], pos);
        val[1] = Math.max(val[1], pos);
        map.put(level, val);

        max(root.left, level + 1, 2 * pos);
        max(root.right, level + 1, 2 * pos + 1);
    }

    public int widthOfBinaryTreeF(TreeNode root) {
        mins = new ArrayList<>();
        maxs = new ArrayList<>();
        maxWidth = 0;
        findMax(root, 0, 0);
        return maxWidth;
    }

    private void findMax(TreeNode node, int level, int val) {
        if (node == null) {
            return;
        }

        if (mins.size() <= level) {
            mins.add(val);
        }

        mins.set(level, Math.min(mins.get(level), val));
        if (maxs.size() <= level) {
            maxs.add(val);
        }
        maxs.set(level, Math.max(maxs.get(level), val));
        maxWidth = Math.max(maxWidth, maxs.get(level) - mins.get(level) + 1);
        findMax(node.left, level + 1, 2 * val);
        findMax(node.right, level + 1, 2 * val + 1);
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
