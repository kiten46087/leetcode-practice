// import java.util.Stack;

public class Solution98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
        // Iterative using stack
        // Stack<TreeNode> stack = new Stack<>();
        // double inorder = - Double.MAX_VALUE;

        // while (!stack.isEmpty() || root != null) {
        //     while (root != null) {
        //         stack.push(root);
        //         root = root.left;
        //     }
        //     root = stack.pop();

        //     if (root.val <= inorder) return false;
        //     inorder = root.val;
        //     root = root.right;
        // }
        // return true;
    }

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!helper(node.right, val, upper)) return false;
        if (!helper(node.left, lower, val)) return false;

        return true;
    }
}