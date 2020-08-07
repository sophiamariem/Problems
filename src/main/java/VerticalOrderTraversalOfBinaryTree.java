import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class VerticalOrderTraversalOfBinaryTree {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();

        helper(root, 0, 0, map);

        for (Integer key : map.keySet()) {
            List<Integer> temp = new ArrayList<>();

            for (List<Integer> list : map.get(key).values()) {
                List<Integer> sub = list;
                Collections.sort(sub);
                temp.addAll(sub);
            }
            result.add(temp);
        }
        return result;
    }

    public void helper(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, List<Integer>>> map) {
        if (root == null) {
            return;
        }

        if (!map.containsKey(x)) {
            map.put(x, new TreeMap<>(Collections.reverseOrder()));
        }
        if (!map.get(x).containsKey(y)) {
            map.get(x).put(y, new ArrayList<>());
        }

        map.get(x).get(y).add(root.val);

        helper(root.left, x - 1, y - 1, map);
        helper(root.right, x + 1, y - 1, map);
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
