import java.util.LinkedList;
import java.util.Queue;


public class Solution226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = temp;
            current.right = temp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return root;
    }
}