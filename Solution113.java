import java.util.LinkedList;
import java.util.List;

public class Solution113 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>res = new LinkedList<>();

        if (root == null) return res;
        traverse(res, new LinkedList<>(), root, sum);

        return res;
    }

    public void traverse(List<List<Integer>> res, List<Integer> temp, TreeNode node, int sum) {
        if (node == null) return;
        
        temp.add(node.val);
        if (node.left == null && node.right == null && (sum - node.val) == 0) {
            res.add(new LinkedList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        } else {
            traverse(res, temp, node.left, sum - node.val);
            traverse(res, temp, node.right, sum - node.val);
        }
        temp.remove(temp.size() - 1);
    }
}