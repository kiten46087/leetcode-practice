import java.util.LinkedList;
import java.util.List;

public class Solution257 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if (root != null) traverse(root, "", list);
        return list;
    }

    public void traverse(TreeNode node, String res, List<String> list) {
        if (node.left == null && node.right == null) list.add(res + node.val);
        if (node.left != null) traverse(node.left, res + node.val + "->", list);
        if (node.right != null) traverse(node.right, res + node.val + "->", list);
    }
}