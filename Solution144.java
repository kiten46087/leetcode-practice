import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        // trival solution that use recursive method
        // List<Integer> res = new ArrayList<>();
        // traverse(root, res);
        // return res;

        // method that use a stack to do it iteratively
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;
    }

    // public void traverse(TreeNode node, List<Integer> res) {
    //     if (node == null) return;

    //     res.add(node.val);
    //     traverse(node.left, res);
    //     traverse(node.right, res);
    // }
}