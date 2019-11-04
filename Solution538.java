import java.util.Stack;
public class Solution538 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    // int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        // Using stack process
        int sum = 0;
        TreeNode node = root;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.add(node);
                node = node.right;
            }

            node = stack.pop();
            sum += node.val;
            node.val = sum;
            
            node = node.left;
        }
        return root;
        // Using Recursive method
        // if (root != null) {
        //     convertBST(root.right);
        //     sum += root.val;
        //     root.val = sum;
        //     convertBST(root.left);
        // }

        // return root;
    }
}