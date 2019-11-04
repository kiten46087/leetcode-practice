public class Solution530 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    Integer prev = null;
    int min = Integer.MIN_VALUE;
    public int getMinimumDiff(TreeNode root) {
        if (root == null) return min;

        getMinimumDiff(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        getMinimumDiff(root.right);
        return min;
    }
}