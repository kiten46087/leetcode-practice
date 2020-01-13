public class Solution213 {
    public int rob(int nums[]) {
        if (nums.length == 1) return nums[0];
        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
    }
    
    private int helper(int[] nums, int lo, int hi) {
        int include = 0;
        int exclude = 0;
        for (int j = lo; j <= hi; j++) {
            int i = include;
            int e = exclude;
            include = e + nums[j];
            exclude = Math.max(e, i);
        }

        return Math.max(include, exclude);
    }
}