public class Solution453 {
    public int minMoves(int[] nums) {
        int min = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
        }

        return sum - min * nums.length;
    }
}