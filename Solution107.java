import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Solution107 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Iterative method
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null) q.add(q.peek().left);
                if (q.peek().right != null) q.add(q.peek().right);
                temp.add(q.poll().val);
            }
            res.add(0, temp);
        }
        return res;
    }
}