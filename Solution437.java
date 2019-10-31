import java.util.HashMap;

public class Solution437 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    int count = 0;

    public int pathSum(TreeNode root, int sum) {
        // Using hashMap method
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        helper(root, 0, sum, preSum);
        return count;
        // Recrusive method using two DFS
        // if (root == null) return 0;
        // return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    public void helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
        if (root == null) return;

        currSum += root.val;

        if (preSum.containsKey(currSum - target)) {
            count += preSum.get(currSum - target);
        }

        if (!preSum.containsKey(currSum)) {
            preSum.put(currSum, 1);
        } else {
            preSum.put(currSum, preSum.get(currSum) + 1);
        }

        helper(root.left, currSum, target, preSum);
        helper(root.right, currSum, target, preSum);
        preSum.put(currSum, preSum.get(currSum) - 1);
    }
    // private int pathSumFrom(TreeNode node, int sum) {
    //     if (node == null) return 0;
    //     return (node.val == sum ? 1 : 0) + pathSumFrom(node.left, sum - node.val) +
    //             pathSumFrom(node.right, sum - node.val);
    // }
}