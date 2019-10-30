public class Solution404 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    int sum = 0;
    public int sumOfLeftLeaves (TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return sum;
    }

    public void helper(TreeNode node) {
        if (node.left == null && node.right == null) 
            return;
        if (node.left != null && node.left.left == null && node.left.right == null) {
            sum += node.left.val;
        }
        if (node.left != null) {
            helper(node.left);
        }
        if (node.right != null) {
            helper(node.right);
        }
    }
}