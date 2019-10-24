public class Solution110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return height(root) != -1;

        // bottom up method
        // return isBalanced(root.left) && isBalanced(root.right) && 
        //     (Math.abs(height(root.left) - height(root.right)) <= 1);
    }

    // bottom up method
    public int height(TreeNode node) {
        if (node == null) return 0;
        int leftH = height(node.left);
        if (leftH == -1) return -1;
        int rightH = height(node.right);
        if (rightH == -1) return -1;
        if (Math.abs(leftH - rightH) > 1) return -1;

        return Math.max(leftH, rightH) + 1;
    }

    // public int height(TreeNode node) {
    //     if (node == null) return 0;
    //     return 1 + Math.max(height(node.left), height(node.right));
    // }  
}