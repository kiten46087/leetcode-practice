public class Solution129 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    private int sum;
    public int sumNumber(TreeNode root) {
        if (root == null) return 0;
        helper(root, 0);
        return sum;
    }

    public void helper(TreeNode node, int temp) {
        temp = temp * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += temp;
            return;
        }
        if (node.left != null) helper(node.left, temp);
        if (node.right != null) helper(node.right, temp);
    }
}