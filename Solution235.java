public class Solution235 {
    public class TreeNode  {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        // can be made looked better
        if (p.val == root.val || q.val == root.val) return root;
        if (q.val < root.val && p.val > root.val) return root;
        if (q.val > root.val && p.val < root.val) return root;
        if (q.val > root.val && p.val > root.val) return findLCA(root.right, p, q);
        if (q.val < root.val && p.val < root.val) return findLCA(root.left, p, q);
        return root;
    }
}