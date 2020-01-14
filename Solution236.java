public class Solution236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // hard to understand
        // if (left != null && right != null) return root;
        // return left != null ? left : right;

        // put it in this way
        if (left == null) 
            return right;
        else if (right == null)
            return left;
        else
            return root;
    }
}