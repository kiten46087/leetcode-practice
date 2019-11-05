public class Solution543 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    int max = 1;
    public int diameter(TreeNode root) {
        traverse(root);
        return 0;
    }

    public int traverse(TreeNode node) {
        if (node == null) return 0;
        int l = traverse(node.left);
        int r = traverse(node.left);
        max = Math.max(max, l + r + 1);
        return Math.max(l, r) + 1;
    }
}