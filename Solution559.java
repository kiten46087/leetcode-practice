import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution559 {
    public class TreeNode {
        int val;
        List<TreeNode> children;

        TreeNode (int x, List<TreeNode> children) {
            val = x;
            this.children = children;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                for (TreeNode child : current.children) {
                    queue.offer(child);
                }

                depth += 1;
            }
        }

        return depth;

    }
}