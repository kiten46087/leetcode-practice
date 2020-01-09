import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution199 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    Map<Integer, TreeNode> map = new HashMap<>();

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        helper(root, 0);
        for (TreeNode node : map.values()) {
            res.add(node.val);
        }

        return res;
    }

    public void helper(TreeNode node, int level) {
        if (node == null) return;
        helper(node.left, level + 1);
        map.put(level, node);
        helper(node.right, level + 1);
    }
}