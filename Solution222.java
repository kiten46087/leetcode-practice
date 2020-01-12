public class Solution222 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int totalLength = getDepth(root);
        int rightLength = getDepth(root.right);

        if (rightLength + 1 == totalLength) {
            return (1 << totalLength - 1) + countNodes(root.right);
        }

        return (1 << totalLength - 2) + countNodes(root.right);
    }

    private int getDepth(TreeNode node) {
        if (node == null) return 0;
        return 1 + getDepth(node.left);
    }
}